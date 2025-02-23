package com.upb.myrestaurante;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void consultarSedes (View v) {
        Intent i = new Intent(this, SedeActivity.class);
        startActivity(i);

    }
    public void consultarMenu (View v) {
        Intent i = new Intent(this, MenuActivity.class);
        startActivity(i);

    }
    public void consultarReserva (View v) {
        //Intent i = new Intent(this, ReservaActivity.class);

        String phone = "+57123456785";
        String message = "Hola, desea hacer una reserva";
        String url = "https://api.whatsapp.com/send?phone"+phone+"&text="+ Uri.encode(message);
        //Proveedor de contenido de aplicaciones de terceros
        PackageManager pm;
        pm = getPackageManager();
        //configurar numero, mensaje

        Intent i = pm.getLaunchIntentForPackage("com.whatsapp");
        i.setData(Uri.parse(url));
        startActivity(i);


    }
}