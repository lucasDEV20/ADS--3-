/*
A interface Java Queuejava.util.Queue 
representa uma estrutura de dados projetada 
para ter elementos inseridos no final da fila e 
elementos removidos do início da fila. Isso é semelhante 
ao funcionamento de uma fila de supermercado.

Ilustração de uma fila
A Queueinterface Java é um subtipo da interface Java Collection . 
Ele representa uma sequência ordenada de objetos como uma Lista Java , 
mas seu uso pretendido é um pouco diferente. Como a interface Java Queue é um subtipo da Collectioninterface Java , 
todos os métodos da Collectioninterface também estão disponíveis na Queueinterface.
 */
package fila.EstudandoQueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class entendendoQueue {

    /**
     * LinkedListé uma implementação de fila bastante padrão. Os elementos da
     * fila são armazenados internamente em uma estrutura de dados de lista
     * vinculada padrão. Isso agiliza a inserção de elementos no final (cauda)
     * da lista e a remoção de elementos do início (início) da lista.
     *
     * PriorityQueuearmazena seus elementos internamente de acordo com sua ordem
     * natural (se eles implementam Comparable), ou de acordo com um
     * Comparatorpassado ao PriorityQueue.
     *
     *
     */
    //criando instancia da fila 
    Queue queueA = new LinkedList();
    Queue queueB = new PriorityQueue();
    /*
    Na maioria das Queueimplementações, 
    o início e o fim da fila estão em extremidades opostas.
    É possível, no entanto, implementar a Queueinterface de 
    forma que o início e o fim da fila fiquem na mesma extremidade.
    Nesse caso, você teria uma pilha.
     */

    //exemplo de objeto de uma  fila generica 
    //tornando assim possivel fazer uma lista generica dentro da fila 
//    Queue<ObjetoTeste> queue = new LinkedList<ObjetoTeste>();
//    ObjetoTeste  objetoTeste = queue.remove();
//
//
//
//    Normalizer.Form    
    //do someting to anObject...
    //do someting to anObject...
    /*
    [-Método----------------------Descrição------------------------------------------------------~]
    [-boolean add (objeto)--------É usado para inserir o elemento especificado nesta--------------] 
    [-----------------------------fila e retornar verdadeiro em caso de sucesso.------------------]
    [---------------------------------------------------------------------------------------------]
    [-oferta booleana (objeto)----Ele é usado para inserir o elemento especificado nesta fila.----]
    [---------------------------------------------------------------------------------------------]
    [-Remover objeto ()-----------Ele é usado para recuperar e remover o início desta fila.-------]
    [---------------------------------------------------------------------------------------------]
    [-Pesquisa de objeto ()-------Ele é usado para recuperar e remover o início desta-------------] 
    [----------------------------fila ou retorna nulo se a fila estiver vazia.--------------------]
    [---------------------------------------------------------------------------------------------]
    [-Elemento de objeto ()-------Ele é usado para recuperar, mas não remove, o topo dessa fila.--]
    [-Objeto peek ()--------------Ele é usado para recuperar, mas não remove,---------------------]
    [---------------------------o cabeçalho desta fila ou retorna nulo se a fila estiver vazia.---]
    [---------------------------------------------------------------------------------------------]
     *
FONTE : https://www.javatpoint.com/java-priorityqueue
*/
}

