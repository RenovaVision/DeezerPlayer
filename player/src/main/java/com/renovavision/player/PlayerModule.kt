package com.renovavision.player

import androidx.fragment.app.Fragment
import com.renovavision.deezerplayer.inject.FragmentKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface PlayerModule {

    @Binds
    @IntoMap
    @FragmentKey(PlayerFragment::class)
    fun playerFragment(playerFragment: PlayerFragment): Fragment
}