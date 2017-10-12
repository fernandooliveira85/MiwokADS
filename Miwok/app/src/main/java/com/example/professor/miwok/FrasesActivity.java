package com.example.professor.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FrasesActivity extends AppCompatActivity {
    /**
     * Método de criação da tela de Frases
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_palavras);

        ArrayList<Palavras> palavras = new ArrayList<Palavras>();
        palavras.add(new Palavras("onde você está indo?", "minto wuksus"));
        palavras.add(new Palavras("qual o seu nome?", "tinnǝ oyaase'nǝ"));
        palavras.add(new Palavras("meu nome é...", "oyaaset..."));
        palavras.add(new Palavras("como está se sentindo?", "michǝksǝs?"));
        palavras.add(new Palavras("estou me sentindo bem", "kuchi achit"));
        palavras.add(new Palavras("você está vindo?", "ǝǝnǝs'aa?"));
        palavras.add(new Palavras("sim, estou indo", "hǝǝ' ǝǝnǝm"));
        palavras.add(new Palavras("estou indo", "ǝǝnǝm"));
        palavras.add(new Palavras("vamos", "yoowutis"));
        palavras.add(new Palavras("venha aqui", "ǝnni'nem"));

        PalavrasAdapter itensAdapter = new PalavrasAdapter(this, palavras);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itensAdapter);
    }
}
