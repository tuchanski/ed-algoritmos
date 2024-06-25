package fila.exercicios;

import java.util.Random;

import fila.models.Fila;

public class Ex04 {

    public static void main(String[] args) {

        // Escreva um programa em filas que simule a brincadeira da batata-quente

        Fila<Integer> fila = new Fila<>();

        try {

            for (int i = 0; i < 11; i++){
                fila.enfileiraElemento(i);
            }

            Random aleatorio = new Random();

            int num = 0;

            while (num == 0){
                num = aleatorio.nextInt(10);
            }

            System.out.println("Numero: " + num);

            while (fila.getTamanhoReal() > 1){
                for (int j = 0; j < num; j++){
                    fila.enfileiraElemento(fila.desenfileirarElemento());
                }
                System.out.println("Eliminado: " + fila.desenfileirarElemento());
            }

            System.out.println("Ganhador: " + fila.desenfileirarElemento());


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
