package insertionsort;

public class Ex01 {

    public static void main(String[] args) {

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }

        // Printando

        System.out.print("Vetor desordenado: ");
        for (int j = 0; j < vetor.length; j++) {
            System.out.print(vetor[j] + " ");
        }

        // Algoritmo de ordenação mais rápido que bubble sort

        int aux, l;
        for (int k = 1; k < vetor.length; k++) {
            aux = vetor[k];
            l = k - 1;
            while (l >= 0 && vetor[l] > aux) {
                if (vetor[l] > aux) {

                    vetor[l + 1] = vetor[l];
                    l -= 1;

                }
                vetor[l + 1] = aux;
            }
        }

        System.out.println();
        System.out.print("Vetor ordenado: ");
        for (int j = 0; j < vetor.length; j++) {
            System.out.print(vetor[j] + " ");
        }

    }

}
