package buscabinaria;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10000];

        // Busca binária funciona apenas se o vetor estiver ordenado

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
        }

        boolean encontrado = false;

        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        int contador = 0;

        System.out.print("Insira um número: ");
        int busca = input.nextInt();

        while (inicio <= fim) {

            meio = (int) ((inicio + fim) / 2);
            contador++;
            if (vetor[meio] == busca) {
                encontrado = true;
                break;
            } else if (vetor[meio] < busca) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }

        }

        if (encontrado) {
            System.out.println("Encontrado!");
        } else {
            System.out.println("Não encontrado.");
        }

        System.out.println("Número de testes: " + contador);

    }

}
