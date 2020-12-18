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
 * @author lucasDEV20
 */
public abstract class rede {
    String nomeDoUsuario;
    String senhaDoUsuario;

    rede() {}

    /**
     * 
     *   Publique os dados em qualquer rede.
     */
    public boolean post(String message) {
        // Autentique antes de postar. Cada rede usa um diferente
        // Método de autenticação.
        //LogIn = conecte-se
        //log out = sair
        //sendData  enviar data
        if (logIn(this.nomeDoUsuario, this.senhaDoUsuario)) {
            // Envie os dados da postagem.

            boolean result =  sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String nomeDoUsuario, String senha);
    //  concta o usuario passando o parametro de nome e senha do usuario
    abstract boolean sendData(byte[] data);
    //  envia a data de log do usario e envia
    abstract void logOut();
    //  sai do sistema
    
    
}

