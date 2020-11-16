/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eex3;

import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class Eex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //escopo do menu 
        /**
         * 1 - Empilhar um objeto Pessoa 2 - Desempilhar um objeto Pessoa 3
         * -Imprimir toda a pilha 4- Consultar/mostrar o objeto Pessoa do topo
         * da pilha (sem remover) 5 – Sair
         *
         *
         */

       exibirMenu();
        Pessoavalida();
        mostrapessoa();

    }

    public static void exibirMenu() {
        System.out.println("\n");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|                 MENU                                  |");
        System.out.println("+-------------------------------------------------------+");
        System.out.println(
                "| 1 - Empilhar um objeto Pessoa |\n"
                + "| 2 - Desempilhar um objeto Pessoa |\n"
                + "| 3 -Imprimir toda a pilha |\n"
                + "| 4- Consultar/mostrar o objeto Pessoa do topo da pilha |\n"
                + "| 99 - Sair                            |"
        );
        System.out.println("+------------------------------------------------------+\n\n");
    }

    public static Scanner entrada;
    public static float imc;
    private static String nome;
    private static String dataNascimento;
    private static float altura;
    private static float peso;
    private static float idade;

    public static void Pessoavalida() {
        entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Digite sua data de nacimento: ");
        dataNascimento = entrada.nextLine();

        System.out.println("Digite seu Peso: ");
        peso = entrada.nextFloat();

        System.out.println("Digite sua Altura: ");
        altura = entrada.nextFloat();

    }

    public static void imc(String pessoa) {
        imc = altura * altura;
        imc = peso / imc;
    }

// preciso de um metodo para calcular a idade do usuario que seria a data atual - a data de nacimento.
// alocando na variavel idade.
    public static void mostrapessoa() {
        System.out.println("Seu nome e: " + nome);
        System.out.println("Sua altura e: " + altura);
        System.out.println("Seu peso e: " + peso);
        System.out.println("Sua idade e: " + idade);
        System.out.println("Seu IMC : " + imc);

    }

   

}

