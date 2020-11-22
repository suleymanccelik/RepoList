package com.suleymancelik.github.core

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.airbnb.mvrx.*
import io.reactivex.disposables.Disposable
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map
import timber.log.Timber
import kotlin.reflect.KProperty1

@ExperimentalCoroutinesApi
abstract class BaseViewModel<S : MvRxState>(initialState: S) :
    BaseMvRxViewModel<S>(initialState, debugMode = BuildConfig.DEBUG) {

    private val liveData by lazy(LazyThreadSafetyMode.NONE) {
        MvRxStateLiveData<S> {
            subscribe { value = it }
        }
    }

    protected suspend fun <T> Flow<T>.execute(
        stateReducer: S.(Async<T>) -> S) = execute({ it }, stateReducer)

    protected suspend fun <T, V> Flow<T>.execute(
        mapper: (T) -> V, stateReducer: S.(Async<V>) -> S) {
        setState { stateReducer(Loading()) }
        //setState { stateReducer(Fail(Throwable("Hata"))) }
        @Suppress("USELESS_CAST")
        return map { Success(mapper(it)) as Async<V> }
            .catch {
                if (BuildConfig.DEBUG) {
                    Timber.e(this@BaseViewModel::class.java.simpleName, "Exception during observe", it)
                }
                emit(Fail(it))
            }
            .collect { setState { stateReducer(it) } }
    }

    fun observeAsLiveData(): LiveData<S> = liveData

    fun <A> selectObserve(
        owner: LifecycleOwner,
        prop1: KProperty1<S, A>,
        deliveryMode: DeliveryMode
    ): LiveData<A> =
        MvRxStateLiveData {
            selectSubscribe(owner, prop1, deliveryMode) { value = it }
        }

    private class MvRxStateLiveData<T>(
        private val subscribe: MvRxStateLiveData<T>.() -> Disposable
    ) : MutableLiveData<T>() {
        private var disposable: Disposable? = null

        override fun onActive() {
            disposable = subscribe()
        }

        override fun onInactive() {
            val d = disposable
            disposable = null

            if (d != null && !d.isDisposed) {
                d.dispose()
            }
        }
    }
}

