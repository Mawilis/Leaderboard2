package com.wilsy.leaderboard.model.remote;

//
// Created by Wilson Khanyezi on 2020/09/09.
//
public class APIUtilsSkillIQ {

    public static final String BASE_URL = " https://gadsapi.herokuapp.com/";

    public static APIServiceSkillIQ getAPIServiceSkillIQ(){

        return RetrofitClient.getRetrofit(BASE_URL).create(APIServiceSkillIQ.class);
    }

    }
