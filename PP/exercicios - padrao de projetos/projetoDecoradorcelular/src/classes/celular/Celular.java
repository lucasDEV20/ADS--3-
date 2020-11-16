/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.celular;

/**
 *
 * @author Computador
 */
public abstract class Celular {
   String descrisao = "celular";
   
   public String getDescricao(){
       return descrisao;
   }
   
   public abstract double preco();
       
   
}
