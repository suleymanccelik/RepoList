// Generated by Dagger (https://dagger.dev).
package com.suleymancelik.github.core.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final NetworkModule module;

  private final Provider<String> baseURLProvider;

  private final Provider<OkHttpClient> clientProvider;

  public NetworkModule_ProvideRetrofitFactory(NetworkModule module,
      Provider<String> baseURLProvider, Provider<OkHttpClient> clientProvider) {
    this.module = module;
    this.baseURLProvider = baseURLProvider;
    this.clientProvider = clientProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(module, baseURLProvider.get(), clientProvider.get());
  }

  public static NetworkModule_ProvideRetrofitFactory create(NetworkModule module,
      Provider<String> baseURLProvider, Provider<OkHttpClient> clientProvider) {
    return new NetworkModule_ProvideRetrofitFactory(module, baseURLProvider, clientProvider);
  }

  public static Retrofit provideRetrofit(NetworkModule instance, String baseURL,
      OkHttpClient client) {
    return Preconditions.checkNotNull(instance.provideRetrofit(baseURL, client), "Cannot return null from a non-@Nullable @Provides method");
  }
}
