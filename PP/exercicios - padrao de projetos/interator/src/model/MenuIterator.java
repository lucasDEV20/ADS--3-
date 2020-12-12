/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Computador
 */
class MenuItem {

    String nome;

    MenuItem(String nome) {
        this.nome = nome;
    }

}

interface Iterator {

    boolean hasNext();

    Object next();
}

public class MenuIterator implements Iterator {

    MenuItem[] itens;
    int posicao = 0;

    public MenuIterator(MenuItem[] itens) {
        this.itens = itens;
    }

    public MenuIterator(java.awt.MenuItem[] menuItens) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object next() {
        MenuItem menuItem = itens[posicao];
        posicao++;
        return menuItem;
    }

    public boolean hasNext() {
        if (posicao >= itens.length || itens[posicao] == null) {
            

            return false;
        } else {
            return true;
        }
    }

}
