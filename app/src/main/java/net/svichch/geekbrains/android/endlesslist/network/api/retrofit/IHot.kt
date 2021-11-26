package net.svichch.geekbrains.android.endlesslist.network.api.retrofit

import io.reactivex.rxjava3.core.Single
import net.svichch.geekbrains.android.endlesslist.network.api.hot.Hot

interface IHot {

    fun getHot(): Single<Hot>
}