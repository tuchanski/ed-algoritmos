package pilha.testes;

import pilha.models.Pilha;

public class Teste02 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>(3);

        try {

            for (int i = 0; i < 3; i++) {
                pilha.empilhaElemento(i);
            }

            System.out.println(pilha);
            System.out.println(pilha.getTamanhoReal());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
