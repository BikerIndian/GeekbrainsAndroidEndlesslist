package net.svichch.geekbrains.android.endlesslist.network.api

import io.reactivex.rxjava3.core.Single
import net.svichch.geekbrains.android.endlesslist.network.api.hot.Hot
import retrofit2.http.GET

interface IDataSource {

    @GET("r/aww/hot.json")
    fun getHot(): Single<Hot>

}