package com.example.serviceexample

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class ClassicServiceExample : Service() {
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        Log.d("service","service created.")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("service","service started.")
        Log.d("service thread",Thread.currentThread().name)

//        stopSelf()

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("service","service destroyed.")
    }
}