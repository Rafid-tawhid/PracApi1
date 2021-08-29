package com.example.pracapi.response;


//singel movie request

import com.example.pracapi.MovieApi;
import com.example.pracapi.models.MovieModel;
import com.example.pracapi.request.Servicey;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MovieResponse {

    //finding the movie object
    @SerializedName("results")
    @Expose
    private MovieModel movie;
    public MovieModel getMovie()
    {
        return movie;
    }

    @Override
    public String toString() {
        return "MovieResponse{" +
                "movie=" + movie +
                '}';
    }

}
