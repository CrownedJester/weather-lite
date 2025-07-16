package com.crowedjester.edu.weatherlite.data.dto.current

import com.crowedjester.edu.weatherlite.data.dto.Current
import com.crowedjester.edu.weatherlite.data.dto.Location
import kotlinx.serialization.SerialName

data class CurrentWeatherDto(
    @SerialName("location") var location: Location = Location(),
    @SerialName("current") var current: Current = Current(),
)
