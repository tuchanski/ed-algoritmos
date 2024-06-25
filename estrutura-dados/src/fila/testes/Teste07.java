package fila.testes;

import java.util.PriorityQueue;
import java.util.Queue;

public class Teste07 {

    public static void main(String[] args) {
        

        Queue<Integer> filaComPrioridade = new PriorityQueue<Integer>();

        filaComPrioridade.add(2);
        filaComPrioridade.add(1);
    

        System.out.println(filaComPrioridade);

    }
    
}
