package com.renovavision.deezerplayer.artist.artistinfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/renovavision/deezerplayer/artist/artistinfo/State;", "", "isLoading", "", "showError", "model", "Lcom/renovavision/deezerplayer/domain/usecases/ArtistModel;", "(ZZLcom/renovavision/deezerplayer/domain/usecases/ArtistModel;)V", "()Z", "getModel", "()Lcom/renovavision/deezerplayer/domain/usecases/ArtistModel;", "getShowError", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "artist_debug"})
public final class State {
    private final boolean isLoading = false;
    private final boolean showError = false;
    @org.jetbrains.annotations.Nullable()
    private final com.renovavision.deezerplayer.domain.usecases.ArtistModel model = null;
    
    public final boolean isLoading() {
        return false;
    }
    
    public final boolean getShowError() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.renovavision.deezerplayer.domain.usecases.ArtistModel getModel() {
        return null;
    }
    
    public State(boolean isLoading, boolean showError, @org.jetbrains.annotations.Nullable()
    com.renovavision.deezerplayer.domain.usecases.ArtistModel model) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.renovavision.deezerplayer.domain.usecases.ArtistModel component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.renovavision.deezerplayer.artist.artistinfo.State copy(boolean isLoading, boolean showError, @org.jetbrains.annotations.Nullable()
    com.renovavision.deezerplayer.domain.usecases.ArtistModel model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}