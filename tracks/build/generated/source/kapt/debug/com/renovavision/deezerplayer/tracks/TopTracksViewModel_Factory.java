// Generated by Dagger (https://dagger.dev).
package com.renovavision.deezerplayer.tracks;

import com.renovavision.deezerplayer.domain.usecases.GetHomeModel;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TopTracksViewModel_Factory implements Factory<TopTracksViewModel> {
  private final Provider<GetHomeModel> useCaseProvider;

  public TopTracksViewModel_Factory(Provider<GetHomeModel> useCaseProvider) {
    this.useCaseProvider = useCaseProvider;
  }

  @Override
  public TopTracksViewModel get() {
    return newInstance(useCaseProvider.get());
  }

  public static TopTracksViewModel_Factory create(Provider<GetHomeModel> useCaseProvider) {
    return new TopTracksViewModel_Factory(useCaseProvider);
  }

  public static TopTracksViewModel newInstance(GetHomeModel useCase) {
    return new TopTracksViewModel(useCase);
  }
}
