package br.com.hisamoto.listViewAndroid.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import br.com.hisamoto.listViewAndroid.R;

/**
 * @author Leandro Shindi
 * @version 1.0 25/06/15.
 */
public class AlinhamentoActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.alinhamento_activity);

        Button btnVoltar = (Button)findViewById(R.id.voltar);
        btnVoltar.setText("Voltar");

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

    }
}