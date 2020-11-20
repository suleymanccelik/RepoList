package com.suleymancelik.github.ui.list.ui

import com.airbnb.mvrx.Async
import com.airbnb.mvrx.MvRxState
import com.airbnb.mvrx.Uninitialized
import com.suleymancelik.github.data.common.Result
import com.suleymancelik.github.data.repo.RepoListModel


data class RepoListState(
    val repoListState: Async<Result<List<RepoListModel>>> = Uninitialized,
    val repoList: List<RepoListModel> = emptyList()
) : MvRxState