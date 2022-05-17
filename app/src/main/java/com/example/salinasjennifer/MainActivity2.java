package com.example.salinasjennifer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity2 extends AppCompatActivity {

    private EditText nombre;
    private EditText base;
    private EditText apellido;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nombre = (EditText)findViewById(R.id.editText_Nombre1);
        base = (EditText)findViewById(R.id.editText_Base1);

        String nombr = getIntent().getStringExtra("nombre");
        nombre.setText(nombr);

        String bas = getIntent().getStringExtra("base");
        base.setText(bas);
    }

    public void Siguiente2(View view){
        Intent siguiente2 = new Intent(this, MainActivity3.class );
        String nom = nombre.getText().toString();
        String bas = base.getText().toString();

        siguiente2.putExtra("nombre", nom);
        siguiente2.putExtra("base",bas);
        startActivity(siguiente);
    }

    public void Cerrar(View view){
        Intent siguiente = new Intent(this, MainActivity.class );
        String apellido = getIntent().getStringExtra("apellido");
        String exponente = getIntent().getStringExtra("exponen");

        String nmb = nombre.getText().toString();
        String bas = base.getText().toString();

        siguiente.putExtra("apellido", apellido);
        siguiente.putExtra("nombre", nmb);
        siguiente.putExtra("base",bas);
        siguiente.putExtra("exponen",exponente);

        startActivity(siguiente);
    }
}
