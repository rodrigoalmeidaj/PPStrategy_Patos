package br.edu.iftm.strategy.classes.exemplosdecomportamentos;

import br.edu.iftm.strategy.interfaces.ComportamentoSwim;

public class NadoCrawl implements ComportamentoSwim {

    @Override
    public void swim() {
        System.out.println("Sim, Sou um Pato que Nada Crawl nas olimpíadas dos patos");
    }
    
}
