package com.danilo.vetor.teste;

import com.danilo.vetor.Vetor;

/**
 * VetorTeste
 */
public class VetorTeste {

    public static void main(String[] args) {
        
        Vetor vetor = new Vetor(10);

        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");

            System.out.println(vetor.tamanho());
            System.out.println(vetor);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}