// Generated by Dagger (https://dagger.dev).
package com.renovavision.deezerplayer.activity;

import androidx.fragment.app.Fragment;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NavHostFragmentModule_NavHostFragmentFactory implements Factory<Fragment> {
  @Override
  public Fragment get() {
    return navHostFragment();
  }

  public static NavHostFragmentModule_NavHostFragmentFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Fragment navHostFragment() {
    return Preconditions.checkNotNull(NavHostFragmentModule.INSTANCE.navHostFragment(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final NavHostFragmentModule_NavHostFragmentFactory INSTANCE = new NavHostFragmentModule_NavHostFragmentFactory();
  }
}