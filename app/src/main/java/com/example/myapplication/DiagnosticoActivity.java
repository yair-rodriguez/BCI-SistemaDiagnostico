package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class DiagnosticoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostico);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_diagnostico, menu);
        return true;
    }

    // Determina el elemento del Action Bar que ha sido presionado y comienza el Activity correspondiente.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //handle presses on the action bar items
        switch (item.getItemId()) {

            case R.id.action_bluetooth:
                startActivity(new Intent(this, DispositivosActivity.class));
                return true;

            case R.id.action_registrar:
                startActivity(new Intent(this, RegistrarActivity.class));
                return true;

        }

        return super.onOptionsItemSelected(item);
    }
}
