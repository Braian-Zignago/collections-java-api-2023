package edu.collections.set.ordenacao;

public class CadastroTest01 {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.addProduto(111111, "AShampo", 9.99, 200);
        cadastroProduto.addProduto(22222, "Sabão", 2.45, 100);
        cadastroProduto.addProduto(33333, "Prato", 6.50, 50);
        System.out.println(cadastroProduto.exibirProdutosPorNome());
        System.out.println(cadastroProduto.exibirProdutosPorPreco());
    }
}
