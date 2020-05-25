// Generated by Dagger (https://dagger.dev).
package com.renovavision.deezerplayer.activity;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NavigationModule_NavBackFactory implements Factory<Function0<Boolean>> {
  private final Provider<MainActivity> mainActivityProvider;

  public NavigationModule_NavBackFactory(Provider<MainActivity> mainActivityProvider) {
    this.mainActivityProvider = mainActivityProvider;
  }

  @Override
  public Function0<Boolean> get() {
    return navBack(mainActivityProvider.get());
  }

  public static NavigationModule_NavBackFactory create(
      Provider<MainActivity> mainActivityProvider) {
    return new NavigationModule_NavBackFactory(mainActivityProvider);
  }

  public static Function0<Boolean> navBack(MainActivity mainActivity) {
    return Preconditions.checkNotNull(NavigationModule.INSTANCE.navBack(mainActivity), "Cannot return null from a non-@Nullable @Provides method");
  }
}
