/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class Lista_estrutura_de_dados_exercicio3 {
    public class Exercicio10 {

   
        // Variaveis
        Scanner sc = new Scanner(System.in);
        double f, c;

        // Entrada
        System.out.println();
        System.out.print("Digite uma temperatura em graus Fahrenheit (°F): ");
        f = sc.nextDouble();

        // Processamento
        c = (f - 32.0) * 5 / 9.0;

        // Saída
        System.out.println();
        System.out.printf("%.1f°F correspondem a %.1f°C.\n", f, c);
    }
}

