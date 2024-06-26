package bubblesort;

public class Ex01 {

    public static void main(String[] args) {

        int[] vetor = new int[8];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) ((Math.random()) * 100);
        }

        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

        System.out.println();

        // BubbleSort -> Ordena vetor desordenado (mas é lerdo)

        for (int i = 0; i < vetor.length; i++){
            for (int j = i + 1; j < vetor.length; j++){
                if (vetor[i] > vetor[j]){
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }

        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }

}
