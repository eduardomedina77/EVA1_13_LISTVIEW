package com.example.eva1_13_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //DATOS
    String[] datos ={
            "Mole",
            "Montado",
            "Enchilada",
            "Hamburguesas",
            "Pizza",
            "Quesadilla",
            "Tostadas",
            "Tacos",
            "Lasagna",
            "Alitas",
            "Boneless",
            "Pay",
            "Hamburguesas",
            "Pizza",
            "Quesadilla",
            "Tostadas",
            "Tacos",
            "Lasagna"};

    ListView lstVwDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwDatos = findViewById(R.id.lstVwDatos);

        lstVwDatos.setAdapter(new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                datos
        ));

        lstVwDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),datos[i],Toast.LENGTH_LONG).show();
            }
        });
    }
}