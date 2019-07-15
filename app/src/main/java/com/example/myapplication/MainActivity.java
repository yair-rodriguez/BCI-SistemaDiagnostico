package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Botón que inicializa la vista de dispositivos
        Button btnDispositivos = (Button) findViewById(R.id.button_dispositivos);
        btnDispositivos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), DispositivosActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        //Botón que inicializa la vista de diagnóstico
        Button btnDiagnostico = (Button) findViewById(R.id.button_diagnostivo);
        btnDiagnostico.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), DiagnosticoActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        //Botón que inicializa la vista de FAQ
        Button btnFAQ = (Button) findViewById(R.id.button_faq);
        btnFAQ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), FAQActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        //Botón que inicializa la vista de Información
        Button btnInformacion = (Button) findViewById(R.id.button_informacion);
        btnInformacion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), InformacionActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        //Botón que inicializa la vista de Información
        Button btnAcercaDe = (Button) findViewById(R.id.button_acerca_de);
        btnAcercaDe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), AcercaDeActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        //Botón que inicializa la vista de Registros
        Button btnRegistros = (Button) findViewById(R.id.button_registros);
        btnRegistros.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), RegistrosActivity.class);
                startActivityForResult(intent, 0);
            }
        });

    }
}
