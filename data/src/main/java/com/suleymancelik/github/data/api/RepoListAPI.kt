package com.suleymancelik.github.data.api

import com.suleymancelik.github.data.repo.RepoListModelItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RepoListAPI {

    @GET("users/{username}/repos")
    fun fetchRepoListByUser(
        @Path("username") username: String
    ): Call<List<RepoListModelItem>>

}