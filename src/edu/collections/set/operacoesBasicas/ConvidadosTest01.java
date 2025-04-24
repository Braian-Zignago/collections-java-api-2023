package edu.collections.set.operacoesBasicas;

public class ConvidadosTest01 {
    public static void main(String[] args) {
        ConjuntoConvidados cnv = new ConjuntoConvidados();
        cnv.addConivado("Braian" , 1);
        cnv.addConivado("Rafael" , 2);
        cnv.addConivado("Vitoria" , 3);
        cnv.exibirCovnidados();
        System.out.println(cnv.contarCovidados());
        cnv.rmCovidadePorConvite(2);
        cnv.exibirCovnidados();

    }
}
