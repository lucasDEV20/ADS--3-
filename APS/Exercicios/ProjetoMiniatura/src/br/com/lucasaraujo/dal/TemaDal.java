/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucasaraujo.dal;

import br.com.lucasaraujo.model.Tema;
import br.com.lucasaraujo.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Computador
 */
public class TemaDal {

    private Connection conexao;

    public TemaDal() throws Exception {
        conexao = Conexao.getConnection();
    }

    public void addTema(Tema tema) throws Exception {
        String sql = "insert into temas (tem_iden, tem_nome) values (DEFAULT, ? )";
        try {

            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            // Parameters start with 1       
            preparedStatement.setString(1, tema.getTem_nome());
            preparedStatement.execute();

        } catch (SQLException e) {
            throw e;
        }
    }

    public void deleteTema(int temaId) throws Exception {
        try {
            PreparedStatement preparedStatement = conexao
                    .prepareStatement("delete from temas where tem_iden=?");
            // Parameters start with 1
            preparedStatement.setInt(1, temaId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw e;
        }
    }

    public void updateTema(Tema tema) throws Exception {
        try {
            PreparedStatement preparedStatement = conexao
                    .prepareStatement("update temas set tem_nome=? where tem_iden = ?");
            // Parameters start with 1
            preparedStatement.setString(1, tema.getTem_nome());
            preparedStatement.setInt(2, tema.getTem_iden());
            preparedStatement.execute();

        } catch (SQLException e) {
            throw e;
        }
    }

    public List<Tema> getTemas() {
        List<Tema> temas = new ArrayList<Tema>();
        String sql = "select * from temas";
        try {
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Tema tema = new Tema();//   tem_iden
                tema.setTem_iden(rs.getInt("tem_iden"));
                tema.setTem_nome(rs.getString("tem_nome"));
                temas.add(tema);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return temas;
    }

    public Tema getTemaid(int temaId) {
        Tema tema = new Tema();
        try {
            PreparedStatement preparedStatement = conexao.
                    prepareStatement("select * from temas where tem_iden=?");
            preparedStatement.setInt(1, temaId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                tema.setTem_iden(rs.getInt("tem_iden"));
                tema.setTem_nome(rs.getString("tem_nome"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tema;
    }
}
