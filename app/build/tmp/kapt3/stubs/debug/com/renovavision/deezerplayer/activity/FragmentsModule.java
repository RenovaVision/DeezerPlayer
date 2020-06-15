package com.renovavision.deezerplayer.activity;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\'J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\'\u00a8\u0006\r"}, d2 = {"Lcom/renovavision/deezerplayer/activity/FragmentsModule;", "", "albumFragment", "Landroidx/fragment/app/Fragment;", "Lcom/renovavision/deezerplayer/album/AlbumFragment;", "artistFragment", "Lcom/renovavision/deezerplayer/artist/artistinfo/ArtistFragment;", "playerFragment", "Lcom/renovavision/player/PlayerFragment;", "topArtistsFragment", "Lcom/renovavision/deezerplayer/artist/topartists/TopArtistsFragment;", "topTracksFragment", "Lcom/renovavision/deezerplayer/tracks/TopTracksFragment;", "app_debug"})
@dagger.Module()
public abstract interface FragmentsModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.renovavision.deezerplayer.inject.FragmentKey(value = com.renovavision.deezerplayer.artist.topartists.TopArtistsFragment.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.fragment.app.Fragment topArtistsFragment(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.artist.topartists.TopArtistsFragment topArtistsFragment);
    
    @org.jetbrains.annotations.NotNull()
    @com.renovavision.deezerplayer.inject.FragmentKey(value = com.renovavision.deezerplayer.artist.artistinfo.ArtistFragment.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.fragment.app.Fragment artistFragment(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.artist.artistinfo.ArtistFragment artistFragment);
    
    @org.jetbrains.annotations.NotNull()
    @com.renovavision.deezerplayer.inject.FragmentKey(value = com.renovavision.deezerplayer.tracks.TopTracksFragment.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.fragment.app.Fragment topTracksFragment(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.tracks.TopTracksFragment topTracksFragment);
    
    @org.jetbrains.annotations.NotNull()
    @com.renovavision.deezerplayer.inject.FragmentKey(value = com.renovavision.deezerplayer.album.AlbumFragment.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.fragment.app.Fragment albumFragment(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.album.AlbumFragment albumFragment);
    
    @org.jetbrains.annotations.NotNull()
    @com.renovavision.deezerplayer.inject.FragmentKey(value = com.renovavision.player.PlayerFragment.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.fragment.app.Fragment playerFragment(@org.jetbrains.annotations.NotNull()
    com.renovavision.player.PlayerFragment playerFragment);
}