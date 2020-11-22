package com.suleymancelik.github.core.viewmodel;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0014\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003R\u001b\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/suleymancelik/github/core/viewmodel/ViewModelKey;", "", "value", "Lkotlin/reflect/KClass;", "Lcom/suleymancelik/github/core/BaseViewModel;", "()Ljava/lang/Class;", "core_debug"})
@java.lang.annotation.Target(value = {java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@dagger.MapKey()
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FUNCTION})
@kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.RUNTIME)
public abstract @interface ViewModelKey {
    
    public abstract java.lang.Class<? extends com.suleymancelik.github.core.BaseViewModel<?>> value();
}