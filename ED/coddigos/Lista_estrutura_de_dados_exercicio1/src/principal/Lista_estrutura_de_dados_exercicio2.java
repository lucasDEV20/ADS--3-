/*
2.Elabore um programa para armazenar em um vetor V1 
todos os valores inteiros positivos desde 1 até 50.
Em seguida transporte todos os elementos primos do vetor V1
para um vetor V2. Imprima no final os dois vetores. 
 */
package principal;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class Lista_estrutura_de_dados_exercicio2 {

    public static void main(String[] args) {
        //armazenando no vetor v1
        int v1[] = new int[50];
        int v2[] = new int[50];
        int posicao_v2 = 0;
        int quantidade_divisores = 0;
        //preenche o vetor de 1 a 50 
        for (int i = 0; i < 50; i++) {
            v1[i] = i + 1;

        }
        
        
        //procura numero primos no vetor
        for (int i = 0; i < v1.length; i++) {
            //testar se v1[i] e um numero primo
            //Um número é divisível por outro quando o resto da divisão entre os dois é igual a zero
            quantidade_divisores = 0;
            //calcula a quatidade de divisores
            for (int j = 0; j < v1[i]; j++) {
                if (v1[i] % v1[j] == 0) {
                    quantidade_divisores++;
                    //sera divisivel
                }
            }
            if (quantidade_divisores == 2 ){
               //e primo  
               v2[posicao_v2] = v1[i];
               posicao_v2++;
            }
                
            
           

        }
        for (int i = 0; i < 50; i++) {
            System.out.print(v1[i]+" ");
            
        }
        System.out.println();
        for (int i = 0; i < 50; i++) {
            if (v2[i] > 0) {
              System.out.print("v1{");
              System.out.print(v2[i]+" , }");
            }
            
           
            
        }
        
        System.out.println();
    }

}
