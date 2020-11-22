package com.suleymancelik.github.ui.list.ui

import com.suleymancelik.github.core.helper.SuspendingWorkInteractor
import com.suleymancelik.github.data.common.Result
import com.suleymancelik.github.data.repo.RepoListModelItem
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class RepoListWork @Inject constructor(
    private val institutionListRepository: RepoListRepository
) : SuspendingWorkInteractor<RepoListWork.Params, Result<List<RepoListModelItem>>>() {
    override val dispatcher: CoroutineDispatcher = Dispatchers.IO

    override suspend fun doWork(params: Params): Result<List<RepoListModelItem>> {
        return institutionListRepository.provideRepoList(params.username)
    }

    data class Params(val username: String)
}