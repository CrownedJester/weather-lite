package com.crowedjester.edu.weatherlite.extensions.connection

sealed class ConnectionState {

    data object Available : ConnectionState()
    data object Unavailable : ConnectionState()

}