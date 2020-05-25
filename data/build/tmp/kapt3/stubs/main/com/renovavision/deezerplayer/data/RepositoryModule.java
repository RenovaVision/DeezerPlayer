package com.renovavision.deezerplayer.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0007H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/renovavision/deezerplayer/data/RepositoryModule;", "", "albumRepository", "Lcom/renovavision/deezerplayer/domain/repositories/AlbumRepository;", "Lcom/renovavision/deezerplayer/data/repositories/AlbumRepositoryImpl;", "artistRepository", "Lcom/renovavision/deezerplayer/domain/repositories/ArtistRepository;", "Lcom/renovavision/deezerplayer/data/repositories/ArtistRepositoryImpl;", "homeRepository", "Lcom/renovavision/deezerplayer/domain/repositories/HomeRepository;", "Lcom/renovavision/deezerplayer/data/repositories/HomeRepositoryImpl;", "data"})
@dagger.Module()
public abstract interface RepositoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.renovavision.deezerplayer.domain.repositories.AlbumRepository albumRepository(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.data.repositories.AlbumRepositoryImpl albumRepository);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.renovavision.deezerplayer.domain.repositories.ArtistRepository artistRepository(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.data.repositories.ArtistRepositoryImpl artistRepository);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.renovavision.deezerplayer.domain.repositories.HomeRepository homeRepository(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.data.repositories.HomeRepositoryImpl homeRepository);
}