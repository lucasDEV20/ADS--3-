package br.com.torrentz.app;

//import br.com.marcosjob.bll.FabricanteBll;
//import br.com.marcosjob.model.Fabricante;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AuxPlano extends javax.swing.JFrame {

    private DefaultTableModel tbl = new DefaultTableModel();
//    private FabricanteBll bll = new FabricanteBll();
//    Fabricante model = new Fabricante();

    public AuxPlano() throws Exception {
        CriarTable();
//        read();
        initComponents();
        this.setLocationRelativeTo(rootPane);
//        jTable.getTableHeader().setFont(new java.awt.Font("Dialog", 0, 18));
//        estadoInicialComponentes();

    }

    public void estadoInicialComponentes() {
        btnUpdateAux.setEnabled(false);
        btnDelete.setEnabled(false);
        txtAuxNome.setEnabled(false);
        btnUpdate.setEnabled(false);
    }

    private void CriarTable() {
        jTable = new JTable(tbl);
        tbl.addColumn("Código");
        tbl.addColumn("Nome");
        tbl.addColumn("Acessos Simultâneos");
        tbl.addColumn("Preço R$");
    }

    public void read() throws Exception {
//        try {
//            tbl.setNumRows(0);
//            List<Fabricante> listModel = new ArrayList<>();
//            listModel = bll.read();
//
//            if (listModel.size() > 0) {
//                for (int i = 0; i < listModel.size(); i++) {
//                    tbl.addRow(new Object[]{
//                        listModel.get(i).getId_fabricante(),
//                        listModel.get(i).getNome()
//                    });
//                }
//            } else {
//                tbl.setNumRows(0);
//            }
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, e);
//        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedOpcoes = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtAuxNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        btnUpdateAux = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtAuxAcessos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAuxPreco = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnIncluir = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAcessos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Torrentz Fimes | Cadastro Planos");

        jTabbedOpcoes.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        jTable.setFont(new java.awt.Font("Dialog", 0, 16));
        jTable.setModel(tbl);
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTable.setAutoscrolls(false);
        jTable.setRowHeight(50);
        jTable.setShowHorizontalLines(false);
        jTable.setShowVerticalLines(false);
        jTable.getTableHeader().setResizingAllowed(false);
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        btnDelete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDelete.setText("Excluir");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUpdate.setText("Salvar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtAuxNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Pesquisar");

        jTextFieldPesquisar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Nome");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Campos editáveis");

        btnUpdateAux.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUpdateAux.setText("Editar");
        btnUpdateAux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAuxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Acessos Simultâneos");

        txtAuxAcessos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Preço R$");

        txtAuxPreco.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUpdateAux, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAuxAcessos, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAuxPreco))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAuxNome)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdateAux))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAuxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAuxAcessos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAuxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addContainerGap())
        );

        jTabbedOpcoes.addTab("Editar / Excluir", jPanel1);

        btnIncluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Acessos Simultâneos");

        txtAcessos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Nome");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Preço R$");

        txtPreco.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(txtAcessos))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(txtPreco))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(188, 188, 188))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAcessos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(btnIncluir)
                .addGap(168, 168, 168))
        );

        jTabbedOpcoes.addTab("Incluir", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTabbedOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTabbedOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
//        try {
//            model.setNome(jTextFieldCreateNome.getText());
//            bll.create(model);
//            JOptionPane.showMessageDialog(rootPane, model.getNome()
//                    + " cadastrado com sucesso!");
//            read();
//            jTextFieldCreateNome.setText("");
//            
//        } catch (Exception e) {
//            e.getMessage();
//        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
//        try {
//            model.setId_fabricante(Integer.parseInt(jTable.getValueAt(
//                    jTable.getSelectedRow(), 0).toString()));
//            bll.delete(model);
//            estadoInicialComponentes();
//            read();
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, e);
//        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateAuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAuxActionPerformed
//        jButtonUpdate.setEnabled(true);
//        jTextFieldAuxNome.setEnabled(true);
//        jTextFieldAuxNome.setText(jTable.getValueAt(
//                jTable.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_btnUpdateAuxActionPerformed

    private void jTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMousePressed
//        jButtonUpdateAux.setEnabled(true);
//        jButtonDelete.setEnabled(true);
    }//GEN-LAST:event_jTableMousePressed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
//        try {
//            model.setId_fabricante(Integer.parseInt(jTable.getValueAt(
//                    jTable.getSelectedRow(), 0).toString()));
//            model.setNome(jTextFieldAuxNome.getText());
//            bll.update(model);
//            jTextFieldAuxNome.setText("");
//            estadoInicialComponentes();
//            read();
//        } catch (Exception e) {
//            e.getMessage();
//        }

    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(AuxPlano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuxPlano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuxPlano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuxPlano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AuxPlano().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(AuxPlano.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateAux;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedOpcoes;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField txtAcessos;
    private javax.swing.JTextField txtAuxAcessos;
    private javax.swing.JTextField txtAuxNome;
    private javax.swing.JTextField txtAuxPreco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
