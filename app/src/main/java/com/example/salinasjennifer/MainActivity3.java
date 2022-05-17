package com.example.salinasjennifer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity3 extends AppCompatActivity {
    private EditText nombre;
    private EditText apellido;
    private EditText base;
    private EditText exponente;
    private EditText numero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        nombre=(EditText)findViewById(R.id.editText_Nombre3);
        apellido=(EditText)findViewById(R.id.editText_Apellido3);
        base=(EditText)findViewById(R.id.editText_Base3);
        exponente=(EditText)findViewById(R.id.editText_Exponente3);
        numero=(EditText)findViewById(R.id.editTextT_Numero1);

        String nombre = getIntent().getStringExtra("nombre");
        nombre.setText(nombre);

        String base = getIntent().getStringExtra("base");
        base.setText(base);
    }
}