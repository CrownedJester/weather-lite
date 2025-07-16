package com.crowedjester.edu.weatherlite.domain.repo

import com.crowedjester.edu.weatherlite.data.WeatherApi
import com.crowedjester.edu.weatherlite.data.dto.WeatherDto
import com.crowedjester.edu.weatherlite.data.dto.current.CurrentWeatherDto
import com.crowedjester.edu.weatherlite.data.dto.search.SearchResponseDto
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi,
) : WeatherRepository {

    override suspend fun getCurrentWeather(
        query: String,
        aqi: String,
    ): CurrentWeatherDto = api.getCurrentWeather(q = query, aqi = aqi)

    override suspend fun getWeatherForecast(
        query: String,
        days: Int,
        aqi: String,
        alerts: String,
    ): WeatherDto =
        api.getWeatherForecast(query, days, aqi, alerts)


    override suspend fun search(query: String): SearchResponseDto = api.search(query)

}
