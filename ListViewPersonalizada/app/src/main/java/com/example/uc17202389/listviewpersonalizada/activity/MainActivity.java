package com.example.uc17202389.listviewpersonalizada.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.uc17202389.listviewpersonalizada.R;

public class MainActivity extends Activity {

    ListView listViewCarros;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.arrayCarros));
        listViewCarros = findViewById(R.id.listViewCarros);
        listViewCarros.setAdapter(arrayAdapter);

    }
}
