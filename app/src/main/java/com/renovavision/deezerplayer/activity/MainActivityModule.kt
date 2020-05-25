package com.renovavision.deezerplayer.activity

import androidx.lifecycle.ViewModelProvider
import com.renovavision.deezerplayer.album.AlbumModule
import com.renovavision.deezerplayer.artist.ArtistModule
import com.renovavision.deezerplayer.inject.ViewModelFactory
import com.renovavision.deezerplayer.tracks.TracksModule
import com.renovavision.player.PlayerModule
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface MainActivityModule {

    @Binds
    fun viewModelProviderFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    @ContributesAndroidInjector(
        modules = [
            TracksModule::class,
            ArtistModule::class,
            AlbumModule::class,
            PlayerModule::class,
            NavigationModule::class
        ]
    )
    fun mainActivity(): MainActivity
}