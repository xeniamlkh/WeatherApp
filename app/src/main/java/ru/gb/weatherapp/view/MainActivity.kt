package ru.gb.weatherapp.view

// UI Layer (View)

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.gb.weatherapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_frame, MainFragment.newInstance())
                .commit()
        }
    }
}