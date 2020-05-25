package com.renovavision.deezerplayer.data;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.io.File;
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
public final class NetworkModule_ProvideRetrofit$dataFactory implements Factory<Retrofit> {
  private final Provider<File> httpCacheDirProvider;

  private final Provider<String> apiUrlProvider;

  public NetworkModule_ProvideRetrofit$dataFactory(Provider<File> httpCacheDirProvider,
      Provider<String> apiUrlProvider) {
    this.httpCacheDirProvider = httpCacheDirProvider;
    this.apiUrlProvider = apiUrlProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit$data(httpCacheDirProvider.get(), apiUrlProvider.get());
  }

  public static NetworkModule_ProvideRetrofit$dataFactory create(
      Provider<File> httpCacheDirProvider, Provider<String> apiUrlProvider) {
    return new NetworkModule_ProvideRetrofit$dataFactory(httpCacheDirProvider, apiUrlProvider);
  }

  public static Retrofit provideRetrofit$data(File httpCacheDir, String apiUrl) {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.provideRetrofit$data(httpCacheDir, apiUrl), "Cannot return null from a non-@Nullable @Provides method");
  }
}
