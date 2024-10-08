package lista.testes;

import lista.models.ListaEncadeada;

public class Teste02 {

    public static void main(String[] args) {

        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<Integer>();

        listaEncadeada.adicionaElemento(1);
        listaEncadeada.adicionaElemento(2);
        listaEncadeada.adicionaElemento(3);
        listaEncadeada.adicionaElemento(6);
        listaEncadeada.adicionaElemento(9);
        listaEncadeada.adicionaElemento(6);

        System.out.println(listaEncadeada);
        System.out.println(listaEncadeada.getTamanho());

        System.out.println("Busca por posição: " + listaEncadeada.buscarElementoPorPosicao(3)); // Retorna 6
        System.out.println("Busca por elemento: " + listaEncadeada.buscarElemento(2)); // Retorna 1

        listaEncadeada.limparLista();

        System.out.println(listaEncadeada);

    }

}
