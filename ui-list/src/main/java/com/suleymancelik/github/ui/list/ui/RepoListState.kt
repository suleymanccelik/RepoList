package com.suleymancelik.github.ui.list.ui

import com.airbnb.mvrx.Async
import com.airbnb.mvrx.MavericksState
import com.airbnb.mvrx.Uninitialized
import com.suleymancelik.github.data.common.Result
import com.suleymancelik.github.data.repo.RepoListModelItem


data class RepoListState(
    val repoListState: Async<Result<List<RepoListModelItem>>> = Uninitialized,
    val repoList: List<RepoListModelItem> = emptyList()
) : MavericksState