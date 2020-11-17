/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila.classe.Ex2;

/**
 *
 * @author Computador
 */
public class Aviao {

    private String nome;
    private int codigo;

    public Aviao(String nome, int codigo) {
        super();
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void autorizacao(Aviao autorizacao) {
        System.out.println("Favor confirmar a autorização do vôo.");
    }

    @Override
    public String toString() {
        return this.getCodigo() + " - " + this.getNome();
    }
}
