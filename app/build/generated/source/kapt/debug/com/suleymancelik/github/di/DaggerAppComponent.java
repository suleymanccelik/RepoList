// Generated by Dagger (https://dagger.dev).
package com.suleymancelik.github.di;

import android.content.Context;
import com.suleymancelik.github.BaseApplication;
import com.suleymancelik.github.MainActivity;
import com.suleymancelik.github.core.BaseViewModel;
import com.suleymancelik.github.core.CoreComponent;
import com.suleymancelik.github.core.helper.NetworkHelper;
import com.suleymancelik.github.core.helper.NetworkHelper_Factory;
import com.suleymancelik.github.core.viewmodel.AssistedViewModelFactory;
import com.suleymancelik.github.ui.list.ui.RepoListRepository;
import com.suleymancelik.github.ui.list.ui.RepoListRepository_Factory;
import com.suleymancelik.github.ui.list.ui.RepoListViewModel;
import com.suleymancelik.github.ui.list.ui.RepoListViewModel_AssistedFactory;
import com.suleymancelik.github.ui.list.ui.RepoListWork;
import com.suleymancelik.github.ui.list.ui.RepoListWork_Factory;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private Provider<ActivityBuilder_BindMainActivity.MainActivitySubcomponent.Factory> mainActivitySubcomponentFactoryProvider;

  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<BaseApplication> applicationProvider;

  private Provider<Context> provideContextProvider;

  private Provider<NetworkHelper> networkHelperProvider;

  private Provider<RepoListRepository> repoListRepositoryProvider;

  private Provider<RepoListWork> repoListWorkProvider;

  private DaggerAppComponent(AppModule appModuleParam, CoreComponent coreComponentParam,
      BaseApplication applicationParam) {

    initialize(appModuleParam, coreComponentParam, applicationParam);
  }

  public static AppComponent.Factory factory() {
    return new Factory();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
      ) {
    return Collections.<Class<?>, Provider<AndroidInjector.Factory<?>>>singletonMap(MainActivity.class, (Provider) mainActivitySubcomponentFactoryProvider);}

  private DispatchingAndroidInjector<Object> getDispatchingAndroidInjectorOfObject() {
    return DispatchingAndroidInjector_Factory.newInstance(getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());}

  private RepoListViewModel_AssistedFactory getRepoListViewModel_AssistedFactory() {
    return new RepoListViewModel_AssistedFactory(repoListWorkProvider);}

  @SuppressWarnings("unchecked")
  private void initialize(final AppModule appModuleParam, final CoreComponent coreComponentParam,
      final BaseApplication applicationParam) {
    this.mainActivitySubcomponentFactoryProvider = new Provider<ActivityBuilder_BindMainActivity.MainActivitySubcomponent.Factory>() {
      @Override
      public ActivityBuilder_BindMainActivity.MainActivitySubcomponent.Factory get() {
        return new MainActivitySubcomponentFactory();}
    };
    this.provideRetrofitProvider = new com_suleymancelik_github_core_CoreComponent_provideRetrofit(coreComponentParam);
    this.applicationProvider = InstanceFactory.create(applicationParam);
    this.provideContextProvider = AppModule_ProvideContextFactory.create(appModuleParam, applicationProvider);
    this.networkHelperProvider = NetworkHelper_Factory.create(provideContextProvider);
    this.repoListRepositoryProvider = RepoListRepository_Factory.create(provideRetrofitProvider, networkHelperProvider);
    this.repoListWorkProvider = RepoListWork_Factory.create(repoListRepositoryProvider);
  }

  @Override
  public void inject(BaseApplication arg0) {
    injectBaseApplication(arg0);}

  @Override
  public Map<Class<? extends BaseViewModel<?>>, AssistedViewModelFactory<?, ?>> viewModelFactories(
      ) {
    return Collections.<Class<? extends BaseViewModel<?>>, AssistedViewModelFactory<?, ?>>singletonMap(RepoListViewModel.class, getRepoListViewModel_AssistedFactory());}

  private BaseApplication injectBaseApplication(BaseApplication instance) {
    DaggerApplication_MembersInjector.injectAndroidInjector(instance, getDispatchingAndroidInjectorOfObject());
    return instance;
  }

  private static final class Factory implements AppComponent.Factory {
    @Override
    public AppComponent create(BaseApplication application, CoreComponent coreComponent) {
      Preconditions.checkNotNull(application);
      Preconditions.checkNotNull(coreComponent);
      return new DaggerAppComponent(new AppModule(), coreComponent, application);
    }
  }

  private static class com_suleymancelik_github_core_CoreComponent_provideRetrofit implements Provider<Retrofit> {
    private final CoreComponent coreComponent;

    com_suleymancelik_github_core_CoreComponent_provideRetrofit(CoreComponent coreComponent) {
      this.coreComponent = coreComponent;
    }

    @Override
    public Retrofit get() {
      return Preconditions.checkNotNull(coreComponent.provideRetrofit(), "Cannot return null from a non-@Nullable component method");
    }
  }

  private final class MainActivitySubcomponentFactory implements ActivityBuilder_BindMainActivity.MainActivitySubcomponent.Factory {
    @Override
    public ActivityBuilder_BindMainActivity.MainActivitySubcomponent create(MainActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new MainActivitySubcomponentImpl(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl implements ActivityBuilder_BindMainActivity.MainActivitySubcomponent {
    private MainActivitySubcomponentImpl(MainActivity arg0) {

    }

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);}

    private MainActivity injectMainActivity(MainActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfObject());
      return instance;
    }
  }
}
