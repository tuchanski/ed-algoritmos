package pilha.exercicios;

import java.util.Stack;

public class Ex05 {

    // Desafio Torre de Hanoi com Pilha

    public static void main(String[] args) {
        
        Stack<Integer> base = new Stack<>();
        Stack<Integer> destino = new Stack<>();
        Stack<Integer> auxiliar = new Stack<>();

        base.push(3);
        base.push(2);
        base.push(1);

        torreDeHanoi(base.size(), base, auxiliar, destino);


    }

    public static void torreDeHanoi(int numeroDiscos, Stack<Integer> base,
     Stack<Integer> destino, Stack<Integer> auxiliar){

        if (numeroDiscos > 0){
            torreDeHanoi(numeroDiscos - 1, base, auxiliar, destino);
            destino.push(base.pop());
            System.out.println("------");
            System.out.println("Base: " + base);
            System.out.println("Destino: " + destino);
            System.out.println("Auxiliar: " + auxiliar);
            torreDeHanoi(numeroDiscos - 1, auxiliar, destino, base);
        }
    }
    
}
 