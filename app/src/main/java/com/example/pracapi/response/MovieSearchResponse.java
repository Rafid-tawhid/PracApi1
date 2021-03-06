package com.example.pracapi.response;


//getting multiple movies

import com.example.pracapi.models.MovieModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieSearchResponse {
    @SerializedName("total_results")
    @Expose()
    private int total_count;

    @SerializedName("results")
    @Expose()
    private List<MovieModel> movies;
    public int getTotal_count()
    {
        return total_count;
    }

    public List<MovieModel> getMovies()
    {
        return movies;
    }

}
