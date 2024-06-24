package pilha.exercicios;

import pilha.models.Pilha;

public class Ex01 {

    public static void main(String[] args) {

        // Escreva um programa que leia 10 números
        // Se for par, empilhe na pilha.
        // Se for ímpar, desempilhe um número na pilha.
        // Caso esteja vazia, mostre uma mensagem.
        // No final do programa, se nao estiver vazia, desempilhe todos os elementos.
        // Imprima-os na tela.

        Pilha<Integer> pilha = new Pilha<>(); // Cabe 10

        try {

            for (int i = 1; i <= 10; i++) {

                if (i % 2 == 0) {
                    pilha.empilhaElemento(i);
                    System.out.println("Pilha atual: " + pilha);
                } else {
                    if (!pilha.estaVazia()) {

                        System.out.println("Desempilhando: " + pilha.desempilhaElemento());

                    } else {
                        System.out.println("Pilha vazia!");
                    }
                }

            }

            if (!pilha.estaVazia()) {
                for (int i = 0; i < pilha.getTamanhoReal(); i++) {
                    System.out.println("Desempilhando: " + pilha.desempilhaElemento());
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
