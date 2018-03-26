package caraoucoroa.ellenmota.com.caraoucoroa;

import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imgMoeda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imgMoeda = findViewById(R.id.imgMoeda);

        Bundle dados = getIntent().getExtras();
        dados.get("resultadoMoeda");

        if (dados != null) {
            if(dados.get("resultadoMoeda").equals("cara")){
                imgMoeda.setImageResource(R.drawable.moeda_cara);
            }else{
                imgMoeda.setImageResource(R.drawable.moeda_coroa);
            }
        }


    }
}
