// Generated by Dagger (https://dagger.dev).
package com.suleymancelik.github.core;

import android.content.Context;
import android.content.SharedPreferences;
import com.suleymancelik.github.core.module.NetworkModule;
import com.suleymancelik.github.core.module.NetworkModule_ProvideBaseURLFactory;
import com.suleymancelik.github.core.module.NetworkModule_ProvideClientFactory;
import com.suleymancelik.github.core.module.NetworkModule_ProvideHttpLoggingInterceptorFactory;
import com.suleymancelik.github.core.module.NetworkModule_ProvideRetrofitFactory;
import com.suleymancelik.github.core.module.SharedPreferencesModule;
import com.suleymancelik.github.core.module.SharedPreferencesModule_ProvideSharedPreferenceEditorFactory;
import com.suleymancelik.github.core.module.SharedPreferencesModule_ProvideSharedPreferencesFactory;
import dagger.internal.Preconditions;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerCoreComponent implements CoreComponent {
  private final NetworkModule networkModule;

  private final SharedPreferencesModule sharedPreferencesModule;

  private final Context context;

  private DaggerCoreComponent(NetworkModule networkModuleParam,
      SharedPreferencesModule sharedPreferencesModuleParam, Context contextParam) {
    this.networkModule = networkModuleParam;
    this.sharedPreferencesModule = sharedPreferencesModuleParam;
    this.context = contextParam;
  }

  public static CoreComponent.Factory factory() {
    return new Factory();
  }

  @Override
  public OkHttpClient provideOkHttpClient() {
    return NetworkModule_ProvideClientFactory.provideClient(networkModule, NetworkModule_ProvideHttpLoggingInterceptorFactory.provideHttpLoggingInterceptor(networkModule));}

  @Override
  public Retrofit provideRetrofit() {
    return NetworkModule_ProvideRetrofitFactory.provideRetrofit(networkModule, NetworkModule_ProvideBaseURLFactory.provideBaseURL(networkModule), provideOkHttpClient());}

  @Override
  public SharedPreferences.Editor provideSharedPreferencesEditor() {
    return SharedPreferencesModule_ProvideSharedPreferenceEditorFactory.provideSharedPreferenceEditor(sharedPreferencesModule, provideSharedPreference());}

  @Override
  public SharedPreferences provideSharedPreference() {
    return SharedPreferencesModule_ProvideSharedPreferencesFactory.provideSharedPreferences(sharedPreferencesModule, context);}

  private static final class Factory implements CoreComponent.Factory {
    @Override
    public CoreComponent create(Context context) {
      Preconditions.checkNotNull(context);
      return new DaggerCoreComponent(new NetworkModule(), new SharedPreferencesModule(), context);
    }
  }
}
