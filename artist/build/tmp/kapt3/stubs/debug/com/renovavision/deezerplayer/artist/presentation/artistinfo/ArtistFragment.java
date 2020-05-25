package com.renovavision.deezerplayer.artist.presentation.artistinfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001Bc\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012(\b\u0001\u0010\u0004\u001a\"\u0012\u0018\u0012\u00160\u0006\u00a2\u0006\u0002\b\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005\u0012(\b\u0001\u0010\f\u001a\"\u0012\u0018\u0012\u00160\r\u00a2\u0006\u0002\b\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000b0\u0005\u00a2\u0006\u0002\u0010\u000fJ\u0012\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u0012\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u000bH\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R.\u0010\u0004\u001a\"\u0012\u0018\u0012\u00160\u0006\u00a2\u0006\u0002\b\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R.\u0010\f\u001a\"\u0012\u0018\u0012\u00160\r\u00a2\u0006\u0002\b\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/renovavision/deezerplayer/artist/presentation/artistinfo/ArtistFragment;", "Landroidx/fragment/app/Fragment;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "navArtistToAlbum", "Lkotlin/Function1;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ParameterName;", "name", "id", "", "navArtistToPlayer", "Lcom/renovavision/deezerplayer/domain/entities/PlayerModel;", "track", "(Landroidx/lifecycle/ViewModelProvider$Factory;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "albumsAdapter", "Lcom/renovavision/deezerplayer/artist/presentation/artistinfo/AlbumsAdapter;", "binding", "Lcom/renovavision/deezerplayer/artist/databinding/FragmentArtistBinding;", "getBinding", "()Lcom/renovavision/deezerplayer/artist/databinding/FragmentArtistBinding;", "binding$delegate", "Lcom/renovavision/deezerplayer/utils/BindingDelegate;", "tracksAdapter", "Lcom/renovavision/deezerplayer/artist/presentation/artistinfo/TracksAdapter;", "viewModel", "Lcom/renovavision/deezerplayer/artist/presentation/artistinfo/ArtistViewModel;", "getViewModel", "()Lcom/renovavision/deezerplayer/artist/presentation/artistinfo/ArtistViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initViews", "artist", "Lcom/renovavision/deezerplayer/domain/entities/ArtistEntity;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "artist_debug"})
public final class ArtistFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private final com.renovavision.deezerplayer.utils.BindingDelegate binding$delegate = null;
    private final com.renovavision.deezerplayer.artist.presentation.artistinfo.TracksAdapter tracksAdapter = null;
    private final com.renovavision.deezerplayer.artist.presentation.artistinfo.AlbumsAdapter albumsAdapter = null;
    private final androidx.lifecycle.ViewModelProvider.Factory viewModelFactory = null;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> navArtistToAlbum = null;
    private final kotlin.jvm.functions.Function1<com.renovavision.deezerplayer.domain.entities.PlayerModel, kotlin.Unit> navArtistToPlayer = null;
    
    private final com.renovavision.deezerplayer.artist.presentation.artistinfo.ArtistViewModel getViewModel() {
        return null;
    }
    
    private final com.renovavision.deezerplayer.artist.databinding.FragmentArtistBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews(com.renovavision.deezerplayer.domain.entities.ArtistEntity artist) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @javax.inject.Inject()
    public ArtistFragment(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory viewModelFactory, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "navArtistToAlbum")
    kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> navArtistToAlbum, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "navArtistToPlayer")
    kotlin.jvm.functions.Function1<com.renovavision.deezerplayer.domain.entities.PlayerModel, kotlin.Unit> navArtistToPlayer) {
        super();
    }
}