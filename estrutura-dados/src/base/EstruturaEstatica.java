package base;

public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanhoReal;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanhoReal = 0;
    }

    public EstruturaEstatica() {
        this(10);
    }

    protected void aumentarCapacidade() {

        if (this.tamanhoReal == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }

    }

    protected void adicionarElemento(T elemento) throws Exception {
        aumentarCapacidade();
        if (this.tamanhoReal < this.elementos.length) {
            this.elementos[this.tamanhoReal] = elemento;
            this.tamanhoReal += 1;
        } else {
            throw new Exception("Erro: Vetor cheio.");
        }

    }

    protected void adicionarElementoEmPosicao(T elemento, int posicao) {
        aumentarCapacidade();
        if (!(posicao >= 0 && posicao < this.tamanhoReal)) {
            throw new IllegalArgumentException("Erro: Índice inexistente.");
        }

        for (int i = this.tamanhoReal - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanhoReal += 1;

    }

    protected void removerElementoPorPosicao(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanhoReal)) {
            throw new IllegalArgumentException("Erro: Índice inexistente.");
        }
        for (int i = posicao; i < this.tamanhoReal - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanhoReal -= 1;
    }

    public int getTamanhoReal() {
        return this.tamanhoReal;
    }

    public Boolean estaVazia() {
        if (this.tamanhoReal != 0) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {

        StringBuilder strb = new StringBuilder();

        strb.append("[");

        for (int i = 0; i < this.tamanhoReal - 1; i++) {
            strb.append(this.elementos[i]);
            strb.append(", ");
        }

        if (this.tamanhoReal > 0) {
            strb.append(this.elementos[this.tamanhoReal - 1]);
        }

        strb.append("]");

        return strb.toString();
    }

}