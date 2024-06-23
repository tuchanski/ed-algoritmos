package vetor;

public class Vetor {

    private Integer[] elementos;
    private int tamanhoReal;

    public Vetor(int capacidade) {
        this.elementos = new Integer[capacidade];
        this.tamanhoReal = 0;
    }

    // Por questões de eficiência, não é interessante iterar sobre cada elemento e
    // verificar se está NULL.
    // Portanto, utiliza-se uma variável para guardar o tamanho real do vetor.
    public void adicionarElemento(int elemento) throws Exception {

        if (this.tamanhoReal < this.elementos.length) {
            this.elementos[this.tamanhoReal] = elemento;
            // System.out.printf("Elemento %d inserido com sucesso.\n", this.tamanhoReal);
            this.tamanhoReal += 1;
        } else {
            throw new Exception("Erro: Vetor cheio.");
        }

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