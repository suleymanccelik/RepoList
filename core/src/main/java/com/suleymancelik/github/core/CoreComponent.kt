package com.suleymancelik.github.core

import android.content.Context
import android.content.SharedPreferences
import com.suleymancelik.github.core.module.NetworkModule
import com.suleymancelik.github.core.module.SharedPreferencesModule
import dagger.BindsInstance
import dagger.Component
import okhttp3.OkHttpClient
import retrofit2.Retrofit

@Component(
    modules = [
        NetworkModule::class,
        SharedPreferencesModule::class
    ]
)
interface CoreComponent {

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context
        ): CoreComponent
    }

    fun provideOkHttpClient(): OkHttpClient

    fun provideRetrofit(): Retrofit

    fun provideSharedPreferencesEditor(): SharedPreferences.Editor

    fun provideSharedPreference(): SharedPreferences
}