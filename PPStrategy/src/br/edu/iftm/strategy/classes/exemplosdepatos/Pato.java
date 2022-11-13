package br.edu.iftm.strategy.classes.exemplosdepatos;

import br.edu.iftm.strategy.interfaces.ComportamentoQuack;
import br.edu.iftm.strategy.interfaces.ComportamentoSwim;
import br.edu.iftm.strategy.interfaces.ComportamentoVoo;

public abstract class Pato {
    
    ComportamentoQuack comportamentoQuack;
    ComportamentoVoo comportamentoFly;
    ComportamentoSwim comportamentoSwim;

    public Pato() {}

    public void setComportamentoQuack(ComportamentoQuack comportamentoQuack) {
        this.comportamentoQuack = comportamentoQuack;
    }

    public void setComportamentoFly(ComportamentoVoo comportamentoFly) {
        this.comportamentoFly = comportamentoFly;
    }

    public void setComportamentoSwim(ComportamentoSwim comportamentoSwim) {
        this.comportamentoSwim = comportamentoSwim;
    }

    public void performanceQuack(){
        this.comportamentoQuack.quack();
    }

    public void performanceFly(){
        this.comportamentoFly.fly();
    }

    public void performanceSwim(){
        this.comportamentoSwim.swim();
    }

    
    public abstract void exibir();

    
    //método retirado após a criação do comportamento nadar
    // public void nadar(){
    //     System.out.println("Todos os patos usam Surf!!");
    // };

}
