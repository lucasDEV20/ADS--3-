/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucasaraujo.dal;

import br.com.lucasaraujo.model.Miniatura;
import br.com.lucasaraujo.util.Conexao;
import java.sql.Connection;
import java.sql.Date;
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
public class MiniaturaDal {

    private Connection conexao;

    public MiniaturaDal() throws Exception{
        conexao = Conexao.getConnection();
    }

    public void addMiniatura(Miniatura miniatura)throws Exception {
        String sql = "insert into miniatura"
                + "(min_iden, min_modelo, min_ano, min_observacoes, min_edicao, min_escala, min_valor, min_fab_iden, min_tm_iden, min_tem_iden) "
                + "values "
                + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = conexao
                    .prepareStatement(sql);
            // Parameters start with 1
            preparedStatement.setInt(1, miniatura.getMin_iden());
            preparedStatement.setString(2, miniatura.getMin_modelo());
            preparedStatement.setDate(3, (Date) miniatura.getMin_ano());
            preparedStatement.setString(4, miniatura.getMin_observacoes());
            preparedStatement.setInt(5, miniatura.getMin_edicao());
            preparedStatement.setInt(6, miniatura.getMin_escala());
            preparedStatement.setDouble(7, miniatura.getMin_valor());
            preparedStatement.setInt(8, miniatura.getFabricante().getFab_iden());
            preparedStatement.setInt(9, miniatura.getTipo_miniatura().getTm_iden());
            preparedStatement.setInt(10, miniatura.getTema().getTem_iden());

            preparedStatement.executeUpdate();

        } catch (SQLException e){
            throw e;
        }
    }

    public void deleteMiniaturar(int miniaturaId) throws Exception{
        try {
            PreparedStatement preparedStatement = conexao
                    .prepareStatement("delete from users where min_iden=?");
            // Parameters start with 1
            preparedStatement.setInt(1, miniaturaId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
           throw e;
        }
    }

    public void updateMiniatura(Miniatura miniatura) throws Exception {
        try {
            PreparedStatement preparedStatement = conexao
                    .prepareStatement("update miniaturas set min_iden=?, min_modelo=?, min_ano=?, min_observacoes=?"
                            + ", min_edicao=?, min_escala=?, min_valor=?, min_fab_iden=?, min_tm_iden=?, min_tem_iden=? where min_iden = ?");
            // Parameters start with 1
            preparedStatement.setInt(1, miniatura.getMin_iden());
            preparedStatement.setString(2, miniatura.getMin_modelo());
            preparedStatement.setDate(3, (Date) miniatura.getMin_ano());
            preparedStatement.setString(4, miniatura.getMin_observacoes());
            preparedStatement.setInt(5, miniatura.getMin_edicao());
            preparedStatement.setInt(6, miniatura.getMin_escala());
            preparedStatement.setDouble(7, miniatura.getMin_valor());
            preparedStatement.setInt(8, miniatura.getFabricante().getFab_iden());
            preparedStatement.setInt(9, miniatura.getTipo_miniatura().getTm_iden());
            preparedStatement.setInt(9, miniatura.getTema().getTem_iden());

        } catch (SQLException e) {
            throw  e;
        }
    }

    public List<Miniatura> getMiniaturas() {
        List<Miniatura> miniaturas = new ArrayList<Miniatura>();
        String sql = "select * from miniatura";
        try {
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Miniatura miniatura = new Miniatura();
                miniatura.setMin_iden(rs.getInt("min_iden"));
                miniatura.setMin_modelo(rs.getString("min_modelo"));
                miniatura.setMin_ano(rs.getDate("min_ano"));
                miniatura.setMin_observacoes(rs.getString("min_observacoes"));
                miniatura.setMin_edicao(rs.getInt("min_edicao"));
                miniatura.setMin_escala(rs.getInt("min_escala"));
                miniatura.setMin_valor(rs.getDouble("min_valor"));

                miniaturas.add(miniatura);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return miniaturas;
    }

    public Miniatura getMiniaturaId(int miniaturaId) {
        Miniatura miniatura = new Miniatura();
        try {
            PreparedStatement preparedStatement = conexao.
                    prepareStatement("select * from users where userid=?");
            preparedStatement.setInt(1, miniaturaId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {

                miniatura.setMin_iden(rs.getInt("min_iden"));
                miniatura.setMin_modelo(rs.getString("min_modelo"));
                miniatura.setMin_ano(rs.getDate("min_ano"));
                miniatura.setMin_observacoes(rs.getString("min_observacoes"));
                miniatura.setMin_edicao(rs.getInt("min_edicao"));
                miniatura.setMin_escala(rs.getInt("min_escala"));
                miniatura.setMin_valor(rs.getDouble("min_valor"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return miniatura;
    }

}
