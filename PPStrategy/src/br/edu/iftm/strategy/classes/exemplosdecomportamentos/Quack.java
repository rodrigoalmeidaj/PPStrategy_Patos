package br.edu.iftm.strategy.classes.exemplosdecomportamentos;

import br.edu.iftm.strategy.interfaces.ComportamentoQuack;

public class Quack implements ComportamentoQuack{

    @Override
    public void quack() {
        System.out.println("Eu falo Quack");
        
    }
    
}
