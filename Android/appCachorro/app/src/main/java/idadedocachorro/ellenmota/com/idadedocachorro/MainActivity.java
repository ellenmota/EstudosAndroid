package idadedocachorro.ellenmota.com.idadedocachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnDescobrir;
    private TextView txtResultado;
    private EditText editIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Cada componente associado a variavel
        btnDescobrir = findViewById(R.id.btnDescobrir);
        txtResultado = findViewById(R.id.txtResultado);
        editIdade = findViewById(R.id.inputIdade);

        //Ao clicar no botão
        btnDescobrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Se não preencher o campo da idade
                if (editIdade.getText().toString().isEmpty()) {
                    txtResultado.setText("Você esqueceu de colocar a idade do cachorro!");
                }
                //Transformação da idade de cachorro para idade humana.
                else{
                    int idadeHumana= Integer.parseInt(editIdade.getText().toString())*7;
                    txtResultado.setText("A idade do cachorro em anos humanos é: "+ idadeHumana+" anos");

                }

            }
        });


    }
}
