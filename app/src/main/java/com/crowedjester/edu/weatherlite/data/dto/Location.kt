package com.crowedjester.edu.weatherlite.data.dto

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class Location(

  @SerialName("name") var name: String = EMPTY_STRING,
  @SerialName("region") var region: String = EMPTY_STRING,
  @SerialName("country") var country: String = EMPTY_STRING,
  @SerialName("lat") var lat: Double = DOUBLE_DEFAULT,
  @SerialName("lon") var lon: Double = DOUBLE_DEFAULT,
  @SerialName("tz_id") var tzId: String = EMPTY_STRING,
  @SerialName("localtime_epoch") var localtimeEpoch: Int = INT_DEFAULT,
  @SerialName("localtime") var localtime: String = EMPTY_STRING,

  )