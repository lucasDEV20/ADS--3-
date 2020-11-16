/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller_lucas;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model_lucas.DAO.DAOCliente;
import model_lucas.classes.Cliente;
import model_lucas.enumeradores.EnumComparador;
import model_lucas.enumeradores.EnumConstantes;

/**
 *
 * @author vovostudio (assinatura do dono do codigo)
 */
public class ControlCliente {
     // --- ATRIBUTOS ------------------------------------------------------------------------------>
    private static String charsVogaisAcentuadas = "àâãáéêíòôõóúÀÂÂÁÉÊÍÒÔÕÓÚ";
    private static String charsLetras
            = "qwertyuiopasdfghjklçzxcvbnmQWERTYUIOPASDFGHJKLÇZXCVBNM " + charsVogaisAcentuadas;
    private static String charsNumeros = "0123456789";

    // --- FIM ATRIBUTOS --------------------------------------------------------------------------|
    //
    // --- VALIDAÇÕES ----------------------------------------------------------------------------->
    //
    /**
     * Valida o atributo nome.
     *
     * @param nome Texto com nome válido, com pelo menos duas letras.
     * @throws Exception
     */
    private static void validarNome(String nome) throws Exception {
        nome = nome.trim();
        if (nome.length() == 0) {
            throw new Exception("Informe o nome!");
        }

        if (nome.length() < 2) {
            throw new Exception("O nome deve ter pelo menos duas letras!");
        }

        for (char c : nome.toCharArray()) {
            if (!charsLetras.contains(c + "")) {
                throw new Exception("O nome deve ter apenas letras e espaços!");
            }
        }
        if(nome.split(" ").length < 2){
            throw new Exception("Infome o nome e um sobrenome!");
        }
    }

    /**
     * Valida o preenchimento do campo E-Mail.
     *
     * @param email Endereço de e-mail válido.
     * @throws Exception
     */
    private static void validarEmail(String email) throws Exception {
        // FONTE: https://receitasdecodigo.com.br/java/validar-email-em-java
        boolean emailValido = false;

        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                emailValido = true;
            }
        }

        if (!emailValido) {
            throw new Exception("E-mail inválido!");
        }
    }

    private static void validarAtributos(String nome, String email) throws Exception {
        validarNome(nome);
        validarEmail(email);
    }

    /**
     * Valida a inclusão de um novo registro, verificando se há duplicidade.
     *
     * @param nome Nome do cliente.
     * @param email eMail do cliente.
     * @throws Exception
     */
    private static void validarInclusao(String nome, String email) throws Exception {

        if (DAOCliente.getInstance().exists(new Cliente(0, nome, email))) {
            throw new Exception("Esse cadastro já existe!");
        }
    }

    private static void validarEdicao(Cliente cliente) throws Exception {
        ArrayList<Object> clientes
                = DAOCliente.getInstance().retrieveByField(cliente.getId() + "", 0, EnumComparador.Diferente);

        for (Object obj : clientes) {
            Cliente cli = (Cliente) obj;
            if (cli.getNome().equalsIgnoreCase(cliente.getNome())
                    && cli.getEmail().equalsIgnoreCase(cliente.getEmail())) {
                throw new Exception("O cadastro já existe!\n"
                        + "O cliente nº " + cli.getId() + " tem o mesmo nome e o mesmo e-mail."
                );
            }
        }
    }

    // --- FIM VALIDAÇÕES -------------------------------------------------------------------------|
    //    
    //--- GET ------------------------------------------------------------------------------------->
    //
    public static Cliente getClienteById(int idCliente) throws Exception {
        return DAOCliente.getInstance().retrieveById(idCliente);
    }

    public static ArrayList<Object> getAllClientes() throws Exception {
        return DAOCliente.getInstance().retrieveAll();
    }

    public static ArrayList<Object> getAllClientesLike(String nome) throws Exception {
        return DAOCliente.getInstance().retrieveLikeNome(nome);
    }

    public static Cliente toObject(int id, String nome, String email) throws Exception {
        String sep = EnumConstantes.SeparadorSplit.getConstante();
        return (Cliente) DAOCliente.getInstance().buildObject(id + sep + nome + sep + email);
    }

    //--- FIM GET ---------------------------------------------------------------------------------|
    //
    //--- SET ------------------------------------------------------------------------------------->
    //
    public static void addCliente(String nome, String email) throws Exception {
        validarAtributos(nome, email);
        validarInclusao(nome, email);
        DAOCliente.getInstance().create(nome, email);
    }

    public static void updateCliente(Cliente cliente) throws Exception {
        validarAtributos(cliente.getNome(), cliente.getEmail());
        validarEdicao(cliente);
        DAOCliente.getInstance().update(cliente);
    }

    //--- FIM SET ---------------------------------------------------------------------------------|
    //
}
