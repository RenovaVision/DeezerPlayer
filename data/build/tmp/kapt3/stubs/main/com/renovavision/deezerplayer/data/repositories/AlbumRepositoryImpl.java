package com.renovavision.deezerplayer.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/renovavision/deezerplayer/data/repositories/AlbumRepositoryImpl;", "Lcom/renovavision/deezerplayer/domain/repositories/AlbumRepository;", "musicApi", "Lcom/renovavision/deezerplayer/data/api/MusicApi;", "(Lcom/renovavision/deezerplayer/data/api/MusicApi;)V", "loadAlbumInfo", "Lcom/renovavision/deezerplayer/domain/entities/AlbumDetails;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data"})
@javax.inject.Singleton()
public final class AlbumRepositoryImpl implements com.renovavision.deezerplayer.domain.repositories.AlbumRepository {
    private final com.renovavision.deezerplayer.data.api.MusicApi musicApi = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object loadAlbumInfo(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.renovavision.deezerplayer.domain.entities.AlbumDetails> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public AlbumRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.data.api.MusicApi musicApi) {
        super();
    }
}