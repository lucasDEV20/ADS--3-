
public class Lista {
    private final int MAXTAM;//final (constante)
    private int array[];
    private int ultimo;
    //contrutor
    public Lista(int tamanho){
        if(tamanho <= 0)
            throw new RuntimeException("Tamanho tem que ser maior que zero");
        MAXTAM = tamanho;
        array = new int[MAXTAM];
        ultimo=-1;
    }
    public boolean listaVazia(){
        return ultimo == -1;
//        if(ultimo == -1)
//            return true;
//        return false;
    }
    public boolean listaCheia(){
        return ultimo + 1 == MAXTAM;
    }
    //quantidade de elementos armezanados na lista
    public int listaTamanho(){
        return ultimo+1;
    }
    //insere início ==> inserir o elemento na posição zero e deslocar o demais para frente
    public void insereInicio(int elemento){
        if(listaCheia())
            throw new RuntimeException("Lista Cheia");
        ultimo++;
        for (int i = ultimo; i>0; i--) {
            array[i] = array[i-1]; 
        }
        array[0]=elemento;
    }
    public void insereFim(int elemento){
        if(listaCheia())
            throw new RuntimeException("Lista Cheia");
        //ultimo++;
        array[++ultimo]=elemento;
    }
    public void inserePosicao(int posicao, int elemento){
        if(listaCheia())
            throw new RuntimeException("Lista Cheia");
        if(posicao<0 || posicao > ultimo+1)
            throw new RuntimeException("Posição inválida");
        ultimo++;
        for (int i = ultimo; i > posicao; i--) {
            array[i] = array[i-1];
        }
        array[posicao]=elemento;
    }
    public void removeInicio(){
        if(listaVazia())
            throw new RuntimeException("Lista Vazia");
        for (int i = 0; i < ultimo; i++) {
            array[i] = array[i+1];
        }
        ultimo--;
    }
    public void removeFim(){
        if(listaVazia())
            throw new RuntimeException("Lista Vazia");
        ultimo--;
    }
    public void removePosicao(int posicao){
        if(listaVazia())
            throw new RuntimeException("Lista Vazia");
        if(posicao<0 || posicao > ultimo)
            throw new RuntimeException("Posição inválida");
        for (int i = posicao; i < ultimo; i++) {
            array[i] = array[i+1];
        }
        ultimo--;
    }
    //retorna true, caso elemento seja removido
    //retorna false, caso o elemento não existe
    public boolean removeElemento(int elemento){
        int pos = buscaElemento(elemento);
        if(pos == -1)
            return false;
        removePosicao(pos);
        return true;
    }
    //retorna a posição do elemento, caso o elemento existe na lista
    //retorna -1, caso contrário 
    public int buscaElemento(int elemento){
        for (int i = 0; i <= ultimo; i++) {
            if(array[i] == elemento)
                return i;
        }
        return -1;
    }
    public int getInicio(){
        if(listaVazia())
            throw new RuntimeException("Lista Vazia");
        return array[0];
    }
    public int getFim(){
        if(listaVazia())
            throw new RuntimeException("Lista Vazia");
        return array[ultimo];
    }
    public int getPosicao(int posicao){
        if(listaVazia())
            throw new RuntimeException("Lista Vazia");
        if(posicao<0 || posicao > ultimo)
            throw new RuntimeException("Posição inválida");
        return array[posicao];
    }
    //torna a lista vazia
    public void destroi(){
        ultimo = -1;
    }
    //mostra a lista
    public void mostraLista(){
        if(listaVazia()){
            System.out.println("Lista Vazia");
        }else{
            System.out.println("Elementos da lista");
            for (int i=0;i <= ultimo; i++) {
                System.out.printf("%d\t",array[i]);
            }
            System.out.println("");
        }
    }
}
