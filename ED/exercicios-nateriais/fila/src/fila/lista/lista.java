//1. Desenvolva um programa que represente um fila de espera de um
//consultório médico. Considere que os pacientes são registrados na fila assim
//que chegam à sala de espera e ficam aguardando o chamado do médico,
//que obedece a ordem de chegada. O programa deve permitir:

//a) Inserir um paciente na fila de espera;
//b) Chamar o paciente para ser atendido;
//c) Verificar se a fila está cheia ou vazia;
//d) Verificar o próximo paciente a ser atendido;
//e) Informar quantos pacientes existem na fila de espera.

//Considere que os pacientes possuem: CPF, Nome, fone e e-mail.
//2. Escreva um programa que simule o controle de uma pista de decolagem de
//aviões em um aeroporto. Neste programa, o usuário deve ser capaz de
//realizar as seguintes tarefas:
//a) Listar o número de aviões aguardando na fila de decolagem;
//b) Autorizar a decolagem do primeiro avião da fila;
//c) Adicionar um avião à fila de espera;
//d) Listar todos os aviões na fila de espera;
//e) Listar as características do primeiro avião da fila.
//Considere que os aviões possuem um nome e um número inteiro como
//identificador. Adicione outras características conforme achar necessário.
//3. Dada uma string de caracteres formada por uma sequência de letras e
//dígitos, construa uma função que retorne uma fila na qual as letras são
//mantidas na sequência original e os dígitos são colocados na ordem inversa.
//Exemplos:
//A1E5T7W8G → AETWG8751
//3C9H4Q6 → CHQ6493
//Como mostram os exemplos, as letras devem ser mostradas primeiro,
//seguidas dos dígitos.
//Sugestão: usar na função uma fila e uma pilha;
//4. Considere a implementação de filas usando arranjos “circulares”. Escreva
//um método na classe Fila chamado furaFila(int x) que insere um inteiro na
//primeira posição da fila. O detalhe é que seu procedimento deve ser O(1), ou
//seja, não pode movimentar os outros itens da fila. (observe que neste caso,
//estaremos desrespeitando o conceito de FILA – primeiro a entrar é o
//primeiro a sair).
//5. Se uma fila representada por arranjos (vetores) não é considerada circular,
//sugere-se que cada operação Desenfileira deve deslocar para “frente” todos
//elementos restantes de uma fila. Uma maneira alternativa é adiar o
//deslocamento até que “fim” seja igual ao último índice do vetor. Quando
//essa situação ocorre e faz-se uma tentativa de inserir um elemento na fila, a
//fila inteira é deslocada para “frente”, de modo que o primeiro elemento da fila
//fique na primeira posição do vetor, ou posição 0, implementação em Java. 
//Quais são as vantagens desse método sobre um deslocamento em cada
//operação Desenfileira? Quais as desvantagens? Reescreva métodos
//Desenfileira, Enfileira e Vazia usando essa nova maneira.
//6. Desenhe o array q interno da classe Fila após as operações do código
//abaixo. Não se esqueça de representar o (1) tamanho da array, (2) os seus
//elementos e as (3) posições em que se encontram estes elementos. Caso
//não seja possível realizar alguma operação, ignore-a. main()
// {
// Fila q = new Fila(8);
// q.pop();
// q.push(1);
// q.push(2);
// q.push(3);
// q.push(4);
// q.push(5);
// q.pop();
// q.pop();
// q.pop();
// q.push(6);
// q.push(7);
// q.push(8);
// q.push(9);
// }
