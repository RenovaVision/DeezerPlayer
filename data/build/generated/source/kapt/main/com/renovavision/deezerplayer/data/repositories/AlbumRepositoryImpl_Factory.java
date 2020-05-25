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
public final class AlbumRepositoryImpl_Factory implements Factory<AlbumRepositoryImpl> {
  private final Provider<MusicApi> musicApiProvider;

  public AlbumRepositoryImpl_Factory(Provider<MusicApi> musicApiProvider) {
    this.musicApiProvider = musicApiProvider;
  }

  @Override
  public AlbumRepositoryImpl get() {
    return newInstance(musicApiProvider.get());
  }

  public static AlbumRepositoryImpl_Factory create(Provider<MusicApi> musicApiProvider) {
    return new AlbumRepositoryImpl_Factory(musicApiProvider);
  }

  public static AlbumRepositoryImpl newInstance(MusicApi musicApi) {
    return new AlbumRepositoryImpl(musicApi);
  }
}
