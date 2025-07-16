package com.crowedjester.edu.weatherlite.domain.model

import com.crowedjester.edu.weatherlite.data.dto.Current
import com.crowedjester.edu.weatherlite.data.dto.Location
import com.crowedjester.edu.weatherlite.data.dto.current.CurrentWeatherDto

data class Current(
    val location: Location = Location(),
    val current: Current = Current(),
)
