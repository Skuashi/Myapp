package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

import Objetos.Productos;

public class MainActivity extends AppCompatActivity {
    private Spinner insumos;
    private TextView resultado;
    private RatingBar rating ;
    private Productos pro = new Productos(); // obtengo mis productos


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insumos = (Spinner)findViewById(R.id.spn_insumos);
        resultado = (TextView)findViewById(R.id.tv);
        rating = (RatingBar)findViewById(R.id.rt);

        ArrayAdapter XXXX=new ArrayAdapter(this, android.R.layout.simple_list_item_1, pro.getInsumos());
        insumos.setAdapter(XXXX);



    }

    public void Calcular (View view)
    {
        String opcion = insumos.getSelectedItem().toString();
        int resultado = 0;

        for (int i = 0; i < opcion.length(); i++)
        {
            if (opcion.equals(pro.getInsumos()[i])) //se pregunta por el insumo
            {
                resultado = pro.anadirAdicional(pro.getPrecios()[i], 350);
                //calificar.
                break;

            }
        }

        //result.setText("La opcion es: " + opcion+ "El precio es: "+resultado);
    }




}