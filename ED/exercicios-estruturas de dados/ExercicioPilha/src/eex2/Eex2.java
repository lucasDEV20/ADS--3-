/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eex2;

import java.util.Stack;

/**
 *
 * @author Computador
 */
public class Eex2 {
       public static void lerNumeroEConverter(int numeroAConverter) {
        Stack pilha = new Stack();
        if (pilha.isEmpty() && numeroAConverter <= 0) {
            System.out.println("A Pilha Esta Vazia!Ateçao o numero precisa ser maior que Zero");
        }
        int binar = (int) pilha.push(numeroAConverter);
        String binstr = Integer.toBinaryString(binar);
        System.out.print("Valor Binario: " + binstr);
        int hex = (int) pilha.push(numeroAConverter);
        String convH = Integer.toHexString((int) pilha.push(numeroAConverter));
        System.out.print(", Hexadecimal: "+convH);
        System.out.printf(", valor Original: %s",pilha.push(numeroAConverter), pilha.push(numeroAConverter));
    }
       public static void main(String[] args) {
           lerNumeroEConverter(0);
    }
}
