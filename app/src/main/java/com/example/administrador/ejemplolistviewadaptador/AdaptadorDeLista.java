package com.example.administrador.ejemplolistviewadaptador;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrador on 13/05/2017.
 */

public class AdaptadorDeLista extends BaseAdapter {
     Context EsteContexto;
     List<DatosList> listadeobjetos;

    public AdaptadorDeLista(Context esteContexto, List<DatosList> listadeobjetos) {
        EsteContexto = esteContexto;
        this.listadeobjetos = listadeobjetos;
    }

    public AdaptadorDeLista() {
    }


    @Override
    public int getCount() {
        return listadeobjetos.size();
    }

    @Override
    public Object getItem(int position) {
        return listadeobjetos.get(position);
    }

    @Override
    public long getItemId(int position) {

        return listadeobjetos.get(position).getId();
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View vista = convertView;
        LayoutInflater inflar = LayoutInflater.from(EsteContexto);
        vista = inflar.inflate(R.layout.lista_de_datos,null);

        ImageView idImagen = (ImageView) vista.findViewById(R.id.idImagenLst);
        TextView idTextTitulo = (TextView) vista.findViewById(R.id.idTextoTitulo);
        TextView idTextDetalle = (TextView) vista.findViewById(R.id.idTextoDetalle);

        idTextTitulo.setText(listadeobjetos.get(position).getTitulo().toString());
        idTextDetalle.setText(listadeobjetos.get(position).getDetalle().toString());
        idImagen.setImageResource(listadeobjetos.get(position).getImagen());
        return vista;
    }


}
