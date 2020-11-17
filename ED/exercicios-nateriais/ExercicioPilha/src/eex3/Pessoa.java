/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eex3;

/**
 *
 * @author Computador
 */
public class Pessoa {
    

    private static String nome;
    private static String dataNascimento;
    private static float altura;
    private static float peso;
    private static float idade;

    public Pessoa() {
    }

    public static String getNome() {
        return nome;
    }

    public static String getDataNascimento() {
        return dataNascimento;
    }

    public static float getAltura() {
        return altura;
    }

    public static float getPeso() {
        return peso;
    }

    public static float getIdade() {
        return idade;
    }

    public static void setNome(String nome) {
        Pessoa.nome = nome;
    }

    public static void setDataNascimento(String dataNascimento) {
        Pessoa.dataNascimento = dataNascimento;
    }

    public static void setAltura(float altura) {
        Pessoa.altura = altura;
    }

    public static void setPeso(float peso) {
        Pessoa.peso = peso;
    }

    public static void setIdade(float idade) {
        Pessoa.idade = idade;
    }

    void exibirMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
   
}
