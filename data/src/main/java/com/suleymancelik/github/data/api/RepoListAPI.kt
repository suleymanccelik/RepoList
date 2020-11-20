package com.suleymancelik.github.data.api

import com.suleymancelik.github.data.repo.RepoListModel
import retrofit2.Call
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Path

interface RepoListAPI {

    @FormUrlEncoded
    @GET("users/{username}/repos")
    fun fetchRepoListByUser(
        @Path("username") username: String
    ): Call<RepoListModel>

}