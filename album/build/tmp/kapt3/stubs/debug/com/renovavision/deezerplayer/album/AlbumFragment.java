package com.renovavision.deezerplayer.album;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012(\b\u0001\u0010\u0004\u001a\"\u0012\u0018\u0012\u00160\u0006\u00a2\u0006\u0002\b\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005\u00a2\u0006\u0002\u0010\fJ\u0012\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u000bH\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R.\u0010\u0004\u001a\"\u0012\u0018\u0012\u00160\u0006\u00a2\u0006\u0002\b\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/renovavision/deezerplayer/album/AlbumFragment;", "Landroidx/fragment/app/Fragment;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "navAlbumToPlayer", "Lkotlin/Function1;", "Lcom/renovavision/deezerplayer/domain/entities/PlayerModel;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ParameterName;", "name", "track", "", "(Landroidx/lifecycle/ViewModelProvider$Factory;Lkotlin/jvm/functions/Function1;)V", "albumTracksAdapter", "Lcom/renovavision/deezerplayer/album/AlbumTracksAdapter;", "binding", "Lcom/renovavision/deezerplayer/album/databinding/FragmentAlbumBinding;", "getBinding", "()Lcom/renovavision/deezerplayer/album/databinding/FragmentAlbumBinding;", "binding$delegate", "Lcom/renovavision/deezerplayer/utils/BindingDelegate;", "viewModel", "Lcom/renovavision/deezerplayer/album/AlbumViewModel;", "getViewModel", "()Lcom/renovavision/deezerplayer/album/AlbumViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "album_debug"})
public final class AlbumFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private final com.renovavision.deezerplayer.utils.BindingDelegate binding$delegate = null;
    private final com.renovavision.deezerplayer.album.AlbumTracksAdapter albumTracksAdapter = null;
    private final androidx.lifecycle.ViewModelProvider.Factory viewModelFactory = null;
    private final kotlin.jvm.functions.Function1<com.renovavision.deezerplayer.domain.entities.PlayerModel, kotlin.Unit> navAlbumToPlayer = null;
    
    private final com.renovavision.deezerplayer.album.AlbumViewModel getViewModel() {
        return null;
    }
    
    private final com.renovavision.deezerplayer.album.databinding.FragmentAlbumBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @javax.inject.Inject()
    public AlbumFragment(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory viewModelFactory, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "navAlbumToPlayer")
    kotlin.jvm.functions.Function1<com.renovavision.deezerplayer.domain.entities.PlayerModel, kotlin.Unit> navAlbumToPlayer) {
        super();
    }
}