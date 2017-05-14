package com.example.administrador.ejemplolistviewadaptador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listadeDatos;
    ArrayList<DatosList> arraydeDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listadeDatos = (ListView) findViewById(R.id.lstDatos);
        arraydeDatos = new ArrayList<DatosList>();
        arraydeDatos.add(new DatosList(1,"Este es el titulo del pais","Este es el detalle del Pais", R.drawable.ic_pais1));
        arraydeDatos.add(new DatosList(2,"Este es el titulo del pais","Este es el detalle del Pais", R.drawable.ic_pais2));
        arraydeDatos.add(new DatosList(3,"Este es el titulo del pais","Este es el detalle del Pais", R.drawable.ic_pais3));
        arraydeDatos.add(new DatosList(4,"Este es el titulo del pais","Este es el detalle del Pais", R.drawable.ic_pais4));
        arraydeDatos.add(new DatosList(5,"Este es el titulo del pais","Este es el detalle del Pais", R.drawable.ic_pais5));
        arraydeDatos.add(new DatosList(6,"Este es el titulo del pais","Este es el detalle del Pais", R.drawable.ic_pais6));
        arraydeDatos.add(new DatosList(7,"Este es el titulo del pais","Este es el detalle del Pais", R.drawable.ic_pais7));
        arraydeDatos.add(new DatosList(8,"Este es el titulo del pais","Este es el detalle del Pais", R.drawable.ic_pais8));

        AdaptadorDeLista midaptador = new AdaptadorDeLista(getApplicationContext(),arraydeDatos);
        listadeDatos.setAdapter(midaptador);

    }
}
