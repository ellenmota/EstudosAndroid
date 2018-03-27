package caraoucoroa.ellenmota.com.caraoucoroa;

import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imgMoeda;
    private ImageView imgVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        //Links dos componentes com as variaveis
        imgMoeda = findViewById(R.id.imgMoeda);
        imgVoltar = findViewById(R.id.imgVoltar);

        //Recebimento do dado
        Bundle dados = getIntent().getExtras();
        dados.get("resultadoMoeda");

        //Verifcação dos dados
        if (dados != null) {
            if(dados.get("resultadoMoeda").equals("cara")){
                imgMoeda.setImageResource(R.drawable.moeda_cara);
            } else{
                imgMoeda.setImageResource(R.drawable.moeda_coroa);
            }
        }


        //Volta a primeira activity
        imgVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultadoActivity.this,MainActivity.class));
            }
        });


    }
}
