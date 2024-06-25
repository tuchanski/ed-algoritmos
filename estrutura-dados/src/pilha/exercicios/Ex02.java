package pilha.exercicios;

import java.util.Scanner;

import pilha.models.Pilha;

public class Ex02 {

    public static void main(String[] args) {

        // Escreva um programa que leia 10 números
        // Se for par, empilhe na pilha par
        // Se for ímpar, empilhe na pilha impar
        // Se o número for 0, desempilhe um elemento de cada pilha
        // Caso alguma pilha esteja vazia, mostre uma mensagem de erro
        // Ao final, desempilhe todos os elementos das duas pilhas
        // Imprima-os na tela.

        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();
        Scanner input = new Scanner(System.in);

        try {

            for (int i = 1; i <= 10; i++) {
                System.out.print("\nDigite um número: ");
                int numero = input.nextInt();

                if (numero == 0) {
                    if (par.estaVazia()) {
                        System.out.println("\nErro: Lista par vazia");
                    } else {
                        System.out.println("Desempilhando da lista par: " + par.desempilhaElemento());
                    }

                    if (impar.estaVazia()) {
                        System.out.println("Erro: Lista impar vazia");
                    } else {
                        System.out.println("Desempilhando da lista impar: " + impar.desempilhaElemento());
                    }
                } else if (numero % 2 == 0) {
                    par.empilhaElemento(numero);
                } else {
                    impar.empilhaElemento(numero);
                }

            }

            input.close();

            System.out.println("\nPar: " + par);
            System.out.println("Impar: " + impar);

            System.out.println("\nDesempilhando da pilha Par: ");
            while (!par.estaVazia()) {
                System.out.println(par.desempilhaElemento());
            }
            System.out.println("\nDesempilhando da pilha impar: ");
            while (!impar.estaVazia()) {
                System.out.println(impar.desempilhaElemento());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
