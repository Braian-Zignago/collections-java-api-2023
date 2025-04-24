package edu.collections.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void addConivado(String nome, int codConvite){
        convidadoSet.add(new Convidado(nome, codConvite));
    }

    public void rmCovidadePorConvite(int codConvite){
        int aux = 0;
        for (Convidado c : this.convidadoSet) {
            if (c.getCodigoCovite() == codConvite){
                this.convidadoSet.remove(c);
                aux++;
                break;
            }
        }
        if (aux == 0) System.out.println("Convidado não existe!!!}");

    }

    public int contarCovidados(){
        return this.convidadoSet.size();
    }

    public void exibirCovnidados(){
        System.out.println(this.convidadoSet);
    }
}
