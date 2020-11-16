/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porjetoadapter;

/**
 *
 * @author Computador
 */
public class NotaFiscal {
    
  //atributos 
  private String dados = "";
     
    
    
  //construtores    
   public NotaFiscal(String dados){
       this.dados = dados;
       
   }
   public String getDados(){
       return dados;
       
   }
}
