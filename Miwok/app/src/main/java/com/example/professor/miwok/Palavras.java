package com.example.professor.miwok;

/**
 * Created by professor on 05/10/17.
 */

public class Palavras {
    private String mTraducaoPadrao;
    private String mTraducaoMiwok;
    private int mReferenciaImagem = SEM_IMAGEM_FORNECIDA;
    private static final int SEM_IMAGEM_FORNECIDA = -1;

    /**
     * Classe que armazena todas as palavras, traduções e figuras
     * @param traducaoP
     * @param traducaoM
     * @param refe
     */
    public Palavras(String traducaoP, String traducaoM, int refe){
        this.mTraducaoPadrao = traducaoP;
        this.mTraducaoMiwok = traducaoM;
        this.mReferenciaImagem = refe;
    }

    public Palavras(String traducaoPadrao, String traducaoMiwok){
        this.mTraducaoPadrao = traducaoPadrao;
        this.mTraducaoMiwok = traducaoMiwok;
    }

    public String getTraducaoMiwok() {
        return mTraducaoMiwok;
    }

    public String getTraducaoPadrao(){
        return mTraducaoPadrao;
    }

    public int getReferenciaImagem() { return mReferenciaImagem; }

    public boolean hasImagem() { return mReferenciaImagem != SEM_IMAGEM_FORNECIDA; }

}
