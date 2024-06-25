package lista.models;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> fim;
    private int tamanho = 0;

    public void adicionaElemento(T elemento) {

        No<T> celula = new No<T>(elemento);

        if (this.tamanho == 0) {
            this.inicio = celula;
            this.fim = celula;
        } else {
            this.fim.setProximo(celula);
        }

        this.fim = celula;
        this.tamanho += 1;

    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void limparLista(){

        for (No<T> atual = inicio; atual != null;){
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
        
    }

    @Override
    public String toString() {

        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder strb = new StringBuilder("[");

        No<T> atual = this.inicio;

        for (int i = 0; i < this.tamanho - 1; i++) {
            strb.append(atual.getElemento()).append(", ");
            atual = atual.getProximo();
        }

        strb.append(atual.getElemento()).append("]");

        return strb.toString();
    }

}
