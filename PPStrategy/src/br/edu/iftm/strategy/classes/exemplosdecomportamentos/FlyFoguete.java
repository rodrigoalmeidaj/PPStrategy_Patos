package br.edu.iftm.strategy.classes.exemplosdecomportamentos;

import br.edu.iftm.strategy.interfaces.ComportamentoVoo;

public class FlyFoguete implements ComportamentoVoo {

    @Override
    public void fly() {
        System.out.println("Voando como um foguete!!!");
        
    }
    
}
