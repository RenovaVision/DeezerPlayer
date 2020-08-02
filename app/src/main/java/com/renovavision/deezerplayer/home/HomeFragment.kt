package com.renovavision.deezerplayer.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.renovavision.deezerplayer.R
import com.renovavision.deezerplayer.artist.topartists.TopArtistsFragment
import com.renovavision.deezerplayer.databinding.FragmentHomeBinding
import com.renovavision.deezerplayer.tracks.TopTracksFragment
import com.renovavision.deezerplayer.ui.utils.TabAdapter
import com.renovavision.deezerplayer.ui.utils.bindingDelegate
import com.renovavision.deezerplayer.ui.utils.onViewLifecycle
import javax.inject.Inject

class HomeFragment @Inject constructor(
    private val viewModelFactory: ViewModelProvider.Factory
) : Fragment(R.layout.fragment_home) {

    private val binding by bindingDelegate(FragmentHomeBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val tabAdapter = TabAdapter(childFragmentManager)
        tabAdapter.addFragment(
            TopArtistsFragment(viewModelFactory),
            getString(R.string.top_artists)
        )
        tabAdapter.addFragment(TopTracksFragment(viewModelFactory), getString(R.string.top_tracks))

        onViewLifecycle({ binding.viewPager }, {
            adapter = tabAdapter
        })

        onViewLifecycle({ binding.tabLayout }, {
            setupWithViewPager(binding.viewPager)
        })
    }
}