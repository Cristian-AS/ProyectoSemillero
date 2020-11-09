package com.example.proyectosemillero;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InicioSesion extends AppCompatActivity implements View.OnClickListener {
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setOnClickListener(this);
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
}