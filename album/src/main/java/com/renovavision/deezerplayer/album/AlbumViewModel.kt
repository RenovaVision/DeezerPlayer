package com.renovavision.deezerplayer.album

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.renovavision.deezerplayer.domain.entities.AlbumInfoEntity.TracksEntity.AlbumTrackEntity
import com.renovavision.deezerplayer.domain.entities.PlayerModel
import com.renovavision.deezerplayer.domain.usecases.GetAlbumInfo
import com.renovavision.deezerplayer.utils.*
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import javax.inject.Inject

data class NavigateToPlayer(val track: PlayerModel) : ViewEvent

data class LoadAlbumInfo(val id: Int) : Event
data class TrackClicked(val track: PlayerModel) : Event

data class State(
    val isLoading: Boolean,
    val showError: Boolean,
    val tracks: List<AlbumTrackEntity> = emptyList()
)

class AlbumViewModel @Inject constructor(private val useCase: GetAlbumInfo) : BaseViewModel() {

    private val loadTracks = MutableLiveData<State>()
    private val action = SingleLiveEvent<ViewEvent>()

    val state: LiveData<State>
        get() = loadTracks
    val click: LiveData<ViewEvent>
        get() = action

    override fun dispatch(dispatchable: Dispatchable) {
        when (dispatchable) {
            is LoadAlbumInfo -> loadAlbumTracks(dispatchable.id)
            is TrackClicked -> action.value = NavigateToPlayer(dispatchable.track)
        }
    }

    private fun loadAlbumTracks(id: Int) {
        loadTracks.value = State(isLoading = true, showError = false)

        viewModelScope.launch(CoroutineExceptionHandler { _, _ ->
            loadTracks.value = State(isLoading = false, showError = true)
        }) {
            val albumInfo = useCase.invoke(id)

            when (albumInfo.tracks.data.isNotEmpty()) {
                true -> loadTracks.value = State(
                    isLoading = false,
                    showError = false,
                    tracks = albumInfo.tracks.data
                )
                else -> loadTracks.value = State(isLoading = false, showError = true)
            }
        }
    }
}