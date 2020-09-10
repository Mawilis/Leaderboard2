package com.wilsy.leaderboard.model.remote;

import com.wilsy.leaderboard.model.Skills;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

//
// Created by Wilson Khanyezi on 2020/09/08.
//
public interface APIServiceSkillIQ {

    @POST("/skills")
    @FormUrlEncoded
    Call<Skills> saveSkills(@Field("name")String name,
                            @Field("hours")Integer score,
                            @Field("country")String country,
                            @Field("badgeUrl")String badgeUrl);

}
