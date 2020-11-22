package com.suleymancelik.github.ui.list.di

import com.squareup.inject.assisted.dagger2.AssistedModule
import com.suleymancelik.github.core.viewmodel.AssistedViewModelFactory
import com.suleymancelik.github.core.viewmodel.ViewModelKey
import com.suleymancelik.github.ui.list.ui.RepoListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import kotlinx.coroutines.ExperimentalCoroutinesApi


@Module(includes = [AssistedInject_RepoListModule::class])
@AssistedModule
interface RepoListModule {

    @ExperimentalCoroutinesApi
    @Binds
    @IntoMap
    @ViewModelKey(RepoListViewModel::class)
    fun repoListViewModelFactory(factory: RepoListViewModel.Factory): AssistedViewModelFactory<*, *>

}