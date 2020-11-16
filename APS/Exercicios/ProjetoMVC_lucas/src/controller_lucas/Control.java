/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller_lucas;

import enumeradores.EnumCaracteres;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model_lucas.ClienteDAO;
import model_lucas.Conta;
import model_lucas.ContaDAO;

/**
 *
 * @author Computador
 */
public class Control {

    //Fonte: https://receitasdecodigo.com.br/java/validar-email-em-java
    public static boolean isValidEmailAddressRegex(String email) {
        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }

    public static boolean telefoneValido(String texto) {
        for (char c : texto.toCharArray()) {
            if (!EnumCaracteres.Telefone.getCaracteres().contains(c + "")) {
                return false;
            }
        }
        // Tamanho mínimo do telefone somente com os números = 8
        if (textoSoComNumeros(texto).length() < 8) {
            return false;
        }

        return true;
    }

    public static String textoSoComNumeros(String texto) {
        String ret = "";
        for (char c : texto.toCharArray()) {
            if (EnumCaracteres.Numeros.getCaracteres().contains(c + "")) {
                ret += c + "";
            }
        }
        return ret;

    }
    
    public static boolean soTemLetras(String texto) {
        for (char c : texto.toCharArray()) {
            if (!EnumCaracteres.Letras.getCaracteres().contains(c + "")
                    && !(c + "").equals(" ")) {
                return false;
            }
        }
        return true;
    }

    // Control Clientes:
    public static void addCliente(String nome, String email) throws SQLException {
        ClienteDAO.getInstance().create(nome, email);
    }

    public static ArrayList<Object> getAllClientes() {
        return (ArrayList<Object>) ClienteDAO.getInstance().retrieveAll();
    }

    public static ArrayList<Object> getAllClientesLike(String nome) {
        return (ArrayList<Object>) ClienteDAO.getInstance().retrieveLike(nome);
    }

    // Control Contas:
    public static void addContaComum(int idCliente) {
        ContaDAO.getInstance().create(idCliente);
    }

    public static void addContaEspecial(int idCliente, double limite) {
        ContaDAO.getInstance().create(idCliente, limite);
    }

    public static ArrayList<Object> getAllContasByCliente(int idCliente) {
        return ContaDAO.getInstance().retrieveByIdCliente(idCliente);
    }

    public static void updateConta(Conta conta) throws SQLException {
        ContaDAO.getInstance().update(conta);
    }

}
