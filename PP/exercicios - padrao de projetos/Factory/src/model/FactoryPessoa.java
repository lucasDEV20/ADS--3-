/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Computador
 */
class FactoryPessoa {

	public Pessoa getPessoa(String nome, String sexo) {
		if (sexo.equals("M"))
			return new Homem(nome);
		if (sexo.equals("F"))
			return new Mulher(nome);
            return null;
	
        }
}



