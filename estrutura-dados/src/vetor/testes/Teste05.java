package testes;

import models.Vetor;

public class Teste05 {

    public static void main(String[] args) {
        try {

            Vetor vetor = new Vetor(7);

            vetor.adicionarElemento(1);
            vetor.adicionarElemento(2);
            vetor.adicionarElemento(3);

            System.out.println(vetor.buscarPorElemento(9));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
