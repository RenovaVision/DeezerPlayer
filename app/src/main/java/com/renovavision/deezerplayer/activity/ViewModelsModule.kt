package com.renovavision.deezerplayer.activity

import androidx.lifecycle.ViewModel
import com.renovavision.deezerplayer.album.AlbumViewModel
import com.renovavision.deezerplayer.artist.artistinfo.ArtistViewModel
import com.renovavision.deezerplayer.artist.topartists.TopArtistsViewModel
import com.renovavision.deezerplayer.inject.ViewModelKey
import com.renovavision.deezerplayer.tracks.TopTracksViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@Module
interface ViewModelsModule{

    @Binds
    @IntoMap
    @ViewModelKey(TopArtistsViewModel::class)
    fun topArtistsViewModel(topArtistsViewModel: TopArtistsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ArtistViewModel::class)
    fun artistViewModel(artistViewModel: ArtistViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TopTracksViewModel::class)
    fun topTracksViewModel(topTracksViewModel: TopTracksViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(AlbumViewModel::class)
    fun albumViewModel(albumViewModel: AlbumViewModel): ViewModel
}