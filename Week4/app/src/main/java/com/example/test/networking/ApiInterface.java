package com.example.test.networking;
import com.example.test.models.UsersResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import  retrofit2.http.Query;
public interface ApiInterface{
    @GET("api/")
    Call<UsersResponse> getSingleUser(@Query("results") int v, @Query("inc") String str);


}