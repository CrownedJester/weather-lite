package com.crowedjester.edu.weatherlite.presentation.main_screen.event

sealed class MainScreenEvents {

    data class Search(val query: String) : MainScreenEvents()

    data class SaveQuery(val query: String) : MainScreenEvents()

}