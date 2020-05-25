package com.renovavision.deezerplayer.domain.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/renovavision/deezerplayer/domain/usecases/GetHomeModel;", "", "homeRepository", "Lcom/renovavision/deezerplayer/domain/repositories/HomeRepository;", "(Lcom/renovavision/deezerplayer/domain/repositories/HomeRepository;)V", "getTopArtists", "Lcom/renovavision/deezerplayer/domain/entities/TopArtistsEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopTracks", "Lcom/renovavision/deezerplayer/domain/entities/TopTracksEntity;", "domain"})
public final class GetHomeModel {
    private final com.renovavision.deezerplayer.domain.repositories.HomeRepository homeRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTopTracks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.renovavision.deezerplayer.domain.entities.TopTracksEntity> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTopArtists(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.renovavision.deezerplayer.domain.entities.TopArtistsEntity> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public GetHomeModel(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.domain.repositories.HomeRepository homeRepository) {
        super();
    }
}