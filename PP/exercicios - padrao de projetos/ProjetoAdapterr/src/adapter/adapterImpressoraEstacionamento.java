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
public class adapterImpressoraEstacionamento  implements IFiscalEstacionamento{
ImpressoraDoVovo   Objecto = new ImpressoraDoVovo();
    @Override
    public String IprimirFiscalEstacionamento(FiscalEstacionamento objNota) {
        String str = "\n============================="
                + "   \n NOTA FISCAL ESTACIONAMENTO\n"
                + "   \n DADOS DA NOTA: ";
        str += objNota.getDados() + "\n";
        return Objecto.escreverNaImpressoraNotaFiscal(str);
    }
    
}
