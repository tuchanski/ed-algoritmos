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

    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + "]";
    }

}
