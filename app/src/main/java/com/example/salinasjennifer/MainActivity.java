package com.example.salinasjennifer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;
    private EditText apellido;
    private EditText base;
    private EditText exponente;
    private EditText factorial;
    private EditText potencia;
    private Button mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=(EditText)findViewById(R.id.editText_Nombre);
        apellido=(EditText)findViewById(R.id.editText_Apellido);
        base=(EditText)findViewById(R.id.editText_Base);
        exponente=(EditText)findViewById(R.id.editText_Exponente);
        potencia=(EditText)findViewById(R.id.editText_Potencia);
        mostrar = (Button)findViewById(R.id.button_Siguiente1);


        String nombre = getIntent().getStringExtra("nombre");
        nombre.setText(nombre);

        String apellido = getIntent().getStringExtra("apellido");
        apellido.setText(apellido);

        String base = getIntent().getStringExtra("base");
        base.setText(base);

        String exponente = getIntent().getStringExtra("exponente");
        exponente.setText(exponente);
        if (nombre.length()==0){
            mostrar.setEnabled(false);
        }else{
            mostrar.setEnabled(true);
        }
    }


    public void Siguiente(View view){
        Intent siguiente= new Intent(this, MainActivity2.class);
        startActivity(siguiente);
    }
    public void Mostrar(View view){
        String pot = base.getText().toString();
        String exp = exponente.getText().toString();
        double pote = Double.parseDouble(pot);
        double expo = Double.parseDouble(exp);

        double poten = Math.pow(pote,expo);

        String res = String.valueOf(poten);
        potencia.setText(res);
    }
}
