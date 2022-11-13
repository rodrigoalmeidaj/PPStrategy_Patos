package br.edu.iftm.strategy.classes.exemplosdecomportamentos;

import br.edu.iftm.strategy.interfaces.ComportamentoSwim;

public class DontSwim  implements ComportamentoSwim{

    @Override
    public void swim() {
        System.out.println("Não sei nadar, ~~AFUNDEI");
        
    }
    
}
