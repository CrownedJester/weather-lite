package com.crowedjester.edu.weatherlite.mappers

import com.crowedjester.edu.weatherlite.data.dto.search.SearchResponseDto
import com.crowedjester.edu.weatherlite.domain.model.SearchResult

fun SearchResponseDto.toSearchResult() =
    SearchResult(
        id = id,
        name = name,
        region = region,
        country = country,
        lat = lat,
        lon = lon,
        url = url
    )