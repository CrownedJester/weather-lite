package com.crowedjester.edu.weatherlite.di

import com.crowedjester.edu.weatherlite.data.WeatherApi
import com.crowedjester.edu.weatherlite.domain.repo.WeatherRepository
import com.crowedjester.edu.weatherlite.domain.repo.WeatherRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesRetrofit(): Retrofit = Retrofit.Builder()
        .baseUrl(WeatherApi.URL)
        .client(WeatherApi.client)
        .addConverterFactory(
            Json {
                ignoreUnknownKeys = true
            }
                .asConverterFactory(WeatherApi.MEDIA_TYPE))
        .build()

    @Provides
    @Singleton
    fun providesWeatherApi(retrofit: Retrofit): WeatherApi =
        retrofit.create(WeatherApi::class.java)

    @Provides
    @Singleton
    fun providesRemoteRepository(api: WeatherApi): WeatherRepository = WeatherRepositoryImpl(api)

}

