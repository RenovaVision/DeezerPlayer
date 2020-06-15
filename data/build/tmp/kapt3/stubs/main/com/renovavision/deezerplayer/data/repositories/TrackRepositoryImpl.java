package com.renovavision.deezerplayer.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/renovavision/deezerplayer/data/repositories/TrackRepositoryImpl;", "Lcom/renovavision/deezerplayer/domain/repositories/TrackRepository;", "musicApi", "Lcom/renovavision/deezerplayer/data/api/MusicApi;", "(Lcom/renovavision/deezerplayer/data/api/MusicApi;)V", "loadTopTracks", "Lcom/renovavision/deezerplayer/domain/entities/TopTracks;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data"})
@javax.inject.Singleton()
public final class TrackRepositoryImpl implements com.renovavision.deezerplayer.domain.repositories.TrackRepository {
    private final com.renovavision.deezerplayer.data.api.MusicApi musicApi = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loadTopTracks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.renovavision.deezerplayer.domain.entities.TopTracks> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public TrackRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.data.api.MusicApi musicApi) {
        super();
    }
}