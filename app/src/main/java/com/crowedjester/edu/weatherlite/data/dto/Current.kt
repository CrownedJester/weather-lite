package com.crowedjester.edu.weatherlite.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Current(

  @SerialName("last_updated_epoch") var lastUpdatedEpoch: Int = INT_DEFAULT,
  @SerialName("last_updated") var lastUpdated: String = EMPTY_STRING,
  @SerialName("temp_c") var tempC: Double = DOUBLE_DEFAULT,
  @SerialName("temp_f") var tempF: Int = INT_DEFAULT,
  @SerialName("is_day") var isDay: Int = INT_DEFAULT,
  @SerialName("condition") var condition: Condition? = Condition(),
  @SerialName("wind_mph") var windMph: Double = DOUBLE_DEFAULT,
  @SerialName("wind_kph") var windKph: Double = DOUBLE_DEFAULT,
  @SerialName("wind_degree") var windDegree: Int = INT_DEFAULT,
  @SerialName("wind_dir") var windDir: String = EMPTY_STRING,
  @SerialName("pressure_mb") var pressureMb: Int = INT_DEFAULT,
  @SerialName("pressure_in") var pressureIn: Double = DOUBLE_DEFAULT,
  @SerialName("precip_mm") var precipMm: Double = DOUBLE_DEFAULT,
  @SerialName("precip_in") var precipIn: Double = DOUBLE_DEFAULT,
  @SerialName("humidity") var humidity: Int = INT_DEFAULT,
  @SerialName("cloud") var cloud: Int = INT_DEFAULT,
  @SerialName("feelslike_c") var feelslikeC: Double = DOUBLE_DEFAULT,
  @SerialName("feelslike_f") var feelslikeF: Double = DOUBLE_DEFAULT,
  @SerialName("windchill_c") var windchillC: Double = DOUBLE_DEFAULT,
  @SerialName("windchill_f") var windchillF: Int = INT_DEFAULT,
  @SerialName("heatindex_c") var heatindexC: Double = DOUBLE_DEFAULT,
  @SerialName("heatindex_f") var heatindexF: Double = DOUBLE_DEFAULT,
  @SerialName("dewpoint_c") var dewpointC: Double = DOUBLE_DEFAULT,
  @SerialName("dewpoint_f") var dewpointF: Double = DOUBLE_DEFAULT,
  @SerialName("vis_km") var visKm: Int = INT_DEFAULT,
  @SerialName("vis_miles") var visMiles: Int = INT_DEFAULT,
  @SerialName("uv") var uv: Double = DOUBLE_DEFAULT,
  @SerialName("gust_mph") var gustMph: Double = DOUBLE_DEFAULT,
  @SerialName("gust_kph") var gustKph: Double = DOUBLE_DEFAULT,
  @SerialName("air_quality") var airQuality: AirQuality? = AirQuality(),

  )