package com.crowedjester.edu.weatherlite.domain.use_cases

import com.crowedjester.edu.weatherlite.domain.repo.WeatherRepository
import com.crowedjester.edu.weatherlite.mappers.toCurrent
import javax.inject.Inject

class GetCurrentUseCase @Inject constructor(private val repo: WeatherRepository) {

    suspend operator fun invoke(query: String, aqi: String) =
        repo.getCurrentWeather(query, aqi).toCurrent()

}