package com.renovavision.deezerplayer.tracks

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.renovavision.deezerplayer.inject.FragmentKey
import com.renovavision.deezerplayer.inject.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface TracksModule {

    @Binds
    @IntoMap
    @FragmentKey(TopTracksFragment::class)
    fun topTracksFragment(topTracksFragment: TopTracksFragment): Fragment

    @Binds
    @IntoMap
    @ViewModelKey(TopTracksViewModel::class)
    fun topTracksViewModel(topTracksViewModel: TopTracksViewModel): ViewModel
}