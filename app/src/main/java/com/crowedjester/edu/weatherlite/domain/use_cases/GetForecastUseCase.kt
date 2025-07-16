package com.crowedjester.edu.weatherlite.domain.use_cases

import com.crowedjester.edu.weatherlite.domain.repo.WeatherRepository
import javax.inject.Inject

class GetForecastUseCase @Inject constructor(private val repo: WeatherRepository) {

    suspend operator fun invoke(query: String, days: Int, aqi: String, alerts: String) =
        repo.getWeatherForecast(query, days, aqi, alerts)
}