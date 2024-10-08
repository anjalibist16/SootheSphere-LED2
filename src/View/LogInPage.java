/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.Login;
import Model.User;

import database.DatabaseConnection;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class LogInPage extends javax.swing.JFrame {

    /**
     * Creates new form Signuppage
     */
    public LogInPage() {
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

        jCheckBox1 = new javax.swing.JCheckBox();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SignUp1Button = new javax.swing.JButton();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        LogIn1Button = new javax.swing.JButton();
        ForgetPasswordButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Welcome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 150, 40));

        jLabel2.setText("New User?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 70, -1));

        SignUp1Button.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SignUp1Button.setForeground(new java.awt.Color(102, 153, 255));
        SignUp1Button.setText("Sign Up");
        SignUp1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUp1ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SignUp1Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 90, 20));

        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 157, -1));

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 157, -1));

        LogIn1Button.setBackground(new java.awt.Color(102, 153, 255));
        LogIn1Button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LogIn1Button.setForeground(new java.awt.Color(255, 255, 255));
        LogIn1Button.setText("Log in");
        LogIn1Button.setToolTipText("");
        LogIn1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogIn1ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogIn1Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        ForgetPasswordButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ForgetPasswordButton.setForeground(new java.awt.Color(102, 153, 255));
        ForgetPasswordButton.setText("Forget password?");
        ForgetPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgetPasswordButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ForgetPasswordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 49, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/SootheSphere (11).png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void ForgetPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgetPasswordButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ResetPassword Rp = new ResetPassword();
        Rp.setVisible(true);
    }//GEN-LAST:event_ForgetPasswordButtonActionPerformed

    private void SignUp1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUp1ButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        SignUpPage Sp = new SignUpPage();
        Sp.setVisible(true);
    }//GEN-LAST:event_SignUp1ButtonActionPerformed

    private boolean checkCredentials(String username, String password) {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next(); // Returns true if a matching record is found
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    private void LogIn1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogIn1ButtonActionPerformed
        // TODO add your handling code here:
        String username = Username.getText();
<<<<<<< HEAD:src/src/soothesphere/View/LogInPage.java
        String password = new String(Password.getPassword());

        if (username.equals("")) {
            JOptionPane.showMessageDialog(this, "Username is empty");
        } else if (password.equals("")) {
            JOptionPane.showMessageDialog(this, "Password is empty");
        } else {
            if (checkCredentials(username, password)) {
                JOptionPane.showMessageDialog(this, "Login successful", "Success", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                MainPage mp = new MainPage();
                mp.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
=======
        String password = Password.getText();
        User usr=new User();
        usr.setUsername(username);
        usr.setPassword(password);
        if(username.equals("")){
            JOptionPane.showMessageDialog(this, "username is empty");
        }else if (password.equals("")){
            JOptionPane.showMessageDialog(this, "password is empty");
        }else{
            Login a=new Login();
            
            if(a.isLogin(usr)){
             int response = JOptionPane.showConfirmDialog(this, "Login successful", "Success", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
             if (response == JOptionPane.OK_OPTION) {
                this.dispose();
                MainPage Mp = new MainPage();
                Mp.setVisible(true);
             }
            
            }
            else{
             JOptionPane.showMessageDialog(this, "Credential wrong.");
            }

>>>>>>> 7a3cf7d49bace9a4405c45084104d693abeb4878:src/View/LogInPage.java
        }

    }//GEN-LAST:event_LogIn1ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ForgetPasswordButton;
    private javax.swing.JButton LogIn1Button;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton SignUp1Button;
    private javax.swing.JTextField Username;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
