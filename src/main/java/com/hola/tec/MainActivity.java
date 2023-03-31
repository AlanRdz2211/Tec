package com.hola.tec;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Metodo para los botones
    public void Siguiente(View view){
        Intent Siguiente = new Intent(this, Menu.class);
        startActivity(Siguiente);
    }
}