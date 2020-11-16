/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import classes.acessorios.PeliculaDeVidro;
import classes.acessorios.FoneSemFio;
import classes.acessorios.CarregadorApple;
import classes.acessorios.AcessorioPádrao;
import classes.acessorios.AcessorioPlus;
import classes.celular.xaomi;
import classes.celular.Apple;
import classes.celular.Celular;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Celular Smartphone1 = new xaomi();
        System.out.println("-------------------------------------------------");
        System.out.println("Celular:   " + Smartphone1.getDescricao());
        System.out.println("Preco:  " + Smartphone1.preco());
        System.out.println("-------------------------------------------------");
        Smartphone1 = new AcessorioPádrao(Smartphone1);
        System.out.println("Celualr:   " + Smartphone1.getDescricao());
        System.out.println("Preco:  " + Smartphone1.preco());
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        Smartphone1 = new AcessorioPlus(Smartphone1);
        System.out.println("Carro:   " + Smartphone1.getDescricao());
        System.out.println("Preco:  " + Smartphone1.preco());
        System.out.println("-------------------------------------------------");
        System.out.println();

        Celular Smartphone2 = new Apple();
        System.out.println("-------------------------------------------------");
        System.out.println("Celular:   " + Smartphone2.getDescricao());
        System.out.println("Preco:  " + Smartphone2.preco());
        Smartphone2 = new FoneSemFio(Smartphone2);
        System.out.println("-------------------------------------------------");
        System.out.println("Celular:   " + Smartphone2.getDescricao());
        System.out.println("Preco:  " + Smartphone2.preco());
        Smartphone2 = new CarregadorApple(Smartphone2);
        System.out.println("-------------------------------------------------");
        System.out.println("Celular:   " + Smartphone2.getDescricao());
        System.out.println("Preco:  " + Smartphone2.preco());
        Smartphone2 = new PeliculaDeVidro(Smartphone2);
        System.out.println("-------------------------------------------------");
        System.out.println("Celular:   " + Smartphone2.getDescricao());
        System.out.println("Preco:  " + Smartphone2.preco());

    }
    

}
