package com.example.myempty.weatherapp.model

data class WeatherResponse(
    val location: Location,
    val current: Current
)

data class Location(
    val name: String,
    val region: String,
    val country: String,
    val localtime: String
)

data class Current(
    val temp_c: Double,
    val feelslike_c: Double,
    val humidity: Int,
    val wind_kph: Double,
    val condition: Condition,
    val uv: Double
)

data class Condition(
    val text: String,
    val icon: String
)
