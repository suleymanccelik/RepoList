package com.suleymancelik.github.data.common

sealed class ServiceResult<T> {
    open fun get(): T? = null

    fun getOrThrow(): T = when (this) {
        is SuccessResult -> get()
        is ServerError -> throw throwable
        is EmptyResult -> throw throwable
        is NetworkError -> throw throwable
    }
}

data class SuccessResult<T>(val data: T) : ServiceResult<T>() {
    override fun get(): T = data
}

data class ServerError<T>(val throwable: Throwable) : ServiceResult<T>()
data class NetworkError<T>(val throwable: Throwable) : ServiceResult<T>()
data class EmptyResult<T>(val throwable: Throwable) : ServiceResult<T>()

class NetworkErrorException : Throwable()

class ServiceErrorException : Throwable()

class EmptyListException : Throwable()