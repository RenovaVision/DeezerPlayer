package com.renovavision.deezerplayer.domain.usecases;

import com.renovavision.deezerplayer.domain.repositories.TrackRepository;
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
public final class GetTopTracks_Factory implements Factory<GetTopTracks> {
  private final Provider<TrackRepository> trackRepositoryProvider;

  public GetTopTracks_Factory(Provider<TrackRepository> trackRepositoryProvider) {
    this.trackRepositoryProvider = trackRepositoryProvider;
  }

  @Override
  public GetTopTracks get() {
    return newInstance(trackRepositoryProvider.get());
  }

  public static GetTopTracks_Factory create(Provider<TrackRepository> trackRepositoryProvider) {
    return new GetTopTracks_Factory(trackRepositoryProvider);
  }

  public static GetTopTracks newInstance(TrackRepository trackRepository) {
    return new GetTopTracks(trackRepository);
  }
}
