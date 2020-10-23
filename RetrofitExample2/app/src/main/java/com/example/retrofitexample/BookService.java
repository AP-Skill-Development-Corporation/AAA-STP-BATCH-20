package com.example.retrofitexample;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BookService {

    @GET("books/v1/volumes?q=The%20Monk")
    Call<String> getJsonResponse();
}
