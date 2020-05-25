package com.renovavision.deezerplayer.inject;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012 \u0010\u0002\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0003\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R(\u0010\u0002\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/renovavision/deezerplayer/inject/DaggerFragmentFactory;", "Landroidx/fragment/app/FragmentFactory;", "fragmentProviders", "", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "Ljavax/inject/Provider;", "(Ljava/util/Map;)V", "instantiate", "classLoader", "Ljava/lang/ClassLoader;", "className", "", "inject_debug"})
public final class DaggerFragmentFactory extends androidx.fragment.app.FragmentFactory {
    private final java.util.Map<java.lang.Class<? extends androidx.fragment.app.Fragment>, javax.inject.Provider<androidx.fragment.app.Fragment>> fragmentProviders = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.fragment.app.Fragment instantiate(@org.jetbrains.annotations.NotNull()
    java.lang.ClassLoader classLoader, @org.jetbrains.annotations.NotNull()
    java.lang.String className) {
        return null;
    }
    
    @javax.inject.Inject()
    public DaggerFragmentFactory(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Class<? extends androidx.fragment.app.Fragment>, javax.inject.Provider<androidx.fragment.app.Fragment>> fragmentProviders) {
        super();
    }
}