package com.renovavision.deezerplayer.tracks

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.renovavision.deezerplayer.domain.entities.ArtistEntity
import com.renovavision.deezerplayer.domain.entities.PlayerModel
import com.renovavision.deezerplayer.tracks.databinding.FragmentTopTracksBinding
import com.renovavision.deezerplayer.utils.bindingDelegate
import com.renovavision.deezerplayer.utils.observe
import com.renovavision.deezerplayer.utils.onViewLifecycle
import javax.inject.Inject
import javax.inject.Named

class TopTracksFragment @Inject constructor(
    private val viewModelFactory: ViewModelProvider.Factory,
    @Named("navTopTracksToArtist")
    private val navTopTracksToArtist: (artist: @JvmSuppressWildcards ArtistEntity) -> Unit,
    @Named("navTopTracksToPlayer")
    private val navTopTracksToPlayer: (track: @JvmSuppressWildcards PlayerModel) -> Unit
) : Fragment(R.layout.fragment_top_tracks) {

    private val viewModel: TopTracksViewModel by viewModels { viewModelFactory }

    private val binding by bindingDelegate(FragmentTopTracksBinding::bind)

    private val tracksAdapter = TracksAdapter { viewModel.dispatch(it) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        onViewLifecycle({ binding.tracksRecyclerView }, {
            layoutManager = LinearLayoutManager(
                context,
                RecyclerView.VERTICAL,
                false
            )
            adapter = tracksAdapter
        })

        onViewLifecycle({ binding.errorContainer }, {
            clickListener = View.OnClickListener { viewModel.dispatch(LoadTopTracks) }
            errorMessage = getString(R.string.can_not_load_tracks)
        }, {
            clickListener = null
        })

        viewModel.dispatch(LoadTopTracks)
    }

    override fun onStart() {
        super.onStart()

        viewModel.state.observe(this) {
            tracksAdapter.updateItems(it.topTracks)

            binding.tracksRecyclerView.visibility = if (!it.showError) View.VISIBLE else View.GONE
            binding.errorContainer.visibility = if (it.showError) View.VISIBLE else View.GONE
            binding.progress.visibility = if (it.isLoading) View.VISIBLE else View.GONE
        }

        viewModel.action.observe(this) {
            when (it) {
                is NavigateToArtist -> navTopTracksToArtist(it.artist)
                is NavigateToPlayer -> navTopTracksToPlayer(it.track)
            }
        }
    }
}