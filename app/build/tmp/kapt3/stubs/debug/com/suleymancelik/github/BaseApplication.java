package com.suleymancelik.github;

import com.suleymancelik.github.core.DaggerCoreComponent;
import com.suleymancelik.github.core.viewmodel.DaggerViewModelFactoryComponent;
import com.suleymancelik.github.core.viewmodel.ViewModelFactoryComponent;
import com.suleymancelik.github.di.AppComponent;
import com.suleymancelik.github.di.DaggerAppComponent;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import timber.log.Timber;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/suleymancelik/github/BaseApplication;", "Ldagger/android/DaggerApplication;", "()V", "appComponent", "Lcom/suleymancelik/github/di/AppComponent;", "viewModelFactoryComponent", "Lcom/suleymancelik/github/core/viewmodel/ViewModelFactoryComponent;", "applicationInjector", "Ldagger/android/AndroidInjector;", "configureComponents", "", "onCreate", "app_debug"})
public final class BaseApplication extends dagger.android.DaggerApplication {
    private com.suleymancelik.github.di.AppComponent appComponent;
    private com.suleymancelik.github.core.viewmodel.ViewModelFactoryComponent viewModelFactoryComponent;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected dagger.android.AndroidInjector<? extends dagger.android.DaggerApplication> applicationInjector() {
        return null;
    }
    
    private final void configureComponents() {
    }
    
    public BaseApplication() {
        super();
    }
}