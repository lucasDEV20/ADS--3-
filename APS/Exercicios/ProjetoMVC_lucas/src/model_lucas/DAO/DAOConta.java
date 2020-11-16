/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_lucas.DAO;

import java.util.ArrayList;
import model_lucas.classes.Conta;
import model_lucas.classes.ContaComum;
import model_lucas.classes.ContaEspecial;
import model_lucas.enumeradores.EnumComparador;
import model_lucas.enumeradores.EnumConstantes;
import model_lucas.enumeradores.EnumStatusConta;
import model_lucas.enumeradores.EnumTipoDeConta;

/**
 *
 * @author vovostudio
 */
public class DAOConta extends DAOGeneric {

    //--- ATRIBUTOS ------------------------------------------------------------------------------->
    //
    private static DAOConta instance;

    //--- FIM ATRIBUTOS ---------------------------------------------------------------------------|
    //
    //--- CONSTRUTORES ---------------------------------------------------------------------------->
    //
    private DAOConta() throws Exception {
        super("Conta");
    }
    //--- FIM CONSTRUTORES ------------------------------------------------------------------------|
    //

    //--- GET ------------------------------------------------------------------------------------->
    //
    public static DAOConta getInstance() throws Exception {
        if (instance == null) {
            instance = new DAOConta();
        }
        return instance;
    }
    //--- FIM GET ---------------------------------------------------------------------------------|
    //

    //--- CREATE ---------------------------------------------------------------------------------->
    //
    public void create(int idCliente) throws Exception {
        this.create(EnumTipoDeConta.Comum.ordinal(), idCliente, 0);
    }

    public void create(int idCliente, double limite) throws Exception {
        this.create(EnumTipoDeConta.Especial.ordinal(), idCliente, limite);
    }

    private void create(int tipo, int idCliente, double limite) throws Exception {
        String sep = EnumConstantes.SeparadorSplit.getConstante();
        super.create(
                (getLastID(0) + 1)
                + sep + tipo
                + sep + idCliente
                + sep + "0.00"
                + sep + limite
                + sep + EnumStatusConta.Ativa.ordinal()
        );
    }

    //--- FIM CREATE ------------------------------------------------------------------------------|
    //
    //--- READ ------------------------------------------------------------------------------------>
    //
    @Override
    protected Object buildObject(String objetoToString) {
        Conta obj = null;

        String partes[] = objetoToString.split(EnumConstantes.SeparadorSplit.getConstante());
        int id = Integer.parseInt(partes[0]);
        int tipo = Integer.parseInt(partes[1]);
        int idCliente = Integer.parseInt(partes[2]);
        double saldo = Double.parseDouble(partes[3]);
        EnumStatusConta status = EnumStatusConta.values()[Integer.parseInt(partes[5])];

        switch (tipo) {
            case 0:
                obj = new ContaComum(id, idCliente, status);
                break;

            case 1:
                obj = new ContaEspecial(id, idCliente, Double.parseDouble(partes[4]), status);
        }

        if (obj != null) {
            obj.deposito(saldo);
        }
        return obj;
    }

    @Override
    protected boolean exists(Object object) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Object> retrieveAll() throws Exception {
        return retrieveListOfObjects();
    }

    public ArrayList<Object> retrieveAllOthers(int id) throws Exception {
        return retrieveByField(id + "", 0, EnumComparador.Diferente);
    }

    public ArrayList<Object> retrieveByIdCliente(int idCliente) throws Exception {
        return retrieveByField(idCliente + "", 2, EnumComparador.Igual);
    }

    public Conta retrieveById(int id) throws Exception {
        return (Conta) retrieveById(id, 0);
    }

    public Conta retrieveLastId() throws Exception {
        return (Conta) retrieveLastId(0);
    }

    //--- FIM READ --------------------------------------------------------------------------------|
    //
    //--- UPDATE ---------------------------------------------------------------------------------->
    //
    public void update(Conta conta) throws Exception {
        super.update(conta.getId(), 0, conta.toString());
    }

    //--- FIM UPDATE ------------------------------------------------------------------------------|
    //
    //--- DELETE ---------------------------------------------------------------------------------->
    //
    public void delete(int id) throws Exception {
        super.delete(id, 0);
    }
    //--- FIM DELETE ------------------------------------------------------------------------------|
    //

}
