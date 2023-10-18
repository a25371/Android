package com.example.a20230929_loginandroid.actions;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.a20230929_loginandroid.MainActivity;
import com.example.a20230929_loginandroid.lst_films.model.entities.Movie;
import com.example.a20230929_loginandroid.lst_films.model.entities.MovieResponse;
import com.example.a20230929_loginandroid.retrofit.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ServicePeliculas {

    private ViewPeliculas view;

    public ServicePeliculas(ViewPeliculas view) {
        this.view = view;
    }

    public void getDatosPeliculas() {
        Call<MovieResponse> call = RetrofitClient.getInstance().getPopularMovies();
        call.enqueue(new Callback<MovieResponse>() {
            @Override
            public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
                if (response.isSuccessful()) {
                    List<Movie> movies = response.body().getResults();
                    Movie movie = movies.get(0);
                    Toast.makeText(MainActivity.getInstance(), movie.getTitle(), Toast.LENGTH_SHORT).show();
                    // Procesa y muestra las películas aquí
                } else {
                    Log.d("error", "error");
                }
            }

            @Override
            public void onFailure(Call<MovieResponse> call, Throwable t) {
                Toast.makeText(MainActivity.getInstance(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        // Voy a por los datos
        // VIAJOOOOOOOOO A POR LOS DATOS!!!!!!!!!!!!
        // THREADS!!!!!!!!!!!!!!!!!!!!
        // RETROFIT!!!!!!!!!!!!
        // Toast.makeText(MainActivity.getInstance(), "Welcome To Miami!!!", Toast.LENGTH_SHORT).show();
        view.showPeliculas("Los datos han ido bien: ['films': {''}]");

        // fetch ("url=http://")-->
        // json
    }
}