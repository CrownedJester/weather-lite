package com.crowedjester.edu.weatherlite.presentation.main_screen

import com.crowedjester.edu.weatherlite.data.dto.EMPTY_STRING
import com.crowedjester.edu.weatherlite.domain.model.SearchResult

data class SearchDataState(
    val isLoading: Boolean = false,
    val data: List<SearchResult> = listOf(),
    val error: String = EMPTY_STRING,
)
