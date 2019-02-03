package com.kg.apis;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WeatherService {

    @GET("location/search/")
    Single<List<CitySearchResult>> searchCities(@Query("query") String cityName);

    @GET("location/{woeid}")
    Single<CityInfo> getCityInfo(@Path("woeid") int id);
}
