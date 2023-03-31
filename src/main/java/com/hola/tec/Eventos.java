package com.hola.tec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Eventos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);
    }
    public void diamjr (View view){
        Intent i = new Intent(this, Mujer.class);
        startActivity(i);
    }
    public void salud (View view){
        Intent i = new Intent(this, Mental.class);
        startActivity(i);
    }
}