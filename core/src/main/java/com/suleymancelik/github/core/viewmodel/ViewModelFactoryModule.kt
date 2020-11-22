package com.suleymancelik.github.core.viewmodel

import com.suleymancelik.github.core.BaseViewModel
import dagger.Module
import dagger.Provides

@Module
class ViewModelFactoryModule {

    @Provides
    fun provideMap(viewModelFactoryMap: Map<Class<out BaseViewModel<*>>, AssistedViewModelFactory<*, *>>):
            Map<Class<out BaseViewModel<*>>, AssistedViewModelFactory<*, *>> = viewModelFactoryMap
}