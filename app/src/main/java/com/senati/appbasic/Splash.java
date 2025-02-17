package com.senati.appbasic;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Splash extends AppCompatActivity {

    private EditText tv_numA, tv_numB;
    private TextView tv_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        loadUI();
    }

    //eventos
    public void sumar(View view){
        float numA = Float.parseFloat(tv_numA.getText().toString());
        float numB = Float.parseFloat(tv_numB.getText().toString());

        float resultado = numA + numB;

        tv_resultado.setText(String.valueOf(resultado));

    }

    // metodos
    private void loadUI(){
        tv_numA = (EditText) findViewById(R.id.tv_numA);
        tv_numB = (EditText) findViewById(R.id.tv_numB);
        tv_resultado = (TextView) findViewById(R.id.tv_resultado);
    }
}