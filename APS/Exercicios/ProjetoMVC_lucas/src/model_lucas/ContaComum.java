/*
A Listagem 4 apresenta a implementação da classe ContaComum, derivada de Conta. Como pode ser
observado, seu código é muito simples. Temos apenas o construtor e o método saque() sobrescrito. Na
classe pai esse método realiza a retirada de dinheiro da conta não importando se existe fundo ou não. A
proteção para não realizar a operação caso não exista saldo suficiente só é realizada em ContaComum.
Caso não exista, o método retorna false. Se existir, o método saque() do pai é chamado para efetivamente
realizar o débito. 
 */

package model_lucas;

/**
 *
 * @lucas Computador
 */
public class ContaComum extends Conta{
    
    public ContaComum(int id, int idCliente) {
        super(id, idCliente);
    }
    
    public boolean saque(double valor){
        return((valor>super.getSaldo())?false:super.saque(valor));
        
    }
    
    
    

   
}
