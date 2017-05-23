package com.example.administrador.ejemplolistviewadaptador.services;

import com.example.administrador.ejemplolistviewadaptador.model.UserModel;
import com.example.administrador.ejemplolistviewadaptador.services.callback.CallBackUserModelList;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrador on 17/05/2017.
 */

public class ServiceManager {

    public static void getPost(final CallBackUserModelList callBackUserModelList)
    {
        ServiceInterface serviceInterface = ServiceHelper.getInstance();
        final ArrayList<UserModel> dataModel =  new ArrayList<UserModel>();
        serviceInterface.getPost().enqueue(new Callback<ArrayList<UserModel>>() {
            @Override
            public void onResponse(Call<ArrayList<UserModel>> call, Response<ArrayList<UserModel>> listResponse) {
                if(listResponse.body()!=null && listResponse.body().size()>0){
                    callBackUserModelList.onSuccess(listResponse.body());
                }
                else
                    callBackUserModelList.onError("esta esta malo",1);
            }

            @Override
            public void onFailure(Call<ArrayList<UserModel>> call, Throwable t) {
                callBackUserModelList.onError("falla la conexion",2);
            }
        });
    }
}
