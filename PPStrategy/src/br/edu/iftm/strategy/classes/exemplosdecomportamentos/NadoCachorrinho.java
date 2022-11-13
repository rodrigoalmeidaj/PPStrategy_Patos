package br.edu.iftm.strategy.classes.exemplosdecomportamentos;

import br.edu.iftm.strategy.interfaces.ComportamentoSwim;

public class NadoCachorrinho implements ComportamentoSwim{

    @Override
    public void swim() {
        System.out.println("Sim, Sou um Pato que Nada Cachorrinho");
    }
    
}
