package lista.testes;

import lista.models.ListaEncadeada;

public class Teste01 {

    public static void main(String[] args) {
        
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<Integer>();

        listaEncadeada.adicionaElemento(1);

        System.out.println(listaEncadeada);



    }
    
}
