package com.renovavision.deezerplayer.artist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0007H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Lcom/renovavision/deezerplayer/artist/ArtistModule;", "", "artistFragment", "Landroidx/fragment/app/Fragment;", "Lcom/renovavision/deezerplayer/artist/presentation/artistinfo/ArtistFragment;", "artistViewModel", "Landroidx/lifecycle/ViewModel;", "Lcom/renovavision/deezerplayer/artist/presentation/artistinfo/ArtistViewModel;", "topArtistsFragment", "Lcom/renovavision/deezerplayer/artist/presentation/topartists/TopArtistsFragment;", "topArtistsViewModel", "Lcom/renovavision/deezerplayer/artist/presentation/topartists/TopArtistsViewModel;", "artist_debug"})
@dagger.Module()
public abstract interface ArtistModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.renovavision.deezerplayer.inject.FragmentKey(value = com.renovavision.deezerplayer.artist.presentation.topartists.TopArtistsFragment.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.fragment.app.Fragment topArtistsFragment(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.artist.presentation.topartists.TopArtistsFragment topArtistsFragment);
    
    @org.jetbrains.annotations.NotNull()
    @com.renovavision.deezerplayer.inject.ViewModelKey(value = com.renovavision.deezerplayer.artist.presentation.topartists.TopArtistsViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel topArtistsViewModel(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.artist.presentation.topartists.TopArtistsViewModel topArtistsViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.renovavision.deezerplayer.inject.FragmentKey(value = com.renovavision.deezerplayer.artist.presentation.artistinfo.ArtistFragment.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.fragment.app.Fragment artistFragment(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.artist.presentation.artistinfo.ArtistFragment artistFragment);
    
    @org.jetbrains.annotations.NotNull()
    @com.renovavision.deezerplayer.inject.ViewModelKey(value = com.renovavision.deezerplayer.artist.presentation.artistinfo.ArtistViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel artistViewModel(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.artist.presentation.artistinfo.ArtistViewModel artistViewModel);
}