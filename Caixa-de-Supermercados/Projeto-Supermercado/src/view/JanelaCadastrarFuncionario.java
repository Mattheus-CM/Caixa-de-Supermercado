package view;

import dao.EnderecoDAO;
import dao.FuncionarioDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Endereco;
import model.Funcionario;

public class JanelaCadastrarFuncionario extends javax.swing.JFrame {

    public JanelaCadastrarFuncionario() {
        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) tbEndereco.getModel();
        tbEndereco.setRowSorter(new TableRowSorter(modelo));
        readTable();

        DefaultTableModel modelo2 = (DefaultTableModel) tbFuncionario.getModel();
        tbFuncionario.setRowSorter(new TableRowSorter(modelo2));
        readTable();
    }

    public void readTable() {
        DefaultTableModel modelo = (DefaultTableModel) tbEndereco.getModel();
        modelo.setNumRows(0);

        DefaultTableModel modelo2 = (DefaultTableModel) tbFuncionario.getModel();
        modelo2.setNumRows(0);

        EnderecoDAO edao = new EnderecoDAO();
        for (Endereco e : edao.read()) {

            modelo.addRow(new Object[]{
                e.getIdEndereco(),
                e.getRua(),
                e.getNumero(),
                e.getBairro(),
                e.getCidade(),
                e.getCep()});
            //Método para ler a tabela
        }

        FuncionarioDAO fdao = new FuncionarioDAO();
        for (Funcionario f : fdao.read()) {

            modelo2.addRow(new Object[]{
                f.getIdFuncionario(),
                f.getNome(),
                f.getCargo(),
                f.getCpf(),
                f.getUsuario(),
                f.getEndereco()});
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEndereco = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbFuncionario = new javax.swing.JTable();
        lblEndereco = new javax.swing.JLabel();
        btCadastrarEndereco = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblCadastro = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btCadastrar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        lblIDEndereco = new javax.swing.JLabel();
        txtIDEndereco = new javax.swing.JTextField();
        btLimparCampos = new javax.swing.JButton();
        cbCargo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tbEndereco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Rua", "Número", "Bairro", "Cidade", "CEP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbEndereco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEnderecoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbEndereco);
        if (tbEndereco.getColumnModel().getColumnCount() > 0) {
            tbEndereco.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jTabbedPane1.addTab("Endereço", jScrollPane1);

        tbFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Cargo", "CPF", "Usuário", "ID_Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbFuncionario);
        if (tbFuncionario.getColumnModel().getColumnCount() > 0) {
            tbFuncionario.getColumnModel().getColumn(0).setMaxWidth(50);
            tbFuncionario.getColumnModel().getColumn(5).setMaxWidth(50);
        }

        jTabbedPane1.addTab("Funcionário", jScrollPane3);

        lblEndereco.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEndereco.setText("Selecione seu endereço ou cadastre um");

        btCadastrarEndereco.setText("Cadastre aqui");
        btCadastrarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarEnderecoActionPerformed(evt);
            }
        });

        lblCadastro.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblCadastro.setText("Funcionário:");

        lblNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        lblCPF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblCPF.setText("CPF:");

        lblCargo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblCargo.setText("Cargo:");

        lblUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblUsuario.setText("Usuário");

        lblSenha.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblSenha.setText("Senha:");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        lblIDEndereco.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblIDEndereco.setText("Id Endereço:");

        btLimparCampos.setText("Limpar Campos");
        btLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparCamposActionPerformed(evt);
            }
        });

        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operador de Caixa", "Gerente" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblEndereco)
                        .addGap(34, 34, 34)
                        .addComponent(btCadastrarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCadastro)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCargo)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblUsuario)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNome)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblIDEndereco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIDEndereco)))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSenha)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCPF)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(btCadastrarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCadastro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbCargo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        // TODO add your handling code here:
        JanelaPrincipal jp = new JanelaPrincipal();
        jp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:

        if (tbEndereco.getSelectedRow() != -1) {
            if (txtNome.getText().isEmpty() || txtCPF.getText().isEmpty() 
                    || txtUsuario.getText().isEmpty() || txtIDEndereco.getText().isEmpty() 
                    || txtSenha.getPassword().toString().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos", null, JOptionPane.WARNING_MESSAGE);

            } else {
                String nome = txtNome.getText();
                String cpf = txtCPF.getText();
                String cargo = cbCargo.getSelectedItem().toString();
                String usuario = txtUsuario.getText();
                String senha = new String(txtSenha.getPassword());
                int idEndereco = Integer.parseInt(txtIDEndereco.getText());

                Funcionario funcionario = new Funcionario(nome, cargo, cpf, usuario, senha, idEndereco);
                FuncionarioDAO fdao = new FuncionarioDAO();

                fdao.create(funcionario);

                txtNome.setText("");
                txtIDEndereco.setText("");
                txtCPF.setText("");
                txtUsuario.setText("");
                txtSenha.setText("");
                readTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "É necessário "
                    + "escolher 1 endereço para criar o Funcionãrio");
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparCamposActionPerformed
        // TODO add your handling code here:
        txtNome.setText("");
        txtIDEndereco.setText("");
        txtCPF.setText("");
        txtUsuario.setText("");
        txtSenha.setText("");
    }//GEN-LAST:event_btLimparCamposActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        if (tbFuncionario.getSelectedRow() != -1) {
            if (txtNome.getText().isEmpty() || txtCPF.getText().isEmpty()
                    || txtUsuario.getText().isEmpty() || txtIDEndereco.getText().isEmpty() 
                    || txtSenha.getPassword().toString().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos", null, JOptionPane.WARNING_MESSAGE);

            } else {
                String nome = txtNome.getText();
                String cpf = txtCPF.getText();
                String cargo = cbCargo.getSelectedItem().toString();
                String usuario = txtUsuario.getText();
                String senha = new String(txtSenha.getPassword());
                int idEndereco = Integer.parseInt(txtIDEndereco.getText());
                int idFuncionario = (int) tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), 0);

                Funcionario funcionario = new Funcionario(nome, cargo, cpf, usuario, senha, idEndereco, idFuncionario);
                FuncionarioDAO fdao = new FuncionarioDAO();

                fdao.update(funcionario);

                txtNome.setText("");
                txtIDEndereco.setText("");
                txtCPF.setText("");
                txtUsuario.setText("");
                txtSenha.setText("");
                readTable();
            }
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btCadastrarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarEnderecoActionPerformed
        // TODO add your handling code here:
        JanelaEndereco je = new JanelaEndereco();
        je.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCadastrarEnderecoActionPerformed

    private void tbEnderecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEnderecoMouseClicked
        // TODO add your handling code here:
        txtIDEndereco.setText(tbEndereco.getValueAt(tbEndereco.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_tbEnderecoMouseClicked

    private void tbFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFuncionarioMouseClicked
        // TODO add your handling code here:
        txtNome.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), 1).toString());
        cbCargo.setSelectedItem(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), 2).toString());
        txtCPF.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), 3).toString());
        txtUsuario.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), 4).toString());
        txtIDEndereco.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), 5).toString());
        
    }//GEN-LAST:event_tbFuncionarioMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCadastrarEndereco;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btLimparCampos;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblIDEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tbEndereco;
    private javax.swing.JTable tbFuncionario;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtIDEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
