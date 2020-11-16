/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucasaraujo.bll;

import br.com.lucasaraujo.dal.FabricanteDal;
import br.com.lucasaraujo.model.Fabricante;
import java.util.List;

/**
 *
 * @author lucas
 */
public class FabricanteBll {

    /*
     * Método que busca um fabricante pelo tem_iden
     *
     * @param fab_iden
     * @return
     * @throws Exception
     */
    public static Fabricante getFabricantePeloId(int fab_iden) throws Exception {
        return new FabricanteDal().getFabricanteId(fab_iden);
    }
     
    /**
     * Método para recuperar os fabricantes cadastrados no banco de dados
     *
     * @return
     * @throws Exception
     */
    
    public static List<Fabricante> getFabricantes() throws Exception{
        FabricanteDal dal = new FabricanteDal();
        return dal.geFabricantes();
    }

     /**
     * Método para incluir um fabricante  no banco de dados
     *
     * @param fabricante
     * @throws Exception
     */
    public static void incluir(Fabricante fabricante) throws Exception {

        validarNomeFabricante(fabricante.getFab_nome());

        // Cria uma instância da camada Dal
        FabricanteDal dal = new FabricanteDal();

        // Chama o método da camada Dal que inclui o fabricante no banco de dados
        dal.addFabricante(fabricante);
    }

    /**
     * Método para alterar os dados de um fabricante
     *
     * @param fabricante
     * @throws Exception
     */
    public static void alterar(Fabricante fabricante) throws Exception {

        validarNomeFabricante(fabricante.getFab_nome());

        // Cria uma instância da camada Dal
        FabricanteDal dal = new FabricanteDal();

        // Chama o método da camada Dal que atualiza o tema no banco de dados
        dal.addFabricante(fabricante);
    }

    /**
     * Método para validação do nome do fabricante
     *
     * @param nome
     * @throws Exception
     */
    private static void validarNomeFabricante(String nome) throws Exception {
        // Verifica se o nome do fabricante foi preenchido
        if (nome.trim().length() == 0) {
            throw new Exception("Informe o nome do fabricante!");
        }
    }

    /**
     * Método para excluir um fabricante pelo ID
     *
     * @param tem_iden
     * @throws Exception
     */
    public static void excluir(int fab_iden) throws Exception {
        // Cria uma instância da camada Dal
        FabricanteDal dal = new FabricanteDal();

        // Chama o método da camada Dal que atualiza o tema no banco de dados
        dal.deleteFabricante(fab_iden);
    }
}
