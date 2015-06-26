package br.com.hisamoto.listViewAndroid.activity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * @author Leandro Shindi
 * @version 1.0 25/06/15.
 */
public class ListViewActivity extends ListActivity {

    private static final String[] OPCOES_DO_MENU = new String[]{
            "Definindo ID às Views",
            "Trabalhando com Alinhamento",
            "Trabalhando com EditText",
            "Definindo peso de uma View",
            "Trabalhando com Views",
            "Trabalhando com Texto Estilizado",
            "Trabalhando com LinearLayout Horizontal",
            "Trabalhando com LinearLayout Vertical",
            "Trabalhando com RelativeLayout",
            "Trabalhando com TableLayout",
            "Trabalhando com FrameLayout",
            "Sair"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * Define o Adapter que irá mostrar os dados na ListView.
         */
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, OPCOES_DO_MENU));

    }

    /**
     * Evento a ser disparado ao clicar em um dos itens da ListView.
     */
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        switch (position) {
            case 0:
                startActivity(new Intent(this, TrabalhandoComIDActivity.class));
                break;
            case 1:
                startActivity(new Intent(this, AlinhamentoActivity.class));
                break;
            default:
                Toast.makeText(getApplicationContext(), "Não existe activity para essa opção", Toast.LENGTH_SHORT).show();
                //finish();
        }
    }

}