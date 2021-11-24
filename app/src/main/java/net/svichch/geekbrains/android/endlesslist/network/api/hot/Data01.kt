package net.svichch.geekbrains.android.endlesslist.network.api.hot

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Data01 {
    @SerializedName("after")
    @Expose
    var after: String? = null

    @SerializedName("dist")
    @Expose
    var dist: Long? = null

    @SerializedName("modhash")
    @Expose
    var modhash: String? = null

    @SerializedName("geo_filter")
    @Expose
    var geoFilter: Any? = null

    @SerializedName("children")
    @Expose
    var children: List<Child>? = null

    @SerializedName("before")
    @Expose
    var before: Any? = null
}