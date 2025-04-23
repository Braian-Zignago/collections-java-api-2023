package edu.collections.list.ej_tarefas;

public class TestTarefa01 {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("Limpar a cozinha.");
        listaTarefa.adicionarTarefa("Dar banho no cachorro.");
        listaTarefa.adicionarTarefa("Arrumar a cama.");
        listaTarefa.adicionarTarefa("Comer.");
        for (String s : listaTarefa.obterDescricoesTarefa()) {
            System.out.println("# " + s);
        }

        listaTarefa.removerTarefa("LIMPAR A COZINHA.");
        System.out.println("Voce ainda tem " + listaTarefa.obterNumeroTotalDeTarefas() + " a fazer.");
    }
}
