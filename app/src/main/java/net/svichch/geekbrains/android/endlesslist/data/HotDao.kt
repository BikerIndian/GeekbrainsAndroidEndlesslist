package net.svichch.geekbrains.android.endlesslist.data

import androidx.room.*

@Dao
interface HotDao {

    @Query("SELECT * FROM HotEntity")
    suspend fun all(): List<HotEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(entity: HotEntity)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAll(entities: List<HotEntity>)

    @Update
    suspend fun update(entity: HotEntity)

    @Delete
    suspend fun delete(entity: HotEntity)
}
