package net.svichch.geekbrains.android.endlesslist.network.api.retrofit

import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import net.svichch.geekbrains.android.endlesslist.network.api.IDataSource
import net.svichch.geekbrains.android.endlesslist.network.api.hot.Hot

class RetrofitHot(private val api: IDataSource) : IHot {
    override fun getHot(): Single<Hot> = api.getHot().subscribeOn(Schedulers.io())
}