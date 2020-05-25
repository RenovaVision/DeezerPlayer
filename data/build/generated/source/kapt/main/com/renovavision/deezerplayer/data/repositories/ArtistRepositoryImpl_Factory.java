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
public final class ArtistRepositoryImpl_Factory implements Factory<ArtistRepositoryImpl> {
  private final Provider<MusicApi> musicApiProvider;

  public ArtistRepositoryImpl_Factory(Provider<MusicApi> musicApiProvider) {
    this.musicApiProvider = musicApiProvider;
  }

  @Override
  public ArtistRepositoryImpl get() {
    return newInstance(musicApiProvider.get());
  }

  public static ArtistRepositoryImpl_Factory create(Provider<MusicApi> musicApiProvider) {
    return new ArtistRepositoryImpl_Factory(musicApiProvider);
  }

  public static ArtistRepositoryImpl newInstance(MusicApi musicApi) {
    return new ArtistRepositoryImpl(musicApi);
  }
}
