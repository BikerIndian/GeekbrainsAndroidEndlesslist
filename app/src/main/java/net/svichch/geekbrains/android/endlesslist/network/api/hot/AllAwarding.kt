package net.svichch.geekbrains.android.endlesslist.network.api.hot

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class AllAwarding {
    @SerializedName("giver_coin_reward")
    @Expose
    var giverCoinReward: Long? = null

    @SerializedName("subreddit_id")
    @Expose
    var subredditId: Any? = null

    @SerializedName("is_new")
    @Expose
    var isNew: Boolean? = null

    @SerializedName("days_of_drip_extension")
    @Expose
    var daysOfDripExtension: Long? = null

    @SerializedName("coin_price")
    @Expose
    var coinPrice: Long? = null

    @SerializedName("id")
    @Expose
    var id: String? = null

    @SerializedName("penny_donate")
    @Expose
    var pennyDonate: Long? = null

    @SerializedName("award_sub_type")
    @Expose
    var awardSubType: String? = null

    @SerializedName("coin_reward")
    @Expose
    var coinReward: Long? = null

    @SerializedName("icon_url")
    @Expose
    var iconUrl: String? = null

    @SerializedName("days_of_premium")
    @Expose
    var daysOfPremium: Long? = null

    @SerializedName("tiers_by_required_awardings")
    @Expose
    var tiersByRequiredAwardings: Any? = null

    @SerializedName("resized_icons")
    @Expose
    var resizedIcons: List<ResizedIcon>? = null

    @SerializedName("icon_width")
    @Expose
    var iconWidth: Long? = null

    @SerializedName("static_icon_width")
    @Expose
    var staticIconWidth: Long? = null

    @SerializedName("start_date")
    @Expose
    var startDate: Any? = null

    @SerializedName("is_enabled")
    @Expose
    var isEnabled: Boolean? = null

    @SerializedName("awardings_required_to_grant_benefits")
    @Expose
    var awardingsRequiredToGrantBenefits: Any? = null

    @SerializedName("description")
    @Expose
    var description: String? = null

    @SerializedName("end_date")
    @Expose
    var endDate: Any? = null

    @SerializedName("subreddit_coin_reward")
    @Expose
    var subredditCoinReward: Long? = null

    @SerializedName("count")
    @Expose
    var count: Long? = null

    @SerializedName("static_icon_height")
    @Expose
    var staticIconHeight: Long? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("resized_static_icons")
    @Expose
    var resizedStaticIcons: List<ResizedStaticIcon>? = null

    @SerializedName("icon_format")
    @Expose
    var iconFormat: String? = null

    @SerializedName("icon_height")
    @Expose
    var iconHeight: Long? = null

    @SerializedName("penny_price")
    @Expose
    var pennyPrice: Long? = null

    @SerializedName("award_type")
    @Expose
    var awardType: String? = null

    @SerializedName("static_icon_url")
    @Expose
    var staticIconUrl: String? = null
}