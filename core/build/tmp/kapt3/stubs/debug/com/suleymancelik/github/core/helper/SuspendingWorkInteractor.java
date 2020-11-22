package com.suleymancelik.github.core.helper;

import java.lang.System;

@kotlin.Suppress(names = {"EXPERIMENTAL_API_USAGE"})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00030\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\b\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u0000H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00028\u0000H\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/suleymancelik/github/core/helper/SuspendingWorkInteractor;", "P", "", "T", "Lcom/suleymancelik/github/core/helper/ObservableInteractor;", "()V", "channel", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "doWork", "params", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "", "observe", "Lkotlinx/coroutines/flow/Flow;", "core_debug"})
public abstract class SuspendingWorkInteractor<P extends java.lang.Object, T extends java.lang.Object> implements com.suleymancelik.github.core.helper.ObservableInteractor<T> {
    private final kotlinx.coroutines.channels.ConflatedBroadcastChannel<T> channel = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    P params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object doWork(@org.jetbrains.annotations.NotNull()
    P params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super T> p1);
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<T> observe() {
        return null;
    }
    
    public SuspendingWorkInteractor() {
        super();
    }
}