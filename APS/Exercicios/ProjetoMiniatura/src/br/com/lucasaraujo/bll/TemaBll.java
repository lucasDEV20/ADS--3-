/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucasaraujo.bll;

import br.com.lucasaraujo.dal.TemaDal;
import br.com.lucasaraujo.model.Tema;
import java.util.List;

/**
 *
 * @author Computador
 */
public class TemaBll {

    /**
     * Método que busca um tema pelo tem_iden
     *
     * @param tem_iden
     * @return
     * @throws Exception
     */
    public static Tema getTemaPeloId(int tem_iden) throws Exception {
        return new TemaDal().getTemaid(tem_iden);
    }

    /**
     * Método para recuperar os temas cadastrados no banco de dados
     *
     * @return
     * @throws Exception
     */
    public static List<Tema> getTemas() throws Exception {
        TemaDal dal = new TemaDal();
        return dal.getTemas();
    }

    /**
     * Método para incluir um tema no banco de dados
     *
     * @param tema
     * @throws Exception
     */
    public static void incluir(Tema tema) throws Exception {

        validarNomeTema(tema.getTem_nome());

        // Cria uma instância da camada Dal
        TemaDal dal = new TemaDal();

        // Chama o método da camada Dal que inclui o tema no banco de dados
        dal.addTema(tema);
    }

    /**
     * Método para alterar os dados de um tema
     *
     * @param tema
     * @throws Exception
     */
    public static void alterar(Tema tema) throws Exception {

        validarNomeTema(tema.getTem_nome());

        // Cria uma instância da camada Dal
        TemaDal dal = new TemaDal();

        // Chama o método da camada Dal que atualiza o tema no banco de dados
        dal.updateTema(tema);
    }

    /**
     * Método para validação do nome do tema
     *
     * @param nome
     * @throws Exception
     */
    private static void validarNomeTema(String nome) throws Exception {
        // Verifica se o nome do tema foi preenchido
        if (nome.trim().length() == 0) {
            throw new Exception("Informe o nome do tema!");
        }
    }

    /**
     * Método para excluir um tema pelo ID
     *
     * @param tem_iden
     * @throws Exception
     */
    public static void excluir(int tem_iden) throws Exception {
        // Cria uma instância da camada Dal
        TemaDal dal = new TemaDal();

        // Chama o método da camada Dal que atualiza o tema no banco de dados
        dal.deleteTema(tem_iden);
    }
}
