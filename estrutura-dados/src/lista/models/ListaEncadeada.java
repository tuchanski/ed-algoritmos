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

    public void adicionaInicio(T elemento) {
        if (this.tamanho == 0) {
            No<T> novoNo = new No<T>(elemento);
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {

            No<T> novoNo = new No<T>(elemento);
            novoNo.setProximo(this.inicio);
            this.inicio = novoNo;

        }
        this.tamanho += 1;
    }

    public void adicionaElementoEmPosicao(int posicao, T elemento) {

        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Erro: Posição inválida.");
        }

        if (posicao == 0) {

            this.adicionaInicio(elemento);

        } else if (posicao == this.tamanho) {

            this.adicionaElemento(elemento);

        } else {

            No<T> noAnterior = this.buscarNoPorPosicao(posicao);
            No<T> proximoNo = noAnterior.getProximo();

            No<T> novoNo = new No<T>(elemento, proximoNo);

            noAnterior.setProximo(novoNo);

            this.tamanho += 1;

        }

    }

    public T removeInicio() {

        if (this.tamanho == 0) {
            throw new RuntimeException("Erro: Lista vazia.");
        } else {
            T removido = this.inicio.getElemento();
            this.inicio = this.inicio.getProximo();
            this.tamanho -= 1;

            if (this.tamanho == 0) {
                this.fim = null;
            }

            return removido;
        }

    }

    public void removeFinal() {
        if (this.tamanho == 0) {
            throw new RuntimeException("Erro: Lista vazia.");
        } else {

            No<T> atual = this.inicio;

            for (int i = 0; i < this.tamanho - 2; i++) {
                atual = atual.getProximo();
            }

            atual.setProximo(null);
            this.fim = atual;

            this.tamanho -= 1;

        }
    }

    public void removePorPosicao(int posicao) {

        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Erro: Posição inválida.");
        }

        if (posicao == 0) {
            this.removeInicio();
        }

        else if (posicao == this.tamanho - 1) {
            this.removeFinal();
        }

        else {
            No<T> noAnterior = this.buscarNoPorPosicao(posicao - 1);
            No<T> atual = noAnterior.getProximo();
            No<T> proximo = atual.getProximo();

            noAnterior.setProximo(proximo);
            atual.setProximo(null);

            tamanho -= 1;
        }

    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void limparLista() {

        for (No<T> atual = inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;

    }

    public No<T> buscarNoPorPosicao(int posicao) {

        if (posicao < 0 || posicao > this.tamanho) {
            return null;
        } else {

            No<T> atual = this.inicio;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.getProximo();
            }

            return atual;

        }

    }

    public T buscarElementoPorPosicao(int posicao) {

        if (posicao < 0 || posicao > this.tamanho) {
            return null;
        } else {

            No<T> atual = this.inicio;
            for (int i = 0; i < posicao; i++) {
                atual = atual.getProximo();
            }

            return atual.getElemento();

        }

    }

    public int buscarElemento(T elemento) {

        No<T> atual = this.inicio;

        for (int i = 0; i < this.tamanho; i++) {

            if (atual.getElemento().equals(elemento)) {
                return i;
            } else {
                atual = atual.getProximo();
            }

        }

        return -1;
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
