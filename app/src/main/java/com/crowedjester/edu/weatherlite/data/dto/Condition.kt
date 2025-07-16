package com.crowedjester.edu.weatherlite.data.dto

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName


@Serializable
data class Condition(

    @SerialName("text") var text: String = EMPTY_STRING,
    @SerialName("icon") var icon: String = EMPTY_STRING,
)