package com.developeralamin.retro.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    public static Retrofit retrofit;

    public static ApiInterface getRetrofileClient() {

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://alquranbd.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(ApiInterface.class);
    }
}
