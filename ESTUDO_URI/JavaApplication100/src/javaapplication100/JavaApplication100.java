/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication100;

/**
 *
 * @author Computador
 */
public class JavaApplication100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        imprimir(9);
        
        
    }
    public static void imprimir(int n ){
        
        if(n>=0){
            System.out.print(n+" ");
            imprimir(n-2);
        }
    }
    
}
