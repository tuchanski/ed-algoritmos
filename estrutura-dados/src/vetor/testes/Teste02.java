package testes;

import models.Vetor;

public class Teste02 {

    public static void main(String[] args) {

        try {

            Vetor vetor = new Vetor(2);

            vetor.adicionarElemento(1);
            vetor.adicionarElemento(2);
            vetor.adicionarElemento(3);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
