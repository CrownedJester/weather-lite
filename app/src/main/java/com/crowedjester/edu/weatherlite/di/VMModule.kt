package com.crowedjester.edu.weatherlite.di

import com.crowedjester.edu.weatherlite.domain.repo.WeatherRepository
import com.crowedjester.edu.weatherlite.domain.use_cases.GetCurrentUseCase
import com.crowedjester.edu.weatherlite.domain.use_cases.GetForecastUseCase
import com.crowedjester.edu.weatherlite.domain.use_cases.SearchUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
object VMModule {

    @ViewModelScoped
    @Provides
    fun provideCurrentUseCase(repository: WeatherRepository) = GetCurrentUseCase(repository)


    @ViewModelScoped
    @Provides
    @Singleton
    fun provideForecastUseCase(repository: WeatherRepository) = GetForecastUseCase(repository)

    @ViewModelScoped
    @Provides
    fun provideSearchUseCase(repository: WeatherRepository) = SearchUseCase(repository)

}