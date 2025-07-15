package com.crowedjester.edu.weatherlite.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Hour(

  @SerialName("time_epoch") var timeEpoch: Int = INT_DEFAULT,
  @SerialName("time") var time: String = EMPTY_STRING,
  @SerialName("temp_c") var tempC: Double = DOUBLE_DEFAULT,
  @SerialName("temp_f") var tempF: Double = DOUBLE_DEFAULT,
  @SerialName("is_day") var isDay: Int = INT_DEFAULT,
  @SerialName("condition") var condition: Condition? = Condition(),
  @SerialName("wind_mph") var windMph: Double = DOUBLE_DEFAULT,
  @SerialName("wind_kph") var windKph: Double = DOUBLE_DEFAULT,
  @SerialName("wind_degree") var windDegree: Int = INT_DEFAULT,
  @SerialName("wind_dir") var windDir: String = EMPTY_STRING,
  @SerialName("pressure_mb") var pressureMb: Int = INT_DEFAULT,
  @SerialName("pressure_in") var pressureIn: Double = DOUBLE_DEFAULT,
  @SerialName("precip_mm") var precipMm: Int = INT_DEFAULT,
  @SerialName("precip_in") var precipIn: Int = INT_DEFAULT,
  @SerialName("snow_cm") var snowCm: Int = INT_DEFAULT,
  @SerialName("humidity") var humidity: Int = INT_DEFAULT,
  @SerialName("cloud") var cloud: Int = INT_DEFAULT,
  @SerialName("feelslike_c") var feelslikeC: Double = DOUBLE_DEFAULT,
  @SerialName("feelslike_f") var feelslikeF: Double = DOUBLE_DEFAULT,
  @SerialName("windchill_c") var windchillC: Double = DOUBLE_DEFAULT,
  @SerialName("windchill_f") var windchillF: Double = DOUBLE_DEFAULT,
  @SerialName("heatindex_c") var heatindexC: Double = DOUBLE_DEFAULT,
  @SerialName("heatindex_f") var heatindexF: Double = DOUBLE_DEFAULT,
  @SerialName("dewpoint_c") var dewpointC: Double = DOUBLE_DEFAULT,
  @SerialName("dewpoint_f") var dewpointF: Double = DOUBLE_DEFAULT,
  @SerialName("will_it_rain") var willItRain: Int = INT_DEFAULT,
  @SerialName("chance_of_rain") var chanceOfRain: Int = INT_DEFAULT,
  @SerialName("will_it_snow") var willItSnow: Int = INT_DEFAULT,
  @SerialName("chance_of_snow") var chanceOfSnow: Int = INT_DEFAULT,
  @SerialName("vis_km") var visKm: Int = INT_DEFAULT,
  @SerialName("vis_miles") var visMiles: Int = INT_DEFAULT,
  @SerialName("gust_mph") var gustMph: Int = INT_DEFAULT,
  @SerialName("gust_kph") var gustKph: Double = DOUBLE_DEFAULT,
  @SerialName("uv") var uv: Int = INT_DEFAULT,
  @SerialName("air_quality") var airQuality: AirQuality = AirQuality(),

  )