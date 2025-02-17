package com.senati.appbasic;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn_saludar, btn_preguntar, btn_abrir, btn_cerrar, btn_experimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // cargando interfaz grafica
        loadUI();
        // Evento saludar (TOUCH - CLICK)
        event_btn_saludar();

        // Evento preguntar (TOUCH - CLICK)
        event_btn_preguntar();

        // Evento abrir
        event_btn_abrir();

        // Evento cerrar
        event_btn_cerrar();

        // Evento experimento (lleva a splash)
        event_btn_experimento();
    }



    //evntos
    private void event_btn_saludar(){
        btn_saludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast("holaaa");
            }
        });
    }

    private void event_btn_preguntar(){
        btn_preguntar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preguntar();
            }
        });
    }

    private void event_btn_abrir(){
        // Abrir activity  con una INTENCION
        btn_abrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), About.class);
                startActivity(intent);
            }
        });
    }

    private void event_btn_cerrar(){
        // Abrir activity  con una INTENCION
        btn_cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void event_btn_experimento(){
        btn_experimento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Splash.class);
                startActivity(intent);
            }
        });
    }

    // metodos
    private void preguntar(){
        OnlyMsgAlertDialog("Android","Te gusta JAVA?>:)","Vete con python","Genial, a mi tambien:D");
    }

    private void loadUI(){
        btn_saludar = (Button) findViewById(R.id.btn_saludar);
        btn_preguntar = (Button) findViewById(R.id.btn_preguntar);
        btn_abrir = (Button) findViewById(R.id.btn_abrir);
        btn_cerrar = (Button) findViewById(R.id.btn_cerrar);
        btn_experimento = (Button) findViewById(R.id.btn_experimento);
    }
    private void toast(String msg){
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
    }
    private void OnlyMsgAlertDialog(String titulo, String msg, String msgNegative, String msgPesative){
        AlertDialog.Builder dialogo = new AlertDialog.Builder(this);
        dialogo.setTitle(titulo);
        dialogo.setMessage(msg);
        dialogo.setCancelable(false);

        //2 botones
        dialogo.setNegativeButton("Ño", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                toast(msgNegative);
            }
        });
        dialogo.setPositiveButton("Chi", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                toast(msgPesative);
            }
        });

        dialogo.create().show();
    }


/*
    public void saludar(View view){
        Toast.makeText(this,"Holaaaa",Toast.LENGTH_SHORT).show();
    }
    */


}