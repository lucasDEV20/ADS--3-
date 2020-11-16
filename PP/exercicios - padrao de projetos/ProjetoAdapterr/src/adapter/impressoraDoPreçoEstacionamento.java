/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Computador
 */
public class impressoraDoPreçoEstacionamento implements IFiscalEstacionamento{

   
    public String IprimirFiscalEstacionamento(FiscalEstacionamento objNota) {
        return("\n Preço \n "
             + "\n R$:"+objNota.getDados()); //To change body of generated methods, choose Tools | Templates.
    }
    //essa impressora ira implmentar a interface  

  
}
