package com.example.serviceexample

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService

class JobIntentServiceExample : JobIntentService() {

    override fun onHandleWork(intent: Intent) {

        Log.d("service","service started.")
        Log.d("service thread",Thread.currentThread().name)

    }
    companion object {
        fun onBackgroundService(context: Context, intent: Intent) {
            enqueueWork(context, JobIntentServiceExample::class.java, 1, intent)
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("service","service destroyed.")
    }
}