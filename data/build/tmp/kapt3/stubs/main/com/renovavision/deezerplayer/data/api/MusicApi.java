package com.renovavision.deezerplayer.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ/\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0011\u001a\u00020\u00052\b\b\u0003\u0010\u0012\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u0015H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/renovavision/deezerplayer/data/api/MusicApi;", "", "loadAlbumInfo", "Lcom/renovavision/deezerplayer/data/entities/AlbumInfo;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadArtistAlbums", "Lcom/renovavision/deezerplayer/data/entities/ArtistAlbums;", "artistId", "loadSearchResult", "Lcom/renovavision/deezerplayer/data/entities/TopTracks;", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTopArtistTracks", "Lcom/renovavision/deezerplayer/data/entities/TopArtistTracks;", "limit", "startIndex", "(IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTopArtists", "Lcom/renovavision/deezerplayer/data/entities/TopArtists;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTopTracks", "data"})
public abstract interface MusicApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "chart/0/tracks")
    public abstract java.lang.Object loadTopTracks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.renovavision.deezerplayer.data.entities.TopTracks> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "chart/0/artists")
    public abstract java.lang.Object loadTopArtists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.renovavision.deezerplayer.data.entities.TopArtists> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "artist/{id}/top")
    public abstract java.lang.Object loadTopArtistTracks(@retrofit2.http.Path(value = "id")
    int id, @retrofit2.http.Query(value = "limit")
    int limit, @retrofit2.http.Query(value = "index")
    int startIndex, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.renovavision.deezerplayer.data.entities.TopArtistTracks> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "artist/{id}/albums")
    public abstract java.lang.Object loadArtistAlbums(@retrofit2.http.Path(value = "id")
    int artistId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.renovavision.deezerplayer.data.entities.ArtistAlbums> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "album/{id}")
    public abstract java.lang.Object loadAlbumInfo(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.renovavision.deezerplayer.data.entities.AlbumInfo> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "search/track")
    public abstract java.lang.Object loadSearchResult(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.renovavision.deezerplayer.data.entities.TopTracks> p1);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}