package com.crowedjester.edu.weatherlite.mappers

import com.crowedjester.edu.weatherlite.data.dto.current.CurrentWeatherDto
import com.crowedjester.edu.weatherlite.domain.model.Current

fun CurrentWeatherDto.toCurrent() =
    Current(
        location,
        current
    )
