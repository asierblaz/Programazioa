
import java.util.ArrayList;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class MainGUI extends javax.swing.JFrame {

        static ArrayList<Marrazkia> marrazkiak;


    public MainGUI() {
        initComponents();
        sortu();
    }

    
    
    public  void sortu() {
        int id = 0;
        marrazkiak = new ArrayList<>();
        marrazkiak.add(new Marrazkia(id++, "h", "h"));
       
       
    }

        public static void ArrayeanGehitu(Marrazkia m){ 
            marrazkiak.add(m);
    }
        


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        marraztuButton = new javax.swing.JButton();
        asmatuButton = new javax.swing.JButton();
        titulolabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        marraztuButton.setText("MARRAZTU");
        marraztuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marraztuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(marraztuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 200, 110));

        asmatuButton.setText("ASMATU");
        asmatuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asmatuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(asmatuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 200, 110));

        titulolabel.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        titulolabel.setForeground(new java.awt.Color(0, 51, 255));
        titulolabel.setText("MARRAZKILLO");
        getContentPane().add(titulolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 440, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void marraztuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marraztuButtonActionPerformed
                     
        JFrame entrar = new MarraztuGUI();
        entrar.setVisible(true);
        
    }//GEN-LAST:event_marraztuButtonActionPerformed

    private void asmatuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asmatuButtonActionPerformed
        
             
        JFrame entrar = new AsmatuGUI();
        entrar.setVisible(true);
    }//GEN-LAST:event_asmatuButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asmatuButton;
    private javax.swing.JButton marraztuButton;
    private javax.swing.JLabel titulolabel;
    // End of variables declaration//GEN-END:variables
}
