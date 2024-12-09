package com.mada.weatherapp.Server

import com.mada.weatherapp.Model.CurrentResponseApi
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {

    @GET("data/2.5/weather")
    fun getCurrentWeather(
        @Query("lat")
        lat:Double,
        @Query("lon")
        lon:Double,
        @Query("units")
        units:String,
        @Query("appid")
        ApiKey:String,
    ):Call<CurrentResponseApi>
}