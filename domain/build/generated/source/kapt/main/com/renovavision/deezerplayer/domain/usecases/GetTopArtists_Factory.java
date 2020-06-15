package com.renovavision.deezerplayer.domain.usecases;

import com.renovavision.deezerplayer.domain.repositories.ArtistRepository;
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
public final class GetTopArtists_Factory implements Factory<GetTopArtists> {
  private final Provider<ArtistRepository> artistRepositoryProvider;

  public GetTopArtists_Factory(Provider<ArtistRepository> artistRepositoryProvider) {
    this.artistRepositoryProvider = artistRepositoryProvider;
  }

  @Override
  public GetTopArtists get() {
    return newInstance(artistRepositoryProvider.get());
  }

  public static GetTopArtists_Factory create(Provider<ArtistRepository> artistRepositoryProvider) {
    return new GetTopArtists_Factory(artistRepositoryProvider);
  }

  public static GetTopArtists newInstance(ArtistRepository artistRepository) {
    return new GetTopArtists(artistRepository);
  }
}
