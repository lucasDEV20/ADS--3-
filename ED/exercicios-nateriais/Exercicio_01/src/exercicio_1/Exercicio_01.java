/*
1- Escreva um algoritmo que ordena de forma crescente as letras pela frequência de
ocorrência em um texto informado pelo usuário através do teclado. Utilize um dos
métodos de ordenação
 */
package exercicio_1;

import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class Exercicio_01 {

    private static String teste = "";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String teste = "AAAAAAAAAAAAAAAAAAAAbbbbbbbbzzzzdddfdffffggggggg";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a String:");
        teste = entrada.nextLine();
        while (!teste.equalsIgnoreCase("sair")) {
          
            vai();
            System.out.println("Digite a String:");
            teste = entrada.nextLine();
        }
        
        System.out.println("nao aperte f6");
    }

    public static void vai() {

        int freq[] = new int[256];
        for (int i = 0; i < teste.length(); i++) {
            freq[teste.charAt(i)]++;

        }
        int quantidadeDeEelementosDiferentesZero = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                quantidadeDeEelementosDiferentesZero++;
            }
        }
        CharFreq[] vetorObjetos = new CharFreq[quantidadeDeEelementosDiferentesZero];
        int j = 0;
        for (int i = 0; i < freq.length; i++) {

            if (freq[i] > 0) {
                vetorObjetos[j] = new CharFreq(i, (char) i);
                j++;
            }

        }
        ordena(vetorObjetos);
        System.out.println("tchar\tfreq\n");
        for (int i = 0; i < vetorObjetos.length; i++) {

            System.out.println(vetorObjetos[i]);
        }

//        public static  void ordena(CharFreq vet[]){
//            
//        }
    }

    public static void ordena(CharFreq vet[]) {
        CharFreq tmp;
        int qde = vet.length;
        int j;
        for (int gap = qde / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < qde; i++) {
                tmp = vet[i];
                for (j = i; j >= gap && (tmp.getFreq() < vet[j - gap].getFreq()); j -= gap) {
                    vet[j] = vet[j - gap];
                }
                vet[j] = tmp;
            }
        }
    }

}
