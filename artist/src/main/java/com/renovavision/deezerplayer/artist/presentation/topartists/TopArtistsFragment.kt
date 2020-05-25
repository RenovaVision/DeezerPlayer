package com.renovavision.deezerplayer.artist.presentation.topartists

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.renovavision.deezerplayer.artist.R
import com.renovavision.deezerplayer.artist.databinding.FragmentTopArtistsBinding
import com.renovavision.deezerplayer.domain.entities.ArtistEntity
import com.renovavision.deezerplayer.utils.bindingDelegate
import com.renovavision.deezerplayer.utils.observe
import com.renovavision.deezerplayer.utils.onViewLifecycle
import javax.inject.Inject
import javax.inject.Named

class TopArtistsFragment @Inject constructor(
    private val viewModelFactory: ViewModelProvider.Factory,
    @Named("navTopArtistsToArtist")
    private val navTopArtistsToArtist: (artist: @JvmSuppressWildcards ArtistEntity) -> Unit
) : Fragment(R.layout.fragment_top_artists) {

    private val viewModel: TopArtistsViewModel by viewModels { viewModelFactory }

    private val binding by bindingDelegate(FragmentTopArtistsBinding::bind)

    private val artistsAdapter = ArtistsAdapter { viewModel.dispatch(it) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        onViewLifecycle({ binding.artistsRecyclerView }, {
            layoutManager = LinearLayoutManager(
                context,
                RecyclerView.VERTICAL,
                false
            )
            adapter = artistsAdapter
        })

        onViewLifecycle({ binding.errorContainer }, {
            clickListener = android.view.View.OnClickListener { viewModel.dispatch(LoadTopArtists) }
            errorMessage = getString(R.string.can_not_load_artist)
        }, {
            clickListener = null
        })

        viewModel.dispatch(LoadTopArtists)
    }

    override fun onStart() {
        super.onStart()

        viewModel.state.observe(this) {
            it.topArtists?.data?.let { list -> artistsAdapter.updateItems(list) }

            binding.artistsRecyclerView.visibility = if (!it.showError) View.VISIBLE else View.GONE
            binding.errorContainer.visibility = if (it.showError) View.VISIBLE else View.GONE
            binding.progress.visibility = if (it.isLoading) View.VISIBLE else View.GONE
        }

        viewModel.action.observe(this) {
            when (it) {
                is NavigateToArtist -> navTopArtistsToArtist(it.artist)
            }
        }
    }
}