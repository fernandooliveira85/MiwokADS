package com.example.professor.miwok;
/**
 * @author Fernando Lucio de Oliveira
 * @class Principal do Sistema
 * Inicio do sistema
 */


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import static android.R.attr.id;
import static android.R.string.no;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static android.os.Build.VERSION_CODES.O;
import static com.example.professor.miwok.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {
    /**Método onCreate
     * apresenta todas os links para as outras telas
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numerosTextView = (TextView) findViewById(R.id.numeros);
        numerosTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NumerosActivity.class);
                startActivity(intent);
            }
        });

        TextView familiaTextView = (TextView) findViewById(R.id.familia);
        familiaTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FamiliaActivity.class);
                startActivity(intent);
            }
        });

        TextView coresTextView = (TextView) findViewById(R.id.cores);
        coresTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CoresActivity.class);
                startActivity(intent);
            }
        });

        TextView frasesTextView = (TextView) findViewById(R.id.frases);
        frasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FrasesActivity.class);
                startActivity(intent);
            }
        });



    }

}
