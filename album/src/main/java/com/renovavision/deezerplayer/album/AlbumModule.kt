package com.renovavision.deezerplayer.album

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.renovavision.deezerplayer.inject.FragmentKey
import com.renovavision.deezerplayer.inject.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface AlbumModule {

    @Binds
    @IntoMap
    @FragmentKey(AlbumFragment::class)
    fun albumFragment(albumFragment: AlbumFragment): Fragment

    @Binds
    @IntoMap
    @ViewModelKey(AlbumViewModel::class)
    fun albumViewModel(albumViewModel: AlbumViewModel): ViewModel
}