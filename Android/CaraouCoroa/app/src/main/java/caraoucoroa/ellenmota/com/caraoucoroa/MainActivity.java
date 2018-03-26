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

        imgJogar = findViewById(R.id.imgJogar);


        imgJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                String resultadoMoeda;
                resultadoMoeda = moeda[random.nextInt(moeda.length)];

                Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
                intent.putExtra("resultadoMoeda", resultadoMoeda);

                startActivity(new Intent(MainActivity.this, ResultadoActivity.class));
            }
        });

    }
}
