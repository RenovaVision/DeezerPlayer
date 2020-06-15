package com.renovavision.deezerplayer.artist.artistinfo;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/renovavision/deezerplayer/artist/artistinfo/ArtistViewModel;", "Lcom/renovavision/deezerplayer/ui/uni/UniViewModel;", "Lcom/renovavision/deezerplayer/artist/artistinfo/State;", "useCase", "Lcom/renovavision/deezerplayer/domain/usecases/GetArtistModel;", "artistNavigator", "Lcom/renovavision/deezerplayer/artist/ArtistNavigator;", "dispatcherProvider", "Lcom/renovavision/deezerplayer/domain/CoroutineDispatcherProvider;", "(Lcom/renovavision/deezerplayer/domain/usecases/GetArtistModel;Lcom/renovavision/deezerplayer/artist/ArtistNavigator;Lcom/renovavision/deezerplayer/domain/CoroutineDispatcherProvider;)V", "async", "", "state", "asyncAction", "Lcom/renovavision/deezerplayer/ui/uni/AsyncAction;", "getDefaultState", "loadArtistModel", "id", "", "reduce", "action", "Lcom/renovavision/deezerplayer/ui/uni/Action;", "artist_debug"})
public final class ArtistViewModel extends com.renovavision.deezerplayer.ui.uni.UniViewModel<com.renovavision.deezerplayer.artist.artistinfo.State> {
    private final com.renovavision.deezerplayer.domain.usecases.GetArtistModel useCase = null;
    private final com.renovavision.deezerplayer.artist.ArtistNavigator artistNavigator = null;
    
    @org.jetbrains.annotations.NotNull()
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @java.lang.Override()
    public com.renovavision.deezerplayer.artist.artistinfo.State getDefaultState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.renovavision.deezerplayer.artist.artistinfo.State reduce(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.artist.artistinfo.State state, @org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.ui.uni.Action action) {
        return null;
    }
    
    @java.lang.Override()
    public void async(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.artist.artistinfo.State state, @org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.ui.uni.AsyncAction asyncAction) {
    }
    
    private final void loadArtistModel(int id, com.renovavision.deezerplayer.artist.artistinfo.State state) {
    }
    
    @javax.inject.Inject()
    public ArtistViewModel(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.domain.usecases.GetArtistModel useCase, @org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.artist.ArtistNavigator artistNavigator, @org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.domain.CoroutineDispatcherProvider dispatcherProvider) {
        super(null);
    }
}