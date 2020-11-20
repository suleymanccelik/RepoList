package com.suleymancelik.github.di

import com.suleymancelik.github.BaseApplication
import com.suleymancelik.github.core.CoreComponent
import com.suleymancelik.github.core.viewmodel.FactoriesMap
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@Component(
    modules = [
        ActivityBuilder::class,
        AppModule::class,
        AndroidSupportInjectionModule::class
    ],
    dependencies = [CoreComponent::class]
)
interface AppComponent : AndroidInjector<BaseApplication> {

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance application: BaseApplication,
            coreComponent: CoreComponent
        ): AppComponent
    }

    fun viewModelFactories(): FactoriesMap
}