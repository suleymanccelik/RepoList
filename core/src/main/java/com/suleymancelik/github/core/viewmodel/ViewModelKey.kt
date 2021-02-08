package com.suleymancelik.github.core.viewmodel

import com.suleymancelik.github.core.MvRxViewModel
import dagger.MapKey
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlin.reflect.KClass


@ExperimentalCoroutinesApi
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
@MapKey
annotation class ViewModelKey(val value: KClass<out MvRxViewModel<*>>)