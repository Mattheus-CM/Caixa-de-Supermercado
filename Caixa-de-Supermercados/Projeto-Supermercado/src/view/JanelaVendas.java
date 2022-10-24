package view;

import dao.ProdutoDAO;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Produto;

public class JanelaVendas extends javax.swing.JFrame {

    private BigDecimal totalCompra = new BigDecimal("00.00");
    private int qtd_linha = 0;

    public JanelaVendas() {
        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) tbVenda.getModel();
        tbVenda.setRowSorter(new TableRowSorter(modelo));
        modelo.setNumRows(500);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbVenda = new javax.swing.JTable();
        lblCodigoProduto = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblValorTotal = new javax.swing.JLabel();
        lvlValor = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNomeProduto = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        lblValorUnitario = new javax.swing.JLabel();
        btAdicionarProduto = new javax.swing.JButton();
        spQuantidade = new javax.swing.JSpinner(new SpinnerNumberModel(1,1,100,1));
        lblLogo = new javax.swing.JLabel();
        btFinalizarCompra = new javax.swing.JButton();
        brCancelarCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 638));
        setResizable(false);

        tbVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Quantidade", "Preço Unitário", "Preço Total"
            }
        ));
        jScrollPane1.setViewportView(tbVenda);

        lblCodigoProduto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCodigoProduto.setText("Código do Produto:");

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });

        lblValorTotal.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        lblValorTotal.setText("00.00");

        lvlValor.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lvlValor.setText("Valor Total:");

        lblNomeProduto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblNomeProduto.setText("Nome do Produto:");

        lblNome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNome.setText("Nome do Produto");

        lblValor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblValor.setText("Valor Unitário:");

        lblValorUnitario.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblValorUnitario.setText("00.00");

        btAdicionarProduto.setText("Adicionar Produto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValor)
                            .addComponent(lblNomeProduto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblValorUnitario))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(spQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAdicionarProduto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomeProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNome)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N

        btFinalizarCompra.setText("Finalizar Compra");
        btFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarCompraActionPerformed(evt);
            }
        });

        brCancelarCompra.setText("Cancelar Compra");
        brCancelarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brCancelarCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCodigoProduto)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lvlValor)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblValorTotal)
                                        .addGap(30, 30, 30))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(brCancelarCompra)
                                        .addGap(18, 18, 18)
                                        .addComponent(btFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lvlValor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 103, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(lblCodigoProduto)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brCancelarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtCodigo.getText().length() == 10) {
                String codigo = txtCodigo.getText();

                ProdutoDAO pdao = new ProdutoDAO();
                for (Produto p : pdao.searchProduto(codigo)) {
                    lblNome.setText(p.getNome());
                    lblValorUnitario.setText(p.getPreco().toString());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Digite o código completo");
            }
        }
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void btFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarCompraActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btFinalizarCompraActionPerformed

    private void brCancelarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brCancelarCompraActionPerformed
        // TODO add your handling code here:
            txtCodigo.setText("");
            spQuantidade.setValue(1);
            lblNome.setText("Nome do Produto");
            lblValorUnitario.setText("00.00");
            
            DefaultTableModel modelo = (DefaultTableModel) tbVenda.getModel();
            tbVenda.setRowSorter(new TableRowSorter(modelo));
            modelo.setNumRows(500);
    }//GEN-LAST:event_brCancelarCompraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brCancelarCompra;
    private javax.swing.JButton btAdicionarProduto;
    private javax.swing.JButton btFinalizarCompra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoProduto;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JLabel lblValorUnitario;
    private javax.swing.JLabel lvlValor;
    private javax.swing.JSpinner spQuantidade;
    private javax.swing.JTable tbVenda;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
