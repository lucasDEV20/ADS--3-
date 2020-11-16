/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classes.acessorios;

import classes.celular.Celular;

/**
 *
 * @author eugenio
 */
//classe abstrata que herda da classe celular
public abstract class Acessorio extends Celular {
    public abstract String getDescricao();
    
}
