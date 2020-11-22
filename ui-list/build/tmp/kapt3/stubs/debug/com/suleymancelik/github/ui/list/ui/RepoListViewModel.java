package com.suleymancelik.github.ui.list.ui;

import com.airbnb.mvrx.Fail;
import com.squareup.inject.assisted.Assisted;
import com.squareup.inject.assisted.AssistedInject;
import com.suleymancelik.github.core.BaseViewModel;
import com.suleymancelik.github.core.viewmodel.AssistedViewModelFactory;
import com.suleymancelik.github.core.viewmodel.DaggerMvRxViewModelFactory;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\fB\u0019\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/suleymancelik/github/ui/list/ui/RepoListViewModel;", "Lcom/suleymancelik/github/core/BaseViewModel;", "Lcom/suleymancelik/github/ui/list/ui/RepoListState;", "state", "repoListWork", "Lcom/suleymancelik/github/ui/list/ui/RepoListWork;", "(Lcom/suleymancelik/github/ui/list/ui/RepoListState;Lcom/suleymancelik/github/ui/list/ui/RepoListWork;)V", "makeSearchOperation", "", "userName", "", "Companion", "Factory", "ui-list_debug"})
public final class RepoListViewModel extends com.suleymancelik.github.core.BaseViewModel<com.suleymancelik.github.ui.list.ui.RepoListState> {
    private final com.suleymancelik.github.ui.list.ui.RepoListWork repoListWork = null;
    public static final com.suleymancelik.github.ui.list.ui.RepoListViewModel.Companion Companion = null;
    
    public final void makeSearchOperation(@org.jetbrains.annotations.NotNull()
    java.lang.String userName) {
    }
    
    @com.squareup.inject.assisted.AssistedInject()
    public RepoListViewModel(@org.jetbrains.annotations.NotNull()
    @com.squareup.inject.assisted.Assisted()
    com.suleymancelik.github.ui.list.ui.RepoListState state, @org.jetbrains.annotations.NotNull()
    com.suleymancelik.github.ui.list.ui.RepoListWork repoListWork) {
        super(null);
    }
    
    @com.squareup.inject.assisted.AssistedInject.Factory()
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/suleymancelik/github/ui/list/ui/RepoListViewModel$Factory;", "Lcom/suleymancelik/github/core/viewmodel/AssistedViewModelFactory;", "Lcom/suleymancelik/github/ui/list/ui/RepoListViewModel;", "Lcom/suleymancelik/github/ui/list/ui/RepoListState;", "create", "state", "ui-list_debug"})
    public static abstract interface Factory extends com.suleymancelik.github.core.viewmodel.AssistedViewModelFactory<com.suleymancelik.github.ui.list.ui.RepoListViewModel, com.suleymancelik.github.ui.list.ui.RepoListState> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public abstract com.suleymancelik.github.ui.list.ui.RepoListViewModel create(@org.jetbrains.annotations.NotNull()
        com.suleymancelik.github.ui.list.ui.RepoListState state);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/suleymancelik/github/ui/list/ui/RepoListViewModel$Companion;", "Lcom/suleymancelik/github/core/viewmodel/DaggerMvRxViewModelFactory;", "Lcom/suleymancelik/github/ui/list/ui/RepoListViewModel;", "Lcom/suleymancelik/github/ui/list/ui/RepoListState;", "()V", "ui-list_debug"})
    public static final class Companion extends com.suleymancelik.github.core.viewmodel.DaggerMvRxViewModelFactory<com.suleymancelik.github.ui.list.ui.RepoListViewModel, com.suleymancelik.github.ui.list.ui.RepoListState> {
        
        private Companion() {
            super(null);
        }
    }
}