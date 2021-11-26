package net.svichch.geekbrains.android.endlesslist.network.api.hot

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Resolution {
    @SerializedName("url")
    @Expose
    var url: String? = null

    @SerializedName("width")
    @Expose
    var width: Long? = null

    @SerializedName("height")
    @Expose
    var height: Long? = null
}