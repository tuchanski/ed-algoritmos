package pilha.testes;

import pilha.models.Pilha;

public class Teste03 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        System.out.println(pilha.estaVazia());

        try {

            pilha.empilhaElemento(2);
            pilha.empilhaElemento(4);

            System.out.println(pilha);

            System.out.println(pilha.estaVazia());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
