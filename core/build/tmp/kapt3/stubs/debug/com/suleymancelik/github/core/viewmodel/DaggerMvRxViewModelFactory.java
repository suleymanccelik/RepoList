package com.suleymancelik.github.core.viewmodel;

import java.lang.System;

/**
 * A [MvRxViewModelFactory] which makes it easy to create instances of a ViewModel
 * using its AssistedInject Factory. This class should be implemented by the companion object
 * of every ViewModel which uses AssistedInject.
 *
 * @param viewModelClass The [Class] of the ViewModel being requested for creation
 *
 * This class accesses the map of [AssistedViewModelFactory]s from [AppComponent] and uses it to
 * retrieve the requested ViewModel's factory class. It then creates an instance of this ViewModel
 * using the retrieved factory and returns it.
 *
 * Example:
 *
 * class MyViewModel @AssistedInject constructor(...): BaseViewModel<MyState>(...) {
 *
 *  @AssistedInject.Factory
 *  interface Factory : AssistedViewModelFactory<MyViewModel, MyState> {
 *    ...
 *  }
 *
 *  companion object : DaggerMvRxViewModelFactory<MyViewModel, MyState>(MyViewModel::class.java)
 *
 * }
 */
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\'\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u001b\u0012\u0014\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\rJ/\u0010\u000e\u001a\u0002H\u0001\"\u000e\b\u0002\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\b\b\u0003\u0010\u0003*\u00020\u00042\u0006\u0010\f\u001a\u0002H\u0003H\u0002\u00a2\u0006\u0002\u0010\u000fR\u001c\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/suleymancelik/github/core/viewmodel/DaggerMvRxViewModelFactory;", "VM", "Lcom/suleymancelik/github/core/BaseViewModel;", "S", "Lcom/airbnb/mvrx/MvRxState;", "Lcom/airbnb/mvrx/MvRxViewModelFactory;", "viewModelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "create", "viewModelContext", "Lcom/airbnb/mvrx/ViewModelContext;", "state", "(Lcom/airbnb/mvrx/ViewModelContext;Lcom/airbnb/mvrx/MvRxState;)Lcom/suleymancelik/github/core/BaseViewModel;", "createViewModel", "(Lcom/airbnb/mvrx/MvRxState;)Lcom/suleymancelik/github/core/BaseViewModel;", "core_debug"})
public abstract class DaggerMvRxViewModelFactory<VM extends com.suleymancelik.github.core.BaseViewModel<S>, S extends com.airbnb.mvrx.MvRxState> implements com.airbnb.mvrx.MvRxViewModelFactory<VM, S> {
    private final java.lang.Class<? extends com.suleymancelik.github.core.BaseViewModel<S>> viewModelClass = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public VM create(@org.jetbrains.annotations.NotNull()
    com.airbnb.mvrx.ViewModelContext viewModelContext, @org.jetbrains.annotations.NotNull()
    S state) {
        return null;
    }
    
    private final <VM extends com.suleymancelik.github.core.BaseViewModel<S>, S extends com.airbnb.mvrx.MvRxState>VM createViewModel(S state) {
        return null;
    }
    
    public DaggerMvRxViewModelFactory(@org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends com.suleymancelik.github.core.BaseViewModel<S>> viewModelClass) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public S initialState(@org.jetbrains.annotations.NotNull()
    com.airbnb.mvrx.ViewModelContext viewModelContext) {
        return null;
    }
}