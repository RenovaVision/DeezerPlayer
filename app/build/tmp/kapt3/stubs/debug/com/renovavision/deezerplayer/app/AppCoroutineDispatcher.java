package com.renovavision.deezerplayer.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/renovavision/deezerplayer/app/AppCoroutineDispatcher;", "Lcom/renovavision/deezerplayer/domain/CoroutineDispatcherProvider;", "()V", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "mainDispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "app_debug"})
@javax.inject.Singleton()
public final class AppCoroutineDispatcher implements com.renovavision.deezerplayer.domain.CoroutineDispatcherProvider {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.MainCoroutineDispatcher mainDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.CoroutineDispatcher ioDispatcher() {
        return null;
    }
    
    @javax.inject.Inject()
    public AppCoroutineDispatcher() {
        super();
    }
}