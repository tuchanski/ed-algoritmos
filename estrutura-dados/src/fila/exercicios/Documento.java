package fila.exercicios;

public class Documento {

    private String nome;
    private Integer quantidadeFolhas;

    public Documento() {
    }

    public Documento(String nome, Integer quantidadeFolhas) {
        this.nome = nome;
        this.quantidadeFolhas = quantidadeFolhas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeFolhas() {
        return quantidadeFolhas;
    }

    public void setQuantidadeFolhas(Integer quantidadeFolhas) {
        this.quantidadeFolhas = quantidadeFolhas;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Documento other = (Documento) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (quantidadeFolhas == null) {
            if (other.quantidadeFolhas != null)
                return false;
        } else if (!quantidadeFolhas.equals(other.quantidadeFolhas))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Documento [nome=" + nome + ", quantidadeDeFolhas=" + quantidadeFolhas + "]";
    }

}
