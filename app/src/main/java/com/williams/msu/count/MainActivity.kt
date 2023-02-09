package com.williams.msu.count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

private lateinit var tap_Button : Button
private lateinit var counter_text : TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tap_Button = findViewById(R.id.tap_Button)
        counter_text = findViewById(R.id.counter_text)

        var count = 0

        tap_Button.setOnClickListener {
            count++
            counter_text.text = count.toString()
        }
    }
}