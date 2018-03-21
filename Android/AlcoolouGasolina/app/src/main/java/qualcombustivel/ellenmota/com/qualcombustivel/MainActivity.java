package qualcombustivel.ellenmota.com.qualcombustivel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText txtGasolina;
    private EditText txtAlcool;
    private Button btnDescobrir;
    private TextView txtResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtGasolina = findViewById(R.id.txtGasolina);
        txtAlcool = findViewById(R.id.txtAlcool);
        txtResultado = findViewById(R.id.txtResultado);
        btnDescobrir = findViewById(R.id.btnDescobrir);

        txtResultado.setText("");

        btnDescobrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Mensagem se não digitar algum campo
                if(txtGasolina.getText().toString().isEmpty() || txtAlcool.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Campo Vazio!",Toast.LENGTH_LONG).show();
                } else {
                    //Calculo para saber qual combustivel vale a pena
                    Double coeficiente =  Double.parseDouble(txtAlcool.getText().toString())  /
                                        Double.parseDouble(txtGasolina.getText().toString());
                    if(coeficiente>=0.7){
                        txtResultado.setText("É melhor utilizar Gasolina!");
                    } else {
                        txtResultado.setText("É melhor utilizar Alcool!");
                    }
                }

            }
        });

    }
}
