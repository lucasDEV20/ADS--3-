/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Computador
 */
public class Janela2 {
    private static Janela2 instancia;
    
    
    
    Janela2(){
        
        
    }
    
    private static synchronized Janela2 getINSTANCIA(){
        if (instancia == null ) {
            instancia = new Janela2();
            
            
        }
        return instancia;
    }
}

