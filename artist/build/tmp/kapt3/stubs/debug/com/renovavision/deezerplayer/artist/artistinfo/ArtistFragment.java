package com.renovavision.deezerplayer.artist.artistinfo;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/renovavision/deezerplayer/artist/artistinfo/ArtistFragment;", "Landroidx/fragment/app/Fragment;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "albumsAdapter", "Lcom/renovavision/deezerplayer/artist/artistinfo/AlbumsAdapter;", "binding", "Lcom/renovavision/deezerplayer/artist/databinding/FragmentArtistBinding;", "getBinding", "()Lcom/renovavision/deezerplayer/artist/databinding/FragmentArtistBinding;", "binding$delegate", "Lcom/renovavision/deezerplayer/ui/utils/BindingDelegate;", "tracksAdapter", "Lcom/renovavision/deezerplayer/artist/artistinfo/TracksAdapter;", "viewModel", "Lcom/renovavision/deezerplayer/artist/artistinfo/ArtistViewModel;", "getViewModel", "()Lcom/renovavision/deezerplayer/artist/artistinfo/ArtistViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initViews", "", "artist", "Lcom/renovavision/deezerplayer/domain/entities/Artist;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "artist_debug"})
public final class ArtistFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private final com.renovavision.deezerplayer.ui.utils.BindingDelegate binding$delegate = null;
    private final com.renovavision.deezerplayer.artist.artistinfo.TracksAdapter tracksAdapter = null;
    private final com.renovavision.deezerplayer.artist.artistinfo.AlbumsAdapter albumsAdapter = null;
    private final androidx.lifecycle.ViewModelProvider.Factory viewModelFactory = null;
    
    private final com.renovavision.deezerplayer.artist.artistinfo.ArtistViewModel getViewModel() {
        return null;
    }
    
    private final com.renovavision.deezerplayer.artist.databinding.FragmentArtistBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews(com.renovavision.deezerplayer.domain.entities.Artist artist) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @javax.inject.Inject()
    public ArtistFragment(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory viewModelFactory) {
        super();
    }
}