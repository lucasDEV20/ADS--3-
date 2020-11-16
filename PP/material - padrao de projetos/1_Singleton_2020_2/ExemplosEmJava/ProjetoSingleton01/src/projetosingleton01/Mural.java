/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosingleton01;

/**
 *
 * @author eugenio
 */
public class Mural {
    //Atributos
    private String titulo;
    private String texto;
    // Metodos
    public Mural (String titulo){
        this.titulo = titulo;
        texto = titulo + "\n";
    }
    public String getTitulo(){ return titulo;}
    public String getTexto(){ return texto;}
    public void setTexto(String texto){ this.texto += texto + "\n";}
}
