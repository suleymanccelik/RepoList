package com.suleymancelik.github.core.viewmodel

import com.suleymancelik.github.core.MvRxViewModel
import dagger.Module
import dagger.Provides

@Module
class ViewModelFactoryModule {

    @Provides
    fun provideMap(viewModelFactoryMap: Map<Class<out MvRxViewModel<*>>, AssistedViewModelFactory<*, *>>):
            Map<Class<out MvRxViewModel<*>>, AssistedViewModelFactory<*, *>> = viewModelFactoryMap
}