package com.suleymancelik.github.core.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/suleymancelik/github/core/module/SharedPreferencesModule;", "", "()V", "provideSharedPreferenceEditor", "Landroid/content/SharedPreferences$Editor;", "sharedPreferences", "Landroid/content/SharedPreferences;", "provideSharedPreferences", "context", "Landroid/content/Context;", "core_debug"})
@dagger.Module()
public class SharedPreferencesModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.SharedPreferences provideSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.SharedPreferences.Editor provideSharedPreferenceEditor(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        return null;
    }
    
    public SharedPreferencesModule() {
        super();
    }
}