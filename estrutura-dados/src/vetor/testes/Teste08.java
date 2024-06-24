package testes;

import models.Vetor;

public class Teste08 {

    public static void main(String[] args) {


        try {

            Vetor vetor = new Vetor(3);

            vetor.adicionarElemento(1);
            vetor.adicionarElemento(2);
            vetor.adicionarElemento(3);
            vetor.adicionarElemento(4);

            vetor.removerElementoPorPosicao(2);

            System.out.println(vetor);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
    }
    
}
