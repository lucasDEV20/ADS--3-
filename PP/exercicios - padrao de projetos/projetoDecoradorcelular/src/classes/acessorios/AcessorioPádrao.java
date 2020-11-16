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
public class AcessorioPádrao extends Acessorio {

    private Celular smartphone;

    public AcessorioPádrao(Celular smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public String getDescricao() {
        return smartphone.getDescricao() + "Acessorios Padroes";
    }

    @Override
    public double preco() {
        return 200 + smartphone.preco();
    }

}
