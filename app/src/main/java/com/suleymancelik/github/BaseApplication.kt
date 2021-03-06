package com.suleymancelik.github

import com.airbnb.mvrx.Mavericks
import com.suleymancelik.github.core.DaggerCoreComponent
import com.suleymancelik.github.core.viewmodel.DaggerViewModelFactoryComponent
import com.suleymancelik.github.core.viewmodel.ViewModelFactoryComponent
import com.suleymancelik.github.di.AppComponent
import com.suleymancelik.github.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import timber.log.Timber

class BaseApplication : DaggerApplication() {

    private lateinit var appComponent: AppComponent
    private lateinit var viewModelFactoryComponent: ViewModelFactoryComponent

    override fun onCreate() {
        super.onCreate()
        Mavericks.initialize(this)
        configureComponents()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        configureComponents()
        return appComponent
    }

    private fun configureComponents() {
        DaggerCoreComponent.factory().create(this).let { coreComponent ->
            appComponent = DaggerAppComponent.factory().create(this, coreComponent)
            viewModelFactoryComponent =
                DaggerViewModelFactoryComponent.factory().create(appComponent.viewModelFactories())
            ViewModelFactoryComponent.storeInstance(viewModelFactoryComponent);
        }
    }
}