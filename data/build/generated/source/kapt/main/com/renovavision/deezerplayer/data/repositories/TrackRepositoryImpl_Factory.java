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
public final class TrackRepositoryImpl_Factory implements Factory<TrackRepositoryImpl> {
  private final Provider<MusicApi> musicApiProvider;

  public TrackRepositoryImpl_Factory(Provider<MusicApi> musicApiProvider) {
    this.musicApiProvider = musicApiProvider;
  }

  @Override
  public TrackRepositoryImpl get() {
    return newInstance(musicApiProvider.get());
  }

  public static TrackRepositoryImpl_Factory create(Provider<MusicApi> musicApiProvider) {
    return new TrackRepositoryImpl_Factory(musicApiProvider);
  }

  public static TrackRepositoryImpl newInstance(MusicApi musicApi) {
    return new TrackRepositoryImpl(musicApi);
  }
}
