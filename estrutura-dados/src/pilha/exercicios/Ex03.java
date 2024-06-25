package pilha.exercicios;

import java.time.Year;
import java.util.Scanner;

import pilha.models.Pilha;

public class Ex03 {

    public static void main(String[] args) {

        // Crie uma pilha com capacidade de 20 livros
        // Insira 6 livros na pilha, cada livro contém nome, isbn, ano de lançamento e
        // autor
        // Crie um exemplo para utilizar cada método da classe Pilha

        Pilha<Livro> livros = new Pilha<Livro>(20);
        Scanner input = new Scanner(System.in);

        try {

            for (int i = 0; i < 6; i++) {

                System.out.printf("\n[%d] - Adicionando Livro", i + 1);

                System.out.print("\n1 - Nome: ");
                String nome = input.nextLine();
                System.out.print("\n2 - ISBN: ");
                String isbn = input.nextLine();
                System.out.print("\n3 - Ano de Lançamento: ");
                String anoLancamentoString = input.nextLine();
                Year anoLancamento = Year.parse(anoLancamentoString);
                System.out.print("\n4 - Autor: ");
                String autor = input.nextLine();

                Livro livro = new Livro(nome, isbn, anoLancamento, autor);

                livros.empilhaElemento(livro);
            }

            input.close();

            System.out.println("\nPilha de livros: " + livros);

            System.out.println("\nTopo da pilha: " + livros.topoPilha());

            System.out.println("\nDesempilhando: " + livros.desempilhaElemento());
            System.out.println("Desempilhando: " + livros.desempilhaElemento());

            System.out.println("\nPilha de livros atual: " + livros);

            System.out.println("\nPilha está vazia: " + livros.estaVazia());
            System.out.println("Tamanho da pilha: " + livros.getTamanhoReal());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
