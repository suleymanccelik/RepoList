package com.suleymancelik.github.ui.list.ui

import androidx.lifecycle.viewModelScope
import com.airbnb.mvrx.Fail
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject
import com.suleymancelik.github.core.BaseViewModel
import com.suleymancelik.github.core.helper.launchObserve
import com.suleymancelik.github.core.viewmodel.AssistedViewModelFactory
import com.suleymancelik.github.core.viewmodel.DaggerMvRxViewModelFactory
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
class RepoListViewModel @AssistedInject constructor(
    @Assisted state: RepoListState,
    private val repoListWork: RepoListWork
) : BaseViewModel<RepoListState>(state) {

    fun makeSearchOperation(userName: String) {
        viewModelScope.launch {
            val job = async(repoListWork.dispatcher) {
                repoListWork(RepoListWork.Params(userName))
            }
            job.await()
        }

        viewModelScope.launchObserve(repoListWork) {
            it.execute { result ->
                try {
                    val list = result.invoke()?.getOrThrow()
                    if (list != null) {
                        copy(repoListState = result, repoList = list)
                    } else {
                        copy(repoListState = result)
                    }
                } catch (t: Throwable) {
                    copy(repoListState = Fail(t))
                }
            }
        }
    }

    @AssistedInject.Factory
    interface Factory : AssistedViewModelFactory<RepoListViewModel, RepoListState> {
        override fun create(state: RepoListState): RepoListViewModel
    }

    companion object :
        DaggerMvRxViewModelFactory<RepoListViewModel, RepoListState>(
            RepoListViewModel::class.java
        )
}
