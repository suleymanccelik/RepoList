package com.suleymancelik.github.core.viewmodel

import com.suleymancelik.github.core.BaseViewModel
import dagger.MapKey
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlin.reflect.KClass


@ExperimentalCoroutinesApi
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
@MapKey
annotation class ViewModelKey(val value: KClass<out BaseViewModel<*>>)