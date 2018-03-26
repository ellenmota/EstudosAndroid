package activitybasic.ellenmota.com.activitybasic;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {


    private Button btnSegunda;


    //CICLO DE VIDA: PRIMEIRO METODO A SER CHAMADO - VULGO VIEWDIDLOAD
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(getApplicationContext(),"ON CREATE",Toast.LENGTH_SHORT).show();

        setContentView(R.layout.activity_main);

        btnSegunda = findViewById(R.id.btnSegunda);

        //Evento de click do botão
        btnSegunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Abre outra activity
                //Primeiro parametro: Activity de origem, Segundo parametro: Activity destino
                startActivity(new Intent(MainActivity.this, SegundaActivity.class));
            }
        });
    }


    //CICLO DE VIDA: VISIVEL - VULGO VIEWWILLAPPEAR
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "ON START", Toast.LENGTH_SHORT).show();
    }

    //CICLO DE VIDA: VISIVEL - VULGO VIEWDIDAPPEAR
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"ON RESUME", Toast.LENGTH_SHORT).show();

    }

    //CICLO DE VIDA: PARCIALMENTE VISIVEL - QUANDO ABRE OUTRO APP
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "ON PAUSE", Toast.LENGTH_SHORT).show();
    }

    //CICLO DE VIDA: ESTA ESCONDIDO
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "ON STOP", Toast.LENGTH_SHORT).show();
    }


    //CICLO DE VIDA: QUANDO FECHA O APP - DESTROI DA MEMORIA
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "ON DESTROY", Toast.LENGTH_SHORT).show();
    }


    //CICLO DE VIDA: QUANDO VOLTA A ACTIVITY - RESETA A ACTIVITY
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "ON RESTART", Toast.LENGTH_SHORT).show();
    }

}
