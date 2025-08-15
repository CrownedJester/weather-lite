package com.crowedjester.edu.weatherlite.domain.use_cases

import com.crowedjester.edu.weatherlite.domain.repo.WeatherRepository
import com.crowedjester.edu.weatherlite.mappers.toSearchResult
import javax.inject.Inject

class SearchUseCase @Inject constructor(private val repo: WeatherRepository) {

    suspend operator fun invoke(query: String) = repo.search(query).map { it.toSearchResult() }

}