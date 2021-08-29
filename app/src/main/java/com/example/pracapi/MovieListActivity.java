package com.example.pracapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.pracapi.models.MovieModel;
import com.example.pracapi.request.Servicey;
import com.example.pracapi.response.MovieSearchResponse;
import com.example.pracapi.utils.Credentials;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieListActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.bttn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GetRetrofitResponse();
            }
        });
    }

    private void GetRetrofitResponse() {

        MovieApi movieApi= Servicey.getMovieApi();


        Call<MovieSearchResponse> responseCall= (Call<MovieSearchResponse>) movieApi.searchMovie(Credentials.API_KEY,"Action","1");

        responseCall.enqueue(new Callback<MovieSearchResponse>() {
            @Override
            public void onResponse(Call<MovieSearchResponse> call, Response<MovieSearchResponse> response) {
                if (response.code()==200)

                {
                    Log.v("aa",response.body().toString());
                    List<MovieModel> movies =new ArrayList<>(response.body().getMovies());
                    for (MovieModel movie:movies)

                    {
                        Log.v("aa","List the : "+movie.getRelease_date());
                    }
                }
                else
                {
                    Log.v("aa","Error"+response.errorBody().toString());
                }
            }

            @Override
            public void onFailure(Call<MovieSearchResponse> call, Throwable t) {

            }
        });
    }
}