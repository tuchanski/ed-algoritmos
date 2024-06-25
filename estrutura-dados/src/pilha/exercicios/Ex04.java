package pilha.exercicios;

import java.util.Stack;

public class Ex04 {

    public static void main(String[] args) {

        // Crie um verificador de Palindromos com pilha

        String palavra = "mirim";

        System.out.println("Palavra: " + palavra);

        System.out.println("É palindromo: " + verificaPalindromo(palavra));

    }

    public static boolean verificaPalindromo(String palavra) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < palavra.length(); i++) {
            stack.add(palavra.charAt(i));
        }

        String palavraInversa = "";

        while (!stack.isEmpty()) {
            palavraInversa += stack.pop();
        }

        if (palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }

        return false;
    }

}
