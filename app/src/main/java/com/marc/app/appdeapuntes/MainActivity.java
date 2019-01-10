package com.marc.app.appdeapuntes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // El metodo onCreate se ejecuta cada vez que hay un cambio en el estado de ejcucion de la actividad
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Carga los componentes definidos en el xml activity_main

        TextView texto = (TextView) findViewById(R.id.idTexto); // Instanciamos el componente de tipo TextView buscandolo por el id definido en el xml activity_main
        // texto.setText("Hola!");
    }
}
