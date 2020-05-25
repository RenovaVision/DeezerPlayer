package com.renovavision.deezerplayer.album;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Lcom/renovavision/deezerplayer/album/AlbumModule;", "", "albumFragment", "Landroidx/fragment/app/Fragment;", "Lcom/renovavision/deezerplayer/album/AlbumFragment;", "albumViewModel", "Landroidx/lifecycle/ViewModel;", "Lcom/renovavision/deezerplayer/album/AlbumViewModel;", "album_debug"})
@dagger.Module()
public abstract interface AlbumModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.renovavision.deezerplayer.inject.FragmentKey(value = com.renovavision.deezerplayer.album.AlbumFragment.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.fragment.app.Fragment albumFragment(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.album.AlbumFragment albumFragment);
    
    @org.jetbrains.annotations.NotNull()
    @com.renovavision.deezerplayer.inject.ViewModelKey(value = com.renovavision.deezerplayer.album.AlbumViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel albumViewModel(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.album.AlbumViewModel albumViewModel);
}