package fila.testes;

import fila.models.Fila;

public class Teste04 {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        try {
            System.out.println("Tamanho da fila atual: " + fila.getTamanhoReal());
            System.out.println("Fila atual: " + fila.toString());
            System.out.println("Desenfileirando: " + fila.desenfileirarElemento());

            fila.enfileiraElemento(1);
            fila.enfileiraElemento(2);
            fila.enfileiraElemento(3);

            System.out.println("\nTamanho da fila atual: " + fila.getTamanhoReal());
            System.out.println("Fila atual: " + fila.toString());

            System.out.println("\nDesenfileirando: " + fila.desenfileirarElemento());

            System.out.println("\nTamanho da fila atual: " + fila.getTamanhoReal());
            System.out.println("Fila atual: " + fila.toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
