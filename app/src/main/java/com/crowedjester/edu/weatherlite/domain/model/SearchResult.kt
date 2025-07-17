package com.crowedjester.edu.weatherlite.domain.model

import com.crowedjester.edu.weatherlite.data.dto.DOUBLE_DEFAULT
import com.crowedjester.edu.weatherlite.data.dto.EMPTY_STRING
import com.crowedjester.edu.weatherlite.data.dto.INT_DEFAULT
import kotlinx.serialization.SerialName

data class SearchResult(
    val id: Int = INT_DEFAULT,
    val name: String = EMPTY_STRING,
    val region: String = EMPTY_STRING,
    val country: String = EMPTY_STRING,
    val lat: Double = DOUBLE_DEFAULT,
    val lon: Double = DOUBLE_DEFAULT,
    val url: String = EMPTY_STRING
)