/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucasaraujo.bll;

import br.com.lucasaraujo.dal.FabricanteDal;
import br.com.lucasaraujo.dal.MiniaturaDal;
import br.com.lucasaraujo.dal.TemaDal;
import br.com.lucasaraujo.model.Fabricante;
import br.com.lucasaraujo.model.Foto;
import br.com.lucasaraujo.model.Miniatura;
import br.com.lucasaraujo.model.Tema;
import br.com.lucasaraujo.model.Tipo_miniatura;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Computador
 */
public class MiniaturaBll {

    public static Miniatura getMiniaturaPeloId( int min_iden) throws Exception {
        return new MiniaturaDal().getMiniaturaId(min_iden);
    }

    public static List<Miniatura> getMiniaturas() throws Exception {
        MiniaturaDal dal = new MiniaturaDal();
        return dal.getMiniaturas();
    }
    
      public static void incluir(Miniatura miniatura) throws Exception {

        validarminiatura(miniatura.getMin_modelo());
                
        validarminiatura(miniatura.getMin_observacoes());
                


                

        // Cria uma instância da camada Dal
        MiniaturaDal dal = new MiniaturaDal();

        // Chama o método da camada Dal que inclui o tema no banco de dados
        dal.addMiniatura(miniatura);
    }

    /**
     * Método para alterar os dados de um tema
     *
     * @param tema
     * @throws Exception
     */
    public static void alterar(Miniatura miniatura) throws Exception {

         validarminiatura(miniatura.getMin_modelo());
                
        validarminiatura(miniatura.getMin_observacoes());
                

        // Cria uma instância da camada Dal
        MiniaturaDal dal = new MiniaturaDal();

        // Chama o método da camada Dal que atualiza o tema no banco de dados
        dal.addMiniatura(miniatura);
    }

    /**
     * Método para validação do nome do tema
     *
     * @param nome
     * @throws Exception
     */
    private static void validarminiatura(String nome) throws Exception {
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
    public static void excluir(int min_iden) throws Exception {
        // Cria uma instância da camada Dal
        MiniaturaDal dal = new MiniaturaDal();

        // Chama o método da camada Dal que atualiza o tema no banco de dados
        dal.addMiniatura(miniatura);
    }

}
