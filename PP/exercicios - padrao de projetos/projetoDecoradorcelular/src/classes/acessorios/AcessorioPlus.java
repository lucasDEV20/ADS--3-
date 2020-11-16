/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.acessorios;

import classes.celular.Celular;


/**
 *
 * @author Computador
 */
//a classe concreta foi extendida de acessrio
public class AcessorioPlus extends Acessorio {
    private Celular smartphone;
    
    public AcessorioPlus(Celular smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public String getDescricao() {
        return smartphone.getDescricao()+ ", Acessorio Plus";
    }

    @Override
    public double preco() {
          return 400 + smartphone.preco();
    }
 
}
