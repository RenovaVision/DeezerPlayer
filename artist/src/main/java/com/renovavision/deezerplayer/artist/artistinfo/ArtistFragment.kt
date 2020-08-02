package com.renovavision.deezerplayer.artist.artistinfo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.HORIZONTAL
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import com.renovavision.deezerplayer.artist.R
import com.renovavision.deezerplayer.artist.databinding.FragmentArtistBinding
import com.renovavision.deezerplayer.domain.entities.Artist
import com.renovavision.deezerplayer.ui.utils.bindingDelegate
import com.renovavision.deezerplayer.ui.utils.observe
import com.renovavision.deezerplayer.ui.utils.onViewLifecycle
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

@ExperimentalCoroutinesApi
class ArtistFragment @Inject constructor(
    private val viewModelFactory: ViewModelProvider.Factory
) : Fragment(R.layout.fragment_artist) {

    private val viewModel: ArtistViewModel by viewModels { viewModelFactory }

    private val binding by bindingDelegate(FragmentArtistBinding::bind)

    private val tracksAdapter =
        TracksAdapter {
            viewModel.dispatch(
                it
            )
        }
    private val albumsAdapter =
        AlbumsAdapter {
            viewModel.dispatch(it)
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val artist = arguments?.getSerializable("artist")?.let { it as Artist }

        initViews(artist)

        artist?.let {
            viewModel.dispatch(
                LoadArtistModel(
                    it.id
                )
            )
        }
    }

    private fun initViews(artist: Artist?) {
        onViewLifecycle({ binding.toolbar }, {
            title = getString(R.string.artist)
        })

        onViewLifecycle({ binding.artistView }, {
            artist?.let { artistInfo = it }
        })

        onViewLifecycle({ binding.errorContainer }, {
            errorMessage = getString(R.string.can_not_load_artist)
            clickListener =
                View.OnClickListener {
                    artist?.let {
                        viewModel.dispatch(
                            LoadArtistModel(
                                it.id
                            )
                        )
                    }
                }
        }, {
            clickListener = null
        })

        onViewLifecycle({ binding.albumsRecyclerView }, {
            layoutManager = GridLayoutManager(context, 2, HORIZONTAL, false)
            setHasFixedSize(true)
            adapter = albumsAdapter
        })

        onViewLifecycle({ binding.tracksRecyclerView }, {
            layoutManager = LinearLayoutManager(context, VERTICAL, false)
            setHasFixedSize(true)
            adapter = tracksAdapter
        })
    }

    override fun onStart() {
        super.onStart()

        viewModel.state.observe(this) {
            it.model?.let { model ->
                tracksAdapter.updateItems(model.artistTracks.data)
                albumsAdapter.updateItems(model.artistAlbums.data)
            }

            binding.container.visibility = if (!it.showError) View.VISIBLE else View.GONE
            binding.errorContainer.visibility = if (it.showError) View.VISIBLE else View.GONE
            binding.progress.visibility = if (it.isLoading) View.VISIBLE else View.GONE
        }
    }
}