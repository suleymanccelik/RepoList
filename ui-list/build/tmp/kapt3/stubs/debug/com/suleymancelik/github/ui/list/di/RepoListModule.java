package com.suleymancelik.github.ui.list.di;

import com.squareup.inject.assisted.dagger2.AssistedModule;
import com.suleymancelik.github.core.viewmodel.AssistedViewModelFactory;
import com.suleymancelik.github.core.viewmodel.ViewModelKey;
import com.suleymancelik.github.ui.list.ui.RepoListViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@com.squareup.inject.assisted.dagger2.AssistedModule()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/suleymancelik/github/ui/list/di/RepoListModule;", "", "repoListViewModelFactory", "Lcom/suleymancelik/github/core/viewmodel/AssistedViewModelFactory;", "factory", "Lcom/suleymancelik/github/ui/list/ui/RepoListViewModel$Factory;", "ui-list_debug"})
@dagger.Module(includes = {AssistedInject_RepoListModule.class})
public abstract interface RepoListModule {
    
    @org.jetbrains.annotations.NotNull()
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @com.suleymancelik.github.core.viewmodel.ViewModelKey(value = com.suleymancelik.github.ui.list.ui.RepoListViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract com.suleymancelik.github.core.viewmodel.AssistedViewModelFactory<?, ?> repoListViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.suleymancelik.github.ui.list.ui.RepoListViewModel.Factory factory);
}