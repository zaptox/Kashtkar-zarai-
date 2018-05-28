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
import kashtkarzarai.dao.CustomerDao;
import kashtkarzarai.daoImpl.CustomerDaoImpl;
import kashtkarzarai.util.playAudio;

/**
 *
 * @author Vksoni
 */
public class CustomerRecords extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    DefaultTableModel tableModelCustomer;
    public ArrayList<CustomerBeans> customers_list;
    TableRowSorter<DefaultTableModel> rowSorter = null;

    CustomerDao customerDao;

    public CustomerRecords() {
        initComponents();

        customerDao = new CustomerDaoImpl();
        tableModelCustomer = (DefaultTableModel) this.jTableCustomer.getModel();
        rowSorter = new TableRowSorter<DefaultTableModel>(tableModelCustomer);
        this.jTableCustomer.setRowSorter(rowSorter);

        JTableHeader header = this.jTableCustomer.getTableHeader();
        header.setBackground(new Color(0, 204, 0));
        header.setForeground(new Color(255, 255, 255));
        header.setFont(new Font("SansSerif", Font.BOLD, 18));
        showInTable();

    }

    public CustomerRecords(int reference) {
        initComponents();

        customerDao = new CustomerDaoImpl();
        tableModelCustomer = (DefaultTableModel) this.jTableCustomer.getModel();
        rowSorter = new TableRowSorter<DefaultTableModel>(tableModelCustomer);
        this.jTableCustomer.setRowSorter(rowSorter);

        JTableHeader header = this.jTableCustomer.getTableHeader();
        header.setBackground(new Color(0, 204, 0));
        header.setForeground(new Color(255, 255, 255));
        header.setFont(new Font("SansSerif", Font.BOLD, 18));

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
        jTableCustomer = new javax.swing.JTable();
        jTextFieldSerach = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableCustomer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTableCustomer.setForeground(new java.awt.Color(0, 0, 51));
        jTableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr #", "Customer Id", "Customer Name", "CNIC", "Contact #", "Address", "Creation Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCustomer.setToolTipText("Products");
        jTableCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableCustomer.setGridColor(new java.awt.Color(0, 0, 51));
        jTableCustomer.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTableCustomer.setSelectionForeground(new java.awt.Color(0, 240, 0));
        jTableCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCustomerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableCustomer);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 1260, 520));

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
        jPanel1.add(jTextFieldSerach, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 430, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, 430, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Search");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 60, -1));

        jButtonBack.setBackground(new java.awt.Color(0, 204, 0));
        jButtonBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack.setText("Back");
        jButtonBack.setFocusPainted(false);
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Check CUSTOMERS Record ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 310, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 590));

        jLabel1.setBackground(new java.awt.Color(0, 204, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("All right reserved|2017");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 1290, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed

        new HomePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jTextFieldSerachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerachKeyReleased
        // TODO add your handling code here:
        String searchData = this.jTextFieldSerach.getText();
        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchData));

    }//GEN-LAST:event_jTextFieldSerachKeyReleased

    private void jTextFieldSerachKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerachKeyPressed

    }//GEN-LAST:event_jTextFieldSerachKeyPressed

    private void jTextFieldSerachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSerachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSerachActionPerformed

    private void jTextFieldSerachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldSerachMouseClicked

    }//GEN-LAST:event_jTextFieldSerachMouseClicked

    private void jTableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCustomerMouseClicked
        int customer_id = Integer.parseInt("" + this.jTableCustomer.getValueAt(this.jTableCustomer.getSelectedRow(), 1));
       new CustomerDetails(customer_id).setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_jTableCustomerMouseClicked

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
            java.util.logging.Logger.getLogger(CustomerRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerRecords().setVisible(true);
            }
        });
    }

    public void showInTable() {
        tableModelCustomer.setRowCount(0);

        customers_list = customerDao.getAllCustomers();
        for (CustomerBeans customer : customers_list) {
            Vector V = new Vector();
            V.add(customers_list.size());
            V.add(customer.getCustomer_id());
            V.add(customer.getCustomer_name());
            V.add(customer.getCnic());
            V.add(customer.getContact());
            V.add(customer.getAddress());
            V.add(customer.getCreation_date());

            tableModelCustomer.addRow(V);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableCustomer;
    private javax.swing.JTextField jTextFieldSerach;
    // End of variables declaration//GEN-END:variables
}
