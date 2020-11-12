package com.example.proyectosemillero;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InicioSesion extends AppCompatActivity implements View.OnClickListener {
    TextView textView4;

    BaseDeDato c = new BaseDeDato(this,"semillero",null,1);

    EditText txtcorreo,txtcontrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setOnClickListener(this);

        txtcorreo = (EditText) findViewById(R.id.txtcorreo);
        txtcontrasena = (EditText) findViewById(R.id.txtcontrasena);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.textView4:
                Intent intent = new Intent(this, RecuperarContrasena.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    public void inicio(View view) {

        SQLiteDatabase co = c.getWritableDatabase();
        ContentValues llenarTabla = new ContentValues();
        llenarTabla.put("email",txtcorreo.getText().toString());
        llenarTabla.put("password",txtcontrasena.getText().toString());

        co.insert("semillero",null,llenarTabla);
        Toast.makeText(this,"Inicio de sesion exitoso",Toast.LENGTH_LONG).show();
        co.close();

        txtcorreo.setText("");
        txtcontrasena.setText("");

    }
}