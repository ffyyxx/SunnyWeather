package com.sunnyweather.android.logic.model

/**
 * Created by fyx on 2021/6/16
 */
data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily)