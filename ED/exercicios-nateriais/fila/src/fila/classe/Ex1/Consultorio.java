/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila.classe.Ex1;

/**
 *
 * @author Computador
 */
//************ CONSULTORIO ******************
import javax.swing.JOptionPane;
public class Consultorio {
private Integer codPaciente;
// private String nmPaciente;
public Integer getCodPaciente() {
return codPaciente;
}
public void setCodPaciente(Integer codPaciente) {
this.codPaciente = codPaciente;
}
// public String getNmPaciente() {
// return nmPaciente;
// }
// public void setNmPaciente(String nmPaciente) {
// this.nmPaciente = nmPaciente;
// }
public void displayConsultorio(){
JOptionPane.showMessageDialog(null, "Código do Paciente: "+ codPaciente);
}
}
