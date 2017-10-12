package com.example.professor.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumerosActivity extends AppCompatActivity {
    /**
     * Metodo onCreate de criação da tela de Números
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_palavras);
        ArrayList<Palavras> palavras = new ArrayList<Palavras>();
        palavras.add(new Palavras("um", "lutti", R.mipmap.ic_launcher));
        palavras.add(new Palavras("dois", "otiiko", R.mipmap.ic_launcher));
        palavras.add(new Palavras("três", "tolookosu", R.mipmap.ic_launcher));
        palavras.add(new Palavras("quatro", "oyyisa", R.mipmap.ic_launcher));
        palavras.add(new Palavras("cinco", "massokka", R.mipmap.ic_launcher));
        palavras.add(new Palavras("seis", "temmokka", R.mipmap.ic_launcher));
        palavras.add(new Palavras("sete", "kenekaku", R.mipmap.ic_launcher));
        palavras.add(new Palavras("oito", "kawinta", R.mipmap.ic_launcher));
        palavras.add(new Palavras("nove", "wo'e", R.mipmap.ic_launcher));
        palavras.add(new Palavras("dez", "na'aacha", R.mipmap.ic_launcher));

        //ArrayAdapter<String> itensAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, palavras);
        PalavrasAdapter itensAdapter = new PalavrasAdapter(this, palavras);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itensAdapter);
        //LinearLayout raiz = (LinearLayout) findViewById(R.id.raiz);

        /*for(int cont=0; cont<palavras.size(); cont++){
            TextView palavraTextView = new TextView(this);
            palavraTextView.setText(palavras.get(cont));

            raiz.addView(palavraTextView);
        }*/
    }
}
