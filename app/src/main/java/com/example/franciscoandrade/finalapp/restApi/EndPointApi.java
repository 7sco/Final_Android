package com.example.franciscoandrade.finalapp.restApi;

import com.example.franciscoandrade.finalapp.restApi.model.RootObject;

import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by franciscoandrade on 2/25/18.
 */

public interface EndPointApi {
    @GET("breed/{breed}/images")
    retrofit2.Call<RootObject> getDogs(@Path("breed") String breed);

}
