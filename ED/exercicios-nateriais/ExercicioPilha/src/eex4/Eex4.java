/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eex4;

import java.util.Stack;

/**
 *
 * @author Computador
 */
public class Eex4 {
    
    public static void verificarNumeroPalindro(Integer verificar) {
        Stack pilhaNova = new Stack();
        Stack pilhaVelha = new Stack();
        int result = 0;
        char[] vetorPo = verificar.toString().toCharArray();

        if (verificar <= 0) {
            throw new RuntimeException("O numero dever ser maior que zero");
        }
        for (int i = 0; i < vetorPo.length; i++) {
            pilhaVelha.push(Integer.parseInt(vetorPo[i] + ""));
        }
        for (int i = 0; i < vetorPo.length; i++) {
            pilhaNova.push(verificar % 10);
            result = verificar / 10;
            verificar = result;
            pilhaNova.push(result % 10);
        }
        System.out.println(pilhaVelha.get(0) == pilhaNova.get(0) && pilhaVelha.get(1) == pilhaNova.get(1));
    }
      
          
    }

