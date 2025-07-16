package com.crowedjester.edu.weatherlite.domain.use_cases

import com.crowedjester.edu.weatherlite.domain.repo.WeatherRepository
import javax.inject.Inject

class SearchUseCase @Inject constructor(private val repo: WeatherRepository) {

    suspend operator fun invoke(query: String) = repo.search(query)

}