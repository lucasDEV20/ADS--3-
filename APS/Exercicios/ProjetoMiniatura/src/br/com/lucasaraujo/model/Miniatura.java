/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucasaraujo.model;


import java.util.Date;
import java.util.List;

/**
 *
 * @author Computador
 */
public class Miniatura {

    //atributos
    //atributos que recebem valores inteiros 
    private int min_iden;
    private Date min_ano;
    private int min_edicao;
    private int min_escala;
    //atributos que recebem valores em String 
    private String min_modelo;
    private String min_observacoes;
    //atributos que recebem valores em double 
    private double min_valor;
    //atributos que recebem valores do tipo Fabricante 
    private Fabricante fabricante;
    //atributos que recebem valores do tipo Miniatura
    private Tipo_miniatura tipo_miniatura;
    //atributos que recebem valores do tipo temas
    private Tema tema;
    
    //arraylist
    List<Foto> foto;

    //contrutor padrao 
    public Miniatura() {

    }

    //contrutores ccm paremetros derivados dos atributos 
    public Miniatura(int min_iden, Date min_ano, int min_edicao, int min_escala, String min_modelo, String min_observacoes, double min_valor, Fabricante fabricante, Tipo_miniatura tipo_miniatura, Tema temas, List<Foto> fotos) {
        this.min_iden = min_iden;
        this.min_ano = min_ano;
        this.min_edicao = min_edicao;
        this.min_escala = min_escala;
        this.min_modelo = min_modelo;
        this.min_observacoes = min_observacoes;
        this.min_valor = min_valor;
        this.fabricante = fabricante;
        this.tipo_miniatura = tipo_miniatura;
        this.tema = temas;
        this.foto = fotos;
    }

    //set's

    public int getMin_iden() {
        return min_iden;
    }

    public Date getMin_ano() {
        return min_ano;
    }

    public int getMin_edicao() {
        return min_edicao;
    }

    public int getMin_escala() {
        return min_escala;
    }

    public String getMin_modelo() {
        return min_modelo;
    }

    public String getMin_observacoes() {
        return min_observacoes;
    }

    public double getMin_valor() {
        return min_valor;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public Tipo_miniatura getTipo_miniatura() {
        return tipo_miniatura;
    }

    public Tema getTema() {
        return tema;
    }

    public List<Foto> getFoto() {
        return foto;
    }

    public void setMin_iden(int min_iden) {
        this.min_iden = min_iden;
    }

    public void setMin_ano(Date min_ano) {
        this.min_ano = min_ano;
    }

    public void setMin_edicao(int min_edicao) {
        this.min_edicao = min_edicao;
    }

    public void setMin_escala(int min_escala) {
        this.min_escala = min_escala;
    }

    public void setMin_modelo(String min_modelo) {
        this.min_modelo = min_modelo;
    }

    public void setMin_observacoes(String min_observacoes) {
        this.min_observacoes = min_observacoes;
    }

    public void setMin_valor(double min_valor) {
        this.min_valor = min_valor;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public void setTipo_miniatura(Tipo_miniatura tipo_miniatura) {
        this.tipo_miniatura = tipo_miniatura;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public void setFoto(List<Foto> foto) {
        this.foto = foto;
    }
    

}

