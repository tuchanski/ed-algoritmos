package models;

public class Vetor {

    private Integer[] elementos;
    private int tamanhoReal;

    public Vetor(int capacidade) {
        this.elementos = new Integer[capacidade];
        this.tamanhoReal = 0;
    }

    private void aumentarCapacidade() {

        if (this.tamanhoReal == this.elementos.length) {
            Integer[] elementosNovos = new Integer[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }

    }

    // Por questões de eficiência, não é interessante iterar sobre cada elemento e
    // verificar se está NULL.
    // Portanto, utiliza-se uma variável para guardar o tamanho real do vetor.
    public void adicionarElemento(int elemento) throws Exception {
        aumentarCapacidade();
        if (this.tamanhoReal < this.elementos.length) {
            this.elementos[this.tamanhoReal] = elemento;
            // System.out.printf("Elemento %d inserido com sucesso.\n", this.tamanhoReal);
            this.tamanhoReal += 1;
        } else {
            throw new Exception("Erro: Vetor cheio.");
        }

    }

    public Integer buscarPorPosicao(int posicao) {

        if (posicao >= 0 && posicao < this.tamanhoReal) {
            return this.elementos[posicao];
        } else {
            throw new IllegalArgumentException("Erro: Índice inexistente.");
        }

    }

    public int buscarPorElemento(int elemento) {

        // Busca sequencial
        for (int i = 0; i < this.tamanhoReal; i++) {
            if (this.elementos[i] == elemento) {
                return i;
            }
        }
        return -1; // Posição inexistente

    }

    public void adicionarElementoEmPosicao(int elemento, int posicao) {
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

    public void removerElementoPorPosicao(int posicao) {
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