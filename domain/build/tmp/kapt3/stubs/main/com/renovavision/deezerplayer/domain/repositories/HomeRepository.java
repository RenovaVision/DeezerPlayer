package com.renovavision.deezerplayer.domain.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/renovavision/deezerplayer/domain/repositories/HomeRepository;", "", "loadTopArtists", "Lcom/renovavision/deezerplayer/domain/entities/TopArtistsEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTopTracks", "Lcom/renovavision/deezerplayer/domain/entities/TopTracksEntity;", "domain"})
public abstract interface HomeRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loadTopTracks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.renovavision.deezerplayer.domain.entities.TopTracksEntity> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object loadTopArtists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.renovavision.deezerplayer.domain.entities.TopArtistsEntity> p0);
}