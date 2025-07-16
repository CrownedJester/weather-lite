package com.crowedjester.edu.weatherlite.data.dto.search

import com.crowedjester.edu.weatherlite.data.dto.DOUBLE_DEFAULT
import com.crowedjester.edu.weatherlite.data.dto.EMPTY_STRING
import com.crowedjester.edu.weatherlite.data.dto.INT_DEFAULT
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class SearchResponseDto(

    @SerialName("id") var id: Int = INT_DEFAULT,
    @SerialName("name") var name: String = EMPTY_STRING,
    @SerialName("region") var region: String = EMPTY_STRING,
    @SerialName("country") var country: String = EMPTY_STRING,
    @SerialName("lat") var lat: Double = DOUBLE_DEFAULT,
    @SerialName("lon") var lon: Double = DOUBLE_DEFAULT,
    @SerialName("url") var url: String = EMPTY_STRING,

    )