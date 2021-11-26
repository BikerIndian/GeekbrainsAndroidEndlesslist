package net.svichch.geekbrains.android.endlesslist.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(HotEntity::class), version = 1, exportSchema = false)
abstract class HotDataBase : RoomDatabase() {

    abstract fun getHotDao(): HotDao
}
