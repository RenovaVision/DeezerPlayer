package com.renovavision.deezerplayer.tracks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/renovavision/deezerplayer/tracks/TrackNavigator;", "", "navTopTracksToArtist", "", "artist", "Lcom/renovavision/deezerplayer/domain/entities/Artist;", "navTopTracksToPlayer", "track", "Lcom/renovavision/deezerplayer/domain/entities/PlayerModel;", "tracks_debug"})
public abstract interface TrackNavigator {
    
    public abstract void navTopTracksToArtist(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.domain.entities.Artist artist);
    
    public abstract void navTopTracksToPlayer(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.domain.entities.PlayerModel track);
}