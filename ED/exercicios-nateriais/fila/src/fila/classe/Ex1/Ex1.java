/*
1. Desenvolva um programa que represente um fila de espera de um
consultório médico. Considere que os pacientes são registrados na fila assim
que chegam à sala de espera e ficam aguardando o chamado do médico,
que obedece a ordem de chegada. O programa deve permitir:
a) Inserir um paciente na fila de espera;
b) Chamar o paciente para ser atendido;
c) Verificar se a fila está cheia ou vazia;
d) Verificar o próximo paciente a ser atendido;
e) Informar quantos pacientes existem na fila de espera.
Considere que os pacientes possuem: CPF, Nome, fone e e-mail.
 */
package fila.classe.Ex1;

//************ MENU ******************
import javax.swing.JOptionPane;

public class Ex1 {

    public static void main(String[] args) {
        int item;
        int codPaciente;
        String nomeDoPaciente;
// String nmPaciente;
        MetodosQueue metodosQueue = new MetodosQueue(10);
        do { //inicio do enquanto
            item = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "******************************\n"
                    + "** MENU DE OPÇÕES **\n"
                    + "* 1 - Inserir Paciente*\n"
                    + "* 2 - Chamar o Paciente p/ ser atendido *\n"
                    + "* 3 - Fila cheia ou vazia?* \n"
                    + "* 4 - Próximo Paciente a ser atendido *\n"
                    + "* 5 - Quantidade de Pacientes na fila*\n"
                    + "* 6 - Sair *\n"
                    + "******************************\n"
                    + "Digite sua opção: \n", "Consultório Médico",
                    JOptionPane.INFORMATION_MESSAGE));

            switch (item) { //inicio do case
                case 1: { //cadastrar correspondencias
                    if (!metodosQueue.isFull()) {
                        
                       
                        codPaciente = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite oCódigo dopaciente ", "Consultório Médico !", JOptionPane.INFORMATION_MESSAGE));
// nmPaciente = JOptionPane.showInputDialog("Informe o nome dopaciente:");
                        metodosQueue.insert(codPaciente);
                    
                    } else {
                        JOptionPane.showMessageDialog(null, "Fila cheia! ");
                    }
                }
                break;
                case 2: { //remover paciente
                    // delete item from stack
                    if (!metodosQueue.isEmpty()) {
                        long value = metodosQueue.remove();
                        JOptionPane.showMessageDialog(null, "Paciente chamado para seratendido: " + value);
                    }
                }
                break;
                case 3: {
                    if (metodosQueue.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Fila vazia!");
                    } else {
                        if (metodosQueue.isFull()) {
                            JOptionPane.showMessageDialog(null, "Fila cheia!");
                        } else {
                            JOptionPane.showMessageDialog(null, "A Fila não está cheia, mastambém, não está vazia !");
                        }
                    }
                }
                break;
                case 4: {
                    if (!metodosQueue.isEmpty()) {
                        long value = metodosQueue.peekFront(); // identificar o proximo.
                        JOptionPane.showMessageDialog(null, "Proxima da fila: " + value);
                    }
                }
                break;
                case 5: {
                    long value = metodosQueue.size(); // qtd de pacientes na fila
                    JOptionPane.showMessageDialog(null, "Quantidade de pacientes na fila: " + value);
                }
                break;
                default: {
                    if (item != 6) {
                        JOptionPane.showMessageDialog(null, "Valor inválido, digite novamente!");
                    } else {
                        if (item == 6) {
                            JOptionPane.showMessageDialog(null, "Você está saindo do programa!");
                        }
                    }
                }
                break;
            }
        } while (item != 6);
    }
}
