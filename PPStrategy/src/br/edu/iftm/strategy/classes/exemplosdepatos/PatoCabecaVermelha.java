package br.edu.iftm.strategy.classes.exemplosdepatos;

import br.edu.iftm.strategy.classes.exemplosdecomportamentos.FlyComAsas;
import br.edu.iftm.strategy.classes.exemplosdecomportamentos.NadoCachorrinho;
import br.edu.iftm.strategy.classes.exemplosdecomportamentos.Quack;

public class PatoCabecaVermelha extends Pato{

    

    public PatoCabecaVermelha() {
        setComportamentoFly(new FlyComAsas());
        setComportamentoQuack(new Quack());
        setComportamentoSwim(new NadoCachorrinho());
    }

    @Override
    public void exibir() {
        System.out.println("Sou um Pato da Cabeça Vermelha");
        
    }

    
}
