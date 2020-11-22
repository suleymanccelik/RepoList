// Generated by Dagger (https://dagger.dev).
package com.suleymancelik.github.core.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideBaseURLFactory implements Factory<String> {
  private final NetworkModule module;

  public NetworkModule_ProvideBaseURLFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideBaseURL(module);
  }

  public static NetworkModule_ProvideBaseURLFactory create(NetworkModule module) {
    return new NetworkModule_ProvideBaseURLFactory(module);
  }

  public static String provideBaseURL(NetworkModule instance) {
    return Preconditions.checkNotNull(instance.provideBaseURL(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
