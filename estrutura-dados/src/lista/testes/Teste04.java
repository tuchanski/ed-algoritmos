package lista.testes;

import lista.models.ListaEncadeada;

public class Teste04 {

    public static void main(String[] args) {

        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<Integer>();

        listaEncadeada.adicionaElemento(1);
        listaEncadeada.adicionaElemento(2);
        listaEncadeada.adicionaElemento(3);

        System.out.println(listaEncadeada);

        listaEncadeada.removeFinal();

        listaEncadeada.adicionaElemento(2);
        listaEncadeada.adicionaElemento(3);
        listaEncadeada.adicionaElemento(2);
        listaEncadeada.adicionaElemento(3);

        listaEncadeada.removePorPosicao(2);

        System.out.println(listaEncadeada);
    }

}
