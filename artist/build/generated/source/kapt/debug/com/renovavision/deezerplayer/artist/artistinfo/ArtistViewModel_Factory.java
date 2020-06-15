// Generated by Dagger (https://dagger.dev).
package com.renovavision.deezerplayer.artist.artistinfo;

import com.renovavision.deezerplayer.artist.ArtistNavigator;
import com.renovavision.deezerplayer.domain.CoroutineDispatcherProvider;
import com.renovavision.deezerplayer.domain.usecases.GetArtistModel;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ArtistViewModel_Factory implements Factory<ArtistViewModel> {
  private final Provider<GetArtistModel> useCaseProvider;

  private final Provider<ArtistNavigator> artistNavigatorProvider;

  private final Provider<CoroutineDispatcherProvider> dispatcherProvider;

  public ArtistViewModel_Factory(Provider<GetArtistModel> useCaseProvider,
      Provider<ArtistNavigator> artistNavigatorProvider,
      Provider<CoroutineDispatcherProvider> dispatcherProvider) {
    this.useCaseProvider = useCaseProvider;
    this.artistNavigatorProvider = artistNavigatorProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public ArtistViewModel get() {
    return newInstance(useCaseProvider.get(), artistNavigatorProvider.get(), dispatcherProvider.get());
  }

  public static ArtistViewModel_Factory create(Provider<GetArtistModel> useCaseProvider,
      Provider<ArtistNavigator> artistNavigatorProvider,
      Provider<CoroutineDispatcherProvider> dispatcherProvider) {
    return new ArtistViewModel_Factory(useCaseProvider, artistNavigatorProvider, dispatcherProvider);
  }

  public static ArtistViewModel newInstance(GetArtistModel useCase, ArtistNavigator artistNavigator,
      CoroutineDispatcherProvider dispatcherProvider) {
    return new ArtistViewModel(useCase, artistNavigator, dispatcherProvider);
  }
}