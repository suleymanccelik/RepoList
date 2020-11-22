package com.suleymancelik.github.core.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH&R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/suleymancelik/github/core/helper/ObservableInteractor;", "T", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "observe", "Lkotlinx/coroutines/flow/Flow;", "core_debug"})
public abstract interface ObservableInteractor<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.CoroutineDispatcher getDispatcher();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<T> observe();
}