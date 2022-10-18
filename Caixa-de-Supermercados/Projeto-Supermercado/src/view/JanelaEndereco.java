package view;

import dao.EnderecoDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Endereco;

public class JanelaEndereco extends javax.swing.JFrame {

    public JanelaEndereco() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tbEndereco.getModel();
        tbEndereco.setRowSorter(new TableRowSorter(modelo));
        readTable();
    }

    private void readTable() {

        DefaultTableModel modelo = (DefaultTableModel) tbEndereco.getModel();
        modelo.setNumRows(0);
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

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbEndereco = new javax.swing.JTable();
        lblRua = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

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

        lblRua.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblRua.setText("Rua:");

        lblNumero.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblNumero.setText("Número");

        lblCEP.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCEP.setText("CEP:");

        lblBairro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblBairro.setText("Bairro:");

        lblCidade.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCidade.setText("Cidade:");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBairro)
                    .addComponent(lblRua))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCEP)
                        .addGap(18, 18, 18)
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNumero)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCidade))
                            .addComponent(btVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCidade))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        // TODO add your handling code here:
        JanelaCadastrarFuncionario jcf = new JanelaCadastrarFuncionario();
        jcf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:

        if (txtRua.getText().isEmpty() || txtNumero.getText().isEmpty()
                || txtBairro.getText().isEmpty() || txtCidade.getText().isEmpty()
                || txtCEP.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos primeiro!");
        } else {
            String rua = txtRua.getText();
            String numero = txtNumero.getText();
            String bairro = txtBairro.getText();
            String cidade = txtCidade.getText();
            String cep = txtCEP.getText();

            Endereco endereco = new Endereco(rua, numero, bairro, cidade, cep);
            EnderecoDAO edao = new EnderecoDAO();
            edao.create(endereco);

            txtRua.setText("");
            txtNumero.setText("");
            txtBairro.setText("");
            txtCidade.setText("");
            txtCEP.setText("");
            readTable();
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        if (tbEndereco.getSelectedRow() != -1) {
            if (txtRua.getText().isEmpty() || txtNumero.getText().isEmpty()
                    || txtBairro.getText().isEmpty() || txtCidade.getText().isEmpty()
                    || txtCEP.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos", null, JOptionPane.WARNING_MESSAGE);

            } else {
                String rua = txtRua.getText();
                String numero = txtNumero.getText();
                String bairro = txtBairro.getText();
                String cidade = txtCidade.getText();
                String cep = txtCEP.getText();
                int idEndereco = (int) tbEndereco.getValueAt(tbEndereco.getSelectedRow(), 0);

                Endereco endereco = new Endereco(rua, numero, bairro, cidade, cep, idEndereco);
                EnderecoDAO edao = new EnderecoDAO();
                edao.update(endereco);

                txtRua.setText("");
                txtNumero.setText("");
                txtBairro.setText("");
                txtCidade.setText("");
                txtCEP.setText("");
                readTable();
            }
        }

    }//GEN-LAST:event_btEditarActionPerformed

    private void tbEnderecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEnderecoMouseClicked
        // TODO add your handling code here:
        txtRua.setText(tbEndereco.getValueAt(tbEndereco.getSelectedRow(), 1).toString());
        txtNumero.setText(tbEndereco.getValueAt(tbEndereco.getSelectedRow(), 2).toString());
        txtBairro.setText(tbEndereco.getValueAt(tbEndereco.getSelectedRow(), 3).toString());
        txtCidade.setText(tbEndereco.getValueAt(tbEndereco.getSelectedRow(), 4).toString());
        txtCEP.setText(tbEndereco.getValueAt(tbEndereco.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_tbEnderecoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRua;
    private javax.swing.JTable tbEndereco;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
}
