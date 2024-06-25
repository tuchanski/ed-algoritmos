package lista.models;

public class ListaEncadeada<T> {

    private No<T> inicio;

    public void adicionaElemento(T elemento){

        No<T> celula = new No<T>(elemento);
        this.inicio = celula;

    }

    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + "]";
    }

    
    
}
