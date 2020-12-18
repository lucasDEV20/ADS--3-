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
public class TesteApp {

	public static void main(String args[]) {
		FactoryPessoa factory = new FactoryPessoa();
		String nome = "Carlos";
		String sexo = "M";
		factory.getPessoa(nome, sexo);
	}
}
