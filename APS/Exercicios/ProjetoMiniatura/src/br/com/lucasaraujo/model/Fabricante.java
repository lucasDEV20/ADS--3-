/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucasaraujo.model;

/**
 *
 * @author Computador
 */
public class Fabricante {
    private int fab_iden;
    private String fab_nome;
    
    public Fabricante(){
        
    }

    public Fabricante(int fab_iden, String fab_nome) {
        this.fab_iden = fab_iden;
        this.fab_nome = fab_nome;
    }

    public int getFab_iden() {
        return fab_iden;
    }

    public String getFab_nome() {
        return fab_nome;
    }

    public void setFab_iden(int fab_iden) {
        this.fab_iden = fab_iden;
    }

    public void setFab_nome(String fab_nome) {
        this.fab_nome = fab_nome;
    }
    
    

   
    
    
    
}
