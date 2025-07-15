package com.crowedjester.edu.weatherlite.data.dto

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class Astro(

  @SerialName("sunrise") var sunrise: String = EMPTY_STRING,
  @SerialName("sunset") var sunset: String = EMPTY_STRING,
  @SerialName("moonrise") var moonrise: String = EMPTY_STRING,
  @SerialName("moonset") var moonset: String = EMPTY_STRING,
  @SerialName("moon_phase") var moonPhase: String = EMPTY_STRING,
  @SerialName("moon_illumination") var moonIllumination: Int = INT_DEFAULT,
  @SerialName("is_moon_up") var isMoonUp: Int = INT_DEFAULT,
  @SerialName("is_sun_up") var isSunUp: Int = INT_DEFAULT,

  )