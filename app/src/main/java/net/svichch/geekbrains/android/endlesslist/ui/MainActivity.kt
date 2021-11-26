package net.svichch.geekbrains.android.endlesslist.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import net.svichch.geekbrains.android.endlesslist.R
import net.svichch.geekbrains.android.endlesslist.ui.list.FragmentList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment = FragmentList.newInstance()
        navigateTo(fragment)
    }

    fun navigateTo(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction
            .replace(R.id.container, fragment)
            .addToBackStack("list")
            .commit()
    }
}