package br.edu.iftm.strategy.classes.exemplosdepatos;

import br.edu.iftm.strategy.classes.exemplosdecomportamentos.Boiar;
import br.edu.iftm.strategy.classes.exemplosdecomportamentos.NaoFlyDeJeitoNenhum;
import br.edu.iftm.strategy.classes.exemplosdecomportamentos.Squeack;

public class PatoBorracha extends Pato {

    public PatoBorracha(){
        setComportamentoFly(new NaoFlyDeJeitoNenhum());
        setComportamentoQuack(new Squeack());
        setComportamentoSwim(new Boiar());
    }
    @Override
    public void exibir() {
        System.out.println("Eu sou um pato de Borracha");
        
    }
    
}
