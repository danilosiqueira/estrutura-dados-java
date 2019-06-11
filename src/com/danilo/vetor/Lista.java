package com.danilo.vetor;

import java.lang.reflect.Array;

/**
 * Lista
 */
public class Lista<T> {

    private T[] elementos;
    private int tamanho = 0;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade]; // Solução do livro Java Efetivo.
        this.tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public void adiciona(T elemento) throws Exception {
        aumentaCapacidade();

        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos.");
        }
    }

    public void adiciona(T elemento, int posicao) {
        aumentaCapacidade();

        if(!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida.");
        }

        for(int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;
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

    public Object busca(int posicao) {
        if(!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida.");
        }

        return this.elementos[posicao];
    }

    public int busca(T elemento) {
        for(int i = 0; i < this.tamanho; i++) {
            if(this.elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    private void aumentaCapacidade() {
        if(this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];

            for(int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }

            this.elementos = elementosNovos;
        }
    }
    
    public void remove(int posicao) {
        if(!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida.");
        }

        this.tamanho--;
        
        for(int i = posicao; i < this.tamanho; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
    }

    public void remove(T elemento) throws Exception {
        int posicao = busca(elemento);
        if(posicao < 0 ) {
            throw new Exception(String.format("Elemento %s não encontrado.", elemento));
        }

        remove(posicao);
    }
}