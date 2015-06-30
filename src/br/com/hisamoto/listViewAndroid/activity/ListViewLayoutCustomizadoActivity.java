package br.com.hisamoto.listViewAndroid.activity;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import br.com.hisamoto.listViewAndroid.ListViewCustomizadoItem;
import br.com.hisamoto.listViewAndroid.R;
import br.com.hisamoto.listViewAndroid.adapter.ListViewCustomizadoAdapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author Leandro Shindi
 * @version 1.0 26/06/15.
 */
public class ListViewLayoutCustomizadoActivity extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActionBar().setDisplayHomeAsUpEnabled(true);

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String hora = sdf.format(Calendar.getInstance().getTime());

        /**
         * Cria uma lista com os itens a serem mostrados na tela.
         *
         */
        List<ListViewCustomizadoItem> itens = new ArrayList<ListViewCustomizadoItem>();
        itens.add(new ListViewCustomizadoItem("Definindo ID às Views", R.drawable.leandro, "ekamoto.leandro@gmail.com", hora, "Ativo"));
        itens.add(new ListViewCustomizadoItem("Trabalhando com Alinhamento", R.drawable.leandro, "ekamoto.leandro@gmail.com", hora,"Desativado"));
        itens.add(new ListViewCustomizadoItem("Trabalhando com EditText", R.drawable.leandro, "ekamoto.leandro@gmail.com", hora,"Ativo"));
        itens.add(new ListViewCustomizadoItem("Definindo peso de uma View", R.drawable.leandro, "ekamoto.leandro@gmail.com", hora,"Desativado"));
        itens.add(new ListViewCustomizadoItem("Trabalhando com Views", R.drawable.leandro, "ekamoto.leandro@gmail.com", hora,"Ativo"));
        itens.add(new ListViewCustomizadoItem("Trabalhando com Texto Estilizado", R.drawable.leandro, "ekamoto.leandro@gmail.com", hora,"Desativado"));
        itens.add(new ListViewCustomizadoItem("Trabalhando com LinearLayout Horizontal", R.drawable.leandro, "ekamoto.leandro@gmail.com", hora,"Ativo"));
        itens.add(new ListViewCustomizadoItem("Trabalhando com LinearLayout Vertical", R.drawable.leandro, "ekamoto.leandro@gmail.com", hora,"Desativado"));
        itens.add(new ListViewCustomizadoItem("Trabalhando com RelativeLayout", R.drawable.leandro, "ekamoto.leandro@gmail.com", hora,"Ativo"));
        itens.add(new ListViewCustomizadoItem("Trabalhando com TableLayout", R.drawable.leandro, "ekamoto.leandro@gmail.com", hora,"Desativado"));
        itens.add(new ListViewCustomizadoItem("Trabalhando com FrameLayout", R.drawable.leandro, "ekamoto.leandro@gmail.com", hora,"Ativo"));
        itens.add(new ListViewCustomizadoItem("Sair", R.drawable.leandro, "ekamoto.leandro@gmail.com", hora,"Desativado"));

        /**
         * Define o Adapter que irá mostrar os dados na ListView.
         *
         */
        setListAdapter(new ListViewCustomizadoAdapter(getApplicationContext(), itens));
    }

    /***
     * Quando um item da lista é clicado ele retorna nesse método
     *
     */
    @Override
    protected void onListItemClick(ListView I, View v, int position, long id) {

        switch (position){
            case 0:

                // Direrecionando para a activity TrabalhandoComIDActivity
                startActivity(new Intent(this, TrabalhandoComIDActivity.class));
                break;
            case 1:

                // Direrecionando para a activity AlinhamentoActivity
                startActivity(new Intent(this, AlinhamentoActivity.class));
                break;
            default:
                Toast.makeText(getApplicationContext(), "Não existe activity para essa opção", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home) {
            Log.i("agenda", "botao voltar");
            finish();
        }

        // TODO Auto-generated method stub
        return super.onOptionsItemSelected(item);
    }
}