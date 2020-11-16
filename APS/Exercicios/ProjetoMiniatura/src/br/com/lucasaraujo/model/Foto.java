/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucasaraujo.model;

/**
 *
 * @lucas araujo 
 */
public class Foto {
   //atributos 
   //atributos do tipo inteiro 
    private int fot_iden;
   //atributos do tipo String 
   private String fot_caminho;
   private String fot_descricao;
   //atributos do tipo Miniatura 
   
   
   
   private Miniatura miniatura;
   
   
   public Foto(){
       
   }

    public Foto(int fot_iden, String fot_caminho, String fot_descricao, Miniatura miniatura) {
        this.fot_iden = fot_iden;
        this.fot_caminho = fot_caminho;
        this.fot_descricao = fot_descricao;
        this.miniatura = miniatura;
    }

    public int getFot_iden() {
        return fot_iden;
    }

    public void setFot_iden(int fot_iden) {
        this.fot_iden = fot_iden;
    }

    public String getFot_caminho() {
        return fot_caminho;
    }

    public void setFot_caminho(String fot_caminho) {
        this.fot_caminho = fot_caminho;
    }

    public String getFot_descricao() {
        return fot_descricao;
    }

    public void setFot_descricao(String fot_descricao) {
        this.fot_descricao = fot_descricao;
    }

    public Miniatura getMiniatura() {
        return miniatura;
    }

    public void setMiniatura(Miniatura miniatura) {
        this.miniatura = miniatura;
    }
   
}
