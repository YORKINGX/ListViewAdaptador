package com.example.administrador.ejemplolistviewadaptador.services;

import com.example.administrador.ejemplolistviewadaptador.model.UserModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Administrador on 17/05/2017.
 */

public interface ServiceInterface {

    @GET("posts")
    Call<ArrayList<UserModel>> getPost();



}
