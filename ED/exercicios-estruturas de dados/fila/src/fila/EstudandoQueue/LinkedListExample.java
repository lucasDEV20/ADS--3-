package fila.EstudandoQueue;

import java.util.PriorityQueue;
import java.util.Queue;

class livro implements Comparable<livro> {

    int id;
    String name, author, publisher;
    int quantity;

    public livro(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public int compareTo(livro b) {
        if (id > b.id) {
            return 1;
        } else if (id < b.id) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class LinkedListExample {

    public static void main(String[] args) {
        Queue<livro> queue = new PriorityQueue<livro>();
        //Criaçao do objeto livro 
        //criaçao do livro 
        livro livro1 = new livro(001, "A arte da guerra", "Sun Tzu", "record", 8);
        livro livro2 = new livro(002, "Harry Photer", "j roling", "ert", 6);
        livro livro3 = new livro(003, "java ", "Eugenio junior", "eldorado ", 4);
        livro livro4 = new livro(004, "EuAmoLinux", "Vinnicios lopea", "BPB", 8);
        livro livro5 = new livro(005, "Operating System", "Galvin", "Wiley", 6);
        livro livro6 = new livro(006, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        livro livro7 = new livro(007, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        livro livro8 = new livro(8, "Operating System", "Galvin", "Wiley", 6);
        livro livro9 = new livro(9, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);

        //Adicionando livros a fila  
        queue.add(livro1);
        queue.add(livro2);
        queue.add(livro3);
        queue.add(livro4);
        queue.add(livro5);
        queue.add(livro6);
        queue.add(livro7);
        queue.add(livro8);
        queue.add(livro9);

        System.out.println("\"Percorrendo os elementos da fila:");
        //Traversing queue elements  
        for (livro b : queue) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
        queue.remove();
        System.out.println("Depois de remover um registro de livro:");
        for (livro b : queue) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
