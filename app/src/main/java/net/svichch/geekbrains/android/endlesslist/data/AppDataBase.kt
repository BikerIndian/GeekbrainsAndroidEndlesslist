package net.svichch.geekbrains.android.endlesslist.data

import android.app.Application
import androidx.room.Room

// паттерн синглтон, наследуем класс Application
// Запуск в манифесте
class AppDataBase : Application() {

    private val DATA_BASE_NAME = "education_database"

    private lateinit var db: HotDataBase

    override fun onCreate() {
        super.onCreate()

        // Это для синглтона, сохраняем объект приложения
        instance = this

        db = Room.databaseBuilder(
            applicationContext,
            HotDataBase::class.java,
            DATA_BASE_NAME
        )
            .allowMainThreadQueries() //Только для примеров и тестирования.
            .build()
    }

    // Получаем Dao для составления запросов
    fun getHotDao() = db.getHotDao()

    companion object {
        // Так получаем объект приложения
        lateinit var instance: AppDataBase
    }
}