package edu.collections.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class Agenda {
    private Set<Contato> agenda;

    public Agenda() {
        this.agenda = new HashSet<>();
    }

    public void addCtt(String nome, int numero){
        this.agenda.add(new Contato(nome, numero));
    }

    public void exibirCtt(){
        System.out.println(this.agenda);
    }

    public Set<Contato> pesquisarNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : this.agenda) {
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarCtt(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : this.agenda) {
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }

        }
        return contatoAtualizado;
    }
}
