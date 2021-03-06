package com.suleymancelik.github.ui.list.ui

import com.airbnb.mvrx.Fail

import com.suleymancelik.github.core.MvRxViewModel
import com.suleymancelik.github.core.helper.launchObserve
import com.suleymancelik.github.core.viewmodel.AssistedViewModelFactory
import com.suleymancelik.github.core.viewmodel.DaggerMvRxViewModelFactory
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class RepoListViewModel @AssistedInject constructor(
    @Assisted state: RepoListState,
    private val repoListWork: RepoListWork
) : MvRxViewModel<RepoListState>(state) {

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

    @dagger.assisted.AssistedFactory
    interface Factory : AssistedViewModelFactory<RepoListViewModel, RepoListState> {
        override fun create(state: RepoListState): RepoListViewModel
    }

    companion object :
        DaggerMvRxViewModelFactory<RepoListViewModel, RepoListState>(
            RepoListViewModel::class.java
        )
}
