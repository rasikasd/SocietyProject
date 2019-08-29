package com.example.retroclient;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface LoginService {

    @GET("/getmessage")
    Call<Message> basicLogin();

    @GET("/all")
    Call<List<Owner>> getOwner();
}
