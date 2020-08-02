package com.renovavision.deezerplayer.album

import androidx.lifecycle.viewModelScope
import com.renovavision.deezerplayer.domain.CoroutineDispatcherProvider
import com.renovavision.deezerplayer.domain.entities.AlbumDetails.Tracks.AlbumTrack
import com.renovavision.deezerplayer.domain.entities.PlayerModel
import com.renovavision.deezerplayer.domain.usecases.GetAlbumInfo
import com.renovavision.deezerplayer.ui.uni.Action
import com.renovavision.deezerplayer.ui.uni.AsyncAction
import com.renovavision.deezerplayer.ui.uni.UniViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import javax.inject.Inject

data class LoadAlbumDetails(val id: Int) : AsyncAction
data class TrackClicked(val track: PlayerModel) : AsyncAction

object LoadAlbumDetailsStarted : Action
object LoadAlbumDetailsFailed : Action
data class LoadAlbumDetailsSuccess(val albumDetails: List<AlbumTrack>) : Action

data class State(
    val isLoading: Boolean,
    val showError: Boolean,
    val tracks: List<AlbumTrack> = emptyList()
)

@ExperimentalCoroutinesApi
class AlbumViewModel @Inject constructor(
    private val useCase: GetAlbumInfo,
    private val albumNavigator: AlbumNavigator,
    provider: CoroutineDispatcherProvider
) : UniViewModel<State>(provider.ioDispatcher()) {

    @ExperimentalCoroutinesApi
    override fun getDefaultState() = State(isLoading = true, showError = false)

    override fun reduce(state: State, action: Action): State =
        when (action) {
            is LoadAlbumDetailsStarted -> state.copy(isLoading = true)
            is LoadAlbumDetailsFailed -> state.copy(isLoading = false, showError = true)
            is LoadAlbumDetailsSuccess -> state.copy(
                isLoading = false,
                showError = false,
                tracks = action.albumDetails
            )
            else -> state
        }

    override fun async(state: State, asyncAction: AsyncAction) {
        when(asyncAction) {
            is LoadAlbumDetails -> loadAlbumTracks(asyncAction.id, state)
            is TrackClicked -> albumNavigator.navAlbumToPlayer(asyncAction.track)
        }
    }

    private fun loadAlbumTracks(id: Int, state: State) {
        if(state.tracks.isEmpty()) {
            dispatch(LoadAlbumDetailsStarted)

            viewModelScope.launch(CoroutineExceptionHandler { _, _ ->
                dispatch(LoadAlbumDetailsFailed)
            }) {
                val albumInfo = useCase.invoke(id)

                when (albumInfo.tracks.data.isNotEmpty()) {
                    true -> dispatch(LoadAlbumDetailsSuccess(albumInfo.tracks.data))
                    else -> dispatch(LoadAlbumDetailsFailed)
                }
            }
        }
    }
}