package br.com.hisamoto.listViewAndroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import br.com.hisamoto.listViewAndroid.activity.ListPesquisaActivity;
import br.com.hisamoto.listViewAndroid.activity.ListViewActivity;
import br.com.hisamoto.listViewAndroid.activity.ListViewLayoutCustomizadoActivity;

public class HisamotoActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        LinearLayout layout = new LinearLayout(getApplicationContext());

        /** Rotina para chamar uma ListActivity com layout padrão do android  **/
        Button botaoListagemLayoutPadraoAndroid = new Button(getApplicationContext());
        botaoListagemLayoutPadraoAndroid.setText("L.Pad.");
        botaoListagemLayoutPadraoAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), ListViewActivity.class);
                startActivity(i);
            }
        });
        layout.addView(botaoListagemLayoutPadraoAndroid);

        /** Rotina para chamar uma ListActivity com layout customizado  **/
        Button botaoListagemLayoutCustomizado = new Button(getApplicationContext());
        botaoListagemLayoutCustomizado.setText("L. Custo.");
        botaoListagemLayoutCustomizado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), ListViewLayoutCustomizadoActivity.class);
                startActivity(i);
            }
        });
        layout.addView(botaoListagemLayoutCustomizado);

        /** Rotina para chamar uma ListActivity com pesquisa  **/
        Button botaoListagemPesquisa = new Button(getApplicationContext());
        botaoListagemPesquisa.setText("L. Custo.");
        botaoListagemPesquisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), ListPesquisaActivity.class);
                startActivity(i);
            }
        });
        layout.addView(botaoListagemPesquisa);

        setContentView(layout);
    }

}