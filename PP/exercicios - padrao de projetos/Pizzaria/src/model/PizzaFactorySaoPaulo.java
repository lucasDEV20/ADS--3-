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
public class PizzaFactorySaoPaulo extends PizzaFactory {

    @Override
    public void criarPizza( String tipo ){

        if( tipo.equals( "queijo" ) ){

            pizza = new SPPizzaQuatroQueijos();
        }
        else if( tipo.equals( "portuguesa" ) ){

            pizza = new SPPizzaPortuguesa();
        }
        else if( tipo.equals( "calabresa" ) ){

            pizza = new SPPizzaCalabresa();
        }
    }
}
