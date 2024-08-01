/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src.soothesphere.View;

import Project.View.Education;
import Project1.View.ListOfMusic;
import Project2.View.MeditationScriptss;
import Project3.View.BreathingTechniques;
import soothesphere.listofcontacts;
import soothesphere.yogaandexercises;




/**
 *
 * @author User
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form Loginpage
     */
    public MainPage() {
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
        jButton6 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        SettingsButton = new javax.swing.JButton();
        ContactButton = new javax.swing.JButton();
        ProfileButton = new javax.swing.JButton();
        NotificationButton = new javax.swing.JButton();
        BreathingButton = new javax.swing.JButton();
        AnxietyButton = new javax.swing.JButton();
        MeditationButton = new javax.swing.JButton();
        YogaButton = new javax.swing.JButton();
        ExerciseButton = new javax.swing.JButton();
        MusicButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jButton6.setText("jButton6");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/SootheSphere.png"))); // NOI18N
        SettingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SettingsButtonMouseClicked(evt);
            }
        });
        SettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SettingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 30, -1));

        ContactButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/Emergency_Phone_Numbers-removebg-preview.png"))); // NOI18N
        ContactButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContactButtonMouseClicked(evt);
            }
        });
        ContactButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ContactButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 32, -1));

        ProfileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/Profile Icon Silhouette PNG Transparent, Avatar Icon Profile Icon Member Login Vector Isolated, Login Icons, Profile Icons, Avatar Icons PNG Image For Free Download.jpg"))); // NOI18N
        ProfileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileButtonMouseClicked(evt);
            }
        });
        ProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ProfileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 32, 31));

        NotificationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/SootheSphere (10).png"))); // NOI18N
        NotificationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NotificationButtonMouseClicked(evt);
            }
        });
        getContentPane().add(NotificationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 32, 31));

        BreathingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/SootheSphere (6).png"))); // NOI18N
        BreathingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BreathingButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BreathingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 54, 54));

        AnxietyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/SootheSphere (5).png"))); // NOI18N
        AnxietyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnxietyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AnxietyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 58, 54));

        MeditationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/SootheSphere (7).png"))); // NOI18N
        MeditationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeditationButtonActionPerformed(evt);
            }
        });
        getContentPane().add(MeditationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 56, 54));

        YogaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/SootheSphere (4).png"))); // NOI18N
        YogaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YogaButtonMouseClicked(evt);
            }
        });
        YogaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YogaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(YogaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 50, 54));

        ExerciseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/SootheSphere (8).png"))); // NOI18N
        ExerciseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExerciseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExerciseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 56, 54));

        MusicButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/SootheSphere (9).png"))); // NOI18N
        MusicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusicButtonActionPerformed(evt);
            }
        });
        getContentPane().add(MusicButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 55, 54));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/SootheSphere (3).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BreathingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BreathingButtonActionPerformed
        // TODO add your handling code here:
        // open MeditationScripts
        MeditationScriptss ms=new MeditationScriptss();
        ms.show(); // display MeditationScripts here
        
        dispose(); // close MainPage after opening MeditationScripts
        
    }//GEN-LAST:event_BreathingButtonActionPerformed

    private void YogaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YogaButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_YogaButtonActionPerformed

    private void ContactButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactButtonActionPerformed
        // TODO add your handling code here:
        // open listofcontacts
        listofcontacts loc=new listofcontacts();
        loc.show(); // display listofcontacts here
        
        dispose(); // close MainPage after opening listofcontacts
    }//GEN-LAST:event_ContactButtonActionPerformed

    private void SettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SettingsButtonActionPerformed

    private void AnxietyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnxietyButtonActionPerformed
        // TODO add your handling code here:
        // open List Of Music
        ListOfMusic lom=new ListOfMusic();
        lom.show(); // display ListOfMusic here
        
        dispose(); // close MainPage after opening ListOfMusic
    }//GEN-LAST:event_AnxietyButtonActionPerformed

    private void MeditationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeditationButtonActionPerformed
        // TODO add your handling code here:
        // open yogaandexercises
        yogaandexercises yae=new yogaandexercises();
        yae.show(); // display yogaandexercises here
        
        dispose(); // close MainPage after opening yogaandexercises
    }//GEN-LAST:event_MeditationButtonActionPerformed

    private void MusicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicButtonActionPerformed
        // TODO add your handling code here:
        // open BreathingTechniques
        BreathingTechniques bt=new BreathingTechniques();
        bt.show(); // display BreathingTechniques here
        
        dispose(); // close MainPage after opening BreathingTechniques
    }//GEN-LAST:event_MusicButtonActionPerformed

    private void ExerciseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExerciseButtonActionPerformed
        // TODO add your handling code here:
        // open Education
        Education educ=new Education();
        educ.show(); // display Education here
        
        dispose(); // close MainPage after opening Education
    }//GEN-LAST:event_ExerciseButtonActionPerformed

    private void ProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProfileButtonActionPerformed

    private void ContactButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactButtonMouseClicked
        listofcontacts listofcontacts = new listofcontacts();
   listofcontacts.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_ContactButtonMouseClicked

    private void NotificationButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NotificationButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NotificationButtonMouseClicked

    private void SettingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SettingsButtonMouseClicked

    private void ProfileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ProfileButtonMouseClicked

    private void YogaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YogaButtonMouseClicked
       yogaandexercises yogaandexercises = new yogaandexercises();
    yogaandexercises.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_YogaButtonMouseClicked

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnxietyButton;
    private javax.swing.JButton BreathingButton;
    private javax.swing.JButton ContactButton;
    private javax.swing.JButton ExerciseButton;
    private javax.swing.JButton MeditationButton;
    private javax.swing.JButton MusicButton;
    private javax.swing.JButton NotificationButton;
    private javax.swing.JButton ProfileButton;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JButton YogaButton;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
