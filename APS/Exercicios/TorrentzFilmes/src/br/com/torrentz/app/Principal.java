package br.com.torrentz.app;

//import br.com.marcosjob.bll.*;
//import br.com.marcosjob.model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    private DefaultTableModel tblFilmesModelo = new DefaultTableModel();
    private DefaultTableModel tblUsuariosModelo = new DefaultTableModel();
//    private MiniaturaBll bll = new MiniaturaBll();
//    Miniatura model = new Miniatura();
//
//    private FabricanteBll bllFab = new FabricanteBll();
//    Fabricante modelFab = new Fabricante();
//
//    private TipoBll bllTip = new TipoBll();
//    Tipo modelTip = new Tipo();
//
//    private TemaBll bllTem = new TemaBll();
//    Tema modelTem = new Tema();

    public Principal() throws Exception {
        CriarTblFilmes();
        CriarTblUsuarios();
//        read();
        initComponents();
        this.setLocationRelativeTo(rootPane);
//        jTable.getTableHeader().setFont(new java.awt.Font("Dialog", 0, 18));
//        estadoSemEdicao();
//        atualizarComboBox();
    }

    public void atualizarComboBox() throws Exception {
//        try {
//            List<Fabricante> listFab = new ArrayList<>();
//            listFab = bllFab.read();
//
//            jComboBoxFab.removeAllItems();
//            jComboBoxFabCreate.removeAllItems();
//            for (int i = 0; i < listFab.size(); i++) {
//                jComboBoxFab.addItem(listFab.get(i).getId_fabricante()
//                        + "-" + listFab.get(i).getNome());
//                jComboBoxFabCreate.addItem(listFab.get(i).getId_fabricante()
//                        + "-" + listFab.get(i).getNome());
//
//            }
//
//            List<Tipo> listTip = new ArrayList<>();
//            listTip = bllTip.read();
//
//            jComboBoxTip.removeAllItems();
//            jComboBoxTipCreate.removeAllItems();
//            for (int i = 0; i < listTip.size(); i++) {
//                jComboBoxTip.addItem(listTip.get(i).getId_tipo()
//                        + "-" + listTip.get(i).getTipo());
//                jComboBoxTipCreate.addItem(listTip.get(i).getId_tipo()
//                        + "-" + listTip.get(i).getTipo());
//            }
//
//            List<Tema> lisTema = new ArrayList<>();
//            lisTema = bllTem.read();
//
//            jComboBoxTem.removeAllItems();
//            jComboBoxTemCreate.removeAllItems();
//            for (int i = 0; i < lisTema.size(); i++) {
//                jComboBoxTem.addItem(lisTema.get(i).getId_tema()
//                        + "-" + lisTema.get(i).getTema());
//                jComboBoxTemCreate.addItem(lisTema.get(i).getId_tema()
//                        + "-" + lisTema.get(i).getTema());
//            }
//
//        } catch (Exception e) {
//        }
    }

    public void estadoSemEdicao() {
        btnEditarFilme.setEnabled(false);
        btnExcluirFilme.setEnabled(false);
        txtAnoFilme.setEnabled(false);
        txtTituloFilme.setEnabled(false);
        atxtSinopseFilme.setEnabled(false);
        comboCategoriaFilme.setEnabled(false);
        btnSalvarFilme.setEnabled(false);
        btnLinkCategoria.setEnabled(false);
    }

    public void estadoEdicao() {
        btnEditarFilme.setEnabled(true);
        btnExcluirFilme.setEnabled(true);
        txtAnoFilme.setEnabled(true);
        txtTituloFilme.setEnabled(true);
        atxtSinopseFilme.setEnabled(true);
        comboCategoriaFilme.setEnabled(true);
        btnSalvarFilme.setEnabled(true);
        btnLinkCategoria.setEnabled(true);
    }

    private void CriarTblFilmes() {
        tblFilmes = new JTable(tblFilmesModelo);
        tblFilmesModelo.addColumn("Código");
        tblFilmesModelo.addColumn("Ano");
        tblFilmesModelo.addColumn("Título");
        tblFilmesModelo.addColumn("Categoria");
    }

    private void CriarTblUsuarios() {
        tblUsuarios = new JTable(tblUsuariosModelo);
        tblUsuariosModelo.addColumn("Código");
        tblUsuariosModelo.addColumn("Nome");
        tblUsuariosModelo.addColumn("CPF");
        tblUsuariosModelo.addColumn("Email");
        tblUsuariosModelo.addColumn("Contrato");
        tblUsuariosModelo.addColumn("Plano");
    }

    public void read() throws Exception {
//        try {
//            tblFilmesModelo.setNumRows(0);
//            List<Miniatura> listModel = new ArrayList<>();
//            listModel = bll.read();
//
//            if (listModel.size() > 0) {
//                for (int i = 0; i < listModel.size(); i++) {
//                    tblFilmesModelo.addRow(new Object[]{
//                        listModel.get(i).getId_miniatura(),
//                        listModel.get(i).getModelo(),
//                        listModel.get(i).getAno(),
//                        listModel.get(i).getEdicao(),
//                        listModel.get(i).getEscala(),
//                        listModel.get(i).getValor(),
//                        listModel.get(i).getFabricante().getId_fabricante()
//                        + "-" + listModel.get(i).getFabricante().getNome(),
//                        listModel.get(i).getTipo_Miniatura().getId_tipo()
//                        + "-" + listModel.get(i).getTipo_Miniatura().getTipo(),
//                        listModel.get(i).getTema().getId_tema()
//                        + "-" + listModel.get(i).getTema().getTema()
//                    });
//                }
//            } else {
//                tblFilmesModelo.setNumRows(0);
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
        tblFilmes = new javax.swing.JTable();
        btnExcluirFilme = new javax.swing.JButton();
        btnSalvarFilme = new javax.swing.JButton();
        txtAnoFilme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPesquisarFilmes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        btnEditarFilme = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtTituloFilme = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        atxtSinopseFilme = new javax.swing.JTextArea();
        comboCategoriaFilme = new javax.swing.JComboBox<>();
        btnLinkCategoria = new javax.swing.JButton();
        btnIncluirFilme = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnIncluirUsuario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnEditarUsuario = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtCPFUsuario = new javax.swing.JTextField();
        btnLinkContrato = new javax.swing.JButton();
        btnExcluirUsuario = new javax.swing.JButton();
        btnSalvarUsuario = new javax.swing.JButton();
        txtNomeUsuario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPesquisarUsuario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtEmailUsuario = new javax.swing.JTextField();
        txtSenhaUsuario = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnLinkPlano = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtContratoUsuario = new javax.swing.JTextField();
        txtPlanoUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Torrentz Filmes | Cadastro Principal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jTabbedOpcoes.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        tblFilmes.setFont(new java.awt.Font("Dialog", 0, 16));
        tblFilmes.setModel(tblFilmesModelo);
        tblFilmes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblFilmes.setAutoscrolls(false);
        tblFilmes.setRowHeight(50);
        tblFilmes.setShowHorizontalLines(false);
        tblFilmes.setShowVerticalLines(false);
        tblFilmes.getTableHeader().setResizingAllowed(false);
        tblFilmes.getTableHeader().setReorderingAllowed(false);
        tblFilmes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblFilmesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblFilmes);

        btnExcluirFilme.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnExcluirFilme.setText("Excluir");
        btnExcluirFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFilmeActionPerformed(evt);
            }
        });

        btnSalvarFilme.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalvarFilme.setText("Salvar");
        btnSalvarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFilmeActionPerformed(evt);
            }
        });

        txtAnoFilme.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtAnoFilme.setDisabledTextColor(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Pesquisar");

        txtPesquisarFilmes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Ano");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Campos");

        btnEditarFilme.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEditarFilme.setText("Editar");
        btnEditarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarFilmeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Título");

        txtTituloFilme.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtTituloFilme.setDisabledTextColor(new java.awt.Color(102, 102, 102));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Categ.");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setText("Sinopse");

        atxtSinopseFilme.setColumns(20);
        atxtSinopseFilme.setRows(5);
        atxtSinopseFilme.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(atxtSinopseFilme);

        comboCategoriaFilme.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnLinkCategoria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLinkCategoria.setText("...");
        btnLinkCategoria.setPreferredSize(new java.awt.Dimension(54, 35));
        btnLinkCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinkCategoriaActionPerformed(evt);
            }
        });

        btnIncluirFilme.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnIncluirFilme.setText("Incluir");
        btnIncluirFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirFilmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addGap(71, 71, 71))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(20, 20, 20)
                                        .addComponent(txtAnoFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTituloFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboCategoriaFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLinkCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnSalvarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtPesquisarFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnIncluirFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnEditarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnExcluirFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1217, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPesquisarFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirFilme)
                    .addComponent(btnEditarFilme)
                    .addComponent(btnIncluirFilme))
                .addGap(33, 33, 33)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnoFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(txtTituloFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(comboCategoriaFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLinkCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvarFilme, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jTabbedOpcoes.addTab("Filmes", jPanel1);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Nome");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Contrato");

        btnIncluirUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnIncluirUsuario.setText("Incluir");
        btnIncluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirUsuarioActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Campos");

        btnEditarUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEditarUsuario.setText("Editar");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        tblUsuarios.setFont(new java.awt.Font("Dialog", 0, 16));
        tblUsuarios.setModel(tblUsuariosModelo);
        tblUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblUsuarios.setAutoscrolls(false);
        tblUsuarios.setRowHeight(50);
        tblUsuarios.setShowHorizontalLines(false);
        tblUsuarios.setShowVerticalLines(false);
        tblUsuarios.getTableHeader().setResizingAllowed(false);
        tblUsuarios.getTableHeader().setReorderingAllowed(false);
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblUsuariosMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(tblUsuarios);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setText("CPF");

        txtCPFUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCPFUsuario.setDisabledTextColor(new java.awt.Color(102, 102, 102));

        btnLinkContrato.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLinkContrato.setText("...");
        btnLinkContrato.setPreferredSize(new java.awt.Dimension(54, 35));
        btnLinkContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinkContratoActionPerformed(evt);
            }
        });

        btnExcluirUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnExcluirUsuario.setText("Excluir");
        btnExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUsuarioActionPerformed(evt);
            }
        });

        btnSalvarUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSalvarUsuario.setText("Salvar");
        btnSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarUsuarioActionPerformed(evt);
            }
        });

        txtNomeUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNomeUsuario.setDisabledTextColor(new java.awt.Color(102, 102, 102));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Pesquisar");

        txtPesquisarUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setText("Email");

        txtEmailUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtEmailUsuario.setDisabledTextColor(new java.awt.Color(102, 102, 102));

        txtSenhaUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtSenhaUsuario.setDisabledTextColor(new java.awt.Color(102, 102, 102));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setText("Senha");

        btnLinkPlano.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLinkPlano.setText("...");
        btnLinkPlano.setPreferredSize(new java.awt.Dimension(54, 35));
        btnLinkPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinkPlanoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setText("Plano");

        txtContratoUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtContratoUsuario.setDisabledTextColor(new java.awt.Color(102, 102, 102));

        txtPlanoUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPlanoUsuario.setDisabledTextColor(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnIncluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(20, 20, 20))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(23, 23, 23)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmailUsuario)
                                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(31, 31, 31)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCPFUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(txtSenhaUsuario))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtContratoUsuario)
                                    .addComponent(txtPlanoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLinkContrato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLinkPlano, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtPesquisarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirUsuario)
                    .addComponent(btnEditarUsuario)
                    .addComponent(btnIncluirUsuario))
                .addGap(33, 33, 33)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(txtCPFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtContratoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(txtPlanoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLinkContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnLinkPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(btnSalvarUsuario)
                .addGap(38, 38, 38))
        );

        jTabbedOpcoes.addTab("Usuários", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTabbedOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 1271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTabbedOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
//        try {
//            read();
//            atualizarComboBox();
//
//        } catch (Exception e) {
//        }
    }//GEN-LAST:event_formWindowActivated

    private void btnLinkPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinkPlanoActionPerformed
        try {
            AuxPlano tela = new AuxPlano();
            tela.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnLinkPlanoActionPerformed

    private void btnSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarUsuarioActionPerformed

    private void btnExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirUsuarioActionPerformed

    private void btnLinkContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinkContratoActionPerformed
        try {
            AuxContrato tela = new AuxContrato();
            tela.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnLinkContratoActionPerformed

    private void tblUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblUsuariosMousePressed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnIncluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIncluirUsuarioActionPerformed

    private void btnIncluirFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirFilmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIncluirFilmeActionPerformed

    private void btnLinkCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinkCategoriaActionPerformed
        try {
            AuxCategoria tela = new AuxCategoria();
            tela.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnLinkCategoriaActionPerformed

    private void btnEditarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFilmeActionPerformed
        //        estadoEdicao();
    }//GEN-LAST:event_btnEditarFilmeActionPerformed

    private void btnSalvarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFilmeActionPerformed
        //        try {
            //
            //            model.setId_miniatura(Integer.parseInt(jTable.getValueAt(
                //                    jTable.getSelectedRow(), 0).toString()));
    //
    //            model.setModelo(jTextFieldAuxModelo.getText());
    //            model.setAno(Integer.parseInt(jTextFieldAuxAno.getText()));
    //            model.setObservacoes(jTextAreaAuxObsevacoes.getText());
    //            model.setEdicao(jTextFieldAuxEdicao.getText());
    //            model.setEscala(jTextFieldAuxEscala.getText());
    //            model.setValor(Float.parseFloat(jTextFieldAuxValor.getText()));
    //
    //            String comboFab = jComboBoxFab.getSelectedItem() + "";
    //            String[] splFab = comboFab.split("-");
    //            modelFab.setId_fabricante(Integer.parseInt(splFab[0]));
    //            model.setFabricante(modelFab);
    //
    //            String comboTip = jComboBoxTip.getSelectedItem() + "";
    //            String[] splTip = comboTip.split("-");
    //            modelTip.setId_tipo(Integer.parseInt(splTip[0]));
    //            model.setTipo_Miniatura(modelTip);
    //
    //            String comboTem = jComboBoxTem.getSelectedItem() + "";
    //            String[] splTem = comboTem.split("-");
    //            modelTem.setId_tema(Integer.parseInt(splTem[0]));
    //            model.setTema(modelTem);
    //
    //            bll.update(model);
    //
    //            estadoSemEdicao();
    //            read();
    //        } catch (Exception e) {
    //            JOptionPane.showMessageDialog(rootPane, e);
    //        }
    }//GEN-LAST:event_btnSalvarFilmeActionPerformed

    private void btnExcluirFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFilmeActionPerformed
        //        try {
            //            model.setId_miniatura(Integer.parseInt(jTable.getValueAt(
                //                    jTable.getSelectedRow(), 0).toString()));
    //            bll.delete(model);
    //            estadoSemEdicao();
    //            read();
    //
    //        } catch (Exception e) {
    //            JOptionPane.showMessageDialog(rootPane, e);
    //        }
    }//GEN-LAST:event_btnExcluirFilmeActionPerformed

    private void tblFilmesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFilmesMousePressed

        //        try {
            //            jButtonUpdateAux.setEnabled(true);
            //            jButtonDelete.setEnabled(true);
            //            jTextFieldAuxModelo.setText(jTable.getValueAt(jTable.getSelectedRow(), 1).toString());
            //            jTextFieldAuxAno.setText(jTable.getValueAt(jTable.getSelectedRow(), 2).toString());
            //            jTextFieldAuxEdicao.setText(jTable.getValueAt(jTable.getSelectedRow(), 3).toString());
            //            jTextFieldAuxEscala.setText(jTable.getValueAt(jTable.getSelectedRow(), 4).toString());
            //            jTextFieldAuxValor.setText(jTable.getValueAt(jTable.getSelectedRow(), 5).toString());
            //            jComboBoxFab.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 6).toString());
            //            jComboBoxTip.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 7).toString());
            //            jComboBoxTem.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 8).toString());
            //            int id = Integer.parseInt(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
            //            jTextAreaAuxObsevacoes.setText(bll.readToID(id).getObservacoes());
            //        } catch (Exception e) {
            //            e.getMessage();
            //        }
        //
    }//GEN-LAST:event_tblFilmesMousePressed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                    new Principal().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atxtSinopseFilme;
    private javax.swing.JButton btnEditarFilme;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnExcluirFilme;
    private javax.swing.JButton btnExcluirUsuario;
    private javax.swing.JButton btnIncluirFilme;
    private javax.swing.JButton btnIncluirUsuario;
    private javax.swing.JButton btnLinkCategoria;
    private javax.swing.JButton btnLinkContrato;
    private javax.swing.JButton btnLinkPlano;
    private javax.swing.JButton btnSalvarFilme;
    private javax.swing.JButton btnSalvarUsuario;
    private javax.swing.JComboBox<String> comboCategoriaFilme;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedOpcoes;
    private javax.swing.JTable tblFilmes;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtAnoFilme;
    private javax.swing.JTextField txtCPFUsuario;
    private javax.swing.JTextField txtContratoUsuario;
    private javax.swing.JTextField txtEmailUsuario;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JTextField txtPesquisarFilmes;
    private javax.swing.JTextField txtPesquisarUsuario;
    private javax.swing.JTextField txtPlanoUsuario;
    private javax.swing.JTextField txtSenhaUsuario;
    private javax.swing.JTextField txtTituloFilme;
    // End of variables declaration//GEN-END:variables
}
