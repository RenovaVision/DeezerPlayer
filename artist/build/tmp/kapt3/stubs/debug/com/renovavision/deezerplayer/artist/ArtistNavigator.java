package com.renovavision.deezerplayer.artist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/renovavision/deezerplayer/artist/ArtistNavigator;", "", "navArtistToAlbum", "", "id", "", "navArtistToPlayer", "track", "Lcom/renovavision/deezerplayer/domain/entities/PlayerModel;", "navTopArtistsToArtist", "artist", "Lcom/renovavision/deezerplayer/domain/entities/Artist;", "artist_debug"})
public abstract interface ArtistNavigator {
    
    public abstract void navTopArtistsToArtist(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.domain.entities.Artist artist);
    
    public abstract void navArtistToAlbum(int id);
    
    public abstract void navArtistToPlayer(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.domain.entities.PlayerModel track);
}