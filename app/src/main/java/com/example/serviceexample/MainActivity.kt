package com.example.serviceexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var startClassicService : Button
    lateinit var startJobIntentService : Button
    lateinit var stopService : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startClassicService = findViewById(R.id.startClassicService)
        startJobIntentService = findViewById(R.id.startJobIntentService)
        stopService = findViewById(R.id.stopService)

        startClassicService.setOnClickListener {
            var intent = Intent(this@MainActivity,ClassicServiceExample::class.java)
            startService(intent)
        }

        startJobIntentService.setOnClickListener {
            var intent = Intent(this@MainActivity,JobIntentServiceExample::class.java)
            JobIntentServiceExample.onBackgroundService(this@MainActivity,intent)
        }

        stopService.setOnClickListener {
            var intent = Intent(this@MainActivity,ClassicServiceExample::class.java)
            stopService(intent)
        }
    }
}