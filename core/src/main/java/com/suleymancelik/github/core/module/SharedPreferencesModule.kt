package com.suleymancelik.github.core.module

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides

@Module
open class SharedPreferencesModule {

    @Provides
    fun provideSharedPreferences(context: Context): SharedPreferences {
        return context.applicationContext.getSharedPreferences("appConfig", Context.MODE_PRIVATE)
    }

    @Provides
    fun provideSharedPreferenceEditor(sharedPreferences: SharedPreferences): SharedPreferences.Editor {
        return sharedPreferences.edit()
    }
}
