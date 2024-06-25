package fila.testes;

import fila.models.Fila;

public class Teste03 {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        try {

            fila.enfileiraElemento(1);
            fila.enfileiraElemento(2);
            fila.enfileiraElemento(3);

            System.out.println(fila.espiarElemento());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
