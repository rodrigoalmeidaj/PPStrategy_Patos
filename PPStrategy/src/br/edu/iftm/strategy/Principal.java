package br.edu.iftm.strategy;

import br.edu.iftm.strategy.classes.exemplosdepatos.PatoBorracha;
import br.edu.iftm.strategy.classes.exemplosdepatos.PatoCabecaVermelha;
import br.edu.iftm.strategy.classes.exemplosdepatos.PatoMadeira;
import br.edu.iftm.strategy.classes.exemplosdepatos.PatoModel;
import br.edu.iftm.strategy.classes.exemplosdepatos.PatoSelvagem;

public class Principal {
    public static void main(String[] args) throws Exception {
        PatoSelvagem selvagem = new PatoSelvagem();
        PatoCabecaVermelha cabecaVermelha = new PatoCabecaVermelha();
        PatoMadeira madeira = new PatoMadeira();
        PatoBorracha borracha = new PatoBorracha();
        PatoModel patoModel = new PatoModel();
        

        selvagem.exibir();
        selvagem.performanceFly();
        selvagem.performanceQuack();
        // selvagem.nadar(); método retirado após a criação do comportamento nadar
        System.out.println();

        cabecaVermelha.exibir();
        // cabecaVermelha.nadar();
        System.out.println();

        madeira.exibir();
        // madeira.nadar();
        System.out.println();

        borracha.exibir();
        // borracha.nadar();
        System.out.println();

        System.out.println("----- IMPLEMENTAÇÃO QUESTÃO 6 ----");
        System.out.println();
        patoModel.exibir();
        patoModel.performanceFly();
        patoModel.performanceQuack();
        patoModel.performanceSwim();
        
    }
}
