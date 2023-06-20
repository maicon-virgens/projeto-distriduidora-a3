/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import Controller.ClienteController;
import Controller.ProdutoController;
import Controller.VendaController;
import Model.Cliente;
import Model.Produto;
import Model.Venda;
import Model.VendaItem;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controller.VendaItemController;

/**
 *
 * @author Maicon Virgens
 */
public class TelaVenda extends javax.swing.JInternalFrame {
    Venda venda = new Venda();
    VendaController vendaController = new VendaController();
    VendaItemController vendaItemController = new VendaItemController();
    VendaItem vendaItem = new VendaItem();
    Produto produto = new Produto();
    ProdutoController produtoController = new ProdutoController();
    ArrayList<VendaItem> listVendaItens = new ArrayList<>();
    ArrayList<Produto> listProduto = new ArrayList<>();
   
    /**
     * Creates new form TelaVenda
     */
    public TelaVenda() {
        initComponents();
        txtIdCliente.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        valorTotal = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        salvarVenda = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        caixaCombProduto = new javax.swing.JComboBox();
        caixaCombCliente = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtQuant = new javax.swing.JFormattedTextField();
        addDadosTab = new javax.swing.JButton();
        txtIdCliente = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(599, 455));

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo do produto", "Descrição do produto", "Quantidade", "Valor unt.", "Val.Total"
            }
        ));
        tblProdutos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblProdutos);

        btnExcluir.setText("Excluir");
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirMouseClicked(evt);
            }
        });
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        valorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorTotalActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor total:");

        salvarVenda.setText("Finalizar compra");
        salvarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarVendaActionPerformed(evt);
            }
        });

        jLabel2.setText("Cód/cliente");

        jLabel4.setText("Cód/produto");

        caixaCombProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um produto" }));
        caixaCombProduto.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                caixaCombProdutoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        caixaCombCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um cliente" }));
        caixaCombCliente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                caixaCombClienteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        caixaCombCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaCombClienteActionPerformed(evt);
            }
        });

        jLabel5.setText("Quantidade");

        txtQuant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantActionPerformed(evt);
            }
        });

        addDadosTab.setText("Adicionar");
        addDadosTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDadosTabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExcluir)
                                .addGap(320, 320, 320)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(valorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addDadosTab))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(caixaCombCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(caixaCombProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salvarVenda)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(caixaCombCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(caixaCombProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(addDadosTab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(jLabel3)
                    .addComponent(valorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addComponent(salvarVenda)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:

        ((DefaultTableModel) tblProdutos.getModel()).removeRow(tblProdutos.getSelectedRow());
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void valorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorTotalActionPerformed

    private void salvarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarVendaActionPerformed
        
        listVendaItens = new ArrayList<>();
        int codCliente  = Integer.parseInt(txtIdCliente.getText());
        int codVenda = 0;
        int codProd = 0;
        
        
        venda.setId_cliente_fk(codCliente);
        venda.setValor_total(Double.parseDouble(valorTotal.getText()));
        
        codVenda = vendaController.cadastrarVenda(venda);
        
        
        //System.out.println("cod:" + codVenda);
        
        if(codVenda > 0){
            JOptionPane.showMessageDialog(null, "Venda Salva Com Sucesso.");
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao Salva Venda .");
        }
        
        int cont = tblProdutos.getRowCount();
        
        for (int i = 0; i < cont; i++) {
            codProd = (int) tblProdutos.getValueAt(i, 0);
            vendaItem = new VendaItem();
            produto = new Produto();
            
            vendaItem.setId_produto_fk(codProd);
            vendaItem.setId_venda_fk(codVenda);
            vendaItem.setQuantidade((int) tblProdutos.getValueAt(i, 2));
            vendaItem.setValor_venda_item((double) tblProdutos.getValueAt(i, 3)); 
            
            //produto -> Fazer a Subtração da quantidade vendida com a quantidade de produtos no banco de dados
            produto.setId_produto(codProd);
            
            produto.setQuantidade(produtoController.retornaProduto(codProd).getQuantidade() - Integer.parseInt(tblProdutos.getValueAt(i, 2).toString()));
            
            listVendaItens.add(vendaItem);
            listProduto.add(produto);
        }
        
        if(vendaItemController.salvarVendaItens(listVendaItens)){
            produtoController.alterarEstoqueProduto(listProduto);
            JOptionPane.showMessageDialog(null, "Produtos cadastrado com sucesso.");
            limparTela();
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Produto.");
        }
        
    }//GEN-LAST:event_salvarVendaActionPerformed
    
    
     private void limparTela() {
        DefaultTableModel tabelaProduto = (DefaultTableModel) tblProdutos.getModel();
        tabelaProduto.setRowCount(0);
        tblProdutos.repaint();
        txtIdCliente.setText(null);
        txtQuant.setText(null);
        valorTotal.setText(null);

    }
     
    private void txtQuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantActionPerformed

    }//GEN-LAST:event_txtQuantActionPerformed

    private void CarregarTabela(Produto produto, int quantidade){

        DefaultTableModel tabelaProduto = (DefaultTableModel) tblProdutos.getModel();

        Object[] novoProduto;
        novoProduto = new Object [] {
            
            produto.getId_produto(),
            produto.getNome(),
            quantidade,
            produto.getPreco(),
            quantidade * produto.getPreco()

        };

        tabelaProduto.addRow(novoProduto);
        somarValorTotalProdutos();
      
    }
    
    private void somarValorTotalProdutos(){
        double soma = 0;
        double valor;
        int cont =  tblProdutos.getRowCount();
        
        for(int i = 0; i < cont; i++){
            valor = (double) tblProdutos.getValueAt(i, 4);
            soma += valor;
        }
        
        valorTotal.setText(String.valueOf(soma));
    }
    
    private void addDadosTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDadosTabActionPerformed
        if(caixaCombCliente.getSelectedItem().equals("Selecione um cliente") || caixaCombProduto.getSelectedItem().equals("Selecione um produto") || txtQuant.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Preencha Todos os Campos");
        }else{
            
            Cliente cliente = new Cliente();
            Produto produto = new Produto();
            
            ArrayList<Cliente> clienteList = new ArrayList<>();
            ArrayList<Produto> produtoList = new ArrayList<>();
                      
            cliente = (Cliente) caixaCombCliente.getSelectedItem();
            produto = (Produto) caixaCombProduto.getSelectedItem();
            
            txtIdCliente.setText(String.valueOf(cliente.getId_cliente()));
            
            int quantItem = Integer.parseInt(txtQuant.getText());
            
            txtQuant.setText(null);
            CarregarTabela(produto, quantItem);   
        }
    }//GEN-LAST:event_addDadosTabActionPerformed

    private void caixaCombClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaCombClienteActionPerformed
        
    }//GEN-LAST:event_caixaCombClienteActionPerformed

    private void caixaCombClienteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_caixaCombClienteAncestorAdded
        // TODO add your handling code here:
        ClienteController cliente = new ClienteController();

        try {
            
            List<Cliente> clientes = cliente.listarClientes();
            
            caixaCombCliente.removeAll();
            
            for (Cliente c : clientes) {
                caixaCombCliente.addItem(c);
                
            }
    
        } catch (SQLException ex) {
            Logger.getLogger(TelaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_caixaCombClienteAncestorAdded

    private void caixaCombProdutoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_caixaCombProdutoAncestorAdded
        ProdutoController produto = new ProdutoController();
        
        try {
   
           List<Produto> produtos = produto.listarProdutos();
            caixaCombProduto.removeAll();
            
            for(Produto p : produtos){
                caixaCombProduto.addItem(p);    
            }

        } catch (SQLException ex) {
            Logger.getLogger(TelaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_caixaCombProdutoAncestorAdded
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDadosTab;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox caixaCombCliente;
    private javax.swing.JComboBox caixaCombProduto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salvarVenda;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JFormattedTextField txtQuant;
    private javax.swing.JFormattedTextField valorTotal;
    // End of variables declaration//GEN-END:variables
}
