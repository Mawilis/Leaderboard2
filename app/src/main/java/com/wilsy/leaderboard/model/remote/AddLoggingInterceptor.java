package com.wilsy.leaderboard.model.remote;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

//
// Created by Wilson Khanyezi on 2020/09/09.
//
public class AddLoggingInterceptor {
    public static OkHttpClient setLogging(){
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build();

        return okHttpClient;


    }
}
