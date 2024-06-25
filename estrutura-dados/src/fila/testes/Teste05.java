package fila.testes;

import java.util.LinkedList;
import java.util.Queue;

public class Teste05 {

    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();

        fila.add(1);
        fila.add(3);
        fila.add(2);

        System.out.println(fila);

        System.out.println(fila.peek());

        System.out.println("Removendo: " + fila.remove());

        System.out.println(fila);

    }

}
