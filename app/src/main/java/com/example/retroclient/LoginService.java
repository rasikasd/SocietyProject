package com.example.retroclient;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface LoginService {

    @GET("/getmessage")
    Call<Message> basicLogin();

    @GET("/all")
    Call<List<Owner>> getOwner();

    @POST("/owner")
    Call<Owner> addOwner(@Body Owner owner);

    @PUT("/owner/{id}")
    Call<Owner> updateOwner(@Path("id") int id, @Body Owner owner);

    @DELETE("/delete/{id}")
    Call<Owner> deleteOwner(@Path("id") int id);

}
