/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_lucas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Computador
 */
public abstract class GenericDAO {

    protected ArquivoTXT con;

    protected GenericDAO() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> daoClass = Class.forName("model." + ArquivoTXT.class);
        con = (ArquivoTXT) daoClass.newInstance();
        con.getClass();

    }

    protected abstract Object builObject(ResultSet rs);

    protected ArrayList<Object>
            retrieveListOfObjects(String query) throws SQLException {
        return null;

    }

    protected void update(Conta conta) throws SQLException {

    }

    protected Object retryById(int id, String tableName) throws SQLException {
        return null;
    }

    protected Object retrieveLastId(String tableName) {
        return null;

    }

    protected void delete(int id, String tableName) throws SQLException {

    }
}
