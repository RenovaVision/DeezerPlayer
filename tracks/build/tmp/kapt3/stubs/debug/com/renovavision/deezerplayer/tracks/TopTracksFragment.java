package com.renovavision.deezerplayer.tracks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001Bc\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012(\b\u0001\u0010\u0004\u001a\"\u0012\u0018\u0012\u00160\u0006\u00a2\u0006\u0002\b\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005\u0012(\b\u0001\u0010\f\u001a\"\u0012\u0018\u0012\u00160\r\u00a2\u0006\u0002\b\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000b0\u0005\u00a2\u0006\u0002\u0010\u000fJ\u0012\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u000bH\u0016R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R.\u0010\u0004\u001a\"\u0012\u0018\u0012\u00160\u0006\u00a2\u0006\u0002\b\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R.\u0010\f\u001a\"\u0012\u0018\u0012\u00160\r\u00a2\u0006\u0002\b\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/renovavision/deezerplayer/tracks/TopTracksFragment;", "Landroidx/fragment/app/Fragment;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "navTopTracksToArtist", "Lkotlin/Function1;", "Lcom/renovavision/deezerplayer/domain/entities/ArtistEntity;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ParameterName;", "name", "artist", "", "navTopTracksToPlayer", "Lcom/renovavision/deezerplayer/domain/entities/PlayerModel;", "track", "(Landroidx/lifecycle/ViewModelProvider$Factory;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "binding", "Lcom/renovavision/deezerplayer/tracks/databinding/FragmentTopTracksBinding;", "getBinding", "()Lcom/renovavision/deezerplayer/tracks/databinding/FragmentTopTracksBinding;", "binding$delegate", "Lcom/renovavision/deezerplayer/utils/BindingDelegate;", "tracksAdapter", "Lcom/renovavision/deezerplayer/tracks/TracksAdapter;", "viewModel", "Lcom/renovavision/deezerplayer/tracks/TopTracksViewModel;", "getViewModel", "()Lcom/renovavision/deezerplayer/tracks/TopTracksViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "tracks_debug"})
public final class TopTracksFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private final com.renovavision.deezerplayer.utils.BindingDelegate binding$delegate = null;
    private final com.renovavision.deezerplayer.tracks.TracksAdapter tracksAdapter = null;
    private final androidx.lifecycle.ViewModelProvider.Factory viewModelFactory = null;
    private final kotlin.jvm.functions.Function1<com.renovavision.deezerplayer.domain.entities.ArtistEntity, kotlin.Unit> navTopTracksToArtist = null;
    private final kotlin.jvm.functions.Function1<com.renovavision.deezerplayer.domain.entities.PlayerModel, kotlin.Unit> navTopTracksToPlayer = null;
    
    private final com.renovavision.deezerplayer.tracks.TopTracksViewModel getViewModel() {
        return null;
    }
    
    private final com.renovavision.deezerplayer.tracks.databinding.FragmentTopTracksBinding getBinding() {
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
    public TopTracksFragment(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory viewModelFactory, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "navTopTracksToArtist")
    kotlin.jvm.functions.Function1<com.renovavision.deezerplayer.domain.entities.ArtistEntity, kotlin.Unit> navTopTracksToArtist, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "navTopTracksToPlayer")
    kotlin.jvm.functions.Function1<com.renovavision.deezerplayer.domain.entities.PlayerModel, kotlin.Unit> navTopTracksToPlayer) {
        super();
    }
}