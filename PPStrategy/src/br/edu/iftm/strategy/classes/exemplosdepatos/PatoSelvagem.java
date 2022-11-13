package br.edu.iftm.strategy.classes.exemplosdepatos;

import br.edu.iftm.strategy.classes.exemplosdecomportamentos.FlyComAsas;
import br.edu.iftm.strategy.classes.exemplosdecomportamentos.NadoCrawl;
import br.edu.iftm.strategy.classes.exemplosdecomportamentos.Quack;

public class PatoSelvagem extends Pato{

    //Esse pato da sala de aula seria o seu pato mallard, mas na hora fiz diferente.

    public PatoSelvagem() {
        setComportamentoFly(new FlyComAsas());
        setComportamentoQuack(new Quack());
        setComportamentoSwim(new NadoCrawl());
    }

    @Override
    public void exibir() {
        System.out.println("Eu sou o verdadeiro Pato Mallard");
    }
    
}
