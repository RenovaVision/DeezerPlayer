package com.renovavision.deezerplayer.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/renovavision/deezerplayer/app/AppModule;", "", "provideCoroutineDispatcher", "Lcom/renovavision/deezerplayer/domain/CoroutineDispatcherProvider;", "provider", "Lcom/renovavision/deezerplayer/app/AppCoroutineDispatcher;", "app_debug"})
@dagger.Module()
public abstract interface AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.renovavision.deezerplayer.domain.CoroutineDispatcherProvider provideCoroutineDispatcher(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.app.AppCoroutineDispatcher provider);
}