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
public class FoneSemFio extends Celular {
    public Celular smartphone;
    public FoneSemFio(Celular smartphone) {
        this.smartphone = smartphone;
    }
    @Override
    public String getDescricao(){
        return smartphone.getDescricao() + ", Fone Sem fio";
    }
    
    @Override
    public double preco(){
        return 450 + smartphone.preco();
    }
    
}
