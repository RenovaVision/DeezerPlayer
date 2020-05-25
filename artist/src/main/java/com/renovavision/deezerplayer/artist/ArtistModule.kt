package com.renovavision.deezerplayer.artist

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.renovavision.deezerplayer.artist.presentation.artistinfo.ArtistFragment
import com.renovavision.deezerplayer.artist.presentation.artistinfo.ArtistViewModel
import com.renovavision.deezerplayer.artist.presentation.topartists.TopArtistsFragment
import com.renovavision.deezerplayer.artist.presentation.topartists.TopArtistsViewModel
import com.renovavision.deezerplayer.inject.FragmentKey
import com.renovavision.deezerplayer.inject.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ArtistModule {

    @Binds
    @IntoMap
    @FragmentKey(TopArtistsFragment::class)
    fun topArtistsFragment(topArtistsFragment: TopArtistsFragment): Fragment

    @Binds
    @IntoMap
    @ViewModelKey(TopArtistsViewModel::class)
    fun topArtistsViewModel(topArtistsViewModel: TopArtistsViewModel): ViewModel

    @Binds
    @IntoMap
    @FragmentKey(ArtistFragment::class)
    fun artistFragment(artistFragment: ArtistFragment): Fragment

    @Binds
    @IntoMap
    @ViewModelKey(ArtistViewModel::class)
    fun artistViewModel(artistViewModel: ArtistViewModel): ViewModel
}