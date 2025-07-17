package com.crowedjester.edu.weatherlite.domain.model

import com.crowedjester.edu.weatherlite.data.dto.Current
import com.crowedjester.edu.weatherlite.data.dto.Forecast
import com.crowedjester.edu.weatherlite.data.dto.Location

data class Forecast(
    val location: Location = Location(),
    val current: Current = Current(),
    val forecast: Forecast = Forecast(),
)