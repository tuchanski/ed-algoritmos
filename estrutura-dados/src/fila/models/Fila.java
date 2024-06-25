package fila.models;

import base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileiraElemento(T elemento) throws Exception {
        super.adicionarElemento(elemento);
    }

    public T espiarElemento() {
        if (!estaVazia()) {
            return this.elementos[0];
        }
        return null;
    }

    public T desenfileirarElemento() {

        if (!estaVazia()) {

            T primeiro = this.elementos[0];

            for (int i = 0; i < this.tamanhoReal; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }

            tamanhoReal -= 1;

            return primeiro;

        }

        return null;

    }

}
