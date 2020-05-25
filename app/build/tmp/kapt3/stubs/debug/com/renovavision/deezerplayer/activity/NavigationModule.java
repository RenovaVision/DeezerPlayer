package com.renovavision.deezerplayer.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c1\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J+\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J+\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0007J+\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0007J+\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J+\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\u001a"}, d2 = {"Lcom/renovavision/deezerplayer/activity/NavigationModule;", "", "()V", "navAlbumToPlayer", "Lkotlin/Function1;", "Lcom/renovavision/deezerplayer/domain/entities/PlayerModel;", "Lkotlin/ParameterName;", "name", "track", "", "mainActivity", "Lcom/renovavision/deezerplayer/activity/MainActivity;", "navArtistToAlbum", "", "id", "navArtistToPlayer", "navBack", "Lkotlin/Function0;", "", "navHomeToPlayer", "navHostFragment", "Landroidx/fragment/app/Fragment;", "navTopArtistsToArtist", "Lcom/renovavision/deezerplayer/domain/entities/ArtistEntity;", "artist", "navTopTracksToArtist", "app_debug"})
@dagger.Module()
public final class NavigationModule {
    public static final com.renovavision.deezerplayer.activity.NavigationModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @com.renovavision.deezerplayer.inject.FragmentKey(value = androidx.navigation.fragment.NavHostFragment.class)
    @dagger.multibindings.IntoMap()
    @dagger.Provides()
    public final androidx.fragment.app.Fragment navHostFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "navTopTracksToArtist")
    @dagger.Provides()
    public final kotlin.jvm.functions.Function1<com.renovavision.deezerplayer.domain.entities.ArtistEntity, kotlin.Unit> navTopTracksToArtist(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.activity.MainActivity mainActivity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "navTopTracksToPlayer")
    @dagger.Provides()
    public final kotlin.jvm.functions.Function1<com.renovavision.deezerplayer.domain.entities.PlayerModel, kotlin.Unit> navHomeToPlayer(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.activity.MainActivity mainActivity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "navTopArtistsToArtist")
    @dagger.Provides()
    public final kotlin.jvm.functions.Function1<com.renovavision.deezerplayer.domain.entities.ArtistEntity, kotlin.Unit> navTopArtistsToArtist(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.activity.MainActivity mainActivity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "navArtistToAlbum")
    @dagger.Provides()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> navArtistToAlbum(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.activity.MainActivity mainActivity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "navArtistToPlayer")
    @dagger.Provides()
    public final kotlin.jvm.functions.Function1<com.renovavision.deezerplayer.domain.entities.PlayerModel, kotlin.Unit> navArtistToPlayer(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.activity.MainActivity mainActivity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "navAlbumToPlayer")
    @dagger.Provides()
    public final kotlin.jvm.functions.Function1<com.renovavision.deezerplayer.domain.entities.PlayerModel, kotlin.Unit> navAlbumToPlayer(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.activity.MainActivity mainActivity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "navBack")
    @dagger.Provides()
    public final kotlin.jvm.functions.Function0<java.lang.Boolean> navBack(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.activity.MainActivity mainActivity) {
        return null;
    }
    
    private NavigationModule() {
        super();
    }
}