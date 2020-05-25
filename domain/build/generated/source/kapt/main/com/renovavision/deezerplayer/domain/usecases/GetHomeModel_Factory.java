package com.renovavision.deezerplayer.domain.usecases;

import com.renovavision.deezerplayer.domain.repositories.HomeRepository;
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
public final class GetHomeModel_Factory implements Factory<GetHomeModel> {
  private final Provider<HomeRepository> homeRepositoryProvider;

  public GetHomeModel_Factory(Provider<HomeRepository> homeRepositoryProvider) {
    this.homeRepositoryProvider = homeRepositoryProvider;
  }

  @Override
  public GetHomeModel get() {
    return newInstance(homeRepositoryProvider.get());
  }

  public static GetHomeModel_Factory create(Provider<HomeRepository> homeRepositoryProvider) {
    return new GetHomeModel_Factory(homeRepositoryProvider);
  }

  public static GetHomeModel newInstance(HomeRepository homeRepository) {
    return new GetHomeModel(homeRepository);
  }
}
