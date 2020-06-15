package com.renovavision.deezerplayer.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/renovavision/deezerplayer/app/AppInjector;", "", "inject", "", "app", "Lcom/renovavision/deezerplayer/app/App;", "Factory", "app_debug"})
@javax.inject.Singleton()
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, com.renovavision.deezerplayer.app.AppModule.class, com.renovavision.deezerplayer.activity.MainActivityModule.class, com.renovavision.deezerplayer.data.RepositoryModule.class, com.renovavision.deezerplayer.data.NetworkModule.class, com.renovavision.deezerplayer.activity.NavigationModule.class})
public abstract interface AppInjector {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.app.App app);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\tH&\u00a8\u0006\n"}, d2 = {"Lcom/renovavision/deezerplayer/app/AppInjector$Factory;", "", "create", "Lcom/renovavision/deezerplayer/app/AppInjector;", "application", "Landroid/app/Application;", "apiUrl", "", "cacheDir", "Ljava/io/File;", "app_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.renovavision.deezerplayer.app.AppInjector create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        android.app.Application application, @org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "apiUrl")
        @dagger.BindsInstance()
        java.lang.String apiUrl, @org.jetbrains.annotations.Nullable()
        @javax.inject.Named(value = "cacheDir")
        @dagger.BindsInstance()
        java.io.File cacheDir);
    }
}