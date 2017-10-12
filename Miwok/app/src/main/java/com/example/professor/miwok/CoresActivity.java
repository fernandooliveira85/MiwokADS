package com.example.professor.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CoresActivity extends AppCompatActivity {
    /**
     * Apresenta todas os numeros
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_palavras);
        ArrayList<Palavras> palavras = new ArrayList<Palavras>();
        palavras.add(new Palavras("um", "cor1"));
        palavras.add(new Palavras("dois", "cor2"));
        palavras.add(new Palavras("três", "cor3"));
        palavras.add(new Palavras("quatro", "cor4"));
        palavras.add(new Palavras("cinco", "cor5"));
        palavras.add(new Palavras("seis", "cor6"));
        palavras.add(new Palavras("sete", "cor7"));
        palavras.add(new Palavras("oito", "cor8"));
        palavras.add(new Palavras("nove", "cor9"));
        palavras.add(new Palavras("dez", "cor10"));

        PalavrasAdapter itensAdapter = new PalavrasAdapter(this, palavras);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itensAdapter);
    }
}
