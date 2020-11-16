/*
 1.	Fazer um programa que leia e armazene as notas de 20 
alunos em um vetor notas (notas no intervalo de 0 a 100)
. Em seguida, calcule e escreva a quantidade 
de notas em cada um dos intervalos: 
00 – 09 : __ 
10 – 19 : __ 
: 
. 
90 – 99 : __ 100 : __ 
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class Lista_estrutura_de_dados_exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vetor = new int[20];
        int[] vetor_intervalo = new int[11];
        Scanner entrada = new Scanner(System.in);
        int numero = 0;

        for (int i = 0; i < 20; i++) {
            do {
                System.out.print("Por favor insira a nota do aluno " + (i + 1) + ": ");
                numero = entrada.nextInt();
                if (numero < 0 || numero > 100) {
                    System.out.println("por favor insira um numero entre 0 e 100");
                }
            } while (numero < 0 || numero > 100);

            vetor[i] = numero;

        }
        for (int i = 0; i < vetor.length; i++) {
            vetor_intervalo[vetor[i] / 10]++;

//            if (vetor[i] <= 9) {
//                vetor_intervalo[0]++;
//            }else if (vetor[i]<=19){
//                vetor_intervalo[1]++;
//            }else if (vetor[i]<=29){
//                vetor_intervalo[2]++;
//            }else if (vetor[i]<=39){
//                vetor_intervalo[3]++;
//            }else if (vetor[i]<=49){
//                vetor_intervalo[4]++;
//            }else if (vetor[i]<=59){
//                vetor_intervalo[5]++;
//            }else if (vetor[i]<=69){
//                vetor_intervalo[6]++;
//            }else if (vetor[i]<=79){
//                vetor_intervalo[7]++;
//            }else if (vetor[i]<=89){
//                vetor_intervalo[8]++;
//            }else if (vetor[i]<=99){
//                vetor_intervalo[9]++;
//            }else{
//                vetor_intervalo[10]++;
//            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("notas de " + i + " a "  + (i + 9) + " : " +vetor_intervalo[i]);
        }
//        System.out.println("notas de 0 a 9 : " + vetor_intervalo[0]);
//        System.out.println("notas de 10 a 19 : " + vetor_intervalo[1]);
//        System.out.println("notas de 20 a 29 : " + vetor_intervalo[2]);
//        System.out.println("notas de 30 a 39 : " + vetor_intervalo[3]);
//        System.out.println("notas de 40 a 49 : " + vetor_intervalo[4]);
//        System.out.println("notas de 50 a 59 : " + vetor_intervalo[5]);
//        System.out.println("notas de 60 a 69 : " + vetor_intervalo[6]);
//        System.out.println("notas de 70 a 79 : " + vetor_intervalo[7]);
//        System.out.println("notas de 80 a 89 : " + vetor_intervalo[8]);
//        System.out.println("notas de 90 a 99 : " + vetor_intervalo[9]);
        System.out.println("notas 100 : " + vetor_intervalo[10]);

    }

}
