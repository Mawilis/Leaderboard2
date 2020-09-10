package com.wilsy.leaderboard.model.remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//
// Created by Wilson Khanyezi on 2020/09/08.
//
public class RetrofitClient {

    private static Retrofit sRetrofit;
    private static final String BASE_URL = "https://gadsapi.herokuapp.com/";

    public static Retrofit getRetrofit(String baseUrl) {

        if (sRetrofit==null){
            sRetrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(AddLoggingInterceptor.setLogging())
                    .build();
        }
        return sRetrofit;


    }






}
