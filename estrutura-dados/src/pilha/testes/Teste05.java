package pilha.testes;

import pilha.models.Pilha;

public class Teste05 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        try {

            pilha.empilhaElemento(1);
            pilha.empilhaElemento(2);
            pilha.empilhaElemento(5);

            System.out.println(pilha);

            System.out.println("Desempilhando: " + pilha.desempilhaElemento());

            System.out.println(pilha);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
