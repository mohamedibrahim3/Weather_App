package com.mada.weatherapp.mvvm

import androidx.lifecycle.ViewModel
import com.mada.weatherapp.Repo.WeatherRepo
import com.mada.weatherapp.Server.ApiClient
import com.mada.weatherapp.Server.ApiServices

class WeatherViewModel(val repo:WeatherRepo):ViewModel() {
    constructor() : this(WeatherRepo(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCurrentWeather(lat:Double, lng:Double, unit:String)=
        repo.getCurrentWeatherRepo(lat, lng, unit)
}