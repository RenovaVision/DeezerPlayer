package com.renovavision.deezerplayer.activity

import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.renovavision.deezerplayer.R
import com.renovavision.deezerplayer.album.AlbumFragmentDirections
import com.renovavision.deezerplayer.artist.presentation.artistinfo.ArtistFragmentDirections
import com.renovavision.deezerplayer.artist.presentation.topartists.TopArtistsFragmentDirections
import com.renovavision.deezerplayer.domain.entities.ArtistEntity
import com.renovavision.deezerplayer.domain.entities.PlayerModel
import com.renovavision.deezerplayer.inject.FragmentKey
import com.renovavision.deezerplayer.tracks.TopTracksFragmentDirections
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import javax.inject.Named

@Module
internal object NavigationModule {

    @Provides
    @IntoMap
    @FragmentKey(NavHostFragment::class)
    fun navHostFragment(): Fragment = NavHostFragment()

    @Provides
    @Named("navTopTracksToArtist")
    fun navTopTracksToArtist(mainActivity: MainActivity): (artist: ArtistEntity) -> Unit = {
        mainActivity.findNavController(R.id.navHostFragment).navigate(
            TopTracksFragmentDirections.navigateToArtist(it)
        )
    }

    @Provides
    @Named("navTopTracksToPlayer")
    fun navHomeToPlayer(mainActivity: MainActivity): (track: PlayerModel) -> Unit = {
        mainActivity.findNavController(R.id.navHostFragment).navigate(
            TopTracksFragmentDirections.navigateToPlayer(it)
        )
    }

    @Provides
    @Named("navTopArtistsToArtist")
    fun navTopArtistsToArtist(mainActivity: MainActivity): (artist: ArtistEntity) -> Unit = {
        mainActivity.findNavController(R.id.navHostFragment).navigate(
            TopArtistsFragmentDirections.navigateToArtist(it)
        )
    }

    @Provides
    @Named("navArtistToAlbum")
    fun navArtistToAlbum(mainActivity: MainActivity): (id: Int) -> Unit = {
        mainActivity.findNavController(R.id.navHostFragment).navigate(
            ArtistFragmentDirections.navigateToAlbumInfo(it)
        )
    }

    @Provides
    @Named("navArtistToPlayer")
    fun navArtistToPlayer(mainActivity: MainActivity): (track: PlayerModel) -> Unit = {
        mainActivity.findNavController(R.id.navHostFragment).navigate(
            ArtistFragmentDirections.navigateToPlayer(it)
        )
    }

    @Provides
    @Named("navAlbumToPlayer")
    fun navAlbumToPlayer(mainActivity: MainActivity): (track: PlayerModel) -> Unit = {
        mainActivity.findNavController(R.id.navHostFragment).navigate(
            AlbumFragmentDirections.navigateToPlayer(it)
        )
    }

    @Provides
    @Named("navBack")
    fun navBack(mainActivity: MainActivity): () -> Boolean = {
        mainActivity.findNavController(R.id.navHostFragment).popBackStack()
    }
}