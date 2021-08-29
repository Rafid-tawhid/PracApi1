package com.example.pracapi.request;

import com.example.pracapi.MovieApi;
import com.example.pracapi.utils.Credentials;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Servicey {
    private static Retrofit.Builder retrofitBulder=new Retrofit.Builder().baseUrl(Credentials.BASE_URL).addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit=retrofitBulder.build();
    private static MovieApi movieApi=retrofit.create(MovieApi.class);

    public static MovieApi getMovieApi()
    {
        return movieApi;
    }


}
