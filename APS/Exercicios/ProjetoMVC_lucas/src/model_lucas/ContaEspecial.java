/*
A Listagem 5 apresenta o código da classe ContaEspecial, também derivada de Conta. Nessa classe é
adicionado o atributo limite, com os getters e setters correspondentes e o método saque() é também 
sobrescrito. Observa-se que a única diferença da implementação de saque() fornecida
por ContaComum e a fornecida por ContaEspecial é que, neste último caso, um saque pode ser
executado se o valor a ser sacado não superar o saldo somado ao limite.
Com isso as classes básicas que representam nosso domínio da informação estão implementadas. Vamos
passar agora para a implementação do acesso ao banco de dados. 

 */
package model_lucas;

/**
 *
 * @author Computador
 */
public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(int id, int idCliente) {
        super(id, idCliente);
        this.limite = limite;
        
    }

 
    public double getLimite() {return limite;}
    
    public void setLimite(double limite) {this.limite = limite;}
    
    public boolean saque(double valor){
        return ((valor>(super.getSaldo()
        +this.limite))?false:super.saque(valor));
    }
}
