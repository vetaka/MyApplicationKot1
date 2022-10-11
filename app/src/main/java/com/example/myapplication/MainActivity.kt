package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

import androidx.appcompat.widget.AppCompatButton
import com.google.android.gms.awareness.state.Weather as StateWeather


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<AppCompatButton>(R.id.btn).setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                findViewById<AppCompatButton>(R.id.btn).text = "Привет, дорогие "         }
        })



        val alex = Person(30, "Alex")
        val igor = alex.copy(age=35, nameOfPerson ="Igor")
        findViewById<TextView>(R.id.text_view).text = alex.nameOfPerson + " and " + igor.nameOfPerson

        val weatherList: List<StateWeather>

        for(weather in weatherList) {
            print(weather.humidity)
        }

        for(i in 1..10) {
                print("Hello Kotlin!")
        }

        for (i in 10 downTo 1 step 2)
            print("Hello Kotlin!")

    }
    data class Person(val age: Int, val nameOfPerson: String)

}