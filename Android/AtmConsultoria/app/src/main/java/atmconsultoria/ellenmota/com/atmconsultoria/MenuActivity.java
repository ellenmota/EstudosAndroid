package atmconsultoria.ellenmota.com.atmconsultoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {


    private ImageButton btnEmpresa;
    private ImageButton btnContato;
    private ImageButton btnClientes;
    private ImageButton btnServicos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnEmpresa = findViewById(R.id.btnEmpresa);
        btnClientes = findViewById(R.id.btnClientes);
        btnContato = findViewById(R.id.btnContato);
        btnServicos = findViewById(R.id.btnServico);


        //Clicou em Empresa
        btnEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this,  EmpresaActivity.class));
            }
        });


        //Clicou em Clientes
        btnClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, ClientesActivity.class));
            }
        });

        //Clicou em Contato
        btnContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, ContatoActivity.class));
            }
        });

        //Clicou em Serviços
        btnServicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, ServicosActivity.class));
            }
        });

    }
}
