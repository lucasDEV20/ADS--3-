/*
 .//A DEFINIÇAO DE SINGLETON E QUE EXISTE UM CONTRUTOR PRIVADO QUE RETORNA UMA INSTANCIA 
     //DA PROPRIA CLASSE
     //MAIS NESSA CLASSE RETORNAREMOS A INSTANCIA DE UMA CONEXAO COM O BANCO DE DADOS 
 */
package br.com.lucasaraujo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author Computador
 */
public class Conexao {

    private String driver = "org.postgresql.Driver";

    private static Conexao conexao = null;
    private static Connection connection = null;

    private Conexao() throws Exception {
        String dbname = "miniatura";// http://127.0.0.1:53077/
        String url = "jdbc:postgresql://localhost:5432/" + dbname;
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "lad159io");
        //String user = "postgres";
        //String password = "lad159io";

        Class.forName(driver);
        //connection = DriverManager.getConnection(url, user, password);
        connection = DriverManager.getConnection(url, props);
    }

    public static Connection getConnection() throws Exception {
        if (conexao == null) {
            conexao = new Conexao();

        }
        return connection;

    }

}
