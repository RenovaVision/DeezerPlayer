package com.renovavision.deezerplayer.data.repositories;

import com.renovavision.deezerplayer.data.api.MusicApi;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeRepositoryImpl_Factory implements Factory<HomeRepositoryImpl> {
  private final Provider<MusicApi> musicApiProvider;

  public HomeRepositoryImpl_Factory(Provider<MusicApi> musicApiProvider) {
    this.musicApiProvider = musicApiProvider;
  }

  @Override
  public HomeRepositoryImpl get() {
    return newInstance(musicApiProvider.get());
  }

  public static HomeRepositoryImpl_Factory create(Provider<MusicApi> musicApiProvider) {
    return new HomeRepositoryImpl_Factory(musicApiProvider);
  }

  public static HomeRepositoryImpl newInstance(MusicApi musicApi) {
    return new HomeRepositoryImpl(musicApi);
  }
}
