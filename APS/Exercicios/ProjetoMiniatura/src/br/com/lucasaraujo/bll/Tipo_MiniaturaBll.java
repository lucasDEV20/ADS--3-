/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucasaraujo.bll;

import br.com.lucasaraujo.dal.TipoMiniaturaDal;
import br.com.lucasaraujo.model.Tipo_miniatura;
import java.util.List;

/**
 *
 * @author Computador
 */
public class Tipo_MiniaturaBll {
    /*
     * Método que busca um fabricante pelo tem_iden
     *
     * @param fab_iden
     * @return
     * @throws Exception
     */
    public static Tipo_miniatura gettipoMiniaturaId(int tm_min_iden) throws Exception {
        return new TipoMiniaturaDal().getTipo_miniaturaId(tm_min_iden);
    }
     
    /**
     * Método para recuperar os fabricantes cadastrados no banco de dados
     *
     * @return
     * @throws Exception
     */
    
    public static List<Tipo_miniatura> getTipo_miniaturas() throws Exception{
        TipoMiniaturaDal dal = new TipoMiniaturaDal();
        return dal.getTipo_miniaturas();
    }

     /**
     * Método para incluir um fabricante  no banco de dados
     *
     * @param fabricante
     * @throws Exception
     */
    public static void incluir(Tipo_miniatura tipo_miniatura) throws Exception {

        validarTipoMiniatura(tipo_miniatura.getTm_tipo());

        // Cria uma instância da camada Dal
        TipoMiniaturaDal dal = new TipoMiniaturaDal();

        // Chama o método da camada Dal que inclui o fabricante no banco de dados
        dal.addtipoMiniatura(tipo_miniatura);
    }

    /**
     * Método para alterar os dados de um fabricante
     *
     * @param fabricante
     * @throws Exception
     */
    public static void alterar(Tipo_miniatura tipo_miniatura) throws Exception {

        validarTipoMiniatura(tipo_miniatura.getTm_tipo());

        // Cria uma instância da camada Dal
        TipoMiniaturaDal dal = new TipoMiniaturaDal();

        // Chama o método da camada Dal que atualiza o tema no banco de dados
        dal.addtipoMiniatura(tipo_miniatura);
    }

    /**
     * Método para validação do nome do fabricante
     *
     * @param nome
     * @throws Exception
     */
    private static void validarTipoMiniatura(String tipo) throws Exception {
        // Verifica se o nome do fabricante foi preenchido
        if (tipo.trim().length() == 0) {
            throw new Exception("Informe o  tipo de miniatura!");
        }
    }

    /**
     * Método para excluir um fabricante pelo ID
     *
     * @param tem_iden
     * @throws Exception
     */
    public static void excluir(int tm_min_iden) throws Exception {
        // Cria uma instância da camada Dal
        TipoMiniaturaDal dal = new TipoMiniaturaDal();

        // Chama o método da camada Dal que atualiza o tema no banco de dados
        dal.deleteTipominiaura(tm_min_iden);
    }
}

