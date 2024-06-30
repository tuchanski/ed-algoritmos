package selectionsort;

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

        // Selection sort -> procura o menor e coloca no lugar
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

        System.out.println();
        System.out.print("Vetor ordenado: ");
        for (int j = 0; j < vetor.length; j++) {
            System.out.print(vetor[j] + " ");
        }

    }

}
