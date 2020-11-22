package com.suleymancelik.github.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\nJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&\u00a8\u0006\u000b"}, d2 = {"Lcom/suleymancelik/github/core/CoreComponent;", "", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideRetrofit", "Lretrofit2/Retrofit;", "provideSharedPreference", "Landroid/content/SharedPreferences;", "provideSharedPreferencesEditor", "Landroid/content/SharedPreferences$Editor;", "Factory", "core_debug"})
@dagger.Component(modules = {com.suleymancelik.github.core.module.NetworkModule.class, com.suleymancelik.github.core.module.SharedPreferencesModule.class})
public abstract interface CoreComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract okhttp3.OkHttpClient provideOkHttpClient();
    
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Retrofit provideRetrofit();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.SharedPreferences.Editor provideSharedPreferencesEditor();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.SharedPreferences provideSharedPreference();
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/suleymancelik/github/core/CoreComponent$Factory;", "", "create", "Lcom/suleymancelik/github/core/CoreComponent;", "context", "Landroid/content/Context;", "core_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.suleymancelik.github.core.CoreComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        android.content.Context context);
    }
}