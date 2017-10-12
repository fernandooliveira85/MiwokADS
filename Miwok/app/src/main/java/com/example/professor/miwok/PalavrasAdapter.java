package com.example.professor.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 *
 */

public class PalavrasAdapter extends ArrayAdapter<Palavras>{
    public PalavrasAdapter(Activity context, ArrayList<Palavras> palavras){
        super(context, 0, palavras);
    }

    @NonNull
    @Override
    /**
     *
     */
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){
        View itemListaView = convertView;

        if(itemListaView == null) {
            itemListaView = LayoutInflater.from(getContext()).inflate(R.layout.item_lista, parent, false);
        }

        Palavras palavraAtual = getItem(position);

        TextView miwok = (TextView) itemListaView.findViewById(R.id.miwok);
        miwok.setText(palavraAtual.getTraducaoMiwok());

        TextView padrao = (TextView) itemListaView.findViewById(R.id.padrao);
        padrao.setText(palavraAtual.getTraducaoPadrao());

        ImageView imagem = (ImageView) itemListaView.findViewById(R.id.container_imagem);
        if(palavraAtual.hasImagem()) {
            imagem.setImageResource(palavraAtual.getReferenciaImagem());
            imagem.setVisibility(View.VISIBLE);
        } else {
            imagem.setVisibility(View.GONE);
        }

        return itemListaView;
    }
}
