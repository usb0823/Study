package com.zhy.testmore.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by zhy on 2019/5/8.
 */


public interface WeatherService {
    //  网络接口的使用为查询天气的接口
    @GET("weather_mini")
    //  此处回调返回的可为任意类型Call<T>，再也不用自己去解析json数据啦！！！
    Call<WeatherEntity> getMessage(@Query("city") String city);
}
