/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila.classe;

/**
 *
 * @author Computador
 */
public class Fila {

    private int tamanho;
    private int inicio;
    private int fim;
    private int array[];
    private int qautidadeelementos;
    private int elemento;

    public Fila() {
        this(10);//CHAMA  O BENDITO DO CONTRUTOR
    }

    public Fila(int tamanho) {

        if (tamanho <= 0) {

            throw new RuntimeException("Tammanho tem que ser maior que zero");
        }
        this.tamanho = tamanho;
        this.array = new int[tamanho];
        inicio = 0;
        fim = 0;
        qautidadeelementos = 0;

    }

    public boolean empty() {
        return qautidadeelementos == 0;
    }

    public int size() {
        return qautidadeelementos;
    }

    //enfilerar
    public void enqueue(int elememto) {
        if (qautidadeelementos == tamanho) 
            throw new RuntimeException("fila cheia");
        

        array[fim] = elemento;

        fim = (fim + 1) % tamanho;//resto da divisao e zero 
        qautidadeelementos++;
        //o fim pode estar em quaalquerr lugar do vetor 
        //se eu tenho lugar pra colabcar
        //eu tenho que colacar ele la no fim 
        //kpara fazer a inclusao 
        //tomar cuidado com o desefilerar 

    }

    public void dequeue() {
        if (empty()) 
            throw new RuntimeException("fila vazia");
        inicio = (inicio + 1 )% tamanho;

        qautidadeelementos++;


    }
    public int peek(){
        if (empty()) 
            
        throw  new RuntimeException("fila vazia");
        return array[inicio];
        
    }
    public void destroy(){
        inicio = 0;
        fim = 0;
        qautidadeelementos = 0;
    }

    
}
