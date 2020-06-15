package com.renovavision.deezerplayer.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\f"}, d2 = {"Lcom/renovavision/deezerplayer/activity/NavigationModule;", "", "provideAlbumNavigator", "Lcom/renovavision/deezerplayer/album/AlbumNavigator;", "navigator", "Lcom/renovavision/deezerplayer/activity/NavigatorImpl;", "provideArtistNavigator", "Lcom/renovavision/deezerplayer/artist/ArtistNavigator;", "provideNavigator", "Lcom/renovavision/deezerplayer/ui/navigation/Navigator;", "provideTrackNavigator", "Lcom/renovavision/deezerplayer/tracks/TrackNavigator;", "app_debug"})
@dagger.Module()
public abstract interface NavigationModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.renovavision.deezerplayer.ui.navigation.Navigator provideNavigator(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.activity.NavigatorImpl navigator);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.renovavision.deezerplayer.artist.ArtistNavigator provideArtistNavigator(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.activity.NavigatorImpl navigator);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.renovavision.deezerplayer.tracks.TrackNavigator provideTrackNavigator(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.activity.NavigatorImpl navigator);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.renovavision.deezerplayer.album.AlbumNavigator provideAlbumNavigator(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.activity.NavigatorImpl navigator);
}