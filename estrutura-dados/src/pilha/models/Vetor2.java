package pilha.models;

import base.EstruturaEstatica;

public class Vetor2<T> extends EstruturaEstatica<T> {

    public Vetor2() {
        super();
    }

    public Vetor2(int capacidade) {
        super(capacidade);
    }

    public void adicionarElemento(T elemento) throws Exception {
        super.adicionarElemento(elemento);
    }

    public void adicionarElementoEmPosicao(T elemento, int posicao) {
        super.adicionarElementoEmPosicao(elemento, posicao);
    }

    public void removerElementoPorPosicao(int posicao) {
        super.removerElementoPorPosicao(posicao);
    }

}
