package com.crowedjester.edu.weatherlite.data.dto

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class WeatherDto(

  @SerialName("location") var location: Location? = Location(),
  @SerialName("current") var current: Current? = Current(),
  @SerialName("forecast") var forecast: Forecast? = Forecast(),

  )