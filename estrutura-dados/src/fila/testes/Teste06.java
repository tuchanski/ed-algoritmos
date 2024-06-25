package fila.testes;

import fila.models.FilaComPrioridade;

public class Teste06 {

    public static void main(String[] args) {
        
        FilaComPrioridade<Integer> filaComPrioridade = new FilaComPrioridade<>();

        try {

            filaComPrioridade.enfileiraElemento(1);
            filaComPrioridade.enfileiraElemento(3);
            filaComPrioridade.enfileiraElemento(2);

            System.out.println(filaComPrioridade.toString());

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    
}
