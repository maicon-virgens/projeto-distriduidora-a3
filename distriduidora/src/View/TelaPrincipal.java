/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maicon Virgens
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        nomeUsuario = new javax.swing.JLabel();
        dataUsuario = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        menCad = new javax.swing.JMenu();
        menCadCli = new javax.swing.JMenuItem();
        menCadUsuario = new javax.swing.JMenuItem();
        opCadProduto = new javax.swing.JCheckBoxMenuItem();
        menCadVenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/agua.png"))); // NOI18N

        nomeUsuario.setBackground(new java.awt.Color(0, 0, 0));
        nomeUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nomeUsuario.setText("Usuário");

        dataUsuario.setBackground(new java.awt.Color(0, 0, 0));
        dataUsuario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        dataUsuario.setText("Data");

        menCad.setText("Opções");
        menCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadActionPerformed(evt);
            }
        });

        menCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menCadCli.setText("Cliente");
        menCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadCliActionPerformed(evt);
            }
        });
        menCad.add(menCadCli);

        menCadUsuario.setText("Usuários");
        menCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadUsuarioActionPerformed(evt);
            }
        });
        menCad.add(menCadUsuario);

        opCadProduto.setSelected(true);
        opCadProduto.setText("Produtos");
        opCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCadProdutoActionPerformed(evt);
            }
        });
        menCad.add(opCadProduto);

        menCadVenda.setText("Venda");
        menCadVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadVendaActionPerformed(evt);
            }
        });
        menCad.add(menCadVenda);

        Menu.add(menCad);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataUsuario)
                            .addComponent(nomeUsuario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(43, Short.MAX_VALUE)
                        .addComponent(nomeUsuario)
                        .addGap(26, 26, 26)
                        .addComponent(dataUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(desktop))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // As linha abaixo sobstitue as label 
        Date data = new Date();
        
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        
        dataUsuario.setText(formatador.format(data));
        
    }//GEN-LAST:event_formWindowActivated

    private void menCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadActionPerformed
       
        
        
        
    }//GEN-LAST:event_menCadActionPerformed

    private void menCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadUsuarioActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        desktop.removeAll();
        
        TelaUsuario usuario = new TelaUsuario();
        
        
        
        desktop.add(usuario).setVisible(true);
    }//GEN-LAST:event_menCadUsuarioActionPerformed

    private void opCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCadProdutoActionPerformed

        desktop.removeAll();
        
        TelaProduto produto = new TelaProduto();
        
        desktop.add(produto).setVisible(true);


        // TODO add your handling code here:
    }//GEN-LAST:event_opCadProdutoActionPerformed

    private void menCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadCliActionPerformed
          desktop.removeAll();
        
        TelaCliente cliente = null;
        try {
            cliente = new TelaCliente();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        desktop.add(cliente).setVisible(true);
       
        
    }//GEN-LAST:event_menCadCliActionPerformed

    private void menCadVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadVendaActionPerformed
         desktop.removeAll();
        
        TelaVenda telaVenda = new TelaVenda();
        
        desktop.add(telaVenda).setVisible(true);
    }//GEN-LAST:event_menCadVendaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JLabel dataUsuario;
    public static javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JMenu menCad;
    private javax.swing.JMenuItem menCadCli;
    public static javax.swing.JMenuItem menCadUsuario;
    private javax.swing.JMenuItem menCadVenda;
    private javax.swing.JLabel nomeUsuario;
    private javax.swing.JCheckBoxMenuItem opCadProduto;
    // End of variables declaration//GEN-END:variables
}
