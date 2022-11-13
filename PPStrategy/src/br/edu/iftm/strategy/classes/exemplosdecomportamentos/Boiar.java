package br.edu.iftm.strategy.classes.exemplosdecomportamentos;

import br.edu.iftm.strategy.interfaces.ComportamentoSwim;

public class Boiar implements ComportamentoSwim {

    @Override
    public void swim() {
        System.out.println("Eu estou boiando");
    }
    
}
