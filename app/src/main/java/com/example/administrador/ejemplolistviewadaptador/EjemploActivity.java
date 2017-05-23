package com.example.administrador.ejemplolistviewadaptador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.administrador.ejemplolistviewadaptador.model.UserModel;
import com.example.administrador.ejemplolistviewadaptador.services.ServiceManager;
import com.example.administrador.ejemplolistviewadaptador.services.callback.CallBackUserModelList;

import java.util.ArrayList;

public class EjemploActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo);

        ArrayList<UserModel> userModels = new ArrayList<UserModel>();
        ServiceManager.getPost(new CallBackUserModelList() {
            @Override
            public void onSuccess(ArrayList<UserModel> userModels) {
                Toast.makeText(EjemploActivity.this,"Esto trajo "+ String.valueOf(userModels.size()),Toast.LENGTH_LONG).show();

            }

            @Override
            public void onError(String msgError, int indError) {
                Toast.makeText(EjemploActivity.this,msgError,Toast.LENGTH_LONG).show();

            }
        });




    }
}
