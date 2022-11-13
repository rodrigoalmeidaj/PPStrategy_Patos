package br.edu.iftm.strategy.classes.exemplosdecomportamentos;

import br.edu.iftm.strategy.interfaces.ComportamentoQuack;

public class Squeack  implements ComportamentoQuack{

    @Override
    public void quack() {
        System.out.println("Squeack!!");
        
    }
    
}
