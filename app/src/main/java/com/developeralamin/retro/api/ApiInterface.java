package com.developeralamin.retro.api;

import com.developeralamin.retro.model.QuranModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("api/hadith")
    Call<List<QuranModel>> getquraModel();

}
