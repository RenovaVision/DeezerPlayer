package com.renovavision.deezerplayer.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lcom/renovavision/deezerplayer/activity/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "daggerFragmentFactory", "Lcom/renovavision/deezerplayer/inject/DaggerFragmentFactory;", "getDaggerFragmentFactory$app_debug", "()Lcom/renovavision/deezerplayer/inject/DaggerFragmentFactory;", "setDaggerFragmentFactory$app_debug", "(Lcom/renovavision/deezerplayer/inject/DaggerFragmentFactory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupBottomNavView", "navController", "Landroidx/navigation/NavController;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.renovavision.deezerplayer.inject.DaggerFragmentFactory daggerFragmentFactory;
    
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
    
    public MainActivity() {
        super();
    }
}