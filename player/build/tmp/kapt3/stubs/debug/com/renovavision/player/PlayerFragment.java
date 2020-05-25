package com.renovavision.player;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/renovavision/player/PlayerFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/renovavision/player/databinding/FragmentPlayerBinding;", "getBinding", "()Lcom/renovavision/player/databinding/FragmentPlayerBinding;", "binding$delegate", "Lcom/renovavision/deezerplayer/utils/BindingDelegate;", "deezerPlayer", "Lcom/renovavision/deezerplayer/utils/DeezerPlayer;", "handler", "Landroid/os/Handler;", "updateSongTime", "Ljava/lang/Runnable;", "initViews", "", "track", "Lcom/renovavision/deezerplayer/domain/entities/PlayerModel;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "player_debug"})
public final class PlayerFragment extends androidx.fragment.app.Fragment {
    private final com.renovavision.deezerplayer.utils.BindingDelegate binding$delegate = null;
    private final com.renovavision.deezerplayer.utils.DeezerPlayer deezerPlayer = null;
    private final android.os.Handler handler = null;
    private final java.lang.Runnable updateSongTime = null;
    
    private final com.renovavision.player.databinding.FragmentPlayerBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews(com.renovavision.deezerplayer.domain.entities.PlayerModel track) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @javax.inject.Inject()
    public PlayerFragment() {
        super();
    }
}