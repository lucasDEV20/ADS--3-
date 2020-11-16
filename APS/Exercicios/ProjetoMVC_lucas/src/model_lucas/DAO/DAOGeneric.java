/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_lucas.DAO;

import java.util.ArrayList;
import model_lucas.enumeradores.EnumComparador;
import model_lucas.enumeradores.EnumConstantes;

/**
 *
 * @author Computador
 */
 abstract class DAOGeneric {

    //--- ATRIBUTOS ------------------------------------------------------------------------------->
    //
    protected ArquivoCONN con;

    //--- FIM ATRIBUTOS ---------------------------------------------------------------------------|
    //
    //--- CONSTRUTORES ---------------------------------------------------------------------------->
    //
    protected DAOGeneric(String className) throws Exception {
        con = new ArquivoCONN(className);
    }
    //--- FIM CONSTRUTORES ------------------------------------------------------------------------|
    //

    //--- CREATE ---------------------------------------------------------------------------------->
    //
    protected void create(String objectToString) throws Exception {
        ArrayList<String> linhas = con.getResults();
        linhas.add(objectToString);
        con.executeUpdate(linhas);
    }

    //--- FIM CREATE ------------------------------------------------------------------------------|
    //
    //--- READ ------------------------------------------------------------------------------------>
    //
    protected abstract Object buildObject(String objectToString);

    protected abstract boolean exists(Object object) throws Exception;

    protected int getLastID(int indexPrimaryKey) throws Exception {
        return con.lastID(indexPrimaryKey);
    }

    protected ArrayList<Object> retrieveListOfObjects() throws Exception {
        ArrayList<Object> retorno = new ArrayList<>();
        for (String linha : con.getResults()) {
            retorno.add(buildObject(linha));
        }
        return retorno;
    }

    protected Object retrieveById(int id, int indexPrimaryKey) throws Exception {
        Object retorno = null;
        ArrayList<Object> consulta = retrieveByField(id + "", indexPrimaryKey, EnumComparador.Igual);

        if (!consulta.isEmpty()) {
            retorno = consulta.get(0);
        }
        return retorno;
    }

    protected ArrayList<Object> retrieveByField(String search, int indexField, EnumComparador comparacao) throws Exception {
        return retrieveByFields(new String[]{search}, new int[]{indexField}, new EnumComparador[]{comparacao});
    }

    protected ArrayList<String> retrieveListByField(String search, int indexField, EnumComparador comparacao) throws Exception {
        ArrayList<String> retorno = new ArrayList<>();
        for (String ret : con.getResults()) {
            String value = ret.split(EnumConstantes.SeparadorSplit.getConstante())[indexField];
            if (compareTo(search, value, comparacao)) {
                retorno.add(ret);
            }
        }
        return retorno;
    }

    protected ArrayList<Object> retrieveByFields(String[] search, int[] indexField, EnumComparador[] comparacao) throws Exception {
        ArrayList<Object> retorno = new ArrayList<>();
        ArrayList<Object> comparacoes;

        for (String str : con.getResults()) {
            // Faço todas as comparações
            comparacoes = new ArrayList<>();
            for (int i = 0; i < search.length; i++) {
                String value = str.split(EnumConstantes.SeparadorSplit.getConstante())[indexField[i]];
                comparacoes.add(compareTo(search[i], value, comparacao[i]));
            }

            // Verifico se atendeu à todas as comparações
            if (!comparacoes.contains(false)) {
                retorno.add(buildObject(str));
            }
        }
        return retorno;
    }

    protected boolean compareTo(String search, String value, EnumComparador comparacao) {
        switch (comparacao.ordinal()) {
            case 0:     // Igual
                return value.equalsIgnoreCase(search);
            case 1:     // Contem
                return value.toLowerCase().contains(search.toLowerCase());
            case 2:     // Diferente
                return !value.equalsIgnoreCase(search);
        }
        return false;
    }

    protected Object retrieveLastId(int indexPrimaryKey) throws Exception {
        return retrieveById(getLastID(indexPrimaryKey), indexPrimaryKey);
    }

    //--- FIM READ --------------------------------------------------------------------------------|
    //
    //--- UPDATE ---------------------------------------------------------------------------------->
    //
    protected void update(int id, int indexPrimaryKey, String objectToString) throws Exception {
        ArrayList<String> linhas = retrieveListByField(id + "", indexPrimaryKey, EnumComparador.Diferente);
        linhas.add(objectToString);
        con.executeUpdate(linhas);
    }

    //--- FIM UPDATE ------------------------------------------------------------------------------|
    //
    //--- DELETE ---------------------------------------------------------------------------------->
    //
    protected void delete(int id, int indexPrimaryKey) throws Exception {
        con.executeUpdate(retrieveListByField(id + "", indexPrimaryKey, EnumComparador.Diferente));
    }
    //--- FIM DELETE ------------------------------------------------------------------------------|
    //
}
