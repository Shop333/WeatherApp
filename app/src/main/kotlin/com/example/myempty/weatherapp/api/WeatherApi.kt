package com.example.myempty.weatherapp.api

import com.example.myempty.weatherapp.model.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("current.json")
    suspend fun getCurrentWeather(
        @Query("key") apiKey: String,
        @Query("q") location: String,
        @Query("aqi") aqi: String = "no"
    ): WeatherResponse
}
