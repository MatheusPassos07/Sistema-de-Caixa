/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vendas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import principal.telaPrincipal;
import produtos.frmListaProd;
import static principal.telaPrincipal.painelprincipal;

/**
 *
 * @author Admin
 */
public class frmCaixa extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmCaixa
     */
    public frmCaixa() {
        initComponents();
        int min = 1;
        int max = 100;

        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        txtFatura.setText(String.valueOf(random_int));
        
    }
    
    private static final DecimalFormat df = new DecimalFormat("0.00");
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPPCaixa = new javax.swing.JPanel();
        painelbotoes = new javax.swing.JPanel();
        busca = new javax.swing.JButton();
        txtRecebido = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtTroco = new javax.swing.JTextField();
        txtTotal2 = new javax.swing.JTextField();
        txtTotal3 = new javax.swing.JTextField();
        txtTotal1 = new javax.swing.JTextField();
        codigoL6 = new javax.swing.JLabel();
        codigoL7 = new javax.swing.JLabel();
        codigoL3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtFatura = new javax.swing.JTextField();
        codigoL4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        calculo = new javax.swing.JButton();
        vender = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCaixa = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1200, 500));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        painelPPCaixa.setBackground(new java.awt.Color(255, 255, 255));
        painelPPCaixa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelbotoes.setBackground(new java.awt.Color(0, 0, 153));
        painelbotoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painelbotoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        busca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        busca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/produto1.png"))); // NOI18N
        busca.setBorder(null);
        busca.setContentAreaFilled(false);
        busca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        busca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        busca.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/produto.png"))); // NOI18N
        busca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaActionPerformed(evt);
            }
        });
        painelbotoes.add(busca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 50));

        txtRecebido.setEditable(false);
        txtRecebido.setBackground(new java.awt.Color(0, 51, 204));
        txtRecebido.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtRecebido.setForeground(new java.awt.Color(255, 255, 255));
        txtRecebido.setText("Recebido");
        txtRecebido.setBorder(null);
        painelbotoes.add(txtRecebido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 100, 30));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(0, 51, 204));
        txtTotal.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setText("0");
        txtTotal.setBorder(null);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        painelbotoes.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 20, 70, 30));

        txtTroco.setEditable(false);
        txtTroco.setBackground(new java.awt.Color(0, 51, 204));
        txtTroco.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtTroco.setForeground(new java.awt.Color(255, 255, 255));
        txtTroco.setText("Troco");
        txtTroco.setBorder(null);
        painelbotoes.add(txtTroco, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 90, 30));

        txtTotal2.setEditable(false);
        txtTotal2.setBackground(new java.awt.Color(0, 51, 204));
        txtTotal2.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        txtTotal2.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal2.setText("R$");
        txtTotal2.setBorder(null);
        txtTotal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotal2ActionPerformed(evt);
            }
        });
        painelbotoes.add(txtTotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 40, 30));

        txtTotal3.setEditable(false);
        txtTotal3.setBackground(new java.awt.Color(0, 51, 204));
        txtTotal3.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        txtTotal3.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal3.setText("R$");
        txtTotal3.setBorder(null);
        txtTotal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotal3ActionPerformed(evt);
            }
        });
        painelbotoes.add(txtTotal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 40, 30));

        txtTotal1.setEditable(false);
        txtTotal1.setBackground(new java.awt.Color(0, 51, 204));
        txtTotal1.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        txtTotal1.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal1.setText("R$");
        txtTotal1.setBorder(null);
        txtTotal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotal1ActionPerformed(evt);
            }
        });
        painelbotoes.add(txtTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, 40, 30));

        codigoL6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/recibi.png"))); // NOI18N
        codigoL6.setToolTipText("RECIBI");
        painelbotoes.add(codigoL6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, 52));

        codigoL7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/valores.png"))); // NOI18N
        codigoL7.setToolTipText("CAMBIO");
        painelbotoes.add(codigoL7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, 52));

        codigoL3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/total.png"))); // NOI18N
        painelbotoes.add(codigoL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, -1, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/TotalPHP.png"))); // NOI18N
        painelbotoes.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, -1, -1));

        painelPPCaixa.add(painelbotoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 116, 1170, 70));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/LogoTBR M.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel1.setOpaque(true);
        painelPPCaixa.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 90));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel2.setText("Supermercado TBR LTDA");
        painelPPCaixa.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("  TELEFONE: (11) 4002 -8922");
        painelPPCaixa.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(null);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFatura.setEditable(false);
        txtFatura.setBackground(new java.awt.Color(0, 51, 204));
        txtFatura.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtFatura.setForeground(new java.awt.Color(255, 255, 255));
        txtFatura.setBorder(null);
        jPanel6.add(txtFatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 120, 30));

        codigoL4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/numFac.png"))); // NOI18N
        jPanel6.add(codigoL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 50));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText(" NÚMERO FATURA");
        jLabel15.setToolTipText("");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        painelPPCaixa.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 230, 120));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "OPÇÕES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calculo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/calculo1.png"))); // NOI18N
        calculo.setBorder(null);
        calculo.setContentAreaFilled(false);
        calculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calculo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calculo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/calculo2.png"))); // NOI18N
        calculo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculoActionPerformed(evt);
            }
        });
        jPanel3.add(calculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 200, -1));

        vender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/venda1.png"))); // NOI18N
        vender.setBorder(null);
        vender.setContentAreaFilled(false);
        vender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vender.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        vender.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/venda2.png"))); // NOI18N
        vender.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venderActionPerformed(evt);
            }
        });
        jPanel3.add(vender, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, -1));

        borrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/elimina1.png"))); // NOI18N
        borrar.setBorder(null);
        borrar.setContentAreaFilled(false);
        borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        borrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/elimina2.png"))); // NOI18N
        borrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        jPanel3.add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, -1));

        cancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/cancela1.png"))); // NOI18N
        cancelar.setBorder(null);
        cancelar.setContentAreaFilled(false);
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/cancela2.png"))); // NOI18N
        cancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel3.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, -1));

        painelPPCaixa.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 240));

        tabelaCaixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "TIPO PRODUTO", "DESCRIÇÃO", "VALOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCaixaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCaixa);

        painelPPCaixa.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 950, 240));

        getContentPane().add(painelPPCaixa);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaActionPerformed

        frmListaProd lista = new frmListaProd();

        principal.telaPrincipal.carregador1.add(lista).setLocation(250, 3);

        lista.setVisible(true);
        lista.show();


    }//GEN-LAST:event_buscaActionPerformed

    private void calculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculoActionPerformed
        
         String valorRecebido = JOptionPane.showInputDialog(null, "Valor Recebido:");
         
            double valorRecebidoTotal = Float.parseFloat(valorRecebido);
            double valorTotal = Float.parseFloat(txtTotal.getText());
            txtRecebido.setText(String.valueOf(valorRecebidoTotal));
            double Troco = valorRecebidoTotal - valorTotal;
            if (Troco <0){
                
                JOptionPane.showMessageDialog(null, "Valor Não Cobre o Total", "Transação Não Completa", JOptionPane.ERROR);
                
            }
            
            txtTroco.setText(String.valueOf(Troco));
        
    }//GEN-LAST:event_calculoActionPerformed

    private void venderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderActionPerformed
        
        FechamentoVenda F = new FechamentoVenda();
        principal.telaPrincipal.carregador1.add(F).setLocation(1,3);
        F.show();
        
    }//GEN-LAST:event_venderActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed

        DefaultTableModel modelo = (DefaultTableModel) tabelaCaixa.getModel();
        modelo.setRowCount(0);
        txtTotal.setText("0");

    }//GEN-LAST:event_borrarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed

        DefaultTableModel modelo = (DefaultTableModel) tabelaCaixa.getModel();
        int i = tabelaCaixa.getSelectedRow();
        String totalAntigo = txtTotal.getText();
        String produto = modelo.getValueAt(i, 3).toString();
        double valorTotalAntigo = Float.parseFloat(totalAntigo);
        double valorProdutoNovo = Float.parseFloat(produto);
        modelo.removeRow(tabelaCaixa.getSelectedRow());
        double Total = valorTotalAntigo - valorProdutoNovo - valorProdutoNovo;
        txtTotal.setText(String.valueOf(Total));
  

    }//GEN-LAST:event_cancelarActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void tabelaCaixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCaixaMouseClicked

        int i = tabelaCaixa.getSelectedRow();
        TableModel tbm = tabelaCaixa.getModel();
        String produto = tbm.getValueAt(i, 3).toString();
        String totalAntigo = txtTotal.getText();
        float valorTotalAntigo = Float.valueOf(totalAntigo);
        float valorProdutoNovo = Float.valueOf(produto);
        float Total = valorTotalAntigo + valorProdutoNovo;
        txtTotal.setText(String.valueOf(Total));
        /* Usar String .Format*/

    }//GEN-LAST:event_tabelaCaixaMouseClicked

    private void txtTotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotal1ActionPerformed

    private void txtTotal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotal2ActionPerformed

    private void txtTotal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotal3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotal3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton busca;
    private javax.swing.JButton calculo;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel codigoL3;
    private javax.swing.JLabel codigoL4;
    private javax.swing.JLabel codigoL6;
    private javax.swing.JLabel codigoL7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelPPCaixa;
    private javax.swing.JPanel painelbotoes;
    public static javax.swing.JTable tabelaCaixa;
    public static javax.swing.JTextField txtFatura;
    public static javax.swing.JTextField txtRecebido;
    public static javax.swing.JTextField txtTotal;
    public static javax.swing.JTextField txtTotal1;
    public static javax.swing.JTextField txtTotal2;
    public static javax.swing.JTextField txtTotal3;
    public static javax.swing.JTextField txtTroco;
    private javax.swing.JButton vender;
    // End of variables declaration//GEN-END:variables
}
