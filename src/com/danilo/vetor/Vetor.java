package com.danilo.vetor;

import java.util.Arrays;

/**
 * Vetor
 */
public class Vetor {

    private String[] elementos;
    private int tamanho = 0;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(String elemento) throws Exception {
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos.");
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for(int i = 0; i < this.tamanho - 1; i++) {
            sb.append(this.elementos[i]);
            sb.append(", ");
        }

        if(this.tamanho > 0) {
            sb.append(this.elementos[this.tamanho - 1]);
        }

        sb.append("]");

        return sb.toString();
    }

    public String busca(int posicao) {
        if(!(posicao > 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida.");
        }

        return this.elementos[posicao];
    }
}