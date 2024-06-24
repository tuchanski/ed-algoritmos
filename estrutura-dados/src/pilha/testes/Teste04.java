package pilha.testes;

import pilha.models.Pilha;

public class Teste04 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        try {

            System.out.println(pilha.topoPilha());

            pilha.empilhaElemento(5);
            pilha.empilhaElemento(2);
            pilha.empilhaElemento(7);

            System.out.println(pilha.topoPilha());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
