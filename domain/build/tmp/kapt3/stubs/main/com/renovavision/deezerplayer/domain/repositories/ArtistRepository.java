package com.renovavision.deezerplayer.domain.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/renovavision/deezerplayer/domain/repositories/ArtistRepository;", "", "loadArtistAlbums", "Lcom/renovavision/deezerplayer/domain/entities/ArtistAlbumsEntity;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTopArtistTracks", "Lcom/renovavision/deezerplayer/domain/entities/TopArtistTracksEntity;", "domain"})
public abstract interface ArtistRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loadTopArtistTracks(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.renovavision.deezerplayer.domain.entities.TopArtistTracksEntity> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loadArtistAlbums(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.renovavision.deezerplayer.domain.entities.ArtistAlbumsEntity> p1);
}