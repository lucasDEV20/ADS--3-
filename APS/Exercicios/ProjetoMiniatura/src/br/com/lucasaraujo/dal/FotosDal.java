/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucasaraujo.dal;

import br.com.lucasaraujo.model.Foto;
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
public class FotosDal {

    private Connection conexao;

    public FotosDal() throws Exception{
        conexao = Conexao.getConnection();
    }

    public void addFotos(Foto fotos) {
        String sql = "insert into fotos(fot_iden, fot_caminho, fot_descriçao, fot_min_iden) values (?, ?, ?, ? )";
        try {
            PreparedStatement preparedStatement = conexao
                    .prepareStatement(sql);
            // Parameters start with 1
            preparedStatement.setInt(1, fotos.getFot_iden());
            preparedStatement.setString(2, fotos.getFot_caminho());
            preparedStatement.setString(3, fotos.getFot_descricao());
            preparedStatement.setInt(4, fotos.getMiniatura().getMin_iden());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int fotosId) {
        try {
            PreparedStatement preparedStatement = conexao
                    .prepareStatement("delete from fotos where fot_iden=?");
            // Parameters start with 1
            preparedStatement.setInt(1, fotosId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateFoto(Foto fotos) {
        try {
            PreparedStatement preparedStatement = conexao
                    .prepareStatement("update fotos set fot_iden=?, fot_caminho=?, fot_descricao=?, fot_min_iden=? where fot_iden = ?");
            // Parameters start with 1
            preparedStatement.setInt(1, fotos.getFot_iden());
            preparedStatement.setString(2, fotos.getFot_caminho());
            preparedStatement.setString(3, fotos.getFot_descricao());
            preparedStatement.setInt(4, fotos.getMiniatura().getMin_iden());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Foto> getFotos() {
        List<Foto> fotos = new ArrayList<Foto>();
        String sql = "select * from fotos";
        try {
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Foto foto = new Foto();
                foto.setFot_iden(rs.getInt("fot_iden"));
                foto.setFot_caminho(rs.getString("fot_caminho"));
                foto.setFot_descricao(rs.getString("fot_descricao"));

                fotos.add(foto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return fotos;
    }

    public Foto getFotoId(int fotoId) {
        Foto foto = new Foto();
        try {
            PreparedStatement preparedStatement = conexao.
                    prepareStatement("select * from fotos where fot_iden=?");
            preparedStatement.setInt(1, fotoId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                preparedStatement.setInt(1, foto.getFot_iden());
                preparedStatement.setString(2, foto.getFot_caminho());
                preparedStatement.setString(3, foto.getFot_descricao());
                preparedStatement.setInt(4, foto.getMiniatura().getMin_iden());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return foto;
    }
}
