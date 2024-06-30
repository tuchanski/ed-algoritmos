package selectionsort;

public class Ex03 {

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

        int menorPosicao, auxiliar;

        for (int i = 0; i < vetor.length; i++) {

            // Começa no 0 e vai até vetor.length - 1
            menorPosicao = i;

            // Para comparação, j recebe i + 1
            for (int j = i + 1; j < vetor.length; j++) {

                // Compare se o valor na posição vetor[j] é menor que vetor[menorPosicao]

                if (vetor[j] < vetor[menorPosicao]) {
                    // Caso positivo, a menor posição recebe o valor de J.
                    menorPosicao = j;
                }

                // A variável auxiliar recebe o valor que está em vetor[menorPosicao]
                auxiliar = vetor[menorPosicao];
                // vetor[menorPosicao] recebe o valor de vetor[i]
                vetor[menorPosicao] = vetor[i];
                // vetor[i] recebe o valor que a variável auxiliar guardou, isso é, o que estava
                // em vetor[menorPosicao]
                vetor[i] = auxiliar;

            }

        }

        // Printando
        System.out.print("Vetor ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

    }

}
