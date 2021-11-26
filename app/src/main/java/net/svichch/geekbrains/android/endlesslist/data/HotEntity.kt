package net.svichch.geekbrains.android.endlesslist.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class HotEntity(
    @field:PrimaryKey

    @field:ColumnInfo(name = "content")
    var content: String,
    @field:ColumnInfo(name = "star_num")
    var starNum: String,
    @field:ColumnInfo(name = "comment_size")
    var comment_size: String?

)
