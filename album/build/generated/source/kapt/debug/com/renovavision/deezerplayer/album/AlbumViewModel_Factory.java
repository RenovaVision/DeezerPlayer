// Generated by Dagger (https://dagger.dev).
package com.renovavision.deezerplayer.album;

import com.renovavision.deezerplayer.domain.usecases.GetAlbumInfo;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AlbumViewModel_Factory implements Factory<AlbumViewModel> {
  private final Provider<GetAlbumInfo> useCaseProvider;

  public AlbumViewModel_Factory(Provider<GetAlbumInfo> useCaseProvider) {
    this.useCaseProvider = useCaseProvider;
  }

  @Override
  public AlbumViewModel get() {
    return newInstance(useCaseProvider.get());
  }

  public static AlbumViewModel_Factory create(Provider<GetAlbumInfo> useCaseProvider) {
    return new AlbumViewModel_Factory(useCaseProvider);
  }

  public static AlbumViewModel newInstance(GetAlbumInfo useCase) {
    return new AlbumViewModel(useCase);
  }
}
