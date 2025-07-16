package com.crowedjester.edu.weatherlite.mappers

import com.crowedjester.edu.weatherlite.data.dto.WeatherDto
import com.crowedjester.edu.weatherlite.domain.model.Forecast

fun WeatherDto.toForecast() =
    Forecast(
        location,
        current,
        forecast
    )