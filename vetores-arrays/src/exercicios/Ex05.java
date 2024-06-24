package exercicios;

import vetor.VetorGenerico;

public class Ex05 {

    public static void main(String[] args) {

        // Melhore a classe VetorGenerico e implemente o método limpar() onde todos os
        // elementos
        // são removidos, semelhante ao clear() do ArrayList

        VetorGenerico<Integer> vetorGenerico = new VetorGenerico<>(3);

        try {

            vetorGenerico.adicionarElemento(8);
            vetorGenerico.adicionarElemento(6);
            vetorGenerico.adicionarElemento(9);

            System.out.println(vetorGenerico);

            vetorGenerico.limpar();

            System.out.println(vetorGenerico);

            System.out.println(vetorGenerico.getTamanhoReal());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
