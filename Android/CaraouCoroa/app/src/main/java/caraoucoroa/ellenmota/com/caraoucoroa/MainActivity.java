package caraoucoroa.ellenmota.com.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private ImageView imgJogar;
    private String [] moeda = {"cara", "coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //link do componente com a variavel
        imgJogar = findViewById(R.id.imgJogar);


        imgJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Resultado randomico de cara ou coroa
                Random random = new Random();
                String resultadoMoeda = moeda[random.nextInt(moeda.length)].toString();

                //Interações entre activitys, no caso estou passando dados para outra activity
                Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
                intent.putExtra("resultadoMoeda", resultadoMoeda);

                //Inicia outra activity
                startActivity(intent);
            }
        });

    }


}
