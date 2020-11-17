/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_1;

/**
 *
 * @author Computador
 */
public class CharFreq {
    private int freq;
    private char ch;
    
    public CharFreq(){
        freq = 0;
        ch = 0;
    }

    public CharFreq(int freq, char ch) {
        this.freq = freq;
        this.ch = ch;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    @Override
    public String toString() {
        return String.format("%c\t%d", ch,freq);
    }
    
}
