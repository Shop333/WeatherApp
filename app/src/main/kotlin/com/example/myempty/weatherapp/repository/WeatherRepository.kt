package com.example.myempty.weatherapp.repository

import com.example.myempty.weatherapp.api.RetrofitInstance
import com.example.myempty.weatherapp.model.WeatherResponse

class WeatherRepository {
    private val api = RetrofitInstance.api
    private val apiKey = "8b53513e1bc84ff1a4e55836261505"

    suspend fun getWeather(location: String): Result<WeatherResponse> {
        return try {
            val response = api.getCurrentWeather(apiKey, location)
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
