/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication82;

import sun.applet.Main;

/**
 *
 * @author Computador
 */
public class ex1 {

    /**
     * @param args the command line arguments
     */
    public static removerIntenDaPilha (int[] pilha , int numeroDadoPelaPilha) {
        //variaveis #inteira#
        
        int topo = pilha.length - 1 ;
        //variavel que vai determinar a posiçao da pilha
        int[] pilhaAuxiliar = new int [pilha.length];
        //variavel auxiliar que vai percorrer a pilha [pilhaAuxiliar]
        boolean PilhaQueEstaVazia = pilha[topo] == -1;
        //variavel que vai validar se a plha esta vazia ou nao
        if (PilhaQueEstaVazia) {
            
            throw new RuntimeException("----Pilha vazia---");
            
        }
        for (int i = 0; i<= topo; i++) {
            //contado de posiçoes 
           if (numeroDadoPelaPilha != pilha[i]) {
                pilhaAuxiliar[i] = pilha[i];
            }
        }
        imprimirPilha(pilhaAuxiliar);
        return pilha[topo];
        
        
    }
     public static void imprimirPilha(int[] pilha) {
        int topo = pilha.length - 1;
        for (int i = 0; i <= topo; i++) {
            System.out.println(pilha[i]);
        }
    }
  
}

    
