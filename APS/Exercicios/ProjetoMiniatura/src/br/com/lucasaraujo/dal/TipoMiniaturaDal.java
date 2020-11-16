/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucasaraujo.dal;

import br.com.lucasaraujo.model.Tipo_miniatura;
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
public class TipoMiniaturaDal {

    private Connection conexao;

    public TipoMiniaturaDal() throws Exception {
        conexao = Conexao.getConnection();
    }

    public void addtipoMiniatura(Tipo_miniatura tipo_miniatura)throws  Exception{
        String sql = "insert into tip_miniaturas(tm_iden, tm_tipo) values (DEFAULT, ?)";
        try {

            PreparedStatement preparedStatement = conexao
                    .prepareStatement(sql);
            // Parameters start with 1

            preparedStatement.setString(1, tipo_miniatura.getTm_tipo());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw e;
        }
    }

    public void deleteTipominiaura(int tipominiaturaId)throws Exception{
        try {
            PreparedStatement preparedStatement = conexao
                    .prepareStatement("delete from tip_miniaturas where tm_iden=?");
            // Parameters start with 1
            preparedStatement.setInt(1, tipominiaturaId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw e;
        }
    }

    public void updatetip_miniaturas(Tipo_miniatura tipo_miniatura) throws Exception{
        try {
            PreparedStatement preparedStatement = conexao
                    .prepareStatement("update tip_miniaturas set tm_tipo = ? where tm_iden = ?");
            // Parameters start with 1
            preparedStatement.setString(1, tipo_miniatura.getTm_tipo());
            preparedStatement.setInt(2, tipo_miniatura.getTm_iden());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw e;
        }
    }

    public List<Tipo_miniatura> getTipo_miniaturas() {
        List<Tipo_miniatura> tipo_miniaturas = new ArrayList<Tipo_miniatura>();
        String sql = "select * from tip_miniaturas";
        try {
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Tipo_miniatura tipo_miniatura = new Tipo_miniatura();
                tipo_miniatura.setTm_iden(rs.getInt("tm_iden"));
                tipo_miniatura.setTm_tipo(rs.getString("tm_tipo"));
                tipo_miniaturas.add(tipo_miniatura);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tipo_miniaturas;
    }

    public Tipo_miniatura getTipo_miniaturaId(int tm_iden) {
        Tipo_miniatura tipo_miniatura = new Tipo_miniatura();
        try {
            PreparedStatement preparedStatement = conexao.
                    prepareStatement("select * from tip_miniaturas where tm_iden=?");
            preparedStatement.setInt(1, tm_iden);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                tipo_miniatura.setTm_iden(rs.getInt("tm_iden"));
                tipo_miniatura.setTm_tipo(rs.getString("tm_tipo"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tipo_miniatura;
    }

    //fazer as teças > cadastro de fabricante > cadastro de tema > cadastro de tipo de miniatura 
    //fazer miniaturadal 
    //fazer fotodal
    //fazer tela de cadastro de miniatura
    //fazer tela de cadaastro de foto 
    //vaidar as telas usando a camada bll PARA TODOAS AS TELAS , UMA BLL PARA CADA TABELA 
    //acab0ou esta bagaça nao aperte f6
}
