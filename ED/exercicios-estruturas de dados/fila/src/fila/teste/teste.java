/*
classe de teste
 */
package fila.teste;

import fila.classe.Fila;
import java.util.Random;

/**
 *
 * @author lucas 
 */
public class teste {
    public static void main(String[] args) {
        Fila fila = new Fila(3);
        Random rd = new Random();
                
        try {
            fila.enqueue(1);
            fila.enqueue(2);
            fila.enqueue(3);
            fila.dequeue();
            fila.enqueue(4);
            fila.dequeue();
            fila.dequeue();
            System.out.println("frente " + fila.peek());
            fila.dequeue();
            fila.dequeue();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        
    }
}
