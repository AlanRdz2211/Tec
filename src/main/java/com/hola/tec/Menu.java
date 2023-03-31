package com.hola.tec;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    //Metodo para los botones

      public void Extra (View view){
        Intent anterior = new Intent(this, Escolares.class);
        startActivity(anterior);
      }
      public void Back(View view){
        Intent Back = new Intent(this, Objetivo.class);
          startActivity(Back);
      }
      public void Next(View view){
        Intent Next = new Intent(this,Ubicacion.class);
        startActivity(Next);
      }

    public void Carre(View view){
        Intent Next = new Intent(this,Carreras.class);
        startActivity(Next);
    }
    public void credi (View view){
        Intent i = new Intent(this, Creditos.class);
        startActivity(i);
    }
    public void ventos (View view){
        Intent i = new Intent(this, Eventos.class);
        startActivity(i);
    }
    }
