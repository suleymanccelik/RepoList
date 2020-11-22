package com.suleymancelik.github.di;

import com.suleymancelik.github.BaseApplication;
import com.suleymancelik.github.core.CoreComponent;
import com.suleymancelik.github.core.viewmodel.FactoriesMap;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tJ,\u0010\u0003\u001a&\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00070\u0004j\u0002`\bH&\u00a8\u0006\n"}, d2 = {"Lcom/suleymancelik/github/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/suleymancelik/github/BaseApplication;", "viewModelFactories", "", "Ljava/lang/Class;", "Lcom/suleymancelik/github/core/BaseViewModel;", "Lcom/suleymancelik/github/core/viewmodel/AssistedViewModelFactory;", "Lcom/suleymancelik/github/core/viewmodel/FactoriesMap;", "Factory", "app_debug"})
@dagger.Component(modules = {com.suleymancelik.github.di.ActivityBuilder.class, com.suleymancelik.github.di.AppModule.class, dagger.android.support.AndroidSupportInjectionModule.class}, dependencies = {com.suleymancelik.github.core.CoreComponent.class})
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.suleymancelik.github.BaseApplication> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.Class<? extends com.suleymancelik.github.core.BaseViewModel<?>>, com.suleymancelik.github.core.viewmodel.AssistedViewModelFactory<?, ?>> viewModelFactories();
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/suleymancelik/github/di/AppComponent$Factory;", "", "create", "Lcom/suleymancelik/github/di/AppComponent;", "application", "Lcom/suleymancelik/github/BaseApplication;", "coreComponent", "Lcom/suleymancelik/github/core/CoreComponent;", "app_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.suleymancelik.github.di.AppComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        com.suleymancelik.github.BaseApplication application, @org.jetbrains.annotations.NotNull()
        com.suleymancelik.github.core.CoreComponent coreComponent);
    }
}