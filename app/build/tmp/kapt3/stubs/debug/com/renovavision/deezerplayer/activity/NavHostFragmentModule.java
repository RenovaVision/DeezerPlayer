package com.renovavision.deezerplayer.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c1\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/renovavision/deezerplayer/activity/NavHostFragmentModule;", "", "()V", "navHostFragment", "Landroidx/fragment/app/Fragment;", "app_debug"})
@dagger.Module()
public final class NavHostFragmentModule {
    public static final com.renovavision.deezerplayer.activity.NavHostFragmentModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @com.renovavision.deezerplayer.inject.FragmentKey(value = androidx.navigation.fragment.NavHostFragment.class)
    @dagger.multibindings.IntoMap()
    @dagger.Provides()
    public final androidx.fragment.app.Fragment navHostFragment() {
        return null;
    }
    
    private NavHostFragmentModule() {
        super();
    }
}