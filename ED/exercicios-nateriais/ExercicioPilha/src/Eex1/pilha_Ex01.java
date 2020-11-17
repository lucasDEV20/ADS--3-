    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eex1;

/**
 *
 * @author Computador
 */
public class pilha_Ex01 {
    
    private int tamanho;
    private int[] array;
    private int topo = - 1;

    public pilha_Ex01(int tamanho) {
        if (tamanho > 0) {
            this.tamanho = tamanho;
            this.array = new int[tamanho];
        } else {
            throw new RuntimeException("Os valores devem ser maiores que zero") {
            };
        }
    }

    public pilha_Ex01() {
        this(10);
    }

    public void inserir(int elemento) {
        if (estaCheia()) {
            throw new RuntimeException("Pilha cheia");
        }
        array[topo + 1] = elemento;
        topo++;
    }

    public void retirar() {
        if (estaVazia()) {
            throw new RuntimeException("pilha vazia");
        }
        topo--;
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == (tamanho - 1);
    }

    public int quantidadeElementos() {
        return topo + 1;
    }

    public int consultar() {
        return array[topo];
    }

    public void esvaziar() {
        topo = -1;
    }
}
