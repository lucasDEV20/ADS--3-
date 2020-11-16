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
public class CarregadorApple extends Celular {
    private Celular smartphone;
    public CarregadorApple(Celular smartphone) {
        this.smartphone = smartphone;
    }
    
    @Override
    public String getDescricao(){
        return smartphone.getDescricao() + " , Carregador Apple";
    }

    @Override
    public double preco() {
         return 480 + smartphone.preco();
         
    }
    

    
}
