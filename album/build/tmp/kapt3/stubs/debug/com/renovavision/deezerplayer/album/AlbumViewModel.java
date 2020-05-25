package com.renovavision.deezerplayer.album;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/renovavision/deezerplayer/album/AlbumViewModel;", "Lcom/renovavision/deezerplayer/utils/BaseViewModel;", "useCase", "Lcom/renovavision/deezerplayer/domain/usecases/GetAlbumInfo;", "(Lcom/renovavision/deezerplayer/domain/usecases/GetAlbumInfo;)V", "action", "Lcom/renovavision/deezerplayer/utils/SingleLiveEvent;", "Lcom/renovavision/deezerplayer/utils/ViewEvent;", "click", "Landroidx/lifecycle/LiveData;", "getClick", "()Landroidx/lifecycle/LiveData;", "loadTracks", "Landroidx/lifecycle/MutableLiveData;", "Lcom/renovavision/deezerplayer/album/State;", "state", "getState", "dispatch", "", "dispatchable", "Lcom/renovavision/deezerplayer/utils/Dispatchable;", "loadAlbumTracks", "id", "", "album_debug"})
public final class AlbumViewModel extends com.renovavision.deezerplayer.utils.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<com.renovavision.deezerplayer.album.State> loadTracks = null;
    private final com.renovavision.deezerplayer.utils.SingleLiveEvent<com.renovavision.deezerplayer.utils.ViewEvent> action = null;
    private final com.renovavision.deezerplayer.domain.usecases.GetAlbumInfo useCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.renovavision.deezerplayer.album.State> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.renovavision.deezerplayer.utils.ViewEvent> getClick() {
        return null;
    }
    
    @java.lang.Override()
    public void dispatch(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.utils.Dispatchable dispatchable) {
    }
    
    private final void loadAlbumTracks(int id) {
    }
    
    @javax.inject.Inject()
    public AlbumViewModel(@org.jetbrains.annotations.NotNull()
    com.renovavision.deezerplayer.domain.usecases.GetAlbumInfo useCase) {
        super();
    }
}