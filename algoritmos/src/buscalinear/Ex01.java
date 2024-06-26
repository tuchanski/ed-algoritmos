package buscalinear;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100);

        }

        // Busca Linear -> tem que passar por todos os elementos do vetor
        // pode ser bem lenta se tiver que percorrer um vetor mt grande.

        System.out.print("\n- Insira um número: ");
        int busca = input.nextInt();

        Boolean encontrado = false;

        for (int j = 0; j < vetor.length; j++) {

            if (vetor[j] == busca) {
                encontrado = true;
            }

        }

        if (encontrado) {
            System.out.println("Valor encontrado!");
        } else {
            System.out.println("Valor não encontrado.");
        }

    }

}