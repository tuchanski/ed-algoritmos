package fila.exercicios;

import fila.models.Fila;

public class Ex02 {

    public static void main(String[] args) {

        /*
         * Escreva um programa que simule a distribuição de senhar de atendimento
         * a um grupo de pessoas. Cada pessoa pode receber uma senha prioritária
         * ou uma senha normal. O programa deve obedecer os seguintes critérios:
         * - Existe apenas 1 atendente
         * - 1 pessoa com senha normal deve ser atendida a cada 3 pessoas com senha
         * prioritária
         * - Não havendo prioridades, as pessoas com senha normal podem ser atendidas
         */

        Fila<String> semPrioridade = new Fila<String>();
        Fila<String> comPrioridade = new Fila<String>();

        final int DEF_PRIORIDADE = 3;

        try {

            semPrioridade.enfileiraElemento("Regular 1");
            semPrioridade.enfileiraElemento("Regular 2");
            semPrioridade.enfileiraElemento("Regular 3");
            semPrioridade.enfileiraElemento("Regular 4");
            semPrioridade.enfileiraElemento("Regular 5");
            semPrioridade.enfileiraElemento("Regular 6");

            comPrioridade.enfileiraElemento("Prioridade 1");
            comPrioridade.enfileiraElemento("Prioridade 2");
            comPrioridade.enfileiraElemento("Prioridade 3");
            comPrioridade.enfileiraElemento("Prioridade 4");

            while (!semPrioridade.estaVazia() || !comPrioridade.estaVazia()) {

                int contador = 0;

                while (!comPrioridade.estaVazia() && contador < DEF_PRIORIDADE) {
                    String pessoaAtendida = comPrioridade.desenfileirarElemento();
                    System.out.println(pessoaAtendida + " foi atendida.");
                    contador += 1;
                }

                if (!semPrioridade.estaVazia()) {
                    String pessoaAtendida = semPrioridade.desenfileirarElemento();
                    System.out.println(pessoaAtendida + " foi atendida.");
                }

                if (comPrioridade.estaVazia()) {
                    while (!semPrioridade.estaVazia()) {
                        String pessoaAtendida = semPrioridade.desenfileirarElemento();
                        System.out.println(pessoaAtendida + " foi atendida.");
                    }
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
