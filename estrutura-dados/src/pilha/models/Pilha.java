package pilha.models;

import base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha(){
        super();
    }

    public Pilha(int capacidade){
        super(capacidade);
    }

    public void empilhaElemento(T elemento) throws Exception {
        super.adicionarElemento(elemento);
    }
    
}
