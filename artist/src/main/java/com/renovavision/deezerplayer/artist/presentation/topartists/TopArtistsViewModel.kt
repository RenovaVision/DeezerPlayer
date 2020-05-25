package com.renovavision.deezerplayer.artist.presentation.topartists

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.renovavision.deezerplayer.domain.entities.ArtistEntity
import com.renovavision.deezerplayer.domain.entities.TopArtistsEntity
import com.renovavision.deezerplayer.domain.usecases.GetHomeModel
import com.renovavision.deezerplayer.utils.*
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import javax.inject.Inject

data class NavigateToArtist(val artist: ArtistEntity) : ViewEvent

object LoadTopArtists : Event
data class ArtistClicked(val artist: ArtistEntity) : Event

data class State(
    val isLoading: Boolean,
    val showError: Boolean,
    val topArtists: TopArtistsEntity? = null
)

class TopArtistsViewModel @Inject constructor(private val useCase: GetHomeModel) : BaseViewModel() {

    private val loadTopArtists = MutableLiveData<State>()
    private val actions = SingleLiveEvent<ViewEvent>()

    val state: LiveData<State>
        get() = loadTopArtists

    val action: LiveData<ViewEvent>
        get() = actions

    override fun dispatch(dispatchable: Dispatchable) {
        when (dispatchable) {
            is LoadTopArtists -> loadArtists()
            is ArtistClicked -> actions.value =
                NavigateToArtist(
                    dispatchable.artist
                )
        }
    }

    private fun loadArtists() {
        loadTopArtists.value = State(
            isLoading = true,
            showError = false
        )

        viewModelScope.launch(CoroutineExceptionHandler { _, _ ->
            loadTopArtists.value =
                State(
                    isLoading = false,
                    showError = true
                )
        }) {
            val topArtists = useCase.getTopArtists()

            when (topArtists.data.isNotEmpty()) {
                true -> loadTopArtists.value =
                    State(
                        isLoading = false,
                        showError = false,
                        topArtists = topArtists
                    )
                else -> loadTopArtists.value =
                    State(
                        isLoading = false,
                        showError = true
                    )
            }
        }
    }
}