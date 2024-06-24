package testes;

import models.VetorObject;

public class Teste09 {

    public static void main(String[] args) {

        VetorObject vetor = new VetorObject(3);

        Usuario user1 = new Usuario("João Afonso", "coxa@gmail.com", "123-456-789");
        Usuario user2 = new Usuario("Pitoco Mendes", "pitoco@gmail.com", "765-432-123");
        Usuario user3 = new Usuario("Princeso Afonso", "afonsinho@gmail.com", "654-678-432");

        try {

            vetor.adicionarElemento(user1);
            vetor.adicionarElemento(user2);
            vetor.adicionarElemento(user3);

            System.out.println(vetor);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
