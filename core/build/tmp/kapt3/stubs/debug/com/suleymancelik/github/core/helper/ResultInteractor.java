package com.suleymancelik.github.core.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\t\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0000H\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u0012\u0010\u0005\u001a\u00020\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/suleymancelik/github/core/helper/ResultInteractor;", "P", "R", "", "()V", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "doWork", "params", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "core_debug"})
public abstract class ResultInteractor<P extends java.lang.Object, R extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.CoroutineDispatcher getDispatcher();
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(P params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super R> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object doWork(P params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super R> p1);
    
    public ResultInteractor() {
        super();
    }
}