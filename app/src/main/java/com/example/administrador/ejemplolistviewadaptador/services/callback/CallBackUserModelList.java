package com.example.administrador.ejemplolistviewadaptador.services.callback;

import com.example.administrador.ejemplolistviewadaptador.model.UserModel;

import java.util.ArrayList;

/**
 * Created by Administrador on 17/05/2017.
 */

public interface CallBackUserModelList {
    void onSuccess(ArrayList<UserModel> userModels);
    void onError(String msgError, int indError);

}


