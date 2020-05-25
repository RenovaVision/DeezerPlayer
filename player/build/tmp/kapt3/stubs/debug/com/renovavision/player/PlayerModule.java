package com.renovavision.player;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/renovavision/player/PlayerModule;", "", "playerFragment", "Landroidx/fragment/app/Fragment;", "Lcom/renovavision/player/PlayerFragment;", "player_debug"})
@dagger.Module()
public abstract interface PlayerModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.renovavision.deezerplayer.inject.FragmentKey(value = com.renovavision.player.PlayerFragment.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.fragment.app.Fragment playerFragment(@org.jetbrains.annotations.NotNull()
    com.renovavision.player.PlayerFragment playerFragment);
}