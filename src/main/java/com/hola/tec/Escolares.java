package com.hola.tec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Escolares extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolares);
    }

    public void Lectura (View view){
        Intent i = new Intent(this, Circulo.class);
        startActivity(i);
    }
    public void Tocho (View view){
        Intent i = new Intent(this, Tochito.class);
        startActivity(i);
    }
    public void Video (View view){
        Intent i = new Intent(this, Videografia.class);
        startActivity(i);
    }
    public void Kara (View view){
        Intent i = new Intent(this, Karate.class);
        startActivity(i);
    }
    public void Soft (View view){
        Intent i = new Intent(this, Softbol.class);
        startActivity(i);
    }
}