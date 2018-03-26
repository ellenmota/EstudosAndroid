package passardados.ellenmota.com.passardados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {


    private TextView txtNomeCompleto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        txtNomeCompleto = findViewById(R.id.txtNomeCompleto);
        Bundle dados = getIntent().getExtras();

        if(dados != null) {
            String nome = dados.getString("nome");
            String sobrenome = dados.getString("sobrenome");
            txtNomeCompleto.setText(nome+" "+sobrenome);
        }


    }
}
