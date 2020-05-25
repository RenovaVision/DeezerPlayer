package com.renovavision.deezerplayer.tracks

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.renovavision.deezerplayer.domain.entities.ArtistEntity
import com.renovavision.deezerplayer.domain.entities.PlayerModel
import com.renovavision.deezerplayer.domain.entities.TopTracksEntity.*
import com.renovavision.deezerplayer.domain.usecases.GetHomeModel
import com.renovavision.deezerplayer.utils.*
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import javax.inject.Inject

data class NavigateToArtist(val artist: ArtistEntity) : ViewEvent
data class NavigateToPlayer(val track: PlayerModel) : ViewEvent

object LoadTopTracks : Event
data class ArtistClicked(val artist: ArtistEntity) : Event
data class TrackClicked(val track: PlayerModel) : Event

data class State(
    val isLoading: Boolean,
    val showError: Boolean,
    val topTracks: List<TrackEntity> = emptyList()
)

class TopTracksViewModel @Inject constructor(private val useCase: GetHomeModel) : BaseViewModel() {

    private val loadTopTracks = MutableLiveData<State>()
    private val actions = SingleLiveEvent<ViewEvent>()

    val state: LiveData<State>
        get() = loadTopTracks

    val action: LiveData<ViewEvent>
        get() = actions

    override fun dispatch(dispatchable: Dispatchable) {
        when (dispatchable) {
            is LoadTopTracks -> loadTracks()
            is ArtistClicked -> actions.value =
                NavigateToArtist(
                    dispatchable.artist
                )
            is TrackClicked -> actions.value = NavigateToPlayer(dispatchable.track)
        }
    }

    private fun loadTracks() {
        loadTopTracks.value = State(
            isLoading = true,
            showError = false
        )

        viewModelScope.launch(CoroutineExceptionHandler { _, _ ->
            loadTopTracks.value =
                State(
                    isLoading = false,
                    showError = true
                )
        }) {
            val topTracks = useCase.getTopTracks()

            when (topTracks.data.isNotEmpty()) {
                true -> loadTopTracks.value =
                    State(
                        isLoading = false,
                        showError = false,
                        topTracks = topTracks.data
                    )
                else -> loadTopTracks.value =
                    State(
                        isLoading = false,
                        showError = true
                    )
            }
        }
    }
}