package edu.collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : this.livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }

            }

        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosIntervalosAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : this.livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosIntervalosAnos.add(l);
                }

            }

        }
        return livrosIntervalosAnos;
    }

    public Livro pesquisarTitulo(String titulo){
        Livro livroTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : this.livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroTitulo = l;
                    break;
                }
            }

        }
        return livroTitulo;
    }
}
