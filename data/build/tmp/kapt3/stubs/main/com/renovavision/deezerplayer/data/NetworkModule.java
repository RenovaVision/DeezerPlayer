package com.renovavision.deezerplayer.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J#\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0001\u00a2\u0006\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lcom/renovavision/deezerplayer/data/NetworkModule;", "", "()V", "provideCocktailApi", "Lcom/renovavision/deezerplayer/data/api/MusicApi;", "kotlin.jvm.PlatformType", "retrofit", "Lretrofit2/Retrofit;", "provideRetrofit", "httpCacheDir", "Ljava/io/File;", "apiUrl", "", "provideRetrofit$data", "data"})
@dagger.Module()
public final class NetworkModule {
    public static final com.renovavision.deezerplayer.data.NetworkModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit$data(@org.jetbrains.annotations.Nullable()
    @javax.inject.Named(value = "cacheDir")
    java.io.File httpCacheDir, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "apiUrl")
    java.lang.String apiUrl) {
        return null;
    }
    
    @dagger.Provides()
    public final com.renovavision.deezerplayer.data.api.MusicApi provideCocktailApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    private NetworkModule() {
        super();
    }
}