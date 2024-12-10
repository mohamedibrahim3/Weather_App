package com.mada.weatherapp.Repo

import com.mada.weatherapp.Server.ApiServices

class WeatherRepo(private val api:ApiServices) {

    fun getCurrentWeatherRepo(lat:Double,lng:Double,unit:String){
        api.getCurrentWeather(lat,lng,unit,"252fec42e0cfcea3bbb55d25a665e1bf")
    }
}