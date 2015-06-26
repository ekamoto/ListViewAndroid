package br.com.hisamoto.listViewAndroid.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.hisamoto.listViewAndroid.ListViewCustomizadoItem;
import br.com.hisamoto.listViewAndroid.R;
import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author Leandro Shindi
 * @version 1.0 26/06/15.
 */
public class ListViewCustomizadoAdapter extends BaseAdapter {

    private Context contexto;

    // Lista de itens a serem apresentados na tela
    private List<ListViewCustomizadoItem> itens;

    public ListViewCustomizadoAdapter(Context contexto, List<ListViewCustomizadoItem> itens) {

        this.contexto = contexto;
        this.itens = itens;
    }

    /**
     * Quantidade de itens a serem aprensentados na ListView
     *
     */
    @Override
    public int getCount() {

        return itens.size();
    }

    /**
     *  Retorna um item da ListView através de sua posição atual
     *
     */
    @Override
    public Object getItem(int posicao) {

        return itens.get(posicao);
    }

    /***
     * ID de um item. Em nosso caso usaremos sua posição como ID
     *
     * */
    @Override
    public long getItemId(int position) {

        return position;
    }

    /**
     * Aqui é onde a mágica é feita: cada item da nossa lista de itens
     * será adaptado para ser apresentado em uma linha da ListView.
     * É aqui que montamos nossa View customizada
     *
     * */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Item a ser apresentado na posição atual da ListView
        ListViewCustomizadoItem item = itens.get(position);

        // Criando uma instância de View a partir de um arquivo de Layout
        LayoutInflater inflater = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.activity_listview_customizado, null);

        // Imagem do item a ser apresentada na posição atual da ListView
        ImageView imagem = (ImageView) view.findViewById(R.id.imagem_activity);
        imagem.setImageResource(item.getImagemActivity());

        // Nome
        TextView nome = (TextView) view.findViewById(R.id.nome_activity);
        nome.setText(item.getNomeActivity());

        // E-mail
        TextView email = (TextView) view.findViewById(R.id.email_activity);
        email.setText(item.getEmail());

        // Hora
        TextView hora = (TextView) view.findViewById(R.id.hora_activity);
        hora.setText(item.getHora());

        // Status
        TextView status = (TextView) view.findViewById(R.id.status);
        status.setText(item.getStatus());

        // Zebrando a ListView
        if(position % 2 == 0) {

            view.setBackgroundColor(Color.GREEN);
        } else {

            view.setBackgroundColor(Color.BLUE);
        }

        return view;
    }
}