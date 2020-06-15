// Generated by Dagger (https://dagger.dev).
package com.renovavision.deezerplayer.album;

import androidx.lifecycle.ViewModelProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AlbumFragment_Factory implements Factory<AlbumFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public AlbumFragment_Factory(Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  @Override
  public AlbumFragment get() {
    return newInstance(viewModelFactoryProvider.get());
  }

  public static AlbumFragment_Factory create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new AlbumFragment_Factory(viewModelFactoryProvider);
  }

  public static AlbumFragment newInstance(ViewModelProvider.Factory viewModelFactory) {
    return new AlbumFragment(viewModelFactory);
  }
}
