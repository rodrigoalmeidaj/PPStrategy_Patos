package br.edu.iftm.strategy.classes.exemplosdepatos;

import br.edu.iftm.strategy.classes.exemplosdecomportamentos.DontSwim;
import br.edu.iftm.strategy.classes.exemplosdecomportamentos.FakeQuack;
import br.edu.iftm.strategy.classes.exemplosdecomportamentos.FlyFoguete;

public class PatoModel extends Pato {

    public PatoModel(){
        setComportamentoFly(new FlyFoguete());
        setComportamentoQuack(new FakeQuack());
        setComportamentoSwim(new DontSwim());
    }
    
    @Override
    public void exibir() {
        System.out.println("Eu sou um PatoModel");
    }
    
}
