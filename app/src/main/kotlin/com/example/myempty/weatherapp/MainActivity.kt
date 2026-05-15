package com.example.myempty.weatherapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.myempty.weatherapp.databinding.ActivityMainBinding
import com.example.myempty.weatherapp.repository.WeatherRepository
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val repository = WeatherRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSearch.setOnClickListener {
            val city = binding.etCity.text.toString().trim()
            if (city.isNotEmpty()) {
                fetchWeather(city)
            } else {
                Toast.makeText(this, "Masukkan nama kota!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun fetchWeather(city: String) {
        binding.progressBar.visibility = View.VISIBLE
        binding.cardWeather.visibility = View.GONE

        lifecycleScope.launch {
            val result = repository.getWeather(city)
            binding.progressBar.visibility = View.GONE

            result.onSuccess { weather ->
                binding.cardWeather.visibility = View.VISIBLE
                binding.tvCity.text = "${weather.location.name}, ${weather.location.country}"
                binding.tvTemp.text = "${weather.current.temp_c}°C"
                binding.tvCondition.text = weather.current.condition.text
                binding.tvHumidity.text = "Kelembaban: ${weather.current.humidity}%"
                binding.tvWind.text = "Angin: ${weather.current.wind_kph} km/h"
                binding.tvFeelsLike.text = "Terasa seperti: ${weather.current.feelslike_c}°C"
            }.onFailure {
                Toast.makeText(this@MainActivity, "Gagal: ${it.message}", Toast.LENGTH_LONG).show()
            }
        }
    }
}
