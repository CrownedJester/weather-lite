package com.crowedjester.edu.weatherlite.data.dto

import com.crowedjester.edu.weatherlite.data.dto.AirQuality
import com.crowedjester.edu.weatherlite.data.dto.Condition
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class Day(

    @SerialName("maxtemp_c") var maxtempC: Double = DOUBLE_DEFAULT,
    @SerialName("maxtemp_f") var maxtempF: Double = DOUBLE_DEFAULT,
    @SerialName("mintemp_c") var mintempC: Double = DOUBLE_DEFAULT,
    @SerialName("mintemp_f") var mintempF: Double = DOUBLE_DEFAULT,
    @SerialName("avgtemp_c") var avgtempC: Double = DOUBLE_DEFAULT,
    @SerialName("avgtemp_f") var avgtempF: Double = DOUBLE_DEFAULT,
    @SerialName("maxwind_mph") var maxwindMph: Int = INT_DEFAULT,
    @SerialName("maxwind_kph") var maxwindKph: Double = DOUBLE_DEFAULT,
    @SerialName("totalprecip_mm") var totalprecipMm: Double = DOUBLE_DEFAULT,
    @SerialName("totalprecip_in") var totalprecipIn: Double = DOUBLE_DEFAULT,
    @SerialName("totalsnow_cm") var totalsnowCm: Int = INT_DEFAULT,
    @SerialName("avgvis_km") var avgvisKm: Double = DOUBLE_DEFAULT,
    @SerialName("avgvis_miles") var avgvisMiles: Int = INT_DEFAULT,
    @SerialName("avghumidity") var avghumidity: Int = INT_DEFAULT,
    @SerialName("daily_will_it_rain") var dailyWillItRain: Int = INT_DEFAULT,
    @SerialName("daily_chance_of_rain") var dailyChanceOfRain: Int = INT_DEFAULT,
    @SerialName("daily_will_it_snow") var dailyWillItSnow: Int = INT_DEFAULT,
    @SerialName("daily_chance_of_snow") var dailyChanceOfSnow: Int = INT_DEFAULT,
    @SerialName("condition") var condition: Condition? = Condition(),
    @SerialName("uv") var uv: Double = DOUBLE_DEFAULT,
    @SerialName("air_quality") var airQuality: AirQuality? = AirQuality(),

    )

const val DOUBLE_DEFAULT: Double = -1.0

const val EMPTY_STRING: String = ""

const val INT_DEFAULT: Int = -1