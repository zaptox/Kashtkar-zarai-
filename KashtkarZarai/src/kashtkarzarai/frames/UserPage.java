/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kashtkarzarai.frames;

import zaptox.Kashkarzarai.util.CurrentDate;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;
import kashtkarzarai.bean.CustomerBeans;
import kashtkarzarai.bean.UserBeans;
import kashtkarzarai.dao.CustomerDao;
import kashtkarzarai.dao.UserDao;
import kashtkarzarai.daoImpl.CustomerDaoImpl;
import kashtkarzarai.daoImpl.UserDaoImpl;
import kashtkarzarai.util.playAudio;

/**
 *
 * @author Vksoni
 */
public class UserPage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    DefaultTableModel tableModelUser;
    public ArrayList<UserBeans> user_list;
    TableRowSorter<DefaultTableModel> rowSorter = null;

    UserDao userDao;

    public UserPage() {
        initComponents();

        userDao = new UserDaoImpl();
        tableModelUser = (DefaultTableModel) this.jTableUser.getModel();
        rowSorter = new TableRowSorter<DefaultTableModel>(tableModelUser);
        this.jTableUser.setRowSorter(rowSorter);

        JTableHeader header = this.jTableUser.getTableHeader();
        header.setBackground(new Color(0, 204, 0));
        header.setForeground(new Color(255, 255, 255));
        header.setFont(new Font("SansSerif", Font.BOLD, 18));
        this.jButtonUpdate.setEnabled(false);
        this.jButtonDelete.setEnabled(false);
        showInTable();

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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableUser = new javax.swing.JTable();
        jTextFieldSerach = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        jTextFieldUsername = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jButtoSave = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTableUser.setForeground(new java.awt.Color(0, 0, 51));
        jTableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr #", "User Id ", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUser.setToolTipText("Products");
        jTableUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableUser.setGridColor(new java.awt.Color(0, 0, 51));
        jTableUser.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTableUser.setSelectionForeground(new java.awt.Color(0, 240, 0));
        jTableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUserMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableUser);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 500, 530));

        jTextFieldSerach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldSerach.setBorder(null);
        jTextFieldSerach.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldSerach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldSerachMouseClicked(evt);
            }
        });
        jTextFieldSerach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSerachActionPerformed(evt);
            }
        });
        jTextFieldSerach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSerachKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSerachKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldSerach, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 430, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 430, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Search");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 60, -1));

        jButtonDelete.setBackground(new java.awt.Color(0, 204, 0));
        jButtonDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 240, 40));

        jTextFieldUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        jPanel1.add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 260, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 260, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("USERNAME*");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 170, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 260, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("PASSWORD*");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, -1));

        jButtoSave.setBackground(new java.awt.Color(0, 204, 0));
        jButtoSave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtoSave.setForeground(new java.awt.Color(255, 255, 255));
        jButtoSave.setText("Save");
        jButtoSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoSaveActionPerformed(evt);
            }
        });
        jPanel1.add(jButtoSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 240, 40));

        jButtonClear.setBackground(new java.awt.Color(0, 204, 0));
        jButtonClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 240, 40));

        jButtonUpdate.setBackground(new java.awt.Color(0, 204, 0));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 240, 40));

        jButtonBack.setBackground(new java.awt.Color(0, 204, 0));
        jButtonBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        jPasswordFieldPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        jPanel1.add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 260, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 590));

        jLabel1.setBackground(new java.awt.Color(0, 204, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("All right reserved|2017");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 910, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUserMouseClicked
         int user_id = Integer.parseInt("" + this.jTableUser.getValueAt(this.jTableUser.getSelectedRow(), 1));
        UserBeans user = userDao.getUserById(user_id);
        this.jTextFieldUsername.setText(user.getName());
        this.jPasswordFieldPassword.setText(user.getPassword());
        this.jButtonUpdate.setEnabled(true);
        this.jButtonDelete.setEnabled(true);
        this.jButtoSave.setEnabled(false);


    }//GEN-LAST:event_jTableUserMouseClicked

    private void jTextFieldSerachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldSerachMouseClicked

    }//GEN-LAST:event_jTextFieldSerachMouseClicked

    private void jTextFieldSerachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSerachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSerachActionPerformed

    private void jTextFieldSerachKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerachKeyPressed

    }//GEN-LAST:event_jTextFieldSerachKeyPressed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
         int user_id = Integer.parseInt("" + this.jTableUser.getValueAt(this.jTableUser.getSelectedRow(), 1));
        String username = userDao.getUserById(user_id).getName();
        String password=userDao.getUserById(user_id).getPassword();

        if (userDao.removeUser(new UserBeans(user_id, "", "")) >= 0) {
            JOptionPane.showMessageDialog(this, username + " deleted succesfully ", "deleted", JOptionPane.OK_OPTION);
            this.jTextFieldUsername.setText("");
            this.jPasswordFieldPassword.setText("");
            this.jButtonUpdate.setEnabled(false);
            this.jButtonDelete.setEnabled(false);
            this.jButtoSave.setEnabled(true);
            showInTable();
        }

    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTextFieldUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUsernameMouseClicked

    }//GEN-LAST:event_jTextFieldUsernameMouseClicked

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jTextFieldUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsernameKeyPressed

    }//GEN-LAST:event_jTextFieldUsernameKeyPressed

    private void jButtoSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoSaveActionPerformed
        String username = this.jTextFieldUsername.getText().trim();
        String password = this.jPasswordFieldPassword.getText().trim();

        if (!(username.equals("") || password.equals(""))) {
            if (userDao.saveUser(new UserBeans(0, username, password)) >= 0) {

                JOptionPane.showMessageDialog(this, username + " saved succesfully ", "Added", JOptionPane.DEFAULT_OPTION);
                showInTable();
            }
        } else {
            new playAudio().playErrorSound();
            JOptionPane.showMessageDialog(rootPane, "Please fill require fields");
        }


    }//GEN-LAST:event_jButtoSaveActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        this.jTextFieldUsername.setText("");
        this.jPasswordFieldPassword.setText("");
        this.jButtoSave.setEnabled(true);
        this.jButtonUpdate.setEnabled(false);
        this.jButtonDelete.setEnabled(false);

    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed

         int user_id = Integer.parseInt("" + this.jTableUser.getValueAt(this.jTableUser.getSelectedRow(), 1));
        String username = this.jTextFieldUsername.getText().trim();
        String password = this.jPasswordFieldPassword.getText().trim();
      
        if (!(username.equals("") || password.equals(""))) {
            if (userDao.modifyUser(new UserBeans(user_id, username, password)) >= 0) {

                JOptionPane.showMessageDialog(this, username + " updated succesfully ", "Update", JOptionPane.DEFAULT_OPTION);
                showInTable();
            }
        } else {
            new playAudio().playErrorSound();
            JOptionPane.showMessageDialog(rootPane, "Please fill require fields");
        }

    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTextFieldSerachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerachKeyReleased
        // TODO add your handling code here:
        String searchData = this.jTextFieldSerach.getText();
        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchData));


    }//GEN-LAST:event_jTextFieldSerachKeyReleased

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed

        new HomePage().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jPasswordFieldPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordMouseClicked

    }//GEN-LAST:event_jPasswordFieldPasswordMouseClicked

    private void jPasswordFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPasswordActionPerformed

    private void jPasswordFieldPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordKeyPressed
        //        if (this.jPasswordFieldPassword.getText().equalsIgnoreCase("@Enter_Password")) {
        //            this.jPasswordFieldPassword.setText("");
        //        }
        //        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        //
        //            if (!(this.jTextFieldUsername.getText().equals("Enter Username")
        //                && this.jPasswordFieldPassword.getText().equals("@Enter_Password"))) {
        //
        //            user = dbManager.userAuthentication(this.jTextFieldUsername.getText(),
        //                this.jPasswordFieldPassword.getText());
        //            if (user == null) {
        //                JOptionPane.showMessageDialog(this, "Invalid Password or username!");
        //                this.jTextFieldUsername.setText("Enter Username");
        //                this.jPasswordFieldPassword.setText("@Enter_Password");
        //            } else if ((user.getUser_name().equals(this.jTextFieldUsername.getText()))
        //                && (user.getPassword().equals(this.jPasswordFieldPassword.getText()))) {
        //                this.jTextFieldUsername.setText("");
        //                this.jPasswordFieldPassword.setText("");
        //                user_id = user.getUser_id();
        //                user_cat_id = user.getUser_cat_id();
        //                new HomePage(user_id, user_cat_id).setVisible(true);// if pass correct than open homepage
        //                this.dispose();
        //            }
        //        } else {
        //            JOptionPane.showMessageDialog(this, "Please type Username & Password");
        //        }
        //
        //        }
    }//GEN-LAST:event_jPasswordFieldPasswordKeyPressed

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
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPage().setVisible(true);
            }
        });
    }

    public void showInTable() {
        tableModelUser.setRowCount(0);

        user_list = userDao.getAllUsers();
        int i = 1;

        for (UserBeans user : user_list) {
            Vector V = new Vector();
            V.add(i++);
            V.add(user.getId());
            V.add(user.getName());
            V.add(user.getPassword());

            tableModelUser.addRow(V);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoSave;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTableUser;
    private javax.swing.JTextField jTextFieldSerach;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}