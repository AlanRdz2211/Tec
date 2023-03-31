package com.hola.tec;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
public class Objetivo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objetivo);
    }
    //METODO DE BOTONES
    public void Anterior(View view){
        Intent anterior = new Intent(this, Menu.class);
        startActivity(anterior);
    }
}