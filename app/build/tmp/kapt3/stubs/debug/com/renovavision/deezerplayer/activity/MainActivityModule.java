package com.renovavision.deezerplayer.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Lcom/renovavision/deezerplayer/activity/MainActivityModule;", "", "mainActivity", "Lcom/renovavision/deezerplayer/activity/MainActivity;", "viewModelProviderFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "Lcom/renovavision/deezerplayer/inject/ViewModelFactory;", "app_debug"})
@dagger.Module()
public abstract interface MainActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory viewModelProviderFactory(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.inject.ViewModelFactory viewModelFactory);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.renovavision.deezerplayer.activity.FragmentsModule.class, com.renovavision.deezerplayer.activity.ViewModelsModule.class, com.renovavision.deezerplayer.activity.NavHostFragmentModule.class})
    public abstract com.renovavision.deezerplayer.activity.MainActivity mainActivity();
}