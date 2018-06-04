/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kashtkarzarai.frames;

import com.sun.glass.events.KeyEvent;
import java.applet.AudioClip;
import java.awt.Color;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;
import kashtkarzarai.bean.UserBeans;
import kashtkarzarai.dao.UserDao;
import kashtkarzarai.daoImpl.UserDaoImpl;
import kashtkarzarai.util.playAudio;


/**
 *
 * @author Vksoni
 */

public class Login extends javax.swing.JFrame {
 
  

    /**
     * Creates new form LoginPage
     */
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButtonCancel = new javax.swing.JButton();
        jButtonLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 370, -1));

        jTextFieldUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldUsername.setText("y");
        jTextFieldUsername.setBorder(null);
        jTextFieldUsername.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldUsernameMouseClicked(evt);
            }
        });
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });
        jTextFieldUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldUsernameKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 370, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("USERNAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 200, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 370, -1));

        jPasswordFieldPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordFieldPassword.setText("y");
        jPasswordFieldPassword.setBorder(null);
        jPasswordFieldPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordFieldPasswordMouseClicked(evt);
            }
        });
        jPasswordFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPasswordActionPerformed(evt);
            }
        });
        jPasswordFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldPasswordKeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 370, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("PASSWORD");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 200, -1));

        jButtonCancel.setBackground(new java.awt.Color(0, 204, 0));
        jButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 203, 140, 40));

        jButtonLogin.setBackground(new java.awt.Color(0, 204, 0));
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 203, 150, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kashtkarzarai/images/logo1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 120, 140));

        jLabel5.setBackground(new java.awt.Color(0, 204, 0));
        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Kashtkar Zarai Markaz Sinjhoro");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 270));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUsernameMouseClicked
        if (this.jTextFieldUsername.getText().equalsIgnoreCase("Enter Username")) {
            this.jTextFieldUsername.setText("");
        }
    }//GEN-LAST:event_jTextFieldUsernameMouseClicked

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jTextFieldUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsernameKeyPressed
if (evt.getKeyCode() == KeyEvent.VK_ENTER) {String name =  this.jTextFieldUsername.getText();
        String pass=  this.jPasswordFieldPassword.getText();
        if(!this.jTextFieldUsername.getText().matches("^([A-Za-z_][A-Za-z_]*)$")){
            new playAudio().playErrorSound();
               JOptionPane.showMessageDialog(rootPane, "Username doesn not contain number");
        }
        else{
      
            UserDao user = new UserDaoImpl();
           if( user.userLogin(new UserBeans(0, name, pass))){
               
               new playAudio().playSuccessSound();
               new HomePage().setVisible(true);
               this.dispose();
            
           }
           else{
                new playAudio().playErrorSound();
                   JOptionPane.showMessageDialog(rootPane, "Incorrect Password");
           }
        }}    }//GEN-LAST:event_jTextFieldUsernameKeyPressed

    private void jPasswordFieldPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordMouseClicked
        
    }//GEN-LAST:event_jPasswordFieldPasswordMouseClicked

    private void jPasswordFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPasswordActionPerformed

    private void jPasswordFieldPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordKeyPressed

    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {String name =  this.jTextFieldUsername.getText();
        String pass=  this.jPasswordFieldPassword.getText();
        if(!this.jTextFieldUsername.getText().matches("^([A-Za-z_][A-Za-z_]*)$")){
            new playAudio().playErrorSound();
               JOptionPane.showMessageDialog(rootPane, "Username doesn not contain number");
        }
        else{
      
            UserDao user = new UserDaoImpl();
           if( user.userLogin(new UserBeans(0, name, pass))){
               
               new playAudio().playSuccessSound();
               new HomePage().setVisible(true);
               this.dispose();
            
           }
           else{
                new playAudio().playErrorSound();
                   JOptionPane.showMessageDialog(rootPane, "Incorrect Password");
           }
        }}
    }//GEN-LAST:event_jPasswordFieldPasswordKeyPressed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // TODO add your handling code here:
        String name =  this.jTextFieldUsername.getText();
        String pass=  this.jPasswordFieldPassword.getText();
        if(!this.jTextFieldUsername.getText().matches("^([A-Za-z_][A-Za-z_]*)$")){
            new playAudio().playErrorSound();
               JOptionPane.showMessageDialog(rootPane, "Username doesn not contain number");
        }
        else{
      
            UserDao user = new UserDaoImpl();
           if( user.userLogin(new UserBeans(0, name, pass))){
               
               new playAudio().playSuccessSound();
               new HomePage().setVisible(true);
               this.dispose();
            
           }
           else{
                new playAudio().playErrorSound();
                
                   JOptionPane.showMessageDialog(rootPane, "Incorrect Password");
           }
        }
        
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
