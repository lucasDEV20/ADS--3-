/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.acessorios;

import classes.celular.Celular;

/**
 *
 * @author Computador
 */
public class PeliculaDeVidro extends Celular {
    private Celular smartphone;
    public PeliculaDeVidro(Celular smartphone) {
        this.smartphone = smartphone;
        
    }
    
    @Override
    public String getDescricao(){
        return smartphone.getDescricao() + " , Pelicula de Video";
        
    }
    
    @Override
    public double preco(){
        return 60 + smartphone.preco();
    }
    
}
