package com.suleymancelik.github.core.viewmodel;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005J\u0015\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/suleymancelik/github/core/viewmodel/AssistedViewModelFactory;", "VM", "Lcom/suleymancelik/github/core/BaseViewModel;", "S", "Lcom/airbnb/mvrx/MvRxState;", "", "create", "state", "(Lcom/airbnb/mvrx/MvRxState;)Lcom/suleymancelik/github/core/BaseViewModel;", "core_debug"})
public abstract interface AssistedViewModelFactory<VM extends com.suleymancelik.github.core.BaseViewModel<S>, S extends com.airbnb.mvrx.MvRxState> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract VM create(@org.jetbrains.annotations.NotNull()
    S state);
}