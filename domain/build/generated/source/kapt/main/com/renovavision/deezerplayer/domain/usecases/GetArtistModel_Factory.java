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
public final class GetArtistModel_Factory implements Factory<GetArtistModel> {
  private final Provider<ArtistRepository> artistRepositoryProvider;

  public GetArtistModel_Factory(Provider<ArtistRepository> artistRepositoryProvider) {
    this.artistRepositoryProvider = artistRepositoryProvider;
  }

  @Override
  public GetArtistModel get() {
    return newInstance(artistRepositoryProvider.get());
  }

  public static GetArtistModel_Factory create(Provider<ArtistRepository> artistRepositoryProvider) {
    return new GetArtistModel_Factory(artistRepositoryProvider);
  }

  public static GetArtistModel newInstance(ArtistRepository artistRepository) {
    return new GetArtistModel(artistRepository);
  }
}
