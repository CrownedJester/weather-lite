package com.crowedjester.edu.weatherlite.data.dto

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class Forecast(

  @SerialName("forecastday") var forecastday: ArrayList<Forecastday> = arrayListOf(),

  )