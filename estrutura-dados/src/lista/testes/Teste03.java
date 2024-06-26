package lista.testes;

import lista.models.ListaEncadeada;

public class Teste03 {

    public static void main(String[] args) {

        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<Integer>();

        listaEncadeada.adicionaElemento(1);
        listaEncadeada.adicionaElemento(2);
        listaEncadeada.adicionaElemento(3);
        listaEncadeada.adicionaElemento(6);
        listaEncadeada.adicionaElemento(9);

        System.out.println(listaEncadeada);

        listaEncadeada.adicionaElementoEmPosicao(0, 13);
        listaEncadeada.adicionaElementoEmPosicao(4, 7);


        System.out.println(listaEncadeada);

    }

}
