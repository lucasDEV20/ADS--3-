package fila.EstudandoQueue;

import java.util.Iterator;
import java.util.PriorityQueue;



class TestCollection12 {
 
    public static void main(String args[]) {

        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("LUCAS");
        queue.add("VINICIOS");
        queue.add("MARCOS");
        queue.add("JHONATHAN");
        queue.add("PAULO MIA");
        queue.add("ABNER");
        queue.add("VITOR");
        queue.add("JOBS");
        queue.add("FABRICIO");
        queue.add("MIA");
        queue.add("CAIO");
        queue.add("DANIEL");
        queue.add("BRUNO");
        queue.add("ELDER");
        queue.add("SHEYLA");

        //vai pegar os elementos que estao em orden alfabeticaa 
        //colocando os comas letra a em cima 
        System.out.println("Cabeça:" + queue.element());
        System.out.println("Cabeça:" + queue.peek());

        System.out.println("iterando os elementos da fila:");
        //COMELÇO DA FILA 
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        queue.remove();
        queue.poll();
        //FIANAL DA FILA 
        System.out.println("depois de remover dois elementos:");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

    }
}
