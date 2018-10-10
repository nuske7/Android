package com.example.uc17202389.passagemparametro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView tvNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        tvNome = findViewById(R.id.tvNome);

        String nome = getIntent().getStringExtra(name: "nome");

        Carro carro = (Carro) getIntent().getSerializableExtra(name: "objCarro");

        tvNome.setText(carro.getFabricante());
    }

}
