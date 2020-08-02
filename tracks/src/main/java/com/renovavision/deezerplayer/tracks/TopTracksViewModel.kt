package com.renovavision.deezerplayer.tracks

import androidx.lifecycle.viewModelScope
import com.renovavision.deezerplayer.domain.CoroutineDispatcherProvider
import com.renovavision.deezerplayer.domain.entities.Artist
import com.renovavision.deezerplayer.domain.entities.PlayerModel
import com.renovavision.deezerplayer.domain.entities.TopTracks.*
import com.renovavision.deezerplayer.domain.usecases.GetTopTracks
import com.renovavision.deezerplayer.ui.uni.Action
import com.renovavision.deezerplayer.ui.uni.AsyncAction
import com.renovavision.deezerplayer.ui.uni.UniViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import javax.inject.Inject

object LoadTopTracks : AsyncAction
data class ArtistClicked(val artist: Artist) : AsyncAction
data class TrackClicked(val track: PlayerModel) : AsyncAction

object LoadTopTracksStarted : Action
object LoadTopTracksFailed : Action
data class LoadTopTracksSuccess(val topTracks: List<Track>) : Action

data class State(
    val isLoading: Boolean,
    val showError: Boolean,
    val topTracks: List<Track> = emptyList()
)

@ExperimentalCoroutinesApi
class TopTracksViewModel @Inject constructor(
    private val useCase: GetTopTracks,
    private val tracksNavigator: TrackNavigator,
    dispatcherProvider: CoroutineDispatcherProvider
) : UniViewModel<State>(dispatcherProvider.ioDispatcher()) {

    @ExperimentalCoroutinesApi
    override fun getDefaultState() = State(isLoading = true, showError = false)

    override fun reduce(state: State, action: Action) =
        when (action) {
            is LoadTopTracksStarted -> state.copy(isLoading = true)
            is LoadTopTracksFailed -> state.copy(isLoading = true, showError = false)
            is LoadTopTracksSuccess -> state.copy(
                isLoading = false,
                showError = false,
                topTracks = action.topTracks
            )
            else -> state
        }

    override fun async(state: State, asyncAction: AsyncAction) {
        when (asyncAction) {
            is ArtistClicked -> tracksNavigator.navTopTracksToArtist(asyncAction.artist)
            is TrackClicked -> tracksNavigator.navTopTracksToPlayer(asyncAction.track)
            is LoadTopTracks -> loadTopTracks(state)
        }
    }

    private fun loadTopTracks(state: State) {
        if (state.topTracks.isEmpty()) {
            dispatch(LoadTopTracksStarted)

            viewModelScope.launch(CoroutineExceptionHandler { _, _ ->
                dispatch(LoadTopTracksFailed)
            }) {
                val topTracks = useCase.getTopTracks()

                when (topTracks.data.isNotEmpty()) {
                    true -> dispatch(LoadTopTracksSuccess(topTracks.data))
                    else -> dispatch(LoadTopTracksFailed)
                }
            }
        }
    }
}