package com.example.professor.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamiliaActivity extends AppCompatActivity {
    /**
     * Método de criação da tela de Familia
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_palavras);

        ArrayList<Palavras> palavras = new ArrayList<Palavras>();
        palavras.add(new Palavras("pai", "ǝpǝ", R.drawable.family_father));
        palavras.add(new Palavras("mãe", "ǝta", R.drawable.family_mother));
        palavras.add(new Palavras("filho", "angsi", R.drawable.family_son));
        palavras.add(new Palavras("filha", "tune", R.drawable.family_daughter));
        palavras.add(new Palavras("irmão mais velho", "taachi", R.drawable.family_older_brother));
        palavras.add(new Palavras("irmão mais novo", "chalitti", R.drawable.family_younger_brother));
        palavras.add(new Palavras("irmã mais velha", "tete", R.drawable.family_older_sister));
        palavras.add(new Palavras("irmã mais nova", "kolliti", R.drawable.family_younger_sister));
        palavras.add(new Palavras("avó", "ama", R.drawable.family_grandmother));
        palavras.add(new Palavras("avô", "paapa", R.drawable.family_grandfather));

        PalavrasAdapter itensAdapter = new PalavrasAdapter(this, palavras);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itensAdapter);
    }
}
