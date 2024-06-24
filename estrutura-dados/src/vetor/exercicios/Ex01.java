package exercicios;

import models.VetorGenerico;

public class Ex01 {
    public static void main(String[] args) {

        // 1) Melhore a classe VetorGenerico e implemente o método "contém"
        // semelhante ao método contains da classe ArrayList

        VetorGenerico<String> vetor = new VetorGenerico<>(3);

        try {
            vetor.adicionarElemento("Gato");
            vetor.adicionarElemento("Cachorro");
            vetor.adicionarElemento("Bezerro");

            System.out.println(vetor.contemElemento("Gato")); // true
            System.out.println(vetor.contemElemento("Galinha")); // false
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}