package com.suleymancelik.github.core.helper;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlinx.coroutines.FlowPreview()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\'\u0018\u0000 \u0013*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0086\u0002\u00a2\u0006\u0002\u0010\u0012R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/suleymancelik/github/core/helper/Interactor;", "P", "", "()V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "doWork", "", "params", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeSync", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/suleymancelik/github/core/helper/InvokeStatus;", "timeoutMs", "", "(Ljava/lang/Object;J)Lkotlinx/coroutines/flow/Flow;", "Companion", "core_debug"})
public abstract class Interactor<P extends java.lang.Object> {
    private static final long defaultTimeoutMs = 0L;
    public static final com.suleymancelik.github.core.helper.Interactor.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    protected abstract kotlinx.coroutines.CoroutineScope getScope();
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.suleymancelik.github.core.helper.InvokeStatus> invoke(P params, long timeoutMs) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object executeSync(P params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object doWork(P params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    public Interactor() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/suleymancelik/github/core/helper/Interactor$Companion;", "", "()V", "defaultTimeoutMs", "", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}