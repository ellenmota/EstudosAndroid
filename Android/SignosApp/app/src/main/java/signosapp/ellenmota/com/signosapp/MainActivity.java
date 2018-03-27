package signosapp.ellenmota.com.signosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Signo> signos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewId);

        AdaptadorCustomizado adaptadorcustomizado = new AdaptadorCustomizado(getApplication(), popularSignos());

        listView.setAdapter(adaptadorcustomizado);

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

    //Função cuida de inserir dados no array
    public ArrayList<Signo> popularSignos(){
        signos = new ArrayList<Signo>();
        signos.add(new signosapp.ellenmota.com.signosapp.Signo(1,"Aquario","20 de Janeiro – 18 de Fevereiro",
                R.drawable.aquarius));
        signos.add(new signosapp.ellenmota.com.signosapp.Signo(2,"Peixes","19 de Fevereiro – 20 de Março",
                R.drawable.pisces));
        signos.add(new signosapp.ellenmota.com.signosapp.Signo(3,"Áries","21 de Março – 19 de Abril",
                R.drawable.aries));
        signos.add(new signosapp.ellenmota.com.signosapp.Signo(4,"Touro","20 de Abril – 20 de Maio",
                R.drawable.taurus));
        signos.add(new signosapp.ellenmota.com.signosapp.Signo(5,"Gêmeos","21 de Maio – 20 de Junho",
                R.drawable.gemini));
        signos.add(new signosapp.ellenmota.com.signosapp.Signo(6,"Câncer","21 de Junho – 22 de Julho",
                R.drawable.cancer));
        signos.add(new signosapp.ellenmota.com.signosapp.Signo(7,"Leão","23 de Julho – 22 de Agosto",
                R.drawable.leo));
        signos.add(new signosapp.ellenmota.com.signosapp.Signo(8,"Virgem","23 de Agosto – 22 de Setembro",
                R.drawable.virgo));
        signos.add(new signosapp.ellenmota.com.signosapp.Signo(9,"Libra","23 de Setembro – 22 de Outubro",
                R.drawable.libra));
        signos.add(new signosapp.ellenmota.com.signosapp.Signo(10,"Escorpião","October 23 - November 21",
                R.drawable.scorpio));
        signos.add(new signosapp.ellenmota.com.signosapp.Signo(11,"Sagitário","22 de Novembro – 21 de Dezembro",
                R.drawable.sagittarius));
        signos.add(new signosapp.ellenmota.com.signosapp.Signo(12,"Capricórnio","22 de Dezembro – 19 de Janeiro",
                R.drawable.capricorn));

        return signos;
    }
}
