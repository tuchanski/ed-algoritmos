package fila.testes;

import fila.models.Fila;

public class Teste01 {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        System.out.println(fila.estaVazia());
        System.out.println(fila.getTamanhoReal());

    }

}
