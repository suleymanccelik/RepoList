package com.suleymancelik.github.core.viewmodel

import com.suleymancelik.github.core.MvRxViewModel
import dagger.MapKey
import kotlin.reflect.KClass


@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
@MapKey
annotation class ViewModelKey(val value: KClass<out MvRxViewModel<*>>)