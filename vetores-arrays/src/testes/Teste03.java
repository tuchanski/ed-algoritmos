package testes;

import vetor.Vetor;

public class Teste03 {

    public static void main(String[] args) {

        try {

            Vetor vetor = new Vetor(7);

            vetor.adicionarElemento(1);
            vetor.adicionarElemento(2);

            System.out.println(vetor);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
