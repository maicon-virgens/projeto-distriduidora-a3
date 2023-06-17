/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import javax.swing.JOptionPane;
import Controller.ClienteController;
import Model.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Maicon Virgens
 */
public class TelaCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCliente
     */
    public TelaCliente() throws SQLException {
        initComponents();
        CarregarTabela();
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
        tbCliente = new javax.swing.JTable();
        txtClienteId = new javax.swing.JTextField();
        txtClienteNome = new javax.swing.JTextField();
        txtClienteCnpj = new javax.swing.JTextField();
        txtClienteTelefone = new javax.swing.JTextField();
        txtClienteEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnClienteCriar = new javax.swing.JButton();
        btnClienteAtualizar = new javax.swing.JButton();
        btnClienteDelete = new javax.swing.JButton();
        txtClienteEndereco = new javax.swing.JTextField();

        tbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Cnpj", "Tel", "End", "Email"
            }
        ));
        tbCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCliente);
        if (tbCliente.getColumnModel().getColumnCount() > 0) {
            tbCliente.getColumnModel().getColumn(2).setResizable(false);
            tbCliente.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setText("ID");

        jLabel2.setText("Nome");

        jLabel3.setText("Cnpj");

        jLabel4.setText("Telefone");

        jLabel5.setText("Email");

        jLabel6.setText("Endereço");

        jLabel7.setText("Cliente");

        btnClienteCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/create (1).png"))); // NOI18N
        btnClienteCriar.setToolTipText("Adicionar");
        btnClienteCriar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClienteCriar.setPreferredSize(new java.awt.Dimension(80, 80));
        btnClienteCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteCriarActionPerformed(evt);
            }
        });

        btnClienteAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/update.png"))); // NOI18N
        btnClienteAtualizar.setToolTipText("");
        btnClienteAtualizar.setPreferredSize(new java.awt.Dimension(80, 80));
        btnClienteAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteAtualizarActionPerformed(evt);
            }
        });

        btnClienteDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/delete.png"))); // NOI18N
        btnClienteDelete.setToolTipText("");
        btnClienteDelete.setPreferredSize(new java.awt.Dimension(80, 80));
        btnClienteDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(271, 271, 271))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnClienteCriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btnClienteAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(btnClienteDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtClienteCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(txtClienteId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClienteNome, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClienteTelefone)
                            .addComponent(txtClienteEmail)
                            .addComponent(txtClienteEndereco))
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(txtClienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(txtClienteEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtClienteCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClienteAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClienteCriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClienteDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteCriarActionPerformed
       int result = 0;
       
       if(txtClienteNome.getText().isEmpty() || txtClienteCnpj.getText().isEmpty()||txtClienteTelefone.getText().isEmpty() ||txtClienteEndereco.getText().isEmpty()){ 
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
       }else{
           
           ClienteController cliente = new ClienteController();

           result = cliente.adicionarCliente(txtClienteNome.getText(), txtClienteCnpj.getText(), txtClienteTelefone.getText(), txtClienteEndereco.getText(), txtClienteEmail.getText());
           
           if(result > 0){
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
                txtClienteId.setText(null);
                txtClienteNome.setText(null);
                txtClienteCnpj.setText(null);
                txtClienteTelefone.setText(null);
                txtClienteEndereco.setText(null);
                txtClienteEmail.setText(null);
               try {
                   CarregarTabela();
               } catch (SQLException ex) {
                   Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
       }   
    }//GEN-LAST:event_btnClienteCriarActionPerformed

    private void CarregarTabela() throws SQLException{
        List<Cliente> clientes = new ArrayList<>();
         
        ClienteController ClienteController = new ClienteController();
        
        DefaultTableModel model =(DefaultTableModel) tbCliente.getModel();
       
        model.setNumRows(0);
        
       
             clientes = ClienteController.listarClientes();
             
             clientes.forEach(item -> {
                //System.out.println(item.getNome());       
                model.addRow(new Object[] 
                    { 
                       //retorna os dados da tabela do BD, cada campo e um coluna.
                      
                        item.getId_cliente(),
                        item.getNome(),
                        item.getCnpj(),
                        item.getTelefone(),
                        item.getEndereco(),
                        item.getEmail()       
                });  
            });
     
    
         
  
        
    }
    
    private void btnClienteAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteAtualizarActionPerformed

        int result = 0;
       
       if(txtClienteNome.getText().isEmpty() || txtClienteCnpj.getText().isEmpty()||txtClienteTelefone.getText().isEmpty() ||txtClienteEndereco.getText().isEmpty()){ 
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
       }else{
           
            String textoIdInt = txtClienteId.getText();
            
         try {
           
           ClienteController cliente = new ClienteController();
           
            int idInt = Integer.parseInt(textoIdInt);
            
           result = cliente.alterarCliente(idInt, txtClienteNome.getText(), txtClienteCnpj.getText(), txtClienteTelefone.getText(), txtClienteEndereco.getText(), txtClienteEmail.getText());
           
 
           if(result > 0){
                JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso");
                txtClienteId.setText(null);
                txtClienteNome.setText(null);
                txtClienteCnpj.setText(null);
                txtClienteTelefone.setText(null);
                txtClienteEndereco.setText(null);
                txtClienteEmail.setText(null);
                CarregarTabela();
           }
           } catch (NumberFormatException ex) {
                   JOptionPane.showMessageDialog(null, "Preencha com um número.");    
               } catch (SQLException ex) { 
                Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
            } 
       } 
    
    }//GEN-LAST:event_btnClienteAtualizarActionPerformed

    private void btnClienteDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteDeleteActionPerformed
         int linhaSelecionada = tbCliente.getSelectedRow();

        if (linhaSelecionada != -1) {
            TableModel dadosTabela = tbCliente.getModel();

            String id_cliente = dadosTabela.getValueAt(linhaSelecionada, 0).toString();

            try {
                int idCliente = Integer.parseInt(id_cliente);
                
                ClienteController ClienteController = new ClienteController();
 
                ClienteController.deletarCliente(idCliente);

                txtClienteId.setText(null);
                txtClienteNome.setText(null);
                txtClienteCnpj.setText(null);
                txtClienteTelefone.setText(null);
                txtClienteEndereco.setText(null);
                txtClienteEmail.setText(null);
              

                CarregarTabela();   
        
            } catch (Exception e) {
                
                
            }          
        }  
    }//GEN-LAST:event_btnClienteDeleteActionPerformed

    
        private void setarCamposUpdate(){
             // Obtém a linha selecionada
        int linhaSelecionada = tbCliente.getSelectedRow();

        // Verifica se alguma linha está selecionada
        if (linhaSelecionada != -1) {
            // Obtém o modelo de dados da tabela
            TableModel dadosTabela = tbCliente.getModel();

            // Obtém o número de colunas na tabela
            int columnCount = dadosTabela.getColumnCount();

            // Cria um array para armazenar os valores da linha selecionada
            Object[] dadosLinha = new Object[columnCount];
            
         
            
            txtClienteId.setText(dadosTabela.getValueAt(linhaSelecionada, 0).toString());
            txtClienteNome.setText( dadosTabela.getValueAt(linhaSelecionada, 1).toString());
            txtClienteCnpj.setText( dadosTabela.getValueAt(linhaSelecionada, 2).toString()); 
            txtClienteTelefone.setText( dadosTabela.getValueAt(linhaSelecionada, 3).toString()); 
            txtClienteEndereco.setText( dadosTabela.getValueAt(linhaSelecionada, 4).toString()); 
            txtClienteEmail.setText( dadosTabela.getValueAt(linhaSelecionada, 5).toString()); 
            
            //System.out.println("Aqui: ");
            
        }  
    }
    private void tbClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClienteMouseClicked
    
        setarCamposUpdate();
     
    }//GEN-LAST:event_tbClienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClienteAtualizar;
    private javax.swing.JButton btnClienteCriar;
    private javax.swing.JButton btnClienteDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCliente;
    private javax.swing.JTextField txtClienteCnpj;
    private javax.swing.JTextField txtClienteEmail;
    private javax.swing.JTextField txtClienteEndereco;
    private javax.swing.JTextField txtClienteId;
    private javax.swing.JTextField txtClienteNome;
    private javax.swing.JTextField txtClienteTelefone;
    // End of variables declaration//GEN-END:variables
}
