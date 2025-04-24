package edu.collections.list.operacoesBasicas.carrinhocompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    List<Produto> carrinho;

    public CarrinhoCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int qtd) {
        this.carrinho.add(new Produto(nome, preco, qtd));
    }

    public void removerItem(String nome) {
        List<Produto> itemRemover = new ArrayList<>();
        for (Produto produto : this.carrinho) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                itemRemover.add(produto);
            }
        }
        carrinho.removeAll(itemRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Produto produto : this.carrinho) {
            double valorProduto = produto.getPreco();
            int qtd = produto.getQtd();
            valorTotal += valorProduto * qtd;
        }
        return valorTotal;
    }

    public void exibirItens() {
        for (Produto produto : this.carrinho) {
            System.out.println("# " + produto.getNome() + ": " + produto.getQtd() + " unidades, $" + produto.getPreco()+ " c/u");
        }

    }
}
