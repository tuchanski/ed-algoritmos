package testes;

import vetor.Vetor;

public class Teste06 {

    public static void main(String[] args) {

        try {

            Vetor vetor = new Vetor(10);

            vetor.adicionarElemento(1);
            vetor.adicionarElemento(2);
            vetor.adicionarElemento(3);
            vetor.adicionarElemento(4);

            vetor.adicionarElementoEmPosicao(7, 3);

            System.out.println(vetor);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
    }

}