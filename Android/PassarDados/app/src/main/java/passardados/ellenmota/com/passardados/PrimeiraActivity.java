package passardados.ellenmota.com.passardados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PrimeiraActivity extends AppCompatActivity {


    private Button btnPassarDados;
    private EditText txtNome;
    private EditText txtSobrenome;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);

        txtNome  = findViewById(R.id.txtName);
        txtSobrenome = findViewById(R.id.txtSobrenome);
        btnPassarDados = findViewById(R.id.btnIr);

        limparCampos();

        btnPassarDados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrimeiraActivity.this, SegundaActivity.class);
                intent.putExtra("nome",txtNome.getText().toString());
                intent.putExtra("sobrenome", txtSobrenome.getText().toString());
                startActivity(intent);

            }
        });

    }


    @Override
    protected void onRestart() {
        super.onRestart();
        limparCampos();
    }

    protected  void limparCampos(){
        this.txtNome.setText("");
        this.txtSobrenome.setText("");
    }
}
