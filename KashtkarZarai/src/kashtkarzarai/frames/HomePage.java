/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kashtkarzarai.frames;

/**
 *
 * @author Vksoni
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
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
        jButtonLogin1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonLogin6 = new javax.swing.JButton();
        jButtonLogin7 = new javax.swing.JButton();
        jButtonLogin8 = new javax.swing.JButton();
        jButtonLogin9 = new javax.swing.JButton();
        jButtonLogin10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonLogin1.setBackground(new java.awt.Color(0, 204, 0));
        jButtonLogin1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonLogin1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin1.setText("Company");
        jButtonLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogin1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 310, 120));

        jLabel2.setBackground(new java.awt.Color(0, 204, 0));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jButtonLogin6.setBackground(new java.awt.Color(0, 204, 0));
        jButtonLogin6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonLogin6.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin6.setText("Customer");
        jButtonLogin6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogin6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 310, 120));

        jButtonLogin7.setBackground(new java.awt.Color(0, 204, 0));
        jButtonLogin7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonLogin7.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin7.setText("Products");
        jButtonLogin7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogin7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 310, 120));

        jButtonLogin8.setBackground(new java.awt.Color(0, 204, 0));
        jButtonLogin8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonLogin8.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin8.setText("User");
        jButtonLogin8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogin8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 310, 120));

        jButtonLogin9.setBackground(new java.awt.Color(0, 204, 0));
        jButtonLogin9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonLogin9.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin9.setText("Customer");
        jButtonLogin9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogin9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 310, 120));

        jButtonLogin10.setBackground(new java.awt.Color(0, 204, 0));
        jButtonLogin10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonLogin10.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin10.setText("Sale");
        jButtonLogin10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogin10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 310, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 570));

        jLabel1.setBackground(new java.awt.Color(0, 204, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("All right reserved|2017");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 564, 1010, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogin1ActionPerformed
        new CompanyForm().setVisible(true);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLogin1ActionPerformed

    private void jButtonLogin6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogin6ActionPerformed
        // TODO add your handling code here:
        new CustomerPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonLogin6ActionPerformed

    private void jButtonLogin7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogin7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLogin7ActionPerformed

    private void jButtonLogin8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogin8ActionPerformed
new UserPage().setVisible(true);    }//GEN-LAST:event_jButtonLogin8ActionPerformed

    private void jButtonLogin9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogin9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLogin9ActionPerformed

    private void jButtonLogin10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogin10ActionPerformed
        // TODO add your handling code here:
        new SalePage().setVisible(true);
    }//GEN-LAST:event_jButtonLogin10ActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin1;
    private javax.swing.JButton jButtonLogin10;
    private javax.swing.JButton jButtonLogin6;
    private javax.swing.JButton jButtonLogin7;
    private javax.swing.JButton jButtonLogin8;
    private javax.swing.JButton jButtonLogin9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
