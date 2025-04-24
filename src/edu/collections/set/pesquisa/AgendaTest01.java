package edu.collections.set.pesquisa;

public class AgendaTest01 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.addCtt("Braian Zignago", 111111);
        agenda.addCtt("Vitoria Gomes", 2222222);
        agenda.addCtt("Braian", 333333);
        agenda.addCtt("Braian Dio", 444444);
        agenda.exibirCtt();
        System.out.println(agenda.pesquisarNome("Braian"));
        System.out.println(agenda.atualizarCtt("braian", 98989898));

    }
}
