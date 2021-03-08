/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.FKudeatu;
import model.Terminoa;

/**
 *
 * @author blazquez.asier
 */
public class KudeatuGUI extends javax.swing.JFrame {

    /**
     * Creates new form KudeatuGUI
     */
    DefaultTableModel modelo;
    ArrayList<Terminoa> terminoak;

    public KudeatuGUI() {
        initComponents();
        tabla.setVisible(false);
        modelo = new DefaultTableModel();
        modelo.addColumn("Euskera");
        modelo.addColumn("Gaztelera");
        this.tabla.setModel(modelo);
        tabla.setEnabled(false);
        
    }

    public void hiztegianGehitu() {

        try {
            FKudeatu.tGehitu(new Terminoa(euskeraField.getText().toLowerCase(), gaztField.getText().toLowerCase()));
            emaitzaLabel.setText("Emaitza hiztegian gorde da");
        } catch (IOException ex) {
            Logger.getLogger(KudeatuGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            emaitzaLabel.setText("Ezin izan da hiztegian gorde");
        }
    }

    public void datuakKargatu() {
        int numDatos = modelo.getRowCount();
        for (int i = 0; i < numDatos; i++) {   //para borrar la tabla y no se sobrecargue
            modelo.removeRow(0);
        }
        tabla.setVisible(true);
        try {
            terminoak = FKudeatu.arrayItzuli();
        } catch (IOException ex) {
            Logger.getLogger(KudeatuGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KudeatuGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] info = new String[4];
        int i = 0;
        for (Terminoa t : terminoak) {

            info[0] = t.getEuskara().toUpperCase()+" ";
            info[1] = t.getGaztelera().toUpperCase()+" ";
            modelo.addRow(info);
            i++;

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

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        gaztField = new javax.swing.JTextField();
        gehituButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        euskeraField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emaitzaLabel = new javax.swing.JLabel();
        HiztegiaButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Kudeatu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        gaztField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaztFieldActionPerformed(evt);
            }
        });
        getContentPane().add(gaztField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 190, 40));

        gehituButton.setText("Hitza Hiztegian Gehitu");
        gehituButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gehituButtonActionPerformed(evt);
            }
        });
        getContentPane().add(gehituButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 150, 40));

        jLabel2.setText("Gaztelania");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 80, 30));

        euskeraField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euskeraFieldActionPerformed(evt);
            }
        });
        getContentPane().add(euskeraField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 190, 40));

        jLabel3.setText("Euskera");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 50, 30));
        getContentPane().add(emaitzaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 230, 40));

        HiztegiaButton.setText("Hiztegi Guztia Ikusi");
        HiztegiaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HiztegiaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HiztegiaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 150, 40));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 500, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gaztFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaztFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gaztFieldActionPerformed

    private void euskeraFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euskeraFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_euskeraFieldActionPerformed

    private void gehituButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gehituButtonActionPerformed
        // TODO add your handling code here:

        if (euskeraField.getText().equals("") || gaztField.equals("")) {

            emaitzaLabel.setText("Eremuak ezin dira hutsik egon");

        } else {
            hiztegianGehitu();
        }

        euskeraField.setText("");
        gaztField.setText("");

    }//GEN-LAST:event_gehituButtonActionPerformed

    private void HiztegiaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HiztegiaButtonActionPerformed

        datuakKargatu();
    }//GEN-LAST:event_HiztegiaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(KudeatuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KudeatuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KudeatuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KudeatuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KudeatuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HiztegiaButton;
    private javax.swing.JLabel emaitzaLabel;
    private javax.swing.JTextField euskeraField;
    private javax.swing.JTextField gaztField;
    private javax.swing.JButton gehituButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
