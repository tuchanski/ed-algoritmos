package fila.exercicios;

import java.util.Scanner;

import fila.models.Fila;

public class Ex01 {

    public static void main(String[] args) {

        /*
         * Usando a estrutura de dados Fila, crie uma fila de documentos que precisam
         * ser
         * impressos. Cada documento é composto de nome, quantidade de folhas. O
         * programa deve:
         * - enfileirar os documentos - imprimir cada documento desenfileirando da fila
         * *
         */

        Fila<Documento> filaDocumentos = new Fila<>(5);
        Scanner input = new Scanner(System.in);

        try {

            for (int i = 0; i < 3; i++) {

                System.out.print("\nNome do Documento: ");
                String nomeDocumento = input.next();
                System.out.print("\nQuantidade de folhas: ");
                int quantidadeFolhas = input.nextInt();

                Documento documento = new Documento(nomeDocumento, quantidadeFolhas);

                System.out.println("\nAdicionando documento na fila: " + documento);
                filaDocumentos.enfileiraElemento(documento);
            }

            System.out.println("\nFila de Documentos: " + filaDocumentos);
            System.out.println("Tamanho: " + filaDocumentos.getTamanhoReal());

            while (!filaDocumentos.estaVazia()) {
                System.out.println("\nImprimindo: " + filaDocumentos.desenfileirarElemento());
            }

            System.out.println("\nFila de Documentos: " + filaDocumentos);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
