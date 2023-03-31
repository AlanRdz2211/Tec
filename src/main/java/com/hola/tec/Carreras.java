package com.hola.tec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Carreras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carreras);
    }

    public void Ges (View view){
        Intent i = new Intent(this, Gestion.class);
        startActivity(i);
    }

    public void Mec (View view){
        Intent i = new Intent(this, Mecatronica.class);
        startActivity(i);
    }
    public void Electro (View view){
        Intent i = new Intent(this, Electromecanica.class);
        startActivity(i);
    }
    public void Indu (View view){
        Intent i = new Intent(this, Industrial.class);
        startActivity(i);
    }
    public void Civi (View view){
        Intent i = new Intent(this, Civil.class);
        startActivity(i);
    }
    public void Nica (View view){
        Intent i = new Intent(this, Electronica.class);
        startActivity(i);
    }
    public void Admin (View view){
        Intent i = new Intent(this, Administracion.class);
        startActivity(i);
    }
    public void Arqui (View view){
        Intent i = new Intent(this, Arquitectura.class);
        startActivity(i);
    }
    public void Sistem (View view){
        Intent i = new Intent(this, TICS.class);
        startActivity(i);
    }

}

