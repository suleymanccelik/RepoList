package com.suleymancelik.github.di;

import android.content.Context;
import com.suleymancelik.github.BaseApplication;
import com.suleymancelik.github.ui.list.di.RepoListModule;
import dagger.Module;
import dagger.Provides;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/suleymancelik/github/di/AppModule;", "", "()V", "provideContext", "Landroid/content/Context;", "application", "Lcom/suleymancelik/github/BaseApplication;", "app_debug"})
@dagger.Module(includes = {com.suleymancelik.github.ui.list.di.RepoListModule.class})
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull()
    com.suleymancelik.github.BaseApplication application) {
        return null;
    }
    
    public AppModule() {
        super();
    }
}