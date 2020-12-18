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
package model;

/**
 *
 * @author LucasDEV20
 */
public class Facebook extends rede {
     public Facebook(String nomeDoUsuario, String senhaDoUsuario) {
        this.nomeDoUsuario = nomeDoUsuario;
        this.senhaDoUsuario = senhaDoUsuario;
    }

    public boolean logIn(String nomeDoUsuario, String senhaDoUsuario) {
        System.out.println("----------------------------------------------\n"
                        +"\nVerificando os parâmetros do usuário\n"
                        +"----------------------------------------------\n");
        System.out.println("Nome do usuario: " + this.nomeDoUsuario);
        System.out.print("Senha do usuario: ");
        for (int i = 0; i < this.senhaDoUsuario.length(); i++) {
            System.out.print("*");
        }
        simularLatênciaderRede();
        System.out.println(""
                + "----------------------------------------------\n"
                + "\n\nConctado com sucesso no facebook!"
                + "----------------------------------------------\n");
        return true;
    }

    public boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println(""
                    + "----------------------------------------------\n"
                    + "Mensagem: '" + new String(data) + "' postagem feita com sucesso\n"
                    + "----------------------------------------------\n");
            return true;
        } else {
            return false;
        }
    }

    public void logOut() {
        System.out.println(""
                + "----------------------------------------------\n"
                + "Usuario: '" + nomeDoUsuario + "' voce esta saindo do facebook\n"
                + "----------------------------------------------\n");
    }

    private void simularLatênciaderRede() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
