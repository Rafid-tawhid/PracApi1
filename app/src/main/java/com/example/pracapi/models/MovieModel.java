package com.example.pracapi.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.pracapi.MovieApi;
import com.example.pracapi.request.Servicey;

public class MovieModel implements Parcelable {

    //model class for movies
    private String titel;
    private String poster_path;
    private String release_date;
    private float vote_average;
    private String overview;
    private int movie_id;

    public MovieModel(String titel, String poster_path, String release_date, float vote_average, String overview, int movie_id) {
        this.titel = titel;
        this.poster_path = poster_path;
        this.release_date = release_date;
        this.vote_average = vote_average;
        this.overview = overview;
        this.movie_id = movie_id;
    }

    protected MovieModel(Parcel in) {
        titel = in.readString();
        poster_path = in.readString();
        release_date = in.readString();
        vote_average = in.readFloat();
        overview = in.readString();
        movie_id = in.readInt();
    }

    public static final Creator<MovieModel> CREATOR = new Creator<MovieModel>() {
        @Override
        public MovieModel createFromParcel(Parcel in) {
            return new MovieModel(in);
        }

        @Override
        public MovieModel[] newArray(int size) {
            return new MovieModel[size];
        }
    };

    public String getTitel() {
        return titel;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public String getRelease_date() {
        return release_date;
    }

    public float getVote_average() {
        return vote_average;
    }

    public String getOverview() {
        return overview;
    }

    public int getMovie_id() {
        return movie_id;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(titel);
        parcel.writeString(poster_path);
        parcel.writeString(release_date);
        parcel.writeFloat(vote_average);
        parcel.writeString(overview);
        parcel.writeInt(movie_id);
    }

    Servicey s=new Servicey();


}
