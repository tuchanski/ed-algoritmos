package lista.testes;

import lista.models.ListaEncadeada;

public class Teste02 {

    public static void main(String[] args) {

        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<Integer>();

        listaEncadeada.adicionaElemento(1);
        listaEncadeada.adicionaElemento(2);
        listaEncadeada.adicionaElemento(3);

        System.out.println(listaEncadeada);
        System.out.println(listaEncadeada.getTamanho());

    }

}
