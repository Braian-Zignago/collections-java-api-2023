package edu.collections.list.oredenacao;

public class TestOrdenacao01 {
    public static void main(String[] args) {
        OrdenacaoPessoa op = new OrdenacaoPessoa();
        op.adicionarPessoa("Braian", 22, 1.76);
        op.adicionarPessoa("Vitoria", 23, 1.99);
        op.adicionarPessoa("Vitoriasss", 19, 1.90);

        System.out.println(op.ordenadoPorIdade());
        System.out.println(op.ordenarPorAltura());
    }
}
