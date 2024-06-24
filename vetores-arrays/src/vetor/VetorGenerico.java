package vetor;

public class VetorGenerico<T> {

    private T[] elementos;
    private int tamanhoReal;

    public VetorGenerico(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanhoReal = 0;
    }

    private void aumentarCapacidade() {

        if (this.tamanhoReal == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }

    }

    public Boolean contemElemento(T elemento) {

        for (T elementoContido : this.elementos) {
            if (elementoContido.equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public int ultimoIndice(T elemento) {

        int indice = -1;
        for (int i = 0; i < this.tamanhoReal; i++) {

            if (this.elementos[i].equals(elemento)) {
                indice = i;
            }

        }

        return indice;
    }

    public void adicionarElemento(T elemento) throws Exception {
        aumentarCapacidade();
        if (this.tamanhoReal < this.elementos.length) {
            this.elementos[this.tamanhoReal] = elemento;
            this.tamanhoReal += 1;
        } else {
            throw new Exception("Erro: Vetor cheio.");
        }

    }

    public T buscarPorPosicao(int posicao) {

        if (posicao >= 0 && posicao < this.tamanhoReal) {
            return this.elementos[posicao];
        } else {
            throw new IllegalArgumentException("Erro: Índice inexistente.");
        }

    }

    public int buscarPorElemento(T elemento) {

        for (int i = 0; i < this.tamanhoReal; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void adicionarElementoEmPosicao(T elemento, int posicao) {
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

    public void removerElemento(T elemento) {

        int indice = buscarPorElemento(elemento);

        if (indice == -1) {
            throw new IllegalArgumentException("Erro: Elemento inexistente no vetor.");
        } else {
            for (int i = indice; i < this.tamanhoReal - 1; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }
            this.tamanhoReal -= 1;
        }
    }

    public int getTamanhoReal() {
        return this.tamanhoReal;
    }

    public T obtem(int posicao) {

        if (!(posicao >= 0 && posicao < this.tamanhoReal)) {
            throw new IllegalArgumentException("Erro: Índice inexistente.");
        }

        T elemento;
        elemento = this.elementos[posicao];
        return elemento;

    }

    public void limpar() {

        T[] listaLimpa = (T[]) new Object[this.elementos.length]; // Preserva capacidade
        this.elementos = listaLimpa;
        this.tamanhoReal = 0;

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