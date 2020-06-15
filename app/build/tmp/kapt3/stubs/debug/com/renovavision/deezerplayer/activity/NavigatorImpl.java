package com.renovavision.deezerplayer.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u0018\u001a\u00020\tR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/renovavision/deezerplayer/activity/NavigatorImpl;", "Lcom/renovavision/deezerplayer/ui/navigation/Navigator;", "Lcom/renovavision/deezerplayer/artist/ArtistNavigator;", "Lcom/renovavision/deezerplayer/tracks/TrackNavigator;", "Lcom/renovavision/deezerplayer/album/AlbumNavigator;", "()V", "activity", "Lcom/renovavision/deezerplayer/activity/MainActivity;", "bind", "", "mainActivity", "navAlbumToPlayer", "track", "Lcom/renovavision/deezerplayer/domain/entities/PlayerModel;", "navArtistToAlbum", "id", "", "navArtistToPlayer", "navBack", "navTopArtistsToArtist", "artist", "Lcom/renovavision/deezerplayer/domain/entities/Artist;", "navTopTracksToArtist", "navTopTracksToPlayer", "unbind", "app_debug"})
@javax.inject.Singleton()
public final class NavigatorImpl implements com.renovavision.deezerplayer.ui.navigation.Navigator, com.renovavision.deezerplayer.artist.ArtistNavigator, com.renovavision.deezerplayer.tracks.TrackNavigator, com.renovavision.deezerplayer.album.AlbumNavigator {
    private com.renovavision.deezerplayer.activity.MainActivity activity;
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.activity.MainActivity mainActivity) {
    }
    
    public final void unbind() {
    }
    
    @java.lang.Override()
    public void navBack() {
    }
    
    @java.lang.Override()
    public void navTopArtistsToArtist(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.domain.entities.Artist artist) {
    }
    
    @java.lang.Override()
    public void navArtistToAlbum(int id) {
    }
    
    @java.lang.Override()
    public void navArtistToPlayer(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.domain.entities.PlayerModel track) {
    }
    
    @java.lang.Override()
    public void navTopTracksToArtist(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.domain.entities.Artist artist) {
    }
    
    @java.lang.Override()
    public void navTopTracksToPlayer(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.domain.entities.PlayerModel track) {
    }
    
    @java.lang.Override()
    public void navAlbumToPlayer(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.domain.entities.PlayerModel track) {
    }
    
    @javax.inject.Inject()
    public NavigatorImpl() {
        super();
    }
}