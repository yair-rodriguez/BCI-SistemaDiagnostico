package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class DiagnosticoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostico);

        //Se crea serie de coordenadas lineales
        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 4),
                new DataPoint(4, 2),
                new DataPoint(5, 6),
                new DataPoint(6, 5),
                new DataPoint(7, 7),
                new DataPoint(8, 4),
                new DataPoint(9, 6),
                new DataPoint(10, 5),
                new DataPoint(11, 3),
                new DataPoint(12, 5),
                new DataPoint(13, 4),
                new DataPoint(14, 6),
                new DataPoint(15, 5),
                new DataPoint(16, 6),
                new DataPoint(17, 3),
                new DataPoint(18, 6),
                new DataPoint(19, 5),
                new DataPoint(20, 6)
        });
        //Se agregan coordenadas a graficar
        graph.addSeries(series);
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
