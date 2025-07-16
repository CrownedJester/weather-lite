package com.crowedjester.edu.weatherlite.domain.repo

import com.crowedjester.edu.weatherlite.data.dto.WeatherDto
import com.crowedjester.edu.weatherlite.data.dto.current.CurrentWeatherDto
import com.crowedjester.edu.weatherlite.data.dto.search.SearchResponseDto

interface WeatherRepository {


    suspend fun getCurrentWeather(query: String, aqi: String): CurrentWeatherDto

    suspend fun getWeatherForecast(
        query: String,
        days: Int,
        aqi: String,
        alerts: String,
    ): WeatherDto

    suspend fun search(query: String): SearchResponseDto

}