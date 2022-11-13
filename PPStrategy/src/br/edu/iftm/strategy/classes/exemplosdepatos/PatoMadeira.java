package br.edu.iftm.strategy.classes.exemplosdepatos;

import br.edu.iftm.strategy.classes.exemplosdecomportamentos.Boiar;
import br.edu.iftm.strategy.classes.exemplosdecomportamentos.DontQuack;
import br.edu.iftm.strategy.classes.exemplosdecomportamentos.NaoFlyDeJeitoNenhum;

public class PatoMadeira extends Pato{

    

    public PatoMadeira() {
        setComportamentoFly(new NaoFlyDeJeitoNenhum());
        setComportamentoQuack(new DontQuack());
        setComportamentoSwim(new Boiar());
    }

    @Override
    public void exibir() {
        System.out.println("Eu sou um pato de Madeira");
    }

}
