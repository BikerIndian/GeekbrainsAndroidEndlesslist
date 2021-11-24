package net.svichch.geekbrains.android.endlesslist.network.api

import net.svichch.geekbrains.android.endlesslist.network.retrofit.RetrofitNetwork

class ApiHolder {
    val api: IDataSource by lazy {
        RetrofitNetwork().getService("https://www.reddit.com/").create(IDataSource::class.java)
    }
}