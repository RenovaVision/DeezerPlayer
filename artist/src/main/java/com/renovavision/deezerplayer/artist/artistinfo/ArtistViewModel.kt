package com.renovavision.deezerplayer.artist.artistinfo

import androidx.lifecycle.viewModelScope
import com.renovavision.deezerplayer.artist.ArtistNavigator
import com.renovavision.deezerplayer.domain.CoroutineDispatcherProvider
import com.renovavision.deezerplayer.domain.entities.PlayerModel
import com.renovavision.deezerplayer.domain.usecases.ArtistModel
import com.renovavision.deezerplayer.domain.usecases.GetArtistModel
import com.renovavision.deezerplayer.ui.uni.Action
import com.renovavision.deezerplayer.ui.uni.AsyncAction
import com.renovavision.deezerplayer.ui.uni.UniViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import javax.inject.Inject

data class LoadArtistModel(val id: Int) : AsyncAction
data class AlbumClicked(val id: Int) : AsyncAction
data class TrackClicked(val track: PlayerModel) : AsyncAction

object LoadArtistModelStarted : Action
object LoadArtistModelFailed : Action
data class LoadArtistModelSuccess(val model: ArtistModel) : Action

data class State(
    val isLoading: Boolean,
    val showError: Boolean,
    val model: ArtistModel? = null
)

@ExperimentalCoroutinesApi
class ArtistViewModel @Inject constructor(
    private val useCase: GetArtistModel,
    private val artistNavigator: ArtistNavigator,
    dispatcherProvider: CoroutineDispatcherProvider
) : UniViewModel<State>(dispatcherProvider.ioDispatcher()) {

    @ExperimentalCoroutinesApi
    override fun getDefaultState() = State(isLoading = true, showError = false)

    override fun reduce(state: State, action: Action) =
        when (action) {
            is LoadArtistModelStarted -> state.copy(isLoading = true)
            is LoadArtistModelFailed -> state.copy(isLoading = false, showError = true)
            is LoadArtistModelSuccess -> state.copy(
                isLoading = false,
                showError = false,
                model = action.model
            )
            else -> state
        }

    override fun async(state: State, asyncAction: AsyncAction) {
        when (asyncAction) {
            is AlbumClicked -> artistNavigator.navArtistToAlbum(asyncAction.id)
            is TrackClicked -> artistNavigator.navArtistToPlayer(asyncAction.track)
            is LoadArtistModel -> loadArtistModel(asyncAction.id, state)
        }
    }

    private fun loadArtistModel(
        id: Int,
        state: State
    ) {
        if (state.model == null) {
            dispatch(LoadArtistModelStarted)

            viewModelScope.launch(CoroutineExceptionHandler { _, _ ->
                dispatch(LoadArtistModelFailed)
            }) {
                val artistModel = useCase.invoke(id)

                when (artistModel.artistAlbums.data.isNotEmpty() && artistModel.artistTracks.data.isNotEmpty()) {
                    true -> dispatch(LoadArtistModelSuccess(artistModel))
                    else -> dispatch(LoadArtistModelFailed)
                }
            }
        }
    }
}