package com.example.uc17202389.passparameter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button button
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view){
        intent = new Intent(packageContext: this,SegundaActivity.class);

        intent.putExtra(name: "nome",value: "Thiago");
        startActivity(intent);
    }
}
