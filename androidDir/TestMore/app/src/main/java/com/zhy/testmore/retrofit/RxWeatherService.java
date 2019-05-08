package com.zhy.testmore.retrofit;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by zhy on 2019/5/9.
 */

public interface RxWeatherService {

    @GET("weather_mini")
    Observable<WeatherEntity> getMessage(@Query("city") String city);
}
