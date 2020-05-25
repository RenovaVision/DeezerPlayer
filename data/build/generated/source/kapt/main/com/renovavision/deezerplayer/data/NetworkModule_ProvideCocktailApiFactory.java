package com.renovavision.deezerplayer.data;

import com.renovavision.deezerplayer.data.api.MusicApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideCocktailApiFactory implements Factory<MusicApi> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideCocktailApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public MusicApi get() {
    return provideCocktailApi(retrofitProvider.get());
  }

  public static NetworkModule_ProvideCocktailApiFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideCocktailApiFactory(retrofitProvider);
  }

  public static MusicApi provideCocktailApi(Retrofit retrofit) {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.provideCocktailApi(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
