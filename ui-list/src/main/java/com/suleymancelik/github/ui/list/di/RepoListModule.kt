package com.suleymancelik.github.ui.list.di

import com.suleymancelik.github.core.viewmodel.AssistedViewModelFactory
import com.suleymancelik.github.core.viewmodel.ViewModelKey
import com.suleymancelik.github.ui.list.ui.RepoListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
interface RepoListModule {

    @Binds
    @IntoMap
    @ViewModelKey(RepoListViewModel::class)
    fun repoListViewModelFactory(factory: RepoListViewModel.Factory): AssistedViewModelFactory<*, *>

}