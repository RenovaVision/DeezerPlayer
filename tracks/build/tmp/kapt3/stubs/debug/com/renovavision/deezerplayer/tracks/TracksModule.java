package com.renovavision.deezerplayer.tracks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Lcom/renovavision/deezerplayer/tracks/TracksModule;", "", "topTracksFragment", "Landroidx/fragment/app/Fragment;", "Lcom/renovavision/deezerplayer/tracks/TopTracksFragment;", "topTracksViewModel", "Landroidx/lifecycle/ViewModel;", "Lcom/renovavision/deezerplayer/tracks/TopTracksViewModel;", "tracks_debug"})
@dagger.Module()
public abstract interface TracksModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.renovavision.deezerplayer.inject.FragmentKey(value = com.renovavision.deezerplayer.tracks.TopTracksFragment.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.fragment.app.Fragment topTracksFragment(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.tracks.TopTracksFragment topTracksFragment);
    
    @org.jetbrains.annotations.NotNull()
    @com.renovavision.deezerplayer.inject.ViewModelKey(value = com.renovavision.deezerplayer.tracks.TopTracksViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel topTracksViewModel(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.tracks.TopTracksViewModel topTracksViewModel);
}