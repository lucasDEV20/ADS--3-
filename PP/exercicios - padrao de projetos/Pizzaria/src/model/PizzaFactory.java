/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Computador
 */
public abstract class PizzaFactory {

    protected Pizza pizza;
    
    public abstract void criarPizza( String tipo );

    public Pizza delivery(){

        return pizza;
    }
}
