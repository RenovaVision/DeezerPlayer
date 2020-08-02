package com.renovavision.deezerplayer.activity

import androidx.navigation.findNavController
import com.renovavision.deezerplayer.R
import com.renovavision.deezerplayer.album.AlbumFragmentDirections
import com.renovavision.deezerplayer.album.AlbumNavigator
import com.renovavision.deezerplayer.artist.ArtistNavigator
import com.renovavision.deezerplayer.artist.artistinfo.ArtistFragmentDirections
import com.renovavision.deezerplayer.artist.topartists.TopArtistsFragmentDirections
import com.renovavision.deezerplayer.domain.entities.Artist
import com.renovavision.deezerplayer.domain.entities.PlayerModel
import com.renovavision.deezerplayer.tracks.TopTracksFragmentDirections
import com.renovavision.deezerplayer.tracks.TrackNavigator
import com.renovavision.deezerplayer.ui.navigation.Navigator
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NavigatorImpl @Inject constructor() : Navigator,
    ArtistNavigator, TrackNavigator, AlbumNavigator {

    private var activity: MainActivity? = null

    fun bind(mainActivity: MainActivity) {
        this.activity = mainActivity
    }

    fun unbind() {
        this.activity = null
    }

    override fun navBack() {
        activity?.apply {
            runOnUiThread {
                findNavController(R.id.navHostFragment).popBackStack()
            }
        }
    }

    override fun navTopArtistsToArtist(artist: Artist) {
        activity?.apply {
            runOnUiThread {
                findNavController(R.id.navHostFragment).navigate(
                    TopArtistsFragmentDirections.navigateToArtist(artist)
                )
            }
        }
    }

    override fun navArtistToAlbum(id: Int) {
        activity?.apply {
            runOnUiThread {
                findNavController(R.id.navHostFragment).navigate(
                    ArtistFragmentDirections.navigateToAlbumInfo(id)
                )
            }
        }
    }

    override fun navArtistToPlayer(track: PlayerModel) {
        activity?.apply {
            runOnUiThread {
                findNavController(R.id.navHostFragment).navigate(
                    ArtistFragmentDirections.navigateToPlayer(track)
                )
            }
        }
    }

    override fun navTopTracksToArtist(artist: Artist) {
        activity?.apply {
            runOnUiThread {
                findNavController(R.id.navHostFragment).navigate(
                    TopTracksFragmentDirections.navigateToArtist(artist)
                )
            }
        }
    }

    override fun navTopTracksToPlayer(track: PlayerModel) {
        activity?.apply {
            runOnUiThread {
                findNavController(R.id.navHostFragment).navigate(
                    TopTracksFragmentDirections.navigateToPlayer(track)
                )
            }
        }
    }

    override fun navAlbumToPlayer(track: PlayerModel) {
        activity?.apply {
            runOnUiThread {
                findNavController(R.id.navHostFragment).navigate(
                    AlbumFragmentDirections.navigateToPlayer(track)
                )
            }
        }
    }
}