package exercicios;

import models.VetorGenerico;

public class Ex03 {

    public static void main(String[] args) {

        // Melhore a classe VetorGenerico e implemente o método
        // remove(T elemento), onde será possível remover um elemento
        // da lista o passando como parâmetro

        VetorGenerico<Integer> vetorGenerico = new VetorGenerico<>(3);

        try {

            vetorGenerico.adicionarElemento(1);
            vetorGenerico.adicionarElemento(2);
            vetorGenerico.adicionarElemento(3);
            vetorGenerico.adicionarElemento(4);

            System.out.println(vetorGenerico);

            vetorGenerico.removerElemento(2);

            System.out.println(vetorGenerico);

            vetorGenerico.removerElemento(5);

            System.out.println(vetorGenerico);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
