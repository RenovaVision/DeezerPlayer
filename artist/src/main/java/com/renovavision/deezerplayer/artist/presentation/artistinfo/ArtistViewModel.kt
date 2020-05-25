package com.renovavision.deezerplayer.artist.presentation.artistinfo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.renovavision.deezerplayer.domain.entities.PlayerModel
import com.renovavision.deezerplayer.domain.usecases.ArtistModel
import com.renovavision.deezerplayer.domain.usecases.GetArtistModel
import com.renovavision.deezerplayer.utils.*
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import javax.inject.Inject

data class NavigateToAlbum(val id: Int) : ViewEvent
data class NavigateToPlayer(val track: PlayerModel) : ViewEvent

data class LoadArtistTracks(val id: Int) : Event
data class AlbumClicked(val id: Int) : Event
data class TrackClicked(val track: PlayerModel) : Event

data class State(
    val isLoading: Boolean,
    val showError: Boolean,
    val model: ArtistModel? = null
)

class ArtistViewModel @Inject constructor(private val useCase: GetArtistModel) : BaseViewModel() {

    private val loadTracks = MutableLiveData<State>()
    private val actions = SingleLiveEvent<ViewEvent>()

    val state: LiveData<State>
        get() = loadTracks

    val action: LiveData<ViewEvent>
        get() = actions

    override fun dispatch(dispatchable: Dispatchable) {
        when (dispatchable) {
            is LoadArtistTracks -> loadArtistTracks(dispatchable.id)
            is AlbumClicked -> actions.value =
                NavigateToAlbum(
                    dispatchable.id
                )
            is TrackClicked -> actions.value =
                NavigateToPlayer(
                    dispatchable.track
                )
        }
    }

    private fun loadArtistTracks(id: Int) {
        loadTracks.value =
            State(
                isLoading = true,
                showError = false
            )

        viewModelScope.launch(CoroutineExceptionHandler { _, _ ->
            loadTracks.value =
                State(
                    isLoading = false,
                    showError = true
                )
        }) {
            val artistModel = useCase.invoke(id)

            when (artistModel.artistAlbums.data.isNotEmpty() && artistModel.artistTracks.data.isNotEmpty()) {
                true -> loadTracks.value =
                    State(
                        isLoading = false,
                        showError = false,
                        model = artistModel
                    )
                else -> loadTracks.value =
                    State(
                        isLoading = false,
                        showError = true
                    )
            }
        }
    }
}