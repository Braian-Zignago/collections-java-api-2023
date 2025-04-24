package edu.collections.set.operacoesBasicas;

public class Convidado {
    private String nome;
    private  int codigoCovite;

    public Convidado(String nome, int codigoCovite) {
        this.nome = nome;
        this.codigoCovite = codigoCovite;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", codigoCovite=" + codigoCovite +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoCovite() {
        return codigoCovite;
    }
}
