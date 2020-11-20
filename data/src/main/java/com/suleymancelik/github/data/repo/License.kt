package com.suleymancelik.github.data.repo


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class License(
    @field:Json(name = "key")
    val key: String,
    @field:Json(name = "name")
    val name: String,
    @field:Json(name = "node_id")
    val nodeId: String,
    @field:Json(name = "spdx_id")
    val spdxId: String,
    @field:Json(name = "url")
    val url: String
)