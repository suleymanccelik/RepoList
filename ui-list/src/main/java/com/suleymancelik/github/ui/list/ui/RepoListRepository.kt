package com.suleymancelik.github.ui.list.ui

import com.suleymancelik.github.core.helper.NetworkHelper
import com.suleymancelik.github.data.api.RepoListAPI
import com.suleymancelik.github.data.common.*
import com.suleymancelik.github.data.repo.RepoListModelItem
import com.suleymancelik.github.data.repo.completeRequest

import retrofit2.Retrofit
import javax.inject.Inject

class RepoListRepository @Inject constructor() {

    @Inject
    lateinit var mApiClient: Retrofit

    @Inject
    lateinit var mNetworkHelper: NetworkHelper

    fun provideRepoList(userName: String): Result<List<RepoListModelItem>> = try {
        if (mNetworkHelper.isNetworkConnected()) {
            val service: RepoListAPI = mApiClient.create(RepoListAPI::class.java)
            val serviceCall =
                service.fetchRepoListByUser(username = userName)
            when (val resultOfService = serviceCall.executeForResult()) {
                is Success -> {
                    when (resultOfService.data.completeRequest()) {
                        is SuccessResult -> Success(resultOfService.data)
                        else -> ErrorResult(EmptyListException())
                    }
                }
                is ErrorResult -> {
                    ErrorResult(ServiceErrorException())
                }
            }
        } else {
            ErrorResult(NetworkErrorException())
        }
    } catch (e: Exception) {
        ErrorResult(ServiceErrorException())
    }
}