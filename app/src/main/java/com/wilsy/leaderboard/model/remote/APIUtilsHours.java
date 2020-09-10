package com.wilsy.leaderboard.model.remote;

//
// Created by Wilson Khanyezi on 2020/09/08.
//
public class APIUtilsHours {

    private APIUtilsHours(){}
    public static final String BASE_URL = " https://gadsapi.herokuapp.com/";

    public static APIServiceHours getAPIServiceHours(){

        return RetrofitClient.getRetrofit(BASE_URL).create(APIServiceHours.class);

    }

}
