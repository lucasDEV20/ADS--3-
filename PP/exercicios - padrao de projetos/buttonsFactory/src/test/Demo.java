/*
____________________________________________________________________________________________________________

-Autor > Lucas Araujo (LucasDEV20)
=Disciplina > Padores de projetos
-Fonte para relaizar tal estudo > https://refactoring.guru/pt-br/design-patterns/factory-method/java/example
- Identificação: Os métodos fábrica podem ser reconhecidos por métodos de criação, que criam objetos de 
classes concretas, mas os retornam como objetos de tipo ou interface abstrata.
____________________________________________________________________________________________________________
 */
package test;

import modal.Dialogo;
import modal.HtmlDialogo;
import modal.WindowsTelaDialog;

/**
 *
 * @author lucasDEV20
 */
public class Demo {
     private static Dialogo dialog;
    
    public static void main(String[] args) {
        CONFIGURAR();
        executarRegraDeNegocio();
    }

    /**
     * A fábrica de concreto geralmente é escolhida dependendo da configuração ou
     * opções de ambiente.
     */
    static void CONFIGURAR() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsTelaDialog();
        } else {
            dialog = new HtmlDialogo();
        }
    }//SELECIONA A JANELA PELO SISTEMA OPERACIONAL
    //

    /**
     * Todo o código do cliente deve funcionar com fábricas e produtos por meio
     * interfaces abstratas. Desta forma, não importa com qual fábrica ele funciona
     * com e que tipo de produto é devolvido.
     */
    static void executarRegraDeNegocio() {
        dialog.JanelaDeRederinzacao();
    }
}
