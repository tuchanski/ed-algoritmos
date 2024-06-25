package fila.models;

public class FilaComPrioridade<T> extends Fila<T> {

    @Override
    public void enfileiraElemento(T elemento) throws Exception {

        aumentarCapacidade();

        Comparable<T> chave = (Comparable<T>) elemento;

        int i;

        for (i = 0; i < this.tamanhoReal; i++) {
            if (chave.compareTo(this.elementos[i]) < 0) {
                break;
            }
        }

        for (int j = this.tamanhoReal - 1; j >= i; j--) {
            this.elementos[j + 1] = this.elementos[j];
        }
        this.elementos[i] = elemento;

        this.tamanhoReal += 1;

    }

}
