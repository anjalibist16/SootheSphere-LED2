/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Project3.View;

import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;


/**
 *
 * @author lenoco
 */
public class nine extends javax.swing.JFrame {

    /**
     * Creates new form nine
     */
    public nine() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel2.setText("Mindful Breathing");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel53.setFont(new java.awt.Font("Segoe UI Historic", 0, 8)); // NOI18N
        jLabel53.setText("2. Close your eyes and drop all your concerns now, like setting down a heavy bag.");
        getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 10));

        jLabel14.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel14.setText("FOR VIDEO LINK, CLICK HERE: ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jButton1.setText("Video");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 223, 80, 30));

        jLabel54.setFont(new java.awt.Font("Segoe UI Historic", 0, 8)); // NOI18N
        jLabel54.setText("3. Focus on your breath. Bring your full awareness to the sensation of your breathing.");
        getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 10));

        jLabel55.setFont(new java.awt.Font("Segoe UI Historic", 0, 8)); // NOI18N
        jLabel55.setText("4. Start counting your breaths softly — count from one to ten, and then start over.");
        getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 10));

        jLabel56.setFont(new java.awt.Font("Segoe UI Historic", 0, 8)); // NOI18N
        jLabel56.setText("5. Breathe in through your nose and out through your mouth, letting your breath flow");
        getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 10));

        jLabel57.setFont(new java.awt.Font("Segoe UI Historic", 0, 8)); // NOI18N
        jLabel57.setText("effortlessly in and out of your body.");
        getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 10));

        jLabel58.setFont(new java.awt.Font("Segoe UI Historic", 0, 8)); // NOI18N
        jLabel58.setText("1. Take a deep breath and relax, with your eyes open or closed.");
        getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 10));

        jButton2.setText("<-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 223, 60, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project3/View/pics/Breathbg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            URI uri = new URI("https://youtu.be/I-SFdhVwrVA?si=2klDnTWctVASSGX1");
            java.awt.Desktop.getDesktop().browse(uri);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // open BreathingTechniques
        BreathingTechniques breathingtechniques = new BreathingTechniques();
        breathingtechniques.show(); // display BreathingTechniques here

        dispose(); // close page after opening BreathingTechniques
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(nine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

   
}
