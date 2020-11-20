package com.suleymancelik.github.ui.list.ui

import com.suleymancelik.github.core.helper.NetworkHelper
import com.suleymancelik.github.data.api.RepoListAPI
import com.suleymancelik.github.data.common.ErrorResult
import com.suleymancelik.github.data.common.Success
import com.suleymancelik.github.data.repo.RepoListModel
import com.suleymancelik.github.data.common.Result
import com.suleymancelik.github.data.common.executeForResult

import retrofit2.Retrofit
import javax.inject.Inject

class RepoListRepository @Inject constructor() {

    @Inject
    lateinit var mApiClient: Retrofit

    @Inject
    lateinit var mNetworkHelper: NetworkHelper

    private lateinit var institutionList: List<RepoListModel>

    suspend fun provideRepoList(userName: String): Result<List<RepoListModel>> = try {
        if (mNetworkHelper.isNetworkConnected()) {
            val service: RepoListAPI = mApiClient.create(RepoListAPI::class.java)
            val serviceCall =
                service.fetchRepoListByUser(
                    username = userName
                )
            when (val resultOfService = serviceCall.executeForResult()) {
                is Success -> {
                    ErrorResult(Throwable("ServiceErrorException"))
                }
                is ErrorResult -> {
                    ErrorResult(Throwable("ServiceErrorException"))
                }
            }
        } else {
            ErrorResult(Throwable("ServiceErrorException"))
        }
    } catch (e: Exception) {
        ErrorResult(Throwable("Hata"))
    }
}