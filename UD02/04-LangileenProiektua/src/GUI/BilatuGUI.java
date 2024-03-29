/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import model.Langilea;

/**
 *
 * @author blazquez.asier
 */
public class BilatuGUI extends javax.swing.JFrame {

    /**
     * Creates new form MenuGUI
     */
    public BilatuGUI() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        aurkituField = new javax.swing.JTextField();
        bilatuButton = new javax.swing.JButton();
        jToggleButtonIzena = new javax.swing.JToggleButton();
        jToggleButtonAbizena = new javax.swing.JToggleButton();
        jToggleButtonID = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Bilatu Langilea");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 190, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Izena/ Abizena / ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 140, 50));

        aurkituField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aurkituFieldActionPerformed(evt);
            }
        });
        getContentPane().add(aurkituField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 240, 30));

        bilatuButton.setText("Bilatu");
        bilatuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilatuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(bilatuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 120, 50));

        jToggleButtonIzena.setText("Izena");
        jToggleButtonIzena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonIzenaActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonIzena, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 120, 40));

        jToggleButtonAbizena.setText("Abizena");
        jToggleButtonAbizena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonAbizenaActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonAbizena, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 120, 40));

        jToggleButtonID.setSelected(true);
        jToggleButtonID.setText("ID");
        jToggleButtonID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonIDActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButtonID, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aurkituFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aurkituFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aurkituFieldActionPerformed

    private void jToggleButtonIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonIDActionPerformed
        // TODO add your handling code here:ç

        jToggleButtonAbizena.setSelected(false);
        jToggleButtonIzena.setSelected(false);
    }//GEN-LAST:event_jToggleButtonIDActionPerformed

    private void bilatuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilatuButtonActionPerformed
        // TODO add your handling code here:
        Langilea l = new Langilea();

        if (jToggleButtonID.isSelected()) {
            try {
                l = l.bilatu(aurkituField.getText(), "id", LangileenDatuakGUI.langileak);

            } catch (Exception ex) {
                showMessageDialog(null, "Datu okerrak sartu dituzu", "Errorea", JOptionPane.ERROR_MESSAGE);

            }
        }
        if (jToggleButtonAbizena.isSelected()) {
            try {
                l = l.bilatu(aurkituField.getText(), "abizena", LangileenDatuakGUI.langileak);
            } catch (Exception ex1) {
                showMessageDialog(null, "Datu okerrak sartu dituzu", "Errorea", JOptionPane.ERROR_MESSAGE);

            }
        }

        if (jToggleButtonIzena.isSelected()) {
            try {
                l = l.bilatu(aurkituField.getText(), "izena", LangileenDatuakGUI.langileak);
            } catch (Exception ex2) {
                showMessageDialog(null, "Datu okerrak sartu dituzu", "Errorea", JOptionPane.ERROR_MESSAGE);

            }
        }
        if (l == null) {
            showMessageDialog(null, "Sartutako Balioa ez da aurkitu", "Warning", JOptionPane.WARNING_MESSAGE);

        }
        LangileenDatuakGUI.i = l.getId() - 1;
        JFrame entrar = new LangileenDatuakGUI();
        LangileenDatuakGUI.i = l.getId();
        entrar.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_bilatuButtonActionPerformed

    private void jToggleButtonIzenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonIzenaActionPerformed
        // TODO add your handling code here:
        jToggleButtonAbizena.setSelected(false);
        jToggleButtonID.setSelected(false);
    }//GEN-LAST:event_jToggleButtonIzenaActionPerformed

    private void jToggleButtonAbizenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonAbizenaActionPerformed
        // TODO add your handling code here:
        jToggleButtonID.setSelected(false);
        jToggleButtonIzena.setSelected(false);
    }//GEN-LAST:event_jToggleButtonAbizenaActionPerformed

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
            java.util.logging.Logger.getLogger(BilatuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BilatuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BilatuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BilatuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BilatuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aurkituField;
    private javax.swing.JButton bilatuButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButtonAbizena;
    private javax.swing.JToggleButton jToggleButtonID;
    private javax.swing.JToggleButton jToggleButtonIzena;
    // End of variables declaration//GEN-END:variables
}
