package com.renovavision.deezerplayer.activity

import com.renovavision.deezerplayer.album.AlbumNavigator
import com.renovavision.deezerplayer.artist.ArtistNavigator
import com.renovavision.deezerplayer.tracks.TrackNavigator
import com.renovavision.deezerplayer.ui.navigation.Navigator
import dagger.Binds
import dagger.Module

@Module
interface NavigationModule {

    @Binds
    fun provideNavigator(navigator: NavigatorImpl): Navigator

    @Binds
    fun provideArtistNavigator(navigator: NavigatorImpl): ArtistNavigator

    @Binds
    fun provideTrackNavigator(navigator: NavigatorImpl): TrackNavigator

    @Binds
    fun provideAlbumNavigator(navigator: NavigatorImpl): AlbumNavigator
}