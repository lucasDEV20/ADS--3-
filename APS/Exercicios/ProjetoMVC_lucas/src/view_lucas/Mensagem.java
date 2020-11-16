/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view_lucas;

import javax.swing.JOptionPane;

/**
 *
 * @author Computador
 */
public class Mensagem {
        // --- MENSAGENS ------------------------------------------------------------------------------>
    //
    /**
     * Exibe uma mensagem informativa na tela.
     *
     * @param titulo Título da mensagem.
     * @param mensagem Texto da mensagem.
     */
    public static void mensagem(String titulo, String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Exibe uma mensagem de erro na tela.
     *
     * @param e Exception para obter o texto da mensagem.
     */
    public static void mensagemErro(Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Opa!", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Exibe pergunta e retorna a resposta do usuário.
     * <p>
     * Exemplo:
     * <p>
     * String[] opcoes = {"Sim", "Não", "Talvez"};
     * <p>
     * 0 = Sim
     * <p>
     * 1 = Não
     * <p>
     * 2 = Talvez
     *
     * @param mensagem Texto com a pergunta.
     * @param opcoes Lista com os labels dos botões de opção.
     * @return Inteiro com o índice da opção escolhida pelo usuário.
     *
     */
    public static int mensagemEscolher(String mensagem, String[] opcoes) {
        return JOptionPane.showOptionDialog(null, mensagem, "Escolha uma opção:",
                JOptionPane.CLOSED_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, 0);
    }

    // --- FIM MENSAGENS --------------------------------------------------------------------------|
}
