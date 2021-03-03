/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import model.FKudeatu;
import model.Terminoa;

/**
 *
 * @author blazquez.asier
 */
public class MenuGUI extends javax.swing.JFrame {

    /**
     * Creates new form MenuGUI
     */
    private boolean euskera;

    public MenuGUI() {
        initComponents();
        euskera = true;
    }

    public void hizkuntzaAldatu() {
        if (euskera == true) {
            idiomaButton.setText("Castellano-> Euskera");
            labelHiztegia.setText("Diccionario");
            labelSartu.setText("Introducir Palabra");
            translateButton.setText("Traducir");
            hitzaField.setText("");
            emaitzaLabel.setText("");
             kudeaketaButton.setText("Entrar en la Administracion");
            euskera = false;
        } else {

            idiomaButton.setText("Euskea -> Gaztelania");
            labelHiztegia.setText("Hiztegia");
            labelSartu.setText("Sartu Hitza");
            translateButton.setText("Itzuli");
            emaitzaLabel.setText("");
            hitzaField.setText("");
            kudeaketaButton.setText("Kudeaketan Sartu");

            euskera = true;
        }
    }
    public void translate() throws IOException, FileNotFoundException, ClassNotFoundException {
        try {
            if (euskera == false) {
                emaitzaLabel.setText("Euskera: " + FKudeatu.tBilatu(hitzaField.getText()).getEuskara().toUpperCase());
            } else {
                emaitzaLabel.setText("Gaztelera: " + FKudeatu.tBilatu(hitzaField.getText()).getGaztelera().toUpperCase());

            }
        } catch (Exception e) {
            if (euskera == true) {
                emaitzaLabel.setText("Hitza ez da aurkitu");
            } else {
                emaitzaLabel.setText("La palabra no se ha encontrado");
            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelHiztegia = new javax.swing.JLabel();
        hitzaField = new javax.swing.JTextField();
        labelSartu = new javax.swing.JLabel();
        translateButton = new javax.swing.JButton();
        idiomaButton = new javax.swing.JButton();
        emaitzaLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        kudeaketaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelHiztegia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelHiztegia.setText("Hiztegia");
        getContentPane().add(labelHiztegia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 290, 48));

        hitzaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitzaFieldActionPerformed(evt);
            }
        });
        getContentPane().add(hitzaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 250, 40));

        labelSartu.setText("Sartu Hitza: ");
        getContentPane().add(labelSartu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 140, 40));

        translateButton.setText("Itzuli");
        translateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                translateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(translateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 130, 40));

        idiomaButton.setText("Euskera -> Gaztelania");
        idiomaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idiomaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(idiomaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 180, 40));

        emaitzaLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(emaitzaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 270, 60));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));

        kudeaketaButton.setText("Kudeaketan Sartu");
        kudeaketaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kudeaketaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(kudeaketaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hitzaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitzaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hitzaFieldActionPerformed

    private void idiomaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idiomaButtonActionPerformed
        // TODO add your handling code here:
        hizkuntzaAldatu();

    }//GEN-LAST:event_idiomaButtonActionPerformed

    private void translateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_translateButtonActionPerformed
        if (!"".equals(hitzaField.getText())) {
            try {
                // TODO add your handling code here:ç
                translate();
            } catch (IOException ex) {
                Logger.getLogger(MenuGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MenuGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_translateButtonActionPerformed

    private void kudeaketaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kudeaketaButtonActionPerformed
      JFrame entrar = new KudeatuGUI();
      entrar.setVisible(true);
        
    }//GEN-LAST:event_kudeaketaButtonActionPerformed

    

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
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emaitzaLabel;
    private javax.swing.JTextField hitzaField;
    private javax.swing.JButton idiomaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kudeaketaButton;
    private javax.swing.JLabel labelHiztegia;
    private javax.swing.JLabel labelSartu;
    private javax.swing.JButton translateButton;
    // End of variables declaration//GEN-END:variables
}
