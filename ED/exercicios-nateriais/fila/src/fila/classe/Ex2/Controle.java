/*
//2. Escreva um programa que simule o controle de uma pista de decolagem de
//aviões em um aeroporto. Neste programa, o usuário deve ser capaz de
//realizar as seguintes tarefas:
//a) Listar o número de aviões aguardando na fila de decolagem;
//b) Autorizar a decolagem do primeiro avião da fila;
//c) Adicionar um avião à fila de espera;
//d) Listar todos os aviões na fila de espera;
//e) Listar as características do primeiro avião da fila.
 */
package fila.classe.Ex2;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Computador
 */
public class Controle {

    private final Queue<Aviao> espera = new LinkedList<>();

    public void listar() {
        System.out.println("============ LISTANDO ============");
        this.espera.forEach(a -> System.out.println(a));
    }

    public void listarPrimeiro() {
        System.out.println("============ PRIMEIRO ============");
        System.out.println(this.espera.element());
    }

    public void adicionar(Aviao aviao) {
        System.out.println("=========== ADICIONANDO ===========");
        System.out.println(aviao);
        this.espera.add(aviao);
    }

    public Aviao autorizarDecolagem() {
        Aviao aviao;

        aviao = this.espera.remove();
        System.out.println("====== AUTORIZANDO DECOLAGEM ======");
        System.out.println(aviao);

        return aviao;
    }

    public static void main(String[] args) {
        Controle controle = new Controle();

        controle.adicionar(new Aviao("Tam", 747));
        controle.adicionar(new Aviao("Gol", 737));
        controle.adicionar(new Aviao("Azul", 722));
        controle.adicionar(new Aviao("Avianca", 437));
        controle.adicionar(new Aviao("LaTam", 223));
        controle.adicionar(new Aviao("CanabsC", 420));
        controle.listar();
        controle.autorizarDecolagem();
        controle.listar();
    }
}
