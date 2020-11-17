/*
1.Utilizando as operações de manipulação de pilhas vistas em sala, 
uma pilha auxiliar e uma variável do tipo int, escreva um procedimento 
que remove um número inteiro dado de uma posição qualquer de uma pilha. 
Note que você não tem acesso à estrutura interna da pilha, 
apenas às operações de manipulação. 
 */
package Eex1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class ex1Main {

    public static void main(String[] args) {
        pilha_Ex01 pilha = new pilha_Ex01();
        int i = 10;
        Random rd = new Random();
        Scanner escreva = new Scanner(System.in);
        while (!pilha.estaVazia()) {
            int AUXN = rd.nextInt(100);
            pilha.inserir(rd.nextInt(AUXN));
            System.out.println(AUXN);
        }
        
       
        System.out.println("\n\nto aparecendoo kkk");
        int nRetirar;
        nRetirar = escreva.nextInt();
        retiraElemento(nRetirar, pilha);

    }

    public static void retiraElemento(int e, pilha_Ex01 pilha) {
        pilha_Ex01 pAux = new pilha_Ex01(pilha.quantidadeElementos());
        while (e != pilha.consultar()
                && !pilha.estaVazia()) {
            pAux.inserir(pilha.consultar());
            pilha.retirar();

        }
        System.out.println("teste 1");
        if (!pilha.estaVazia()) {
           pilha.retirar(); 
        }
        System.out.println("teste 2");
        while (!pAux.estaVazia()) {
            pilha.inserir(pAux.consultar());
            pilha.retirar();
        }
        System.out.println("teste 3");
    }
   
}
