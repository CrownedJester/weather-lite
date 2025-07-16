package com.crowedjester.edu.weatherlite.data

import com.crowedjester.edu.weatherlite.BuildConfig
import com.crowedjester.edu.weatherlite.data.dto.WeatherDto
import com.crowedjester.edu.weatherlite.data.dto.current.CurrentWeatherDto
import com.crowedjester.edu.weatherlite.data.dto.search.SearchResponseDto
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    companion object {
        const val URL = "https://api.weatherapi.com/v1/"

        val MEDIA_TYPE = "application/json".toMediaType()

        val client = with(OkHttpClient.Builder()) {
            val logging = HttpLoggingInterceptor()

            addInterceptor { chain ->
                val request = chain.request().newBuilder()
                request.header("X-API-KEY", BuildConfig.KEY)

                val response = chain.proceed(request.build())

                return@addInterceptor response
            }

            addInterceptor(logging)

            build()
        }

    }

    @GET("current.json")
    suspend fun getCurrentWeather(
        @Query("q") q: String,
        @Query("aqi") aqi: String = "no",
    ): CurrentWeatherDto

    //lat-lon, cityname, US zip, UK post, metar Code, iata-airport code, auto:ip, ipaddress, byId, bulk query
    @GET("forecast.json")
    suspend fun getWeatherForecast(
        @Query("q") q: String,
        @Query("days") days: Int,
        @Query("aqi") aqi: String = "no",
        @Query("alerts") alerts: String = "no",
    ): WeatherDto

    @GET("search.json")
    suspend fun search(@Query("q") q: String): SearchResponseDto
}