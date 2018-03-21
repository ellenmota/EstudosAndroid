package frasedodia.ellenmota.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private Button btnGerarFrase;
    private TextView txtFrase;
    private String arrayFrases[] = new String[30];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Atribuição aos componentes
        btnGerarFrase = findViewById(R.id.btnGerarFrase);
        txtFrase = findViewById(R.id.txtFrase);


        //Chamada de Função gerar Frases
        this.gerarFrasesAleatorias();


        //Ao clicar no botao
        btnGerarFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int indexRandomico = random.nextInt(30);
                txtFrase.setText(arrayFrases[indexRandomico]);
            }
        });

    }


    //Função gera frases aleatórias
    private void gerarFrasesAleatorias(){

        System.out.println(this.arrayFrases.length);

        for(int i=0; i<30;i++)
        {
            this.arrayFrases[i] = "Frase "+i+" bem legal aqui!";
        }

    }



}
