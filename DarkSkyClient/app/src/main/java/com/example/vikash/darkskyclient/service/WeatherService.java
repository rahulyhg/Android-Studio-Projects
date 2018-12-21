package com.example.vikash.darkskyclient.service;

import model.Weather;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface WeatherService {

    @GET("{latitude},{longitude}")
    Call<Weather> getWeather(@Path("latitude") double latitude,@Path("longitude") double longitude) ;
}
