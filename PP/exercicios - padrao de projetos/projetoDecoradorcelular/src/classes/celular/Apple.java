/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.celular;

import classes.celular.Celular;

/**
 *
 * @author Computador
 */
public class Apple extends Celular {

    public Apple() {
        descrisao = " IPhone X";
    }

    @Override
    public double preco() {
        return 7.600;
    }

}
