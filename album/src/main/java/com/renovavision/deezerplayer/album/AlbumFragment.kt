package com.renovavision.deezerplayer.album

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import com.renovavision.deezerplayer.album.databinding.FragmentAlbumBinding
import com.renovavision.deezerplayer.domain.entities.PlayerModel
import com.renovavision.deezerplayer.utils.bindingDelegate
import com.renovavision.deezerplayer.utils.observe
import com.renovavision.deezerplayer.utils.onViewLifecycle
import javax.inject.Inject
import javax.inject.Named

class AlbumFragment @Inject constructor(
    private val viewModelFactory: ViewModelProvider.Factory,
    @Named("navAlbumToPlayer")
    private val navAlbumToPlayer: (track: @JvmSuppressWildcards PlayerModel) -> Unit
) : Fragment(R.layout.fragment_album) {

    private val viewModel: AlbumViewModel by viewModels { viewModelFactory }

    private val binding by bindingDelegate(FragmentAlbumBinding::bind)

    private val albumTracksAdapter = AlbumTracksAdapter { viewModel.dispatch(it) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val albumId = arguments?.getInt("albumId")

        onViewLifecycle({ binding.toolbar }, {
            title = getString(R.string.album)
        })

        onViewLifecycle({ binding.errorContainer }, {
            errorMessage = getString(R.string.can_not_load_album)
            clickListener =
                View.OnClickListener { albumId?.let { viewModel.dispatch(LoadAlbumInfo(it)) } }
        }, {
            clickListener = null
        })

        onViewLifecycle({ binding.recyclerView }, {
            layoutManager = LinearLayoutManager(context, VERTICAL, false)
            adapter = albumTracksAdapter
        })

        albumId?.let { viewModel.dispatch(LoadAlbumInfo(it)) }
    }

    override fun onStart() {
        super.onStart()

        viewModel.state.observe(this) {
            albumTracksAdapter.updateItems(it.tracks)
            binding.recyclerView.visibility = if (!it.showError) View.VISIBLE else View.GONE
            binding.errorContainer.visibility = if (it.showError) View.VISIBLE else View.GONE
            binding.progress.visibility = if (it.isLoading) View.VISIBLE else View.GONE
        }

        viewModel.click.observe(this) {
            when (it) {
                is NavigateToPlayer -> navAlbumToPlayer(it.track)
            }
        }
    }
}