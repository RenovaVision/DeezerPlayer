package com.renovavision.deezerplayer.activity;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\'J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/renovavision/deezerplayer/activity/ViewModelsModule;", "", "albumViewModel", "Landroidx/lifecycle/ViewModel;", "Lcom/renovavision/deezerplayer/album/AlbumViewModel;", "artistViewModel", "Lcom/renovavision/deezerplayer/artist/artistinfo/ArtistViewModel;", "topArtistsViewModel", "Lcom/renovavision/deezerplayer/artist/topartists/TopArtistsViewModel;", "topTracksViewModel", "Lcom/renovavision/deezerplayer/tracks/TopTracksViewModel;", "app_debug"})
@dagger.Module()
public abstract interface ViewModelsModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.renovavision.deezerplayer.inject.ViewModelKey(value = com.renovavision.deezerplayer.artist.topartists.TopArtistsViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel topArtistsViewModel(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.artist.topartists.TopArtistsViewModel topArtistsViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.renovavision.deezerplayer.inject.ViewModelKey(value = com.renovavision.deezerplayer.artist.artistinfo.ArtistViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel artistViewModel(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.artist.artistinfo.ArtistViewModel artistViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.renovavision.deezerplayer.inject.ViewModelKey(value = com.renovavision.deezerplayer.tracks.TopTracksViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel topTracksViewModel(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.tracks.TopTracksViewModel topTracksViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.renovavision.deezerplayer.inject.ViewModelKey(value = com.renovavision.deezerplayer.album.AlbumViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel albumViewModel(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.album.AlbumViewModel albumViewModel);
}