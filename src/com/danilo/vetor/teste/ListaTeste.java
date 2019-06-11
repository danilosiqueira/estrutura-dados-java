package com.danilo.vetor.teste;

import com.danilo.vetor.Lista;

/**
 * ListaTeste
 */
public class ListaTeste {

    public static void main(String[] args) {
        try {
            Lista<String> lista = new Lista<String>(1);
            lista.adiciona("elemento");
            System.out.println(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}