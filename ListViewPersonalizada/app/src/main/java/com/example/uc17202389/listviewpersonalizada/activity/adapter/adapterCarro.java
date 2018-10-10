package com.example.uc17202389.listviewpersonalizada.activity.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.uc17202389.listviewpersonalizada.*;

import com.example.uc17202389.listviewpersonalizada.R;
import com.example.uc17202389.listviewpersonalizada.activity.model.Carro;

import java.util.List;


/*
 * Created by uc17202389 on 05/09/2018.
 */

public class adapterCarro extends BaseAdapter{

    private Activity activity;
    private List<Carro> carros;

    @Override
    public int getCount() {
        return carros.size();
    }

    @Override
    public Object getItem(int i) {
        return carros.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0 ;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Carro carro = carros.get(i);

        view = View.inflate(activity,R.layout.layout_list_carrinho,null);

        TextView modelo = view.findViewById(R.id.modelo);
        TextView fabricante = view.findViewById(R.id.fabricante);
        ImageView imgLogo = view.findViewById(R.id.imgLogo);

        modelo.setText(carro.getModelo());
        fabricante.setText(carro.getFabricante());

        if (carro.getModelo().equals("Uno")){
            imgLogo.setImageResource(R.drawable.fiat);
        }
        if (carro.getModelo().equals("Camaro")){
            imgLogo.setImageResource(R.drawable.chev);
        }
        if (carro.getModelo().equals("Roadster")){
            imgLogo.setImageResource(R.drawable.untitled);
        }

        return null;
    }
}
