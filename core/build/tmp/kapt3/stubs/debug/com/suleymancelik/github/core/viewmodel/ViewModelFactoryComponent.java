package com.suleymancelik.github.core.viewmodel;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \b2\u00020\u0001:\u0002\b\tJ,\u0010\u0002\u001a&\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00060\u0003j\u0002`\u0007H&\u00a8\u0006\n"}, d2 = {"Lcom/suleymancelik/github/core/viewmodel/ViewModelFactoryComponent;", "", "provideViewModelFactories", "", "Ljava/lang/Class;", "Lcom/suleymancelik/github/core/BaseViewModel;", "Lcom/suleymancelik/github/core/viewmodel/AssistedViewModelFactory;", "Lcom/suleymancelik/github/core/viewmodel/FactoriesMap;", "Companion", "Factory", "core_debug"})
@dagger.Component(modules = {com.suleymancelik.github.core.viewmodel.ViewModelFactoryModule.class})
public abstract interface ViewModelFactoryComponent {
    public static final com.suleymancelik.github.core.viewmodel.ViewModelFactoryComponent.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.Class<? extends com.suleymancelik.github.core.BaseViewModel<?>>, com.suleymancelik.github.core.viewmodel.AssistedViewModelFactory<?, ?>> provideViewModelFactories();
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032,\b\u0001\u0010\u0004\u001a&\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b0\u0005j\u0002`\tH&\u00a8\u0006\n"}, d2 = {"Lcom/suleymancelik/github/core/viewmodel/ViewModelFactoryComponent$Factory;", "", "create", "Lcom/suleymancelik/github/core/viewmodel/ViewModelFactoryComponent;", "viewModelInject", "", "Ljava/lang/Class;", "Lcom/suleymancelik/github/core/BaseViewModel;", "Lcom/suleymancelik/github/core/viewmodel/AssistedViewModelFactory;", "Lcom/suleymancelik/github/core/viewmodel/FactoriesMap;", "core_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.suleymancelik.github.core.viewmodel.ViewModelFactoryComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        java.util.Map<java.lang.Class<? extends com.suleymancelik.github.core.BaseViewModel<?>>, ? extends com.suleymancelik.github.core.viewmodel.AssistedViewModelFactory<?, ?>> viewModelInject);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/suleymancelik/github/core/viewmodel/ViewModelFactoryComponent$Companion;", "", "()V", "instance", "Lcom/suleymancelik/github/core/viewmodel/ViewModelFactoryComponent;", "getInstance", "storeInstance", "", "core_debug"})
    public static final class Companion {
        private static com.suleymancelik.github.core.viewmodel.ViewModelFactoryComponent instance;
        
        public final void storeInstance(@org.jetbrains.annotations.NotNull()
        com.suleymancelik.github.core.viewmodel.ViewModelFactoryComponent instance) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.suleymancelik.github.core.viewmodel.ViewModelFactoryComponent getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}