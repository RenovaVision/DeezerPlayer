package com.renovavision.deezerplayer.activity

import androidx.fragment.app.Fragment
import com.renovavision.deezerplayer.album.AlbumFragment
import com.renovavision.deezerplayer.artist.artistinfo.ArtistFragment
import com.renovavision.deezerplayer.artist.topartists.TopArtistsFragment
import com.renovavision.deezerplayer.inject.FragmentKey
import com.renovavision.deezerplayer.tracks.TopTracksFragment
import com.renovavision.player.PlayerFragment
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@Module
interface FragmentsModule {

    @Binds
    @IntoMap
    @FragmentKey(TopArtistsFragment::class)
    fun topArtistsFragment(topArtistsFragment: TopArtistsFragment): Fragment

    @Binds
    @IntoMap
    @FragmentKey(ArtistFragment::class)
    fun artistFragment(artistFragment: ArtistFragment): Fragment

    @Binds
    @IntoMap
    @FragmentKey(TopTracksFragment::class)
    fun topTracksFragment(topTracksFragment: TopTracksFragment): Fragment

    @Binds
    @IntoMap
    @FragmentKey(AlbumFragment::class)
    fun albumFragment(albumFragment: AlbumFragment): Fragment

    @Binds
    @IntoMap
    @FragmentKey(PlayerFragment::class)
    fun playerFragment(playerFragment: PlayerFragment): Fragment
}