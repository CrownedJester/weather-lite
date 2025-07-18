package com.crowedjester.edu.weatherlite.presentation.main_screen.event

sealed class SearchEvents {

    data class Search(val query: String) : SearchEvents()

    data class SaveQuery(val query: String) : SearchEvents()

}