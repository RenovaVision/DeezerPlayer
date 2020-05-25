package com.renovavision.deezerplayer.domain.usecases;

import com.renovavision.deezerplayer.domain.repositories.AlbumRepository;
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
public final class GetAlbumInfo_Factory implements Factory<GetAlbumInfo> {
  private final Provider<AlbumRepository> albumRepositoryProvider;

  public GetAlbumInfo_Factory(Provider<AlbumRepository> albumRepositoryProvider) {
    this.albumRepositoryProvider = albumRepositoryProvider;
  }

  @Override
  public GetAlbumInfo get() {
    return newInstance(albumRepositoryProvider.get());
  }

  public static GetAlbumInfo_Factory create(Provider<AlbumRepository> albumRepositoryProvider) {
    return new GetAlbumInfo_Factory(albumRepositoryProvider);
  }

  public static GetAlbumInfo newInstance(AlbumRepository albumRepository) {
    return new GetAlbumInfo(albumRepository);
  }
}
