package com.example.ruben.cuadrodedialogo;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_dialog;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_dialog = (Button) findViewById(R.id.btn_test);

        btn_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
                //Configuración
                alertDialog.setMessage("Deseas iniciar el test de autoelvaluacion")
                        .setCancelable(false)
                        .setPositiveButton("Continuar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                //Codigo cuando quiera continuar
                                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Detener", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                //codigo cuando no se quiera continuar
                                Toast toast = Toast.makeText(getApplicationContext(),"Informes @profchima", Toast.LENGTH_SHORT);
                                toast.show();

                            }
                        });
                //Creamos el alert dialog
                AlertDialog dialog = alertDialog.create();
                //Mostramos el alertDialog
                dialog.show();

            }
        });



    }
}
