package edu.collections.list.carrinhocompras;

public class TestCarrinho01 {
    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.adicionarItem("Coca-Cola", 6.34, 2);
        carrinhoCompras.exibirItens();
        System.out.println("Valor total do carrinho: $" + carrinhoCompras.calcularValorTotal());
        System.out.println("---------------");
        carrinhoCompras.adicionarItem("Pepsi", 3.56, 3);
        carrinhoCompras.exibirItens();
        System.out.println("Valor total do carrinho: $" + carrinhoCompras.calcularValorTotal());
        System.out.println("---------------");
        carrinhoCompras.removerItem("coca-cola");
        carrinhoCompras.exibirItens();
        System.out.println("Valor total do carrinho: $" + carrinhoCompras.calcularValorTotal());
        System.out.println("---------------");

    }
}
