package com.crowedjester.edu.weatherlite.data.dto

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class Forecastday(

  @SerialName("date") var date: String = EMPTY_STRING,
  @SerialName("date_epoch") var dateEpoch: Int = INT_DEFAULT,
  @SerialName("day") var day: Day? = Day(),
  @SerialName("astro") var astro: Astro = Astro(),
  @SerialName("hour") var hour: ArrayList<Hour> = arrayListOf(),

  )