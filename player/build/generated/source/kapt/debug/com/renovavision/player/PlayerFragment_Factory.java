// Generated by Dagger (https://dagger.dev).
package com.renovavision.player;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PlayerFragment_Factory implements Factory<PlayerFragment> {
  @Override
  public PlayerFragment get() {
    return newInstance();
  }

  public static PlayerFragment_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PlayerFragment newInstance() {
    return new PlayerFragment();
  }

  private static final class InstanceHolder {
    private static final PlayerFragment_Factory INSTANCE = new PlayerFragment_Factory();
  }
}
