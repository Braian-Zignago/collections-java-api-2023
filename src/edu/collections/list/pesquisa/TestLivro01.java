package edu.collections.list.pesquisa;

public class TestLivro01 {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Como correr melhor", "Pedro Navaja", 2019);
        System.out.println(catalogoLivros.pesquisaAutor("Pedro Navaja"));
    }
}
