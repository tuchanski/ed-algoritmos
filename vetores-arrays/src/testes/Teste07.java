package testes;

import vetor.Vetor;

public class Teste07 {

    public static void main(String[] args) {


        try {

            Vetor vetor = new Vetor(3);

            vetor.adicionarElemento(1);
            vetor.adicionarElemento(2);
            vetor.adicionarElemento(3);
            vetor.adicionarElemento(4);

            System.out.println(vetor);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
