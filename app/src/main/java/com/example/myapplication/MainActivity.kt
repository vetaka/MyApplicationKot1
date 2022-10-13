package com.example.myapplication


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import android.util.Log.d


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<AppCompatButton>(R.id.btn).setOnClickListener {
            findViewById<AppCompatButton>(R.id.btn).text = "Привет, дорогие "
        }


        val alex = Per(30, "Alex")
        val igor = alex.copy(age =35, nameOfPerson = "Igor")
        findViewById<TextView>(R.id.text_view).text =
            alex.nameOfPerson + " and " + igor.nameOfPerson



        for (i in 1..10) {
           d("@@@", "Hello Kotlin!")
        }

        for (i in 10 downTo 1 step 2)
            print("Hello Kotlin!")








    }

}
data class Per(val age: Int, val nameOfPerson: String)