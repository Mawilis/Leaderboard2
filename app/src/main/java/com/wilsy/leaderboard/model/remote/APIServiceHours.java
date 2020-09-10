package com.wilsy.leaderboard.model.remote;

import com.wilsy.leaderboard.model.Hours;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;

//
// Created by Wilson Khanyezi on 2020/09/08.
//
public interface APIServiceHours {

    @GET("/hours")
    @FormUrlEncoded
    Call<Hours> saveHours(@Field("name")String name,
                          @Field("hours")Integer hours,
                          @Field("country")String country,
                          @Field("badgeUrl")String badgeUrl);
}
