package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * Created by fyx on 2021/6/16
 */
class SunnyWeatherApplication : Application() {
    companion object{
        const val TOKEN = "VZy1hYEW2Okxoysm"
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}