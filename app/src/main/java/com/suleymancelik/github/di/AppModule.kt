package com.suleymancelik.github.di

import android.content.Context
import com.suleymancelik.github.BaseApplication
import com.suleymancelik.github.ui.list.di.RepoListModule
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@Module(includes = [RepoListModule::class])
class AppModule {

    @Provides
    fun provideContext(application: BaseApplication): Context = application.applicationContext

}