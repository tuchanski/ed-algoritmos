package selectionsort;

public class Ex02 {

    public static void main(String[] args) {

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }

        // Printando
        System.out.print("Vetor desordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        // Ordenando com Selection Sort
        // Mais rápido que bubble sort, porém ainda não tão performático.
        // Consiste em passar o menor valor para a primeira posição, e assim
        // sucessivamente.

        int posicaoMenor, aux;
        for (int i = 0; i < vetor.length; i++) {

            posicaoMenor = i;

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[posicaoMenor]) {
                    posicaoMenor = j;
                }
            }

            aux = vetor[posicaoMenor];
            vetor[posicaoMenor] = vetor[i];
            vetor[i] = aux;
        }

        // Printando
        System.out.print("Vetor ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

    }

}
