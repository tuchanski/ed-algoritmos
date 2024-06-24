package exercicios;

import java.util.Scanner;

import testes.Usuario;
import models.VetorGenerico;

public class Ex06 {

    public static void main(String[] args) {

        // Utilize a classe Usuário e crie utilizando o VetorGenerico:
        // a) - Vetor com capacidade para 3 usuarios
        // b) - Insira 5 contatos no vetor com for loop
        // c) - Crie um exemplo para utilizar cada método da classe VetorGenerico

        Scanner input = new Scanner(System.in);

        VetorGenerico<Usuario> usuarios = new VetorGenerico<Usuario>(3);
        Usuario user1 = new Usuario("João Afonso", "joao@gmail.com", "123-456");

        try {

            usuarios.adicionarElemento(user1);

            for (int i = 0; i < 5; i++) {

                String nome, email, telefone;

                System.out.print("\n- Nome: ");
                nome = input.nextLine();
                System.out.print("\n- Email: ");
                email = input.nextLine();
                System.out.print("\n- Telefone: ");
                telefone = input.nextLine();

                usuarios.adicionarElemento(new Usuario(nome, email, telefone));

            }

            System.out.println(usuarios);

            System.out.println(usuarios.contemElemento(user1));

            System.out.println(usuarios.ultimoIndice(user1));

            System.out.println(usuarios.buscarPorPosicao(2));

            System.out.println(usuarios.buscarPorElemento(user1));

            usuarios.adicionarElementoEmPosicao(user1, 3);
            System.out.println(usuarios);

            usuarios.removerElementoPorPosicao(0);
            System.out.println(usuarios);

            usuarios.removerElemento(user1);
            System.out.println(usuarios);

            System.out.println(usuarios.obtem(2));

            usuarios.limpar();

            System.out.println(usuarios);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
