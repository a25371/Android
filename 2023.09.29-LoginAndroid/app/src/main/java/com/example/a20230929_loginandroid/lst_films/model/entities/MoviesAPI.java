package com.example.a20230929_loginandroid.lst_films.model.entities;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MoviesAPI {
    @GET("movie/popular?api_key=79c4fec1a2b344a92b9b800f3a43e131")
    Call<MovieResponse> getPopularMovies();
}