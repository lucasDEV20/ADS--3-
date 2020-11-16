/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Computador
 */
public class janela {//classe 
    
    
    //Atributos (variaveis) /atributos do tipo private 
    private static final janela INSTANCE = new janela();
    private static final String Teste = "ola qual o seu nome? ";
    //as variaveis acima nao serao vistas , fora da classe
    //------------------------------------------------------
    //atributos publicos 
    public static final String SingTon = "meu nome e tony! ";
    //AS variavies acima serao vistas em qualquer lugar 
    
    private janela(){
        //o lindo e bonito construtor solicitario e priivado 
    }
    
    
    public static janela getinstance(){
        return INSTANCE;
        //metodo responsavel o controle da segunda instancia 
    }
    
    
    //estes metodos abaixo sera visto em todo o sistema 
    //podera serr visto e executado em qualquer lugar do prohjeto 
    public static void Abrir(){
    System.out.println("tonny abriu a janela.........");
    }
    
    
    //podera ser visto e executado  em qualquer lugar do projeto 
    public static void Fechar(){
    System.out.println("tonny abriu a janela.........");
    }
}
