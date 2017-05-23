package com.example.administrador.ejemplolistviewadaptador.services;

import com.example.administrador.ejemplolistviewadaptador.Constans;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrador on 17/05/2017.
 */

public class ServiceHelper {
    public ServiceHelper() {

    Gson gson = new GsonBuilder()
            .setLenient()
            .create();

    mRetrofit = new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(Constans.URL_ENDPOINT)
            .build();
    serviceInterface = mRetrofit.create(ServiceInterface.class);

}

    private ServiceInterface serviceInterface;
    private Retrofit mRetrofit;
    public static ServiceHelper mInstance;


    public static ServiceInterface getInstance(){
        if(mInstance == null)
            mInstance = new ServiceHelper();
        return mInstance.serviceInterface;
    }
}
