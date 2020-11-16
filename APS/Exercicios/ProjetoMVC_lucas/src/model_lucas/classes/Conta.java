/*
A Listagem 3 apresenta a implementação da classe Conta. Alguns detalhes são muito importantes em
relação à implementação dessa classe, conforme analisado a seguir. Observa-se, por exemplo, que existe o
método getId(), mas não existe o método setId(). A implementação está assim de propósito, uma vez que
o id é recuperado do banco de dados e definido no objeto a partir do construtor. Como o id nunca será
modificado durante a execução do programa, não há a necessidade de um método setId(). De forma
similar, o idCliente só possui o getter e não o setter. 
 */
package model_lucas.classes;

import model_lucas.enumeradores.EnumStatusConta;

/**
 *
 * @author Computador
 */
public class Conta {
    //metodos privados 
    private int id; 
    int idCliente;
    private double saldo;
    private EnumStatusConta status;
    public enum TipoDeConta{
        comun , especial 
    }
    
    public Conta(int id, int idCliente , EnumStatusConta status){
        this.id = id;
        this.idCliente = idCliente;
        saldo = 0;
        this.status = status;
        
    }

    //getrs 
    public int getId() {return id;}
    public int getIdCliente() {return idCliente;}
    public double getSaldo() {return saldo;}
    public EnumStatusConta getStatus() {return status;}
    //fim
    
    //setrs
    public void setStatus(EnumStatusConta status) {
        this.status = status;
    }
    //fim
    //metodos publicos 
    public void deposito(double valor){
        saldo += valor;
    }
    public boolean saque(double valor){
        saldo -= valor;
        return true;
    }
    //fim
    
     
}

