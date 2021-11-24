package net.svichch.geekbrains.android.endlesslist.network.api.hot

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Gildings {
    @SerializedName("gid_1")
    @Expose
    var gid1: Long? = null

    @SerializedName("gid_2")
    @Expose
    var gid2: Long? = null
}