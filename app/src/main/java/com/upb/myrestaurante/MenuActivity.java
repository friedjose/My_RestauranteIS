package com.upb.myrestaurante;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String [] Categorias = new String [] {"Entradas","Platos Fuertes", "Bebidas", "Postres"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //Obtener el id del archivo xml
        ListView lv = findViewById(android.R.id.list);
        //Prepara el contenido
        ListAdapter la = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Categorias);
        //Asigna contenido a la vista
        lv.setAdapter(la);
        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Intent intencion=null;
        switch (i){

            case 0:  intencion = new Intent(this, EntradasActivity.class);
                startActivity(intencion);
                break;

            case 1:  intencion = new Intent(this, PlatosActivity.class);
                startActivity(intencion);
                break;

            case 2:  intencion = new Intent(this, BebidasActivity.class);
                startActivity(intencion);
                break;
            case 3:  intencion = new Intent(this, PostresActivity.class);
                startActivity(intencion);
                break;
        }
    }
}