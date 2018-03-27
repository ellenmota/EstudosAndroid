package signosapp.ellenmota.com.signosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] signos = {"Aquário", "Peixes", "Áries", "Touro", "Gêmeos", "Câncer",
                                "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewId);


        ArrayAdapter<String> adaptadorDados = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos);

        listView.setAdapter(adaptadorDados);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               getResultadoSignos(position).show();
            }
        });

    }

    //Função cuida de mostrar resultado ao clicar na celula.
    private Toast getResultadoSignos(int position){
        if(listView.getItemAtPosition(position).equals("Aquário"))
            return Toast.makeText(getApplicationContext(), "20 de Janeiro – 18 de Fevereiro", Toast.LENGTH_SHORT);
        if(listView.getItemAtPosition(position).equals("Peixes"))
            return Toast.makeText(getApplicationContext(), "19 de Fevereiro – 20 de Março", Toast.LENGTH_SHORT);

        if(listView.getItemAtPosition(position).equals("Áries"))
            return Toast.makeText(getApplicationContext(), "21 de Março – 19 de Abril", Toast.LENGTH_SHORT);

        if(listView.getItemAtPosition(position).equals("Touro"))
            return Toast.makeText(getApplicationContext(), "20 de Abril – 20 de Maio", Toast.LENGTH_SHORT);


        if(listView.getItemAtPosition(position).equals("Gêmeos"))
            return Toast.makeText(getApplicationContext(), "21 de Maio – 20 de Junho", Toast.LENGTH_SHORT);

        if(listView.getItemAtPosition(position).equals("Câncer"))
            return Toast.makeText(getApplicationContext(), "21 de Junho – 22 de Julho", Toast.LENGTH_SHORT);

        if(listView.getItemAtPosition(position).equals("Leão"))
            return Toast.makeText(getApplicationContext(), "23 de Julho – 22 de Agosto", Toast.LENGTH_SHORT);

        if(listView.getItemAtPosition(position).equals("Virgem"))
            return Toast.makeText(getApplicationContext(), "23 de Agosto – 22 de Setembro", Toast.LENGTH_SHORT);

        if(listView.getItemAtPosition(position).equals("Libra"))
            return Toast.makeText(getApplicationContext(), "23 de Setembro – 22 de Outubro", Toast.LENGTH_SHORT);

        if(listView.getItemAtPosition(position).equals("Escorpião"))
            return Toast.makeText(getApplicationContext(), "October 23 - November 21", Toast.LENGTH_SHORT);

        if(listView.getItemAtPosition(position).equals("Sagitário"))
            return Toast.makeText(getApplicationContext(), "22 de Novembro – 21 de Dezembro", Toast.LENGTH_SHORT);
        else
            return Toast.makeText(getApplicationContext(), "22 de Dezembro – 19 de Janeiro", Toast.LENGTH_SHORT);
    }
}
