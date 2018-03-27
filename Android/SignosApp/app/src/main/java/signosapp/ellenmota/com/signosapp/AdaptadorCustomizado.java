package signosapp.ellenmota.com.signosapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ellenmota on 27/03/2018.
 */

public class AdaptadorCustomizado extends BaseAdapter{

    Context contexto;
    List<Signo> listaSignos;


    public AdaptadorCustomizado(Context contexto, List<Signo> listaSignos){
      this.contexto = contexto;
      this.listaSignos = listaSignos;
    }

    @Override
    public int getCount() {
        return listaSignos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaSignos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listaSignos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        //Transforma o xml em view
        LayoutInflater inflate = LayoutInflater.from(contexto);
        view = inflate.inflate(R.layout.celulasigno, null);

        //link dos componentes com as variaveis
        ImageView imagem = view.findViewById(R.id.imgSigno);
        TextView titulo = view.findViewById(R.id.txtTitulo);
        TextView subtitulo  = view.findViewById(R.id.txtSubtitulo);

        //Atribui os dados
        titulo.setText(listaSignos.get(position).getTitulo().toString());
        subtitulo.setText(listaSignos.get(position).getSubtitulo().toString());
        imagem.setImageResource(listaSignos.get(position).getImagem());

        return view;
    }
}
