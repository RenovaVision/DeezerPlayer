package com.renovavision.deezerplayer.artist.topartists

import androidx.lifecycle.viewModelScope
import com.renovavision.deezerplayer.artist.ArtistNavigator
import com.renovavision.deezerplayer.domain.CoroutineDispatcherProvider
import com.renovavision.deezerplayer.domain.entities.Artist
import com.renovavision.deezerplayer.domain.entities.TopArtists
import com.renovavision.deezerplayer.domain.usecases.GetTopArtists
import com.renovavision.deezerplayer.ui.uni.Action
import com.renovavision.deezerplayer.ui.uni.AsyncAction
import com.renovavision.deezerplayer.ui.uni.UniViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import javax.inject.Inject

object LoadTopArtists : AsyncAction
data class ArtistClicked(val artist: Artist) : AsyncAction

object LoadTopArtistsStarted : Action
object LoadTopArtistsFailed : Action
data class LoadTopArtistsSuccess(val topArtists: TopArtists) : Action

data class State(
    val isLoading: Boolean,
    val showError: Boolean,
    val topArtists: TopArtists? = null
)

@ExperimentalCoroutinesApi
class TopArtistsViewModel @Inject constructor(
    private val useCase: GetTopArtists,
    private val artistNavigator: ArtistNavigator,
    dispatcherProvider: CoroutineDispatcherProvider
) : UniViewModel<State>(dispatcherProvider.ioDispatcher()) {

    @ExperimentalCoroutinesApi
    override fun getDefaultState() = State(isLoading = true, showError = false)

    override fun reduce(state: State, action: Action) =
        when (action) {
            is LoadTopArtistsStarted -> state.copy(isLoading = true)
            is LoadTopArtistsFailed -> state.copy(isLoading = false, showError = false)
            is LoadTopArtistsSuccess -> state.copy(
                isLoading = false,
                showError = false,
                topArtists = action.topArtists
            )
            else -> state
        }

    override fun async(state: State, asyncAction: AsyncAction) {
        when (asyncAction) {
            is ArtistClicked -> artistNavigator.navTopArtistsToArtist(asyncAction.artist)
            is LoadTopArtists -> loadTopArtists(state)
        }
    }

    private fun loadTopArtists(state: State) {
        if (state.topArtists == null) {
            dispatch(LoadTopArtistsStarted)

            viewModelScope.launch(CoroutineExceptionHandler { _, _ ->
                dispatch(LoadTopArtistsFailed)
            }) {
                val topArtists = useCase.getTopArtists()

                when (topArtists.data.isNotEmpty()) {
                    true -> dispatch(LoadTopArtistsSuccess(topArtists))
                    else -> dispatch(LoadTopArtistsFailed)
                }
            }
        }
    }
}