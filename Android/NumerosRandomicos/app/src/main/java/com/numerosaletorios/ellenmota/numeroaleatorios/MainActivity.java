package com.numerosaletorios.ellenmota.numeroaleatorios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Variaveis
    private Button btnJogar;
    private TextView txtResultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Fiz o link da váriavel para os identificadores dos componentes.
        btnJogar = findViewById(R.id.btnJogar);
        txtResultado = findViewById(R.id.txtResultado);

        //Evento click do botão
        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Numero Randomico
                Random numeroRandomJava = new Random();
                int numeroRandomico = numeroRandomJava.nextInt(10);
                txtResultado.setText("O numero é: "+numeroRandomico);
            }
        });



    }
}
