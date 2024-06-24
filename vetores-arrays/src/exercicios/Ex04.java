package exercicios;

import vetor.VetorGenerico;

public class Ex04 {

    public static void main(String[] args) {

        // Melhore a classe VetorGenerico e implemente o método obtem(int posicao),
        // onde será possível obter o elemento dada uma posicão do vetor

        VetorGenerico<Integer> vetorGenerico = new VetorGenerico<>(3);

        try {

            vetorGenerico.adicionarElemento(8);
            vetorGenerico.adicionarElemento(6);
            vetorGenerico.adicionarElemento(9);

            System.out.println(vetorGenerico.obtem(2)); // 9

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
