package com.example.restapiexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {
    //The end points are defined in this interface. i.e. /photos in this case.
    @GET("/photos")
    Call<List<PhotoModel>> getAllPhotos();
}
