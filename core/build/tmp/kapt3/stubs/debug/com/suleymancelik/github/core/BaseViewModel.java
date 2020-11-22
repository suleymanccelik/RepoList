package com.suleymancelik.github.core;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001#B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0005J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ6\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u000f0\r\"\u0004\b\u0001\u0010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u000f0\u00132\u0006\u0010\u0014\u001a\u00020\u0015J`\u0010\u0016\u001a\u00020\u0017\"\u0004\b\u0001\u0010\u0018\"\u0004\b\u0002\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00180\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u00190\u001c2#\u0010\u001d\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190\u001f\u0012\u0004\u0012\u00028\u00000\u001e\u00a2\u0006\u0002\b H\u0084@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!JF\u0010\u0016\u001a\u00020\u0017\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u0002H\u00180\u001a2#\u0010\u001d\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u001f\u0012\u0004\u0012\u00028\u00000\u001e\u00a2\u0006\u0002\b H\u0084@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"R!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/suleymancelik/github/core/BaseViewModel;", "S", "Lcom/airbnb/mvrx/MvRxState;", "Lcom/airbnb/mvrx/BaseMvRxViewModel;", "initialState", "(Lcom/airbnb/mvrx/MvRxState;)V", "liveData", "Lcom/suleymancelik/github/core/BaseViewModel$MvRxStateLiveData;", "getLiveData", "()Lcom/suleymancelik/github/core/BaseViewModel$MvRxStateLiveData;", "liveData$delegate", "Lkotlin/Lazy;", "observeAsLiveData", "Landroidx/lifecycle/LiveData;", "selectObserve", "A", "owner", "Landroidx/lifecycle/LifecycleOwner;", "prop1", "Lkotlin/reflect/KProperty1;", "deliveryMode", "Lcom/airbnb/mvrx/DeliveryMode;", "execute", "", "T", "V", "Lkotlinx/coroutines/flow/Flow;", "mapper", "Lkotlin/Function1;", "stateReducer", "Lkotlin/Function2;", "Lcom/airbnb/mvrx/Async;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "MvRxStateLiveData", "core_debug"})
public abstract class BaseViewModel<S extends com.airbnb.mvrx.MvRxState> extends com.airbnb.mvrx.BaseMvRxViewModel<S> {
    private final kotlin.Lazy liveData$delegate = null;
    
    private final com.suleymancelik.github.core.BaseViewModel.MvRxStateLiveData<S> getLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final <T extends java.lang.Object>java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends T> $this$execute, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super S, ? super com.airbnb.mvrx.Async<? extends T>, ? extends S> stateReducer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final <T extends java.lang.Object, V extends java.lang.Object>java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends T> $this$execute, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends V> mapper, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super S, ? super com.airbnb.mvrx.Async<? extends V>, ? extends S> stateReducer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<S> observeAsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <A extends java.lang.Object>androidx.lifecycle.LiveData<A> selectObserve(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty1<S, ? extends A> prop1, @org.jetbrains.annotations.NotNull()
    com.airbnb.mvrx.DeliveryMode deliveryMode) {
        return null;
    }
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    S initialState) {
        super(null, false, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B$\u0012\u001d\u0010\u0003\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\b\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\nH\u0014R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R%\u0010\u0003\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\b\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/suleymancelik/github/core/BaseViewModel$MvRxStateLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "subscribe", "Lkotlin/Function1;", "Lio/reactivex/disposables/Disposable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "disposable", "onActive", "", "onInactive", "core_debug"})
    static final class MvRxStateLiveData<T extends java.lang.Object> extends androidx.lifecycle.MutableLiveData<T> {
        private io.reactivex.disposables.Disposable disposable;
        private final kotlin.jvm.functions.Function1<com.suleymancelik.github.core.BaseViewModel.MvRxStateLiveData<T>, io.reactivex.disposables.Disposable> subscribe = null;
        
        @java.lang.Override()
        protected void onActive() {
        }
        
        @java.lang.Override()
        protected void onInactive() {
        }
        
        public MvRxStateLiveData(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.suleymancelik.github.core.BaseViewModel.MvRxStateLiveData<T>, ? extends io.reactivex.disposables.Disposable> subscribe) {
            super(null);
        }
    }
}