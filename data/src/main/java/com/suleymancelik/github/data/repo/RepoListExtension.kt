package com.suleymancelik.github.data.repo

import com.suleymancelik.github.data.common.EmptyListException
import com.suleymancelik.github.data.common.EmptyResult
import com.suleymancelik.github.data.common.ServiceResult
import com.suleymancelik.github.data.common.SuccessResult

fun List<RepoListModelItem>.completeRequest(): ServiceResult<List<RepoListModelItem>> =
    if (this.isNullOrEmpty()) {
        EmptyResult(EmptyListException())
    } else {
        SuccessResult(this)
    }
