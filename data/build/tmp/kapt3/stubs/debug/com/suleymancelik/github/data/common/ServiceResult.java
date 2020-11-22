package com.suleymancelik.github.data.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/suleymancelik/github/data/common/ServiceResult;", "T", "", "()V", "get", "()Ljava/lang/Object;", "getOrThrow", "Lcom/suleymancelik/github/data/common/SuccessResult;", "Lcom/suleymancelik/github/data/common/ServerError;", "Lcom/suleymancelik/github/data/common/NetworkError;", "Lcom/suleymancelik/github/data/common/EmptyResult;", "data_debug"})
public abstract class ServiceResult<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.Nullable()
    public T get() {
        return null;
    }
    
    public final T getOrThrow() {
        return null;
    }
    
    private ServiceResult() {
        super();
    }
}