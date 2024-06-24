package exercicios;

import models.VetorGenerico;

public class Ex02 {
    public static void main(String[] args) {

        // 1) Melhore a classe VetorGenerico e implemente o método ultimoIndice
        // semelhante ao método lastIndexOf da classe ArrayList

        VetorGenerico<String> vetor = new VetorGenerico<>(3);

        try {
            vetor.adicionarElemento("Gato");
            vetor.adicionarElemento("Cachorro");
            vetor.adicionarElemento("Bezerro");
            vetor.adicionarElemento("Gato");

            System.out.println(vetor.ultimoIndice("Gato")); // retorna 3
            System.out.println(vetor.ultimoIndice("Peixe")); // retorna -1

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}