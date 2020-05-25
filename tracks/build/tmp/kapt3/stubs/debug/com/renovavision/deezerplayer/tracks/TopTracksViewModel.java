package com.renovavision.deezerplayer.tracks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/renovavision/deezerplayer/tracks/TopTracksViewModel;", "Lcom/renovavision/deezerplayer/utils/BaseViewModel;", "useCase", "Lcom/renovavision/deezerplayer/domain/usecases/GetHomeModel;", "(Lcom/renovavision/deezerplayer/domain/usecases/GetHomeModel;)V", "action", "Landroidx/lifecycle/LiveData;", "Lcom/renovavision/deezerplayer/utils/ViewEvent;", "getAction", "()Landroidx/lifecycle/LiveData;", "actions", "Lcom/renovavision/deezerplayer/utils/SingleLiveEvent;", "loadTopTracks", "Landroidx/lifecycle/MutableLiveData;", "Lcom/renovavision/deezerplayer/tracks/State;", "state", "getState", "dispatch", "", "dispatchable", "Lcom/renovavision/deezerplayer/utils/Dispatchable;", "loadTracks", "tracks_debug"})
public final class TopTracksViewModel extends com.renovavision.deezerplayer.utils.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.renovavision.deezerplayer.tracks.State> loadTopTracks = null;
    private final com.renovavision.deezerplayer.utils.SingleLiveEvent<com.renovavision.deezerplayer.utils.ViewEvent> actions = null;
    private final com.renovavision.deezerplayer.domain.usecases.GetHomeModel useCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.renovavision.deezerplayer.tracks.State> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.renovavision.deezerplayer.utils.ViewEvent> getAction() {
        return null;
    }
    
    @java.lang.Override()
    public void dispatch(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.utils.Dispatchable dispatchable) {
    }
    
    private final void loadTracks() {
    }
    
    @javax.inject.Inject()
    public TopTracksViewModel(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.domain.usecases.GetHomeModel useCase) {
        super();
    }
}