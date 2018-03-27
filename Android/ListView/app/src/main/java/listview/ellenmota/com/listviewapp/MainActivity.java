package listview.ellenmota.com.listviewapp;

import android.app.Activity;
import android.R.layout.*;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listView;
    private String[] dados = {"São Paulo", "Rio de Janeiro", "Bahia", "Alagoas",
                                "Ceará", "Rio Grande do Sul", "Santa Catarina", "Paraná",
                               "Rio Grande do Norte", "Acre", "Amapá", "Roraima", "Rondonia", "Ceará", "Rio Grande do Sul", "Santa Catarina", "Paraná",
                                 "Rio Grande do Norte", "Acre", "Amapá", "Roraima", "Rondonia", "Rio Grande do Norte", "Acre", "Amapá", "Roraima", "Rondonia"
                                ,"Rio Grande do Norte", "Acre", "Amapá", "Roraima", "Rondonia"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewId);

        //Adaptador de array para o listView
        //Parametros: Contexto, layout de lista, componente que vai receber a informaçao (textView do layout),
        // o array de dados
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                dados
        );

        //Coloca na listView
        listView.setAdapter(adaptador);


        //Evento de click no item
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valorClicado = listView.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), valorClicado,Toast.LENGTH_LONG).show();

            }
        });


    }
}
