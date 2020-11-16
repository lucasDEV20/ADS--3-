/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_lucas;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Computador
 */
public class ContaDAO {

   

  private static ContaDAO instance;

    private ContaDAO() {
        super();
    }

    public static ContaDAO getInstance() {
        return null;

    }

    public void create(int IdCliente) {

    }

    public void create(int idCliente, double limite) {
    }

    private void create(int tipo, int idCliente, double limite)
            throws SQLException {

    }

    protected Object buildObject() throws SQLException {
        return null;
    }

    public ArrayList<Object> retrieveAll() {
        return null;

    }

    public ArrayList<Object> retrieveByIdCliente(int idCliente) {
        return null;

    }
    public boolean update(Conta conta) throws SQLException{ 
      return false;
        
    }

}
