package pilha.models;

import base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilhaElemento(T elemento) throws Exception {
        super.adicionarElemento(elemento);
    }

    public T topoPilha() {

        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[this.tamanhoReal - 1];

    }

    public T desempilhaElemento() {

        if (this.estaVazia()) {
            return null;
        }

        T elemento = this.elementos[this.tamanhoReal - 1];
        this.tamanhoReal -= 1;
        return elemento;

    }

}
