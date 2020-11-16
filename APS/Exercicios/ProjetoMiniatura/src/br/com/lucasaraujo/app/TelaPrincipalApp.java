/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lucasaraujo.app;

import br.com.lucasaraujo.bll.FabricanteBll;
import br.com.lucasaraujo.bll.MiniaturaBll;
import br.com.lucasaraujo.bll.TemaBll;
import br.com.lucasaraujo.bll.Tipo_MiniaturaBll;
import br.com.lucasaraujo.model.Fabricante;
import br.com.lucasaraujo.model.Miniatura;
import br.com.lucasaraujo.model.Tema;
import br.com.lucasaraujo.model.Tipo_miniatura;
import java.awt.Component;
import java.awt.Container;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Computador
 */
public class TelaPrincipalApp extends javax.swing.JFrame {

    /**
     * Creates new form CadastroDeFabricante
     */
    public static void limparCampos(Container container) {
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JFormattedTextField) {
                JFormattedTextField field = (JFormattedTextField) component;
                field.setValue(null);
            } else if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                field.setText("");
            } else if (component instanceof JTextArea) {
                JTextArea area = (JTextArea) component;
                area.setText("");
            }

        }
    }

    public TelaPrincipalApp() {
        initComponents();
        this.setLocationRelativeTo(rootPane);
        try {
            atualizarTabelaDeTemas();
            atualizarTabelaDeFabricantes();
            atualizarTabelaDeTipoMiniatura();
//            atualizarTabelaMiniatura();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());    // Exibe mensagem em caso de erro
        }
    }
    private void limpar()
{
  
     jTextFielEdicao.setText("");
     jTextFieldNomeFabricante.setText("");
     jTextFieldNomeTema.setText("");
     jTextFieldNomeTipoMiniastura.setText("");
     jTextFielEdicao.setText("");
     jTextFieldAno.setText("");
     jTextFieldEscala.setText("");
     jTextFieldMinObs.setText("");
     jTextFieldModelo.setText("");
}

    private void atualizarTabelaDeTemas() throws Exception {
        // Obtém o modelo do Jtable de temas
        DefaultTableModel model = (DefaultTableModel) jTableTema.getModel();
        // Exclui as linhas do jtable atual
        model.setRowCount(0);

        //Obtém a lista de temas com a TemaBll
        List<Tema> temas = TemaBll.getTemas();

        for (Tema tema : temas) { // Para cada tema do resultado da consulta
            model.addRow(new Object[]{ // Inclui uma linha no jTable com os dados do tema cadastrado no banco de dados
                tema.getTem_iden(), // tem_idem do objeto tema cadastrado no banco de dados
                tema.getTem_nome() // tem_nome do objeto tema cadastrado no banco de dados
            });
        }
    }

    private void atualizarTabelaDeFabricantes() throws Exception {
        // Obtém o modelo do Jtable de FABRICANTE
        DefaultTableModel model = (DefaultTableModel) jTableFabricante.getModel();
        // Exclui as linhas do jtable atual
        model.setRowCount(0);

        //Obtém a lista de FABRICANTE com a FabricnateBll
        List<Fabricante> fabricantes = FabricanteBll.getFabricantes();

        for (Fabricante fabricante : fabricantes) { // Para cada fabricante do resultado da consulta
            model.addRow(new Object[]{ // Inclui uma linha no jTable com os dados do fabrocante cadastrado no banco de dados
                fabricante.getFab_iden(), // fab_idem do objeto fabocantes cadastrado no banco de dados
                fabricante.getFab_nome()// fab_nome do objeto fabricantes cadastrado no banco de dados
            });
        }
    }

    private void atualizarTabelaDeTipoMiniatura() throws Exception {
        // Obtém o modelo do Jtable de FABRICANTE
        DefaultTableModel model = (DefaultTableModel) jTableTipoMINIATURA.getModel();
        // Exclui as linhas do jtable atual
        model.setRowCount(0);

        //Obtém a lista de FABRICANTE com a FabricnateBll
        List<Tipo_miniatura> tipo_miniaturas = Tipo_MiniaturaBll.getTipo_miniaturas();

        for (Tipo_miniatura tipo_miniatura : tipo_miniaturas) { // Para cada fabricante do resultado da consulta
            model.addRow(new Object[]{ // Inclui uma linha no jTable com os dados do fabrocante cadastrado no banco de dados
                tipo_miniatura.getTm_iden(), // fab_idem do objeto fabocantes cadastrado no banco de dados
                tipo_miniatura.getTm_tipo()// fab_nome do objeto fabricantes cadastrado no banco de dados
            });
        }
    }

    private void atualizarTabelaMiniatura() throws Exception {
        // Obtém o modelo do Jtable de FABRICANTE
        DefaultTableModel model = (DefaultTableModel) jTableMiniatura.getModel();
        // Exclui as linhas do jtable atual
        model.setRowCount(0);

        //Obtém a lista de FABRICANTE com a FabricnateBll
        List<Miniatura> miniaturas = MiniaturaBll.getMiniaturas();

        for (Miniatura miniatura : miniaturas) { // Para cada fabricante do resultado da consulta
            model.addRow(new Object[]{ // Inclui uma linha no jTable com os dados do fabrocante cadastrado no banco de dados
                miniatura.getMin_iden(), // fab_idem do objeto fabocantes cadastrado no banco de dados
                miniatura.getMin_ano(),// fab_nome do objeto fabricantes cadastrado no banco de dados
                miniatura.getMin_edicao(),
                 miniatura.getMin_escala(),
                 miniatura.getMin_modelo(),
                 miniatura.getMin_observacoes(),
                 miniatura.getMin_valor()
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneTelas = new javax.swing.JTabbedPane();
        jPanelFabricante = new javax.swing.JPanel();
        jPanel6Fabricante = new javax.swing.JPanel();
        jScrollPanefabricante = new javax.swing.JScrollPane();
        jTableFabricante = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabelNomeFabricante = new javax.swing.JLabel();
        jTextFieldNomeFabricante = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButtonEXCLUIR = new javax.swing.JButton();
        jButtonALTERARfabricante = new javax.swing.JButton();
        jButtonINCLUIRFabricante = new javax.swing.JButton();
        jPanelTipoMiniatura = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPanefabricante2 = new javax.swing.JScrollPane();
        jTableTipoMINIATURA = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabelNomeTipoMiniatura = new javax.swing.JLabel();
        jTextFieldNomeTipoMiniastura = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jButton9ExcluirTipoMiniatura = new javax.swing.JButton();
        jButton8AlterarTmMiniatura = new javax.swing.JButton();
        jButton7IncluirTmMiiatura = new javax.swing.JButton();
        jPanelTema = new javax.swing.JPanel();
        jPanel7TEMA = new javax.swing.JPanel();
        jScrollPaneTEMA = new javax.swing.JScrollPane();
        jTableTema = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jButtonExcluirTema = new javax.swing.JButton();
        jButtonAlterarTema = new javax.swing.JButton();
        jButtonIncluirTema = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jTextFieldNomeTema = new javax.swing.JTextField();
        jLabelNomeTema = new javax.swing.JLabel();
        jPanelMiniatura = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPanefabricante8 = new javax.swing.JScrollPane();
        jTableMiniatura = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jButton27 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton25incluirMin = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldIden = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEscala = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFielEdicao = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldAno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldMinObs = new javax.swing.JTextField();
        jPanelFotos = new javax.swing.JPanel();
        jPanel1Foto = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setType(java.awt.Window.Type.UTILITY);

        jTabbedPaneTelas.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPaneTelas.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTabbedPaneTelas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jPanelFabricante.setBackground(new java.awt.Color(255, 204, 204));
        jPanelFabricante.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "fabricante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanelFabricante.setToolTipText("");
        jPanelFabricante.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jPanel6Fabricante.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6Fabricante.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6Fabricante.setForeground(new java.awt.Color(102, 102, 102));

        jTableFabricante.setAutoCreateRowSorter(true);
        jTableFabricante.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableFabricante.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTableFabricante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Fabricante Id", "Fabricante Nome"
            }
        ));
        jTableFabricante.setGridColor(new java.awt.Color(0, 0, 0));
        jTableFabricante.setSelectionBackground(new java.awt.Color(255, 204, 204));
        jTableFabricante.setSelectionForeground(new java.awt.Color(204, 255, 204));
        jTableFabricante.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTableFabricanteAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTableFabricante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableFabricanteMouseReleased(evt);
            }
        });
        jScrollPanefabricante.setViewportView(jTableFabricante);

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dado Fabricantes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabelNomeFabricante.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNomeFabricante.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelNomeFabricante.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNomeFabricante.setText("Nome do Fabricante");

        jTextFieldNomeFabricante.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNomeFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomeFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeFabricante)
                    .addComponent(jTextFieldNomeFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "botões", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));

        jButtonEXCLUIR.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEXCLUIR.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonEXCLUIR.setText("EXCLUIR");
        jButtonEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEXCLUIRActionPerformed(evt);
            }
        });

        jButtonALTERARfabricante.setBackground(new java.awt.Color(255, 255, 255));
        jButtonALTERARfabricante.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonALTERARfabricante.setText("ALTERAR");
        jButtonALTERARfabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonALTERARfabricanteActionPerformed(evt);
            }
        });

        jButtonINCLUIRFabricante.setBackground(new java.awt.Color(255, 255, 255));
        jButtonINCLUIRFabricante.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonINCLUIRFabricante.setText("INCLUIR");
        jButtonINCLUIRFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonINCLUIRFabricanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButtonINCLUIRFabricante)
                .addGap(34, 34, 34)
                .addComponent(jButtonALTERARfabricante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButtonEXCLUIR)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonALTERARfabricante)
                    .addComponent(jButtonEXCLUIR)
                    .addComponent(jButtonINCLUIRFabricante))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPanel6FabricanteLayout = new javax.swing.GroupLayout(jPanel6Fabricante);
        jPanel6Fabricante.setLayout(jPanel6FabricanteLayout);
        jPanel6FabricanteLayout.setHorizontalGroup(
            jPanel6FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6FabricanteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPanefabricante, javax.swing.GroupLayout.DEFAULT_SIZE, 1490, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6FabricanteLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        jPanel6FabricanteLayout.setVerticalGroup(
            jPanel6FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6FabricanteLayout.createSequentialGroup()
                .addGroup(jPanel6FabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6FabricanteLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6FabricanteLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPanefabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelFabricanteLayout = new javax.swing.GroupLayout(jPanelFabricante);
        jPanelFabricante.setLayout(jPanelFabricanteLayout);
        jPanelFabricanteLayout.setHorizontalGroup(
            jPanelFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFabricanteLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel6Fabricante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFabricanteLayout.setVerticalGroup(
            jPanelFabricanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFabricanteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6Fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneTelas.addTab("Fabricantes", jPanelFabricante);
        jPanelFabricante.getAccessibleContext().setAccessibleName("");

        jPanelTipoMiniatura.setBackground(new java.awt.Color(255, 204, 204));
        jPanelTipoMiniatura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Miniatura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanelTipoMiniatura.setForeground(new java.awt.Color(102, 0, 0));

        jPanel8.setBackground(new java.awt.Color(204, 255, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableTipoMINIATURA.setAutoCreateRowSorter(true);
        jTableTipoMINIATURA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableTipoMINIATURA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTableTipoMINIATURA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tipo MIniatura id", "Tipo"
            }
        ));
        jTableTipoMINIATURA.setGridColor(new java.awt.Color(0, 0, 0));
        jTableTipoMINIATURA.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jTableTipoMINIATURA.setSelectionForeground(new java.awt.Color(255, 204, 204));
        jTableTipoMINIATURA.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTableTipoMINIATURAAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTableTipoMINIATURA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableTipoMINIATURAMouseReleased(evt);
            }
        });
        jScrollPanefabricante2.setViewportView(jTableTipoMINIATURA);

        jPanel9.setBackground(new java.awt.Color(255, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "tipo de miniatura - dado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabelNomeTipoMiniatura.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNomeTipoMiniatura.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelNomeTipoMiniatura.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeTipoMiniatura.setText("Nome do tipo de miniatura");

        jTextFieldNomeTipoMiniastura.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldNomeTipoMiniastura.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelNomeTipoMiniatura)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldNomeTipoMiniastura, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeTipoMiniatura)
                    .addComponent(jTextFieldNomeTipoMiniastura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Botoes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jButton9ExcluirTipoMiniatura.setBackground(new java.awt.Color(255, 255, 255));
        jButton9ExcluirTipoMiniatura.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton9ExcluirTipoMiniatura.setText("Excluir");
        jButton9ExcluirTipoMiniatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ExcluirTipoMiniaturaActionPerformed(evt);
            }
        });

        jButton8AlterarTmMiniatura.setBackground(new java.awt.Color(255, 255, 255));
        jButton8AlterarTmMiniatura.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton8AlterarTmMiniatura.setText("Alterar");
        jButton8AlterarTmMiniatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8AlterarTmMiniaturaActionPerformed(evt);
            }
        });

        jButton7IncluirTmMiiatura.setBackground(new java.awt.Color(255, 255, 255));
        jButton7IncluirTmMiiatura.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton7IncluirTmMiiatura.setText("INCLUIR");
        jButton7IncluirTmMiiatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7IncluirTmMiiaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7IncluirTmMiiatura)
                .addGap(18, 18, 18)
                .addComponent(jButton8AlterarTmMiniatura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9ExcluirTipoMiniatura)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9ExcluirTipoMiniatura)
                    .addComponent(jButton8AlterarTmMiniatura)
                    .addComponent(jButton7IncluirTmMiiatura))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(245, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPanefabricante2)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPanefabricante2, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelTipoMiniaturaLayout = new javax.swing.GroupLayout(jPanelTipoMiniatura);
        jPanelTipoMiniatura.setLayout(jPanelTipoMiniaturaLayout);
        jPanelTipoMiniaturaLayout.setHorizontalGroup(
            jPanelTipoMiniaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelTipoMiniaturaLayout.setVerticalGroup(
            jPanelTipoMiniaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTipoMiniaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneTelas.addTab("Tipo Miniatura", jPanelTipoMiniatura);

        jPanelTema.setBackground(new java.awt.Color(255, 204, 204));
        jPanelTema.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Temas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jPanel7TEMA.setBackground(new java.awt.Color(204, 255, 204));
        jPanel7TEMA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableTema.setAutoCreateRowSorter(true);
        jTableTema.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableTema.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTableTema.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Fabricante Id", "Fabricante Nome"
            }
        ));
        jTableTema.setGridColor(new java.awt.Color(0, 0, 0));
        jTableTema.setSelectionBackground(new java.awt.Color(204, 255, 204));
        jTableTema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableTemaMouseReleased(evt);
            }
        });
        jScrollPaneTEMA.setViewportView(jTableTema);

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fabricante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jButtonExcluirTema.setBackground(new java.awt.Color(255, 255, 255));
        jButtonExcluirTema.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonExcluirTema.setText("Excluir");
        jButtonExcluirTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirTemaActionPerformed(evt);
            }
        });

        jButtonAlterarTema.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAlterarTema.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonAlterarTema.setText("ALTERAR");
        jButtonAlterarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarTemaActionPerformed(evt);
            }
        });

        jButtonIncluirTema.setBackground(new java.awt.Color(255, 255, 255));
        jButtonIncluirTema.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonIncluirTema.setText("INCLUIR");
        jButtonIncluirTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirTemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jButtonIncluirTema)
                .addGap(44, 44, 44)
                .addComponent(jButtonAlterarTema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButtonExcluirTema)
                .addGap(45, 45, 45))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluirTema)
                    .addComponent(jButtonAlterarTema)
                    .addComponent(jButtonIncluirTema))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "dado tema", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        jTextFieldNomeTema.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldNomeTema.setForeground(new java.awt.Color(102, 102, 102));

        jLabelNomeTema.setBackground(new java.awt.Color(153, 0, 0));
        jLabelNomeTema.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelNomeTema.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeTema.setText("Nome do Tema");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelNomeTema)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldNomeTema, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeTema)
                    .addComponent(jTextFieldNomeTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel7TEMALayout = new javax.swing.GroupLayout(jPanel7TEMA);
        jPanel7TEMA.setLayout(jPanel7TEMALayout);
        jPanel7TEMALayout.setHorizontalGroup(
            jPanel7TEMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7TEMALayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 211, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7TEMALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneTEMA)
                .addContainerGap())
        );
        jPanel7TEMALayout.setVerticalGroup(
            jPanel7TEMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7TEMALayout.createSequentialGroup()
                .addGroup(jPanel7TEMALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTEMA, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanelTemaLayout = new javax.swing.GroupLayout(jPanelTema);
        jPanelTema.setLayout(jPanelTemaLayout);
        jPanelTemaLayout.setHorizontalGroup(
            jPanelTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7TEMA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTemaLayout.setVerticalGroup(
            jPanelTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTemaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7TEMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneTelas.addTab("Tema", jPanelTema);

        jPanelMiniatura.setBackground(new java.awt.Color(204, 255, 204));
        jPanelMiniatura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Miniatura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jPanel14.setBackground(new java.awt.Color(255, 204, 204));
        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableMiniatura.setAutoCreateRowSorter(true);
        jTableMiniatura.setForeground(new java.awt.Color(153, 153, 153));
        jTableMiniatura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "miniatura Id", "ano", "ediçao", "escola", "modelo", "observaçao", "valor", "fabricante", "tipo fabricante", "tema", "foto"
            }
        ));
        jTableMiniatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableMiniaturaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableMiniaturaMouseReleased(evt);
            }
        });
        jScrollPanefabricante8.setViewportView(jTableMiniatura);

        jPanel11.setBackground(new java.awt.Color(255, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Botoes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jButton27.setBackground(new java.awt.Color(102, 0, 0));
        jButton27.setText("jButton3");

        jButton26.setBackground(new java.awt.Color(102, 0, 0));
        jButton26.setText("jButton2");

        jButton25incluirMin.setBackground(new java.awt.Color(102, 0, 0));
        jButton25incluirMin.setText("incluir");
        jButton25incluirMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25incluirMinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton25incluirMin)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButton26)
                .addGap(18, 18, 18)
                .addComponent(jButton27)
                .addGap(24, 24, 24))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton27)
                    .addComponent(jButton26)
                    .addComponent(jButton25incluirMin))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 204, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "dados miniatura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel12.setForeground(new java.awt.Color(102, 0, 0));

        jLabel4.setBackground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("iden");

        jTextFieldIden.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldIden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdenActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(102, 0, 0));
        jLabel5.setText("escala");

        jTextFieldEscala.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setBackground(new java.awt.Color(102, 0, 0));
        jLabel9.setText("ediçao");

        jTextFielEdicao.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setBackground(new java.awt.Color(102, 0, 0));
        jLabel12.setText("Modelo");

        jTextFieldModelo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldModeloActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(102, 0, 0));
        jLabel13.setText("ano");

        jTextFieldAno.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("valor ");

        jTextFieldValor.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("miniatura observaçoes");

        jTextFieldMinObs.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMinObs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMinObsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldIden, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(jTextFieldEscala))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFielEdicao)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel12))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(jTextFieldValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMinObs, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldMinObs, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jTextFieldIden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldEscala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(jTextFielEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPanefabricante8)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPanefabricante8, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelMiniaturaLayout = new javax.swing.GroupLayout(jPanelMiniatura);
        jPanelMiniatura.setLayout(jPanelMiniaturaLayout);
        jPanelMiniaturaLayout.setHorizontalGroup(
            jPanelMiniaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelMiniaturaLayout.setVerticalGroup(
            jPanelMiniaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPaneTelas.addTab("Miniatura", jPanelMiniatura);

        jPanelFotos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jPanel1Foto.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto"));

        javax.swing.GroupLayout jPanel1FotoLayout = new javax.swing.GroupLayout(jPanel1Foto);
        jPanel1Foto.setLayout(jPanel1FotoLayout);
        jPanel1FotoLayout.setHorizontalGroup(
            jPanel1FotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        jPanel1FotoLayout.setVerticalGroup(
            jPanel1FotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("descriçao"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelFotosLayout = new javax.swing.GroupLayout(jPanelFotos);
        jPanelFotos.setLayout(jPanelFotosLayout);
        jPanelFotosLayout.setHorizontalGroup(
            jPanelFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFotosLayout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addGroup(jPanelFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelFotosLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1Foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFotosLayout.createSequentialGroup()
                    .addContainerGap(1400, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanelFotosLayout.setVerticalGroup(
            jPanelFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFotosLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanelFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFotosLayout.createSequentialGroup()
                        .addComponent(jPanel1Foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelFotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFotosLayout.createSequentialGroup()
                    .addContainerGap(124, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jTabbedPaneTelas.addTab("Foto", jPanelFotos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneTelas)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneTelas, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneTelas.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIncluirTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirTemaActionPerformed
        try {
            Tema tema = new Tema();                         // Novo objeto da classe tema
            tema.setTem_nome(jTextFieldNomeTema.getText()); // atribui o nome do tema pelo texto digitado no jTextBox
            TemaBll.incluir(tema);                          // Chama a camada bll para incluir o tema
            JOptionPane.showMessageDialog(rootPane, "Tema incluído com sucesso!"); // Exibe a mensagem de sucesso após incluir
            atualizarTabelaDeTemas();                       // Atualiza o Jtable com os temas cadastrados
            limpar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());    // Exibe mensagem em caso de erro
        }
    }//GEN-LAST:event_jButtonIncluirTemaActionPerformed

    private void jButtonALTERARfabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonALTERARfabricanteActionPerformed
        try {
            // Linha atual no jTable
            int linha = jTableFabricante.getSelectedRow();
            if (linha > -1) {   // -1 , não tem nenhuma linha selecionada
                // Coluna 0 = fab_iden
                // Coluna 1 = fab_nome

                int fab_iden = Integer.parseInt(jTableFabricante.getValueAt(linha, 0) + "");// Obtém o tem_iden da linha selecionada no jTable
                Fabricante fabricante = new Fabricante();         // Instancia um objeto da classe fabricante
                fabricante.setFab_iden(fab_iden);     // Atribui o valor do tem_idem ao objeto fabircante
                fabricante.setFab_nome(jTextFieldNomeFabricante.getText());   // Atribui o nome do fabricante ao objeto fabricante

                // Chama o método alterar da camada fabricanteBll 
                FabricanteBll.alterar(fabricante);

                atualizarTabelaDeFabricantes();
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());    // Exibe mensagem em caso de erro

        }
    }//GEN-LAST:event_jButtonALTERARfabricanteActionPerformed

    private void jTableTemaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTemaMouseReleased
        try {
            int linha = jTableTema.getSelectedRow();
            if (linha > -1) {
                // Coluna 0 = tem_iden
                // Coluna 1 = tem_nome
                int coluna = 1;
                jTextFieldNomeTema.setText(jTableTema.getValueAt(linha, coluna) + "");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());    // Exibe mensagem em caso de erro
        }
    }//GEN-LAST:event_jTableTemaMouseReleased

    private void jButtonAlterarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarTemaActionPerformed
        try {
            // Linha atual no jTable
            int linha = jTableTema.getSelectedRow();
            if (linha > -1) {   // -1 , não tem nenhuma linha selecionada
                // Coluna 0 = tem_iden
                // Coluna 1 = tem_nome

                int tem_iden = Integer.parseInt(jTableTema.getValueAt(linha, 0) + "");// Obtém o tem_iden da linha selecionada no jTable
                Tema tema = new Tema();         // Instancia um objeto da classe tema
                tema.setTem_iden(tem_iden);     // Atribui o valor do tem_idem ao objeto tema
                tema.setTem_nome(jTextFieldNomeTema.getText());   // Atribui o nome do tema ao objeto tema

                // Chama o método alterar da camada TemaBll 
                TemaBll.alterar(tema);

                atualizarTabelaDeTemas();
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());    // Exibe mensagem em caso de erro
        }
    }//GEN-LAST:event_jButtonAlterarTemaActionPerformed

    private void jButtonExcluirTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirTemaActionPerformed
        try {
            // Linha atual no jTable
            int linha = jTableTema.getSelectedRow();
            if (linha > -1) {   // -1 , não tem nenhuma linha selecionada
                // Coluna 0 = tem_iden
                // Coluna 1 = tem_nome

                int tem_iden = Integer.parseInt(jTableTema.getValueAt(linha, 0) + "");// Obtém o tem_iden da linha selecionada no jTable

                // Chama o método exclior da camada TemaBll 
                TemaBll.excluir(tem_iden);

                atualizarTabelaDeTemas();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());    // Exibe mensagem em caso de erro
        }
    }//GEN-LAST:event_jButtonExcluirTemaActionPerformed

    private void jButtonINCLUIRFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonINCLUIRFabricanteActionPerformed
        try {
            Fabricante fabricante = new Fabricante();                         // Novo objeto da classe fabricante
            fabricante.setFab_nome(jTextFieldNomeFabricante.getText()); // atribui o nome do tema pelo texto digitado no jTextBox
            FabricanteBll.incluir(fabricante);                          // Chama a camada bll para incluir o tema
            JOptionPane.showMessageDialog(rootPane, "Fabircante incluído com sucesso!"); // Exibe a mensagem de sucesso após incluir
            atualizarTabelaDeFabricantes();                       // Atualiza o Jtable com os temas cadastrados
          limpar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());    // Exibe mensagem em caso de erro
        }
    }//GEN-LAST:event_jButtonINCLUIRFabricanteActionPerformed

    private void jTableFabricanteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTableFabricanteAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableFabricanteAncestorAdded

    private void jButtonEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEXCLUIRActionPerformed
        try {
            // Linha atual no jTable
            int linha = jTableFabricante.getSelectedRow();
            if (linha > -1) {   // -1 , não tem nenhuma linha selecionada
                // Coluna 0 = fab_iden
                // Coluna 1 = fab_iden

                int fab_iden = Integer.parseInt(jTableFabricante.getValueAt(linha, 0) + "");// Obtém o tem_iden da linha selecionada no jTable

                // Chama o método exclior da camada fabricacatebll 
                FabricanteBll.excluir(fab_iden);

                atualizarTabelaDeFabricantes();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());    // Exibe mensagem em caso de erro
        }
    }//GEN-LAST:event_jButtonEXCLUIRActionPerformed

    private void jButton7IncluirTmMiiaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7IncluirTmMiiaturaActionPerformed
        try {
            Tipo_miniatura tipo_miniatura = new Tipo_miniatura();                         // Novo objeto da classe fabricante
            tipo_miniatura.setTm_tipo(jTextFieldNomeTipoMiniastura.getText()); // atribui o nome do tema pelo texto digitado no jTextBox
            Tipo_MiniaturaBll.incluir(tipo_miniatura);                          // Chama a camada bll para incluir o tema
            JOptionPane.showMessageDialog(rootPane, "tipo incluído com sucesso!"); // Exibe a mensagem de sucesso após incluir
            atualizarTabelaDeTipoMiniatura();                      // Atualiza o Jtable com os temas cadastrados
           limpar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());    // Exibe mensagem em caso de erro
        }
    }//GEN-LAST:event_jButton7IncluirTmMiiaturaActionPerformed

    private void jTableTipoMINIATURAAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTableTipoMINIATURAAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableTipoMINIATURAAncestorAdded

    private void jTableTipoMINIATURAMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTipoMINIATURAMouseReleased
        try {
            int linha = jTableTipoMINIATURA.getSelectedRow();
            if (linha > -1) {
                // Coluna 0 = tem_iden
                // Coluna 1 = tem_nome
                int coluna = 1;
                jTextFieldNomeTipoMiniastura.setText(jTableTipoMINIATURA.getValueAt(linha, coluna) + "");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());    // Exibe mensagem em caso de erro
        }
    }//GEN-LAST:event_jTableTipoMINIATURAMouseReleased

    private void jTableFabricanteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFabricanteMouseReleased
        try {
            int linha = jTableFabricante.getSelectedRow();
            if (linha > -1) {
                // Coluna 0 = tem_iden
                // Coluna 1 = tem_nome
                int coluna = 1;
                jTextFieldNomeFabricante.setText(jTableFabricante.getValueAt(linha, coluna) + "");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());    // Exibe mensagem em caso de erro
        }    }//GEN-LAST:event_jTableFabricanteMouseReleased

    private void jButton8AlterarTmMiniaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8AlterarTmMiniaturaActionPerformed
        try {
            // Linha atual no jTable
            int linha = jTableTipoMINIATURA.getSelectedRow();
            if (linha > -1) {   // -1 , não tem nenhuma linha selecionada
                // Coluna 0 = tem_iden
                // Coluna 1 = tem_nome

                int Tipo_miniatura = Integer.parseInt(jTableTipoMINIATURA.getValueAt(linha, 0) + "");// Obtém o tem_iden da linha selecionada no jTable
                Tipo_miniatura tipo_miniatura = new Tipo_miniatura();         // Instancia um objeto da classe tema
                tipo_miniatura.setTm_iden(Tipo_miniatura);     // Atribui o valor do tem_idem ao objeto tema
                tipo_miniatura.setTm_tipo(jTextFieldNomeTipoMiniastura.getText());   // Atribui o nome do tema ao objeto tema

                // Chama o método alterar da camada TemaBll 
                Tipo_MiniaturaBll.alterar(tipo_miniatura);

                atualizarTabelaMiniatura();
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());    // Exibe mensagem em caso de erro
        }    }//GEN-LAST:event_jButton8AlterarTmMiniaturaActionPerformed

    private void jButton9ExcluirTipoMiniaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ExcluirTipoMiniaturaActionPerformed
        try {
            // Linha atual no jTable
            int linha = jTableTipoMINIATURA.getSelectedRow();
            if (linha > -1) {   // -1 , não tem nenhuma linha selecionada
                // Coluna 0 = fab_iden
                // Coluna 1 = fab_iden

                int tm_iden = Integer.parseInt(jTableTipoMINIATURA.getValueAt(linha, 0) + "");// Obtém o tem_iden da linha selecionada no jTable

                // Chama o método exclior da camada fabricacatebll 
                Tipo_MiniaturaBll.excluir(tm_iden);

                atualizarTabelaDeTipoMiniatura();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButton9ExcluirTipoMiniaturaActionPerformed

    private void jButton25incluirMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25incluirMinActionPerformed

        try {
            Miniatura miniatura = new Miniatura();
            // Novo objeto da classe fabricante
            //conversao em date 
            String strData = jTextFieldAno.getText();
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            cal.setTime(sdf.parse(strData));
            limparCampos(jTextFieldAno);
            // fonte https://pt.stackoverflow.com/questions/134544/converter-string-de-um-jtextfield-para-calendar
            //convesao em int 
            String valorTextField;
            Integer valorIntegerTextField;
            valorTextField = jTextFielEdicao.getText();
            valorTextField = jTextFieldEscala.getText();
            limparCampos(jTextFielEdicao);
            limparCampos(jTextFieldEscala);

            //Capturo o valor do campoTextField e coloco em valorTextField.
            valorIntegerTextField = Integer.parseInt(valorTextField);
            //Transformo o valor de valorTextField em Integer e insiro em valorIntegerTextField.
            // fonte : https://pt.stackoverflow.com/questions/44912/converter-jtextfield-em-inteiro-e-salvar-no-bd#:~:text=2%20Respostas&text=O%20m%C3%A9todo%20getText%20retorna%20uma,parseInt(textField.

            //convertendo em String 
            miniatura.setMin_modelo(jTextFieldModelo.getText());
            miniatura.setMin_modelo(jTextFieldMinObs.getText());
            limpar();
            //cpmvertendo valores em double
            double valor;
            valor = Double.parseDouble(jTextFieldValor.getText());
            // fonte > https://www.hardware.com.br/comunidade/erro-comecar/1263530/
            MiniaturaBll.incluir(miniatura);                          // Chama a camada bll para incluir o tema
            JOptionPane.showMessageDialog(rootPane, "Fabircante incluído com sucesso!"); // Exibe a mensagem de sucesso após incluir
            atualizarTabelaDeFabricantes();                       // Atualiza o Jtable com os temas cadastrados
           

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());    // Exibe mensagem em caso de erro
        }
    }//GEN-LAST:event_jButton25incluirMinActionPerformed

    private void jTextFieldIdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdenActionPerformed

    private void jTextFieldModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldModeloActionPerformed

    private void jTextFieldMinObsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMinObsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMinObsActionPerformed

    private void jTableMiniaturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMiniaturaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableMiniaturaMousePressed

    private void jTableMiniaturaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMiniaturaMouseReleased
        try {
            int linha = jTableMiniatura.getSelectedRow();
            if (linha > -1) {
                // Coluna 0 = tem_iden
                // Coluna 1 = tem_nome
                int coluna = 1;
                jTextFielEdicao.setText(jTableMiniatura.getValueAt(linha, coluna) + "");
                jTextFieldAno.setText(jTableMiniatura.getValueAt(linha, coluna) + "");
                jTextFieldEscala.setText(jTableMiniatura.getValueAt(linha, coluna) + "");
                jTextFieldIden.setText(jTableMiniatura.getValueAt(linha, coluna) + "");
                jTextFieldMinObs.setText(jTableMiniatura.getValueAt(linha, coluna) + "");
                jTextFieldValor.setText(jTableMiniatura.getValueAt(linha, coluna) + "");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());    // Exibe mensagem em caso de erro            JOptionPane.showMessageDialog(rootPane, e.getMessage());    // Exibe mensagem em caso de erro            JOptionPane.showMessageDialog(rootPane, e.getMessage());    // Exibe mensagem em caso de erro    }//GEN-LAST:event_jTableMiniaturaMouseReleased
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalApp().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton25incluirMin;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton7IncluirTmMiiatura;
    private javax.swing.JButton jButton8AlterarTmMiniatura;
    private javax.swing.JButton jButton9ExcluirTipoMiniatura;
    private javax.swing.JButton jButtonALTERARfabricante;
    private javax.swing.JButton jButtonAlterarTema;
    private javax.swing.JButton jButtonEXCLUIR;
    private javax.swing.JButton jButtonExcluirTema;
    private javax.swing.JButton jButtonINCLUIRFabricante;
    private javax.swing.JButton jButtonIncluirTema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNomeFabricante;
    private javax.swing.JLabel jLabelNomeTema;
    private javax.swing.JLabel jLabelNomeTipoMiniatura;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel1Foto;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel6Fabricante;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel7TEMA;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelFabricante;
    private javax.swing.JPanel jPanelFotos;
    private javax.swing.JPanel jPanelMiniatura;
    private javax.swing.JPanel jPanelTema;
    private javax.swing.JPanel jPanelTipoMiniatura;
    private javax.swing.JScrollPane jScrollPaneTEMA;
    private javax.swing.JScrollPane jScrollPanefabricante;
    private javax.swing.JScrollPane jScrollPanefabricante2;
    private javax.swing.JScrollPane jScrollPanefabricante8;
    private javax.swing.JTabbedPane jTabbedPaneTelas;
    private javax.swing.JTable jTableFabricante;
    private javax.swing.JTable jTableMiniatura;
    private javax.swing.JTable jTableTema;
    private javax.swing.JTable jTableTipoMINIATURA;
    private javax.swing.JTextField jTextFielEdicao;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldEscala;
    private javax.swing.JTextField jTextFieldIden;
    private javax.swing.JTextField jTextFieldMinObs;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldNomeFabricante;
    private javax.swing.JTextField jTextFieldNomeTema;
    private javax.swing.JTextField jTextFieldNomeTipoMiniastura;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
