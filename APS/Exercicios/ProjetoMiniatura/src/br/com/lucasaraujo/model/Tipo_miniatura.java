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
public class Tipo_miniatura {
    private int tm_iden;
    private String tm_tipo;
    
    public Tipo_miniatura(){
        
    }

    public Tipo_miniatura(int tm_iden, String tm_tipo) {
        this.tm_iden = tm_iden;
        this.tm_tipo = tm_tipo;
    }

    public int getTm_iden() {
        return tm_iden;
    }

    public void setTm_iden(int tm_iden) {
        this.tm_iden = tm_iden;
    }

    public String getTm_tipo() {
        return tm_tipo;
    }

    public void setTm_tipo(String tm_tipo) {
        this.tm_tipo = tm_tipo;
    }
    
}
