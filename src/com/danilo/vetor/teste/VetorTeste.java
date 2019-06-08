package com.danilo.vetor.teste;

import com.danilo.vetor.Vetor;

/**
 * VetorTeste
 */
public class VetorTeste {

    public static void main(String[] args) {
        try {
            Vetor vetor01 = new Vetor(10);
            vetor01.adiciona("elemento 1");
            vetor01.adiciona("elemento 2");
            vetor01.adiciona("elemento 3");

            System.out.println(vetor01.tamanho());
            System.out.println(vetor01);
            System.out.println(vetor01.busca(2));
            System.out.println(vetor01.busca("elemento 1"));

            Vetor vetor02 = new Vetor(10);
            vetor02.adiciona("B");
            vetor02.adiciona("C");
            vetor02.adiciona("E");
            vetor02.adiciona("F");
            vetor02.adiciona("G");
            System.out.println(vetor02);

            vetor02.adiciona("A", 0);
            System.out.println(vetor02);

            vetor02.adiciona("D", 3);
            System.out.println(vetor02);

            Vetor vetor03 = new Vetor(3);
            vetor03.adiciona("B");
            vetor03.adiciona("C");
            vetor03.adiciona("E");
            vetor03.adiciona("F");
            vetor03.adiciona("G");
            System.out.println(vetor03);

            Vetor vetor04 = new Vetor(3);
            vetor04.adiciona("B");
            vetor04.adiciona("C");
            vetor04.adiciona("E");
            vetor04.adiciona("F");
            vetor04.adiciona("G");
            System.out.println(vetor04);

            vetor04.remove(1);
            System.out.println(vetor04);
            
            vetor04.remove("G");
            System.out.println(vetor04);

            Contato c1 = new Contato("Danilo", "1111-1111", "danilo@danilo");
            Contato c2 = new Contato("Danilo", "1111-1111", "danilo@danilo");
            Contato c3 = new Contato("Danilo", "1111-1111", "danilo@danilo");
            Contato c4 = new Contato("Danilo", "1111-1111", "danilo@danilo");

            Vetor vetor05 = new Vetor(5);
            vetor05.adiciona(c1);
            vetor05.adiciona(c2);
            vetor05.adiciona(c3);
            System.out.println(vetor05);

            int posContato = vetor05.busca(c4);
            if(posContato < 0) {
                System.out.println("Contato não existe no vetor.");
            } else {
                System.out.println("Contato existe no vetor.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}