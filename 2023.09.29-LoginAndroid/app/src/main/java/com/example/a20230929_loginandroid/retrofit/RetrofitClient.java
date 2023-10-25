package com.example.a20230929_loginandroid.retrofit;

import com.example.a20230929_loginandroid.lst_films.model.entities.MoviesAPI;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitClient {
    private static final String BASE_URL = "https://api.themoviedb.org/3/";
    // private static final String
    //      BASE_URL = "http:192.168.59.2:8080/movies/Controller
    //                  ";
    private static MoviesAPI instance;

    public static MoviesAPI getInstance() {
        if (instance == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            instance = retrofit.create(MoviesAPI.class);
        }

        return instance;
    }

}
