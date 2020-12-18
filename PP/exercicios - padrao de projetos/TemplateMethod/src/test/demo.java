/*
 ____________________________________________________________________________________________________________

-Autor > Lucas Araujo (LucasDEV20)
=Disciplina > Padores de projetos
-Fonte para relaizar tal estudo >
https://refactoring.guru/pt-br/design-patterns/template-method/java/example
https://pt.stackoverflow.com/questions/54588/como-criar-manter-variavel-global-em-java-para-login

O padrão Template Method é bastante comum nos frameworks Java. Os desenvolvedores costumam usá-lo para 
fornecer aos usuários do framework um meio simples de estender a funcionalidade padrão usando herança.
____________________________________________________________________________________________________________
 */
package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import model.Facebook;
import model.Twitter;
import model.rede;

/**
 *
 * @author LucasDEV20
 */
public class demo {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        rede rede = null;
        System.out.print(""
                + "----------------------------------------------\n"
                + "Entrada com o nome do usuario: \n"
        );
        String userName = reader.readLine();
        System.out.print("----------------------------------------------\n");
        System.out.print(""
                + "----------------------------------------------\n"
                + "Entrada com a senha do usuario: \n"
        );
        String password = reader.readLine();
        System.out.print("----------------------------------------------\n");

        // Enter the message.
        System.out.print(""
                + "----------------------------------------------\n"
                + "Mensagem de entrada do usuario: \n"
                + "----------------------------------------------\n");
        String message = reader.readLine();

        System.out.println(""
                + "----------------------------------------------\n"
                + "\nEscolha em qual rede social ira postar a mensagem\n"
                + "1 - Facebook\n"
                + "2 - Twitter\n"
                + "----------------------------------------------");
        int choice = Integer.parseInt(reader.readLine());

        // Create proper network object and send the message.
        if (choice == 1) {
            rede = new Facebook(userName, password);
        } else if (choice == 2) {
            rede = new Twitter(userName, password);
        }
        rede.post(message);
    }
}
