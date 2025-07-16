package com.crowedjester.edu.weatherlite.data.dto

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class AirQuality(

    @SerialName("co") var co: Double = DOUBLE_DEFAULT,
    @SerialName("no2") var no2: Double = DOUBLE_DEFAULT,
    @SerialName("o3") var o3: Int = INT_DEFAULT,
    @SerialName("so2") var so2: Double = DOUBLE_DEFAULT,
    @SerialName("pm2_5") var pm25: Double = DOUBLE_DEFAULT,
    @SerialName("pm10") var pm10: Double = DOUBLE_DEFAULT,
    @SerialName("us-epa-index") var usEpaIndex: Int = INT_DEFAULT,
    @SerialName("gb-defra-index") var gbDefraIndex: Int = INT_DEFAULT,
)