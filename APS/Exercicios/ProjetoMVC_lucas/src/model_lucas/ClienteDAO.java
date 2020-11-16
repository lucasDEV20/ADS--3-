/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_lucas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Computador
 */
public class ClienteDAO {

    private static ClienteDAO instance;

    private ClienteDAO() {
        super();
    }

    public static ClienteDAO getInstance() {
        return null;

    }

    protected Object buildObject(ResultSet rs) throws SQLException {
        return null;

    }

    public void create(String nome, String email) throws SQLException {

    }

    public List<Object> retrieveAll() {
        return null;

    }

    public List<Object> retrieveLike(String nome) {
        return null;

    }

    public Cliente retrieveById(int id) {
        return null;

    }

    public Cliente retrieveLastId() {
        return null;

    }

    public boolean update(Cliente cliente) throws SQLException {
        return false;

    }

    public void delete(Conta conta) {

    }

}
