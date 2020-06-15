package com.renovavision.deezerplayer.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0014J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcom/renovavision/deezerplayer/activity/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "daggerFragmentFactory", "Lcom/renovavision/deezerplayer/inject/DaggerFragmentFactory;", "getDaggerFragmentFactory$app_debug", "()Lcom/renovavision/deezerplayer/inject/DaggerFragmentFactory;", "setDaggerFragmentFactory$app_debug", "(Lcom/renovavision/deezerplayer/inject/DaggerFragmentFactory;)V", "navigator", "Lcom/renovavision/deezerplayer/activity/NavigatorImpl;", "getNavigator$app_debug", "()Lcom/renovavision/deezerplayer/activity/NavigatorImpl;", "setNavigator$app_debug", "(Lcom/renovavision/deezerplayer/activity/NavigatorImpl;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setupBottomNavView", "navController", "Landroidx/navigation/NavController;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.renovavision.deezerplayer.activity.NavigatorImpl navigator;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.renovavision.deezerplayer.inject.DaggerFragmentFactory daggerFragmentFactory;
    
    @org.jetbrains.annotations.NotNull()
    public final com.renovavision.deezerplayer.activity.NavigatorImpl getNavigator$app_debug() {
        return null;
    }
    
    public final void setNavigator$app_debug(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.activity.NavigatorImpl p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.renovavision.deezerplayer.inject.DaggerFragmentFactory getDaggerFragmentFactory$app_debug() {
        return null;
    }
    
    public final void setDaggerFragmentFactory$app_debug(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.inject.DaggerFragmentFactory p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupBottomNavView(androidx.navigation.NavController navController) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public MainActivity() {
        super();
    }
}