/*
A Listagem 4 apresenta a implementação da classe ContaComum, derivada de Conta. Como pode ser
observado, seu código é muito simples. Temos apenas o construtor e o método saque() sobrescrito. Na
classe pai esse método realiza a retirada de dinheiro da conta não importando se existe fundo ou não. A
proteção para não realizar a operação caso não exista saldo suficiente só é realizada em ContaComum.
Caso não exista, o método retorna false. Se existir, o método saque() do pai é chamado para efetivamente
realizar o débito. 
 */

package model_lucas.classes;

import model_lucas.classes.Conta;
import model_lucas.enumeradores.EnumConstantes;
import model_lucas.enumeradores.EnumStatusConta;
import model_lucas.enumeradores.EnumTipoDeConta;

/**
 *
 * @lucas Computador
 */
public class ContaComum extends Conta{
    //começo construtores
    public ContaComum(int id, int idCliente,EnumStatusConta  status) {
        super(id, idCliente , status);
    }
    //fim
    
    
    @Override
    public String toString() {
        String sep = EnumConstantes.SeparadorSplit.getConstante();
        return getId()
                + sep + EnumTipoDeConta.Comum.ordinal()
                + sep + getIdCliente()
                + sep + getSaldo()
                + sep + "0.00"
                + sep + getStatus().ordinal();
    }
    
    public boolean saque(double valor){
        return((valor>super.getSaldo())?false:super.saque(valor));
        
    }
    
    
    

   
}
