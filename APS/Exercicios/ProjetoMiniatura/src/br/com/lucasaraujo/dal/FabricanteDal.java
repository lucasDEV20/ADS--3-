/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucasaraujo.dal;

import br.com.lucasaraujo.model.Fabricante;
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
public class FabricanteDal {

    private Connection conexao;

    public FabricanteDal() throws Exception{
        conexao = Conexao.getConnection();
    }

    public void addFabricante(Fabricante fabricante) throws Exception{
        String sql = "insert into fabricantes (fab_iden, fab_nome) values (DEFAULT, ?)";
        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            // Parameters start with 1
            preparedStatement.setString(1, fabricante.getFab_nome());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw e;
        }
    }

    public void deleteFabricante(int fabricanteId) throws Exception{
        try {
            PreparedStatement preparedStatement = conexao
                    .prepareStatement("delete from fabricantes where fab_iden=?");
            // Parameters start with 1
            preparedStatement.setInt(1, fabricanteId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
           throw e;
        }
    }

    public void updateFabricante(Fabricante fabricante)throws Exception{
        try {
            PreparedStatement preparedStatement = conexao
                    .prepareStatement("update fabricantes set fab_nome=? where fab_iden = ?");
            // Parameters start with 1
            //colaca o valro da variavel dentro da interrogaçao            
            preparedStatement.setString(1, fabricante.getFab_nome());
            preparedStatement.setInt(2, fabricante.getFab_iden());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
           throw e;
        }
    }

    public List<Fabricante> geFabricantes() {
        List<Fabricante> fabricantes = new ArrayList<Fabricante>();
        String sql = "select * from fabricantes";
        try {
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Fabricante fabricante = new Fabricante();
                //coloca o valor no objeto fabrocante 
                fabricante.setFab_iden(rs.getInt("fab_iden"));
                fabricante.setFab_nome(rs.getString("fab_nome"));
                //inclui fabricante na lista de fabricante 
                fabricantes.add(fabricante);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return fabricantes;
    }

    public Fabricante getFabricanteId(int fabricanteId) {
        Fabricante fabricante = new Fabricante();
        try {
            PreparedStatement preparedStatement = conexao.
                    prepareStatement("select * from fabricantes where fab_iden=?");
            preparedStatement.setInt(1, fabricanteId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                fabricante.setFab_iden(rs.getInt("fab_iden"));
                fabricante.setFab_nome(rs.getString("fab_nome "));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return fabricante;
    }

}
