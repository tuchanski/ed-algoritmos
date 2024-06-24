package pilha.testes;

import java.util.Stack;

import pilha.models.Pilha;

public class Teste06 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>(); // Cria pilha com capacidade 10

        Stack<Integer> stack = new Stack<>(); // API do Java que cria a pilha

        System.out.println(stack.isEmpty());

        try {

            stack.push(1);
            stack.push(2);
            pilha.empilhaElemento(1);
            pilha.empilhaElemento(2);

            System.out.println(pilha.estaVazia());
            System.out.println(stack.isEmpty());

            System.out.println(stack.size());
            System.out.println(pilha.getTamanhoReal());

            System.out.println(stack.peek());
            System.out.println(pilha.topoPilha());

            System.out.println("Desempilha com Stack: " + stack.pop());
            System.out.println("Desempilha com Pilha: " + pilha.desempilhaElemento());

            System.out.println(stack);
            System.out.println(pilha);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
