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
public class CustomerPage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    DefaultTableModel tableModelCustomer;
    public ArrayList<CustomerBeans> customers_list;
    TableRowSorter<DefaultTableModel> rowSorter = null;

    CustomerDao customerDao;

    public CustomerPage() {
        initComponents();

        customerDao = new CustomerDaoImpl();
        tableModelCustomer = (DefaultTableModel) this.jTableCustomer.getModel();
        rowSorter = new TableRowSorter<DefaultTableModel>(tableModelCustomer);
        this.jTableCustomer.setRowSorter(rowSorter);

        JTableHeader header = this.jTableCustomer.getTableHeader();
        header.setBackground(new Color(0, 204, 0));
        header.setForeground(new Color(255, 255, 255));
        header.setFont(new Font("SansSerif", Font.BOLD, 18));
        this.jButtonUpdate.setEnabled(false);
        this.jButtonDelete.setEnabled(false);
        this.registerButton.setEnabled(false);
        showInTable();

    }
boolean ref=false;
    public CustomerPage(int reference) {
        initComponents();
        customerDao = new CustomerDaoImpl();
        tableModelCustomer = (DefaultTableModel) this.jTableCustomer.getModel();
        rowSorter = new TableRowSorter<DefaultTableModel>(tableModelCustomer);
        this.jTableCustomer.setRowSorter(rowSorter);
ref=true;

        JTableHeader header = this.jTableCustomer.getTableHeader();
        header.setBackground(new Color(0, 204, 0));
        header.setForeground(new Color(255, 255, 255));
        header.setFont(new Font("SansSerif", Font.BOLD, 18));
        this.jButtonUpdate.setEnabled(false);
        this.jButtonDelete.setEnabled(false);
        this.registerButton.setEnabled(false);
        
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
        jButtonDelete = new javax.swing.JButton();
        jTextFieldCustomername = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCustomerCnic = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCustomerContact = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCustomerAddress = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jButtoSave = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButtonClear1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
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

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 1000, 470));

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

        jButtonDelete.setBackground(new java.awt.Color(0, 204, 0));
        jButtonDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 240, 40));

        jTextFieldCustomername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldCustomername.setBorder(null);
        jTextFieldCustomername.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldCustomername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldCustomernameMouseClicked(evt);
            }
        });
        jTextFieldCustomername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustomernameActionPerformed(evt);
            }
        });
        jTextFieldCustomername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCustomernameKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldCustomername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 260, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 260, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("CUSTOMERS Data");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 230, -1));

        jTextFieldCustomerCnic.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldCustomerCnic.setBorder(null);
        jTextFieldCustomerCnic.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldCustomerCnic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldCustomerCnicMouseClicked(evt);
            }
        });
        jTextFieldCustomerCnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustomerCnicActionPerformed(evt);
            }
        });
        jTextFieldCustomerCnic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCustomerCnicKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldCustomerCnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 260, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 260, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("CNIC*");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, -1));

        jTextFieldCustomerContact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldCustomerContact.setBorder(null);
        jTextFieldCustomerContact.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldCustomerContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldCustomerContactMouseClicked(evt);
            }
        });
        jTextFieldCustomerContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustomerContactActionPerformed(evt);
            }
        });
        jTextFieldCustomerContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCustomerContactKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldCustomerContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 260, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("CONTACT*");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, -1));

        jTextFieldCustomerAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldCustomerAddress.setBorder(null);
        jTextFieldCustomerAddress.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldCustomerAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldCustomerAddressMouseClicked(evt);
            }
        });
        jTextFieldCustomerAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustomerAddressActionPerformed(evt);
            }
        });
        jTextFieldCustomerAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCustomerAddressKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldCustomerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 260, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 260, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("ADDRESS*");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 90, -1));

        jButtoSave.setBackground(new java.awt.Color(0, 204, 0));
        jButtoSave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtoSave.setForeground(new java.awt.Color(255, 255, 255));
        jButtoSave.setText("Save");
        jButtoSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoSaveActionPerformed(evt);
            }
        });
        jPanel1.add(jButtoSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 240, 40));

        registerButton.setBackground(new java.awt.Color(0, 204, 0));
        registerButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Select Customer");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, 240, 40));

        jButtonUpdate.setBackground(new java.awt.Color(0, 204, 0));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 240, 40));

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

        jButtonClear1.setBackground(new java.awt.Color(0, 204, 0));
        jButtonClear1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonClear1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear1.setText("Clear");
        jButtonClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClear1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 240, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("CUSTOMER NAME*");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 170, -1));

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

    private void jTableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCustomerMouseClicked
        int customer_id = Integer.parseInt("" + this.jTableCustomer.getValueAt(this.jTableCustomer.getSelectedRow(), 1));
        CustomerBeans customer = customerDao.getCustomerById(customer_id);
        this.jTextFieldCustomerAddress.setText(customer.getAddress());
        this.jTextFieldCustomername.setText(customer.getCustomer_name());
        this.jTextFieldCustomerCnic.setText(customer.getCnic());
        this.jTextFieldCustomerContact.setText(customer.getContact());
        this.jButtonUpdate.setEnabled(true);
        this.jButtonDelete.setEnabled(true);
        if(ref){
        this.registerButton.setEnabled(true);
        }
        this.jButtoSave.setEnabled(false);


    }//GEN-LAST:event_jTableCustomerMouseClicked

    private void jTextFieldSerachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldSerachMouseClicked

    }//GEN-LAST:event_jTextFieldSerachMouseClicked

    private void jTextFieldSerachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSerachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSerachActionPerformed

    private void jTextFieldSerachKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSerachKeyPressed

    }//GEN-LAST:event_jTextFieldSerachKeyPressed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        int customer_id = Integer.parseInt("" + this.jTableCustomer.getValueAt(this.jTableCustomer.getSelectedRow(), 1));
        String cust_name = customerDao.getCustomerById(customer_id).getCustomer_name();

        if (customerDao.removeCustomer(new CustomerBeans(customer_id, "", "", "", "", "")) >= 0) {
            JOptionPane.showMessageDialog(this, cust_name + " deleted succesfully ", "deleted", JOptionPane.OK_OPTION);
            this.jTextFieldCustomerAddress.setText("");
            this.jTextFieldCustomername.setText("");
            this.jTextFieldCustomerCnic.setText("");
            this.jTextFieldCustomerContact.setText("");
            this.jButtonUpdate.setEnabled(false);
            this.jButtonDelete.setEnabled(false);
            this.jButtoSave.setEnabled(true);
            
            showInTable();
        }

    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTextFieldCustomernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCustomernameMouseClicked

    }//GEN-LAST:event_jTextFieldCustomernameMouseClicked

    private void jTextFieldCustomernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustomernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustomernameActionPerformed

    private void jTextFieldCustomernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCustomernameKeyPressed

    }//GEN-LAST:event_jTextFieldCustomernameKeyPressed

    private void jTextFieldCustomerCnicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCustomerCnicMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustomerCnicMouseClicked

    private void jTextFieldCustomerCnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustomerCnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustomerCnicActionPerformed

    private void jTextFieldCustomerCnicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCustomerCnicKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustomerCnicKeyPressed

    private void jTextFieldCustomerContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCustomerContactMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustomerContactMouseClicked

    private void jTextFieldCustomerContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustomerContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustomerContactActionPerformed

    private void jTextFieldCustomerContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCustomerContactKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustomerContactKeyPressed

    private void jTextFieldCustomerAddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCustomerAddressMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustomerAddressMouseClicked

    private void jTextFieldCustomerAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustomerAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustomerAddressActionPerformed

    private void jTextFieldCustomerAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCustomerAddressKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustomerAddressKeyPressed

    private void jButtoSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoSaveActionPerformed
        String customer_name = this.jTextFieldCustomername.getText();
        String cnic = this.jTextFieldCustomerCnic.getText();
        String contact = this.jTextFieldCustomerContact.getText();
        String address = this.jTextFieldCustomerAddress.getText();

        if (!(customer_name.equals("") || cnic.equals("") || contact.equals("") || address.equals(""))) {
            if (true) {
                if (customerDao.saveCustomer(new CustomerBeans(0, customer_name, contact, cnic, address, CurrentDate.getCurrentDate())) >= 0) {
                    this.jTextFieldCustomerAddress.setText("");
                    this.jTextFieldCustomername.setText("");
                    this.jTextFieldCustomerCnic.setText("");
                    this.jTextFieldCustomerContact.setText("");

                    JOptionPane.showMessageDialog(this, customer_name + " saved succesfully ", "Added", JOptionPane.DEFAULT_OPTION);
                    showInTable();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Invalid CNIC");
                new playAudio().playErrorSound();

            }
        } else {
            new playAudio().playErrorSound();
            JOptionPane.showMessageDialog(rootPane, "Please fill require fields");
        }


    }//GEN-LAST:event_jButtoSaveActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
//        int c_id= this.
  int customer_id = Integer.parseInt("" + this.jTableCustomer.getValueAt(this.jTableCustomer.getSelectedRow(), 1));
        CustomerBeans customer = customerDao.getCustomerById(customer_id);
        this.dispose();
        new SalePage(customer).setVisible(true);
      

    }//GEN-LAST:event_registerButtonActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed

        int customer_id = Integer.parseInt("" + this.jTableCustomer.getValueAt(this.jTableCustomer.getSelectedRow(), 1));
        String customer_name = this.jTextFieldCustomername.getText();
        String cnic = this.jTextFieldCustomerCnic.getText();
        String contact = this.jTextFieldCustomerContact.getText();
        String address = this.jTextFieldCustomerAddress.getText();
        if (!(customer_name.equals("") || cnic.equals("") || contact.equals("") || address.equals(""))) {

            customerDao.modifyCustomers(new CustomerBeans(customer_id, customer_name, contact, cnic, address, CurrentDate.getCurrentDate()));
            JOptionPane.showMessageDialog(this, customer_name + " records updated succesfully ", "Update", JOptionPane.PLAIN_MESSAGE);
            this.jTextFieldCustomerAddress.setText("");
            this.jTextFieldCustomername.setText("");
            this.jTextFieldCustomerCnic.setText("");
            this.jTextFieldCustomerContact.setText("");
            this.jButtonUpdate.setEnabled(false);
            this.jButtonDelete.setEnabled(false);
            this.jButtoSave.setEnabled(true);

            showInTable();
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
        this.dispose();

        new HomePage().setVisible(true);

    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClear1ActionPerformed
        // TODO add your handling code here:
        this.jTextFieldCustomerAddress.setText("");
        this.jTextFieldCustomerCnic.setText("");
        this.jTextFieldSerach.setText("");
        this.jTextFieldCustomername.setText("");
        this.jTextFieldCustomerContact.setText("");
        
        
        
        
        
    }//GEN-LAST:event_jButtonClear1ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerPage().setVisible(true);
            }
        });
    }

    public void showInTable() {
        tableModelCustomer.setRowCount(0);
int sr=1;
        customers_list = customerDao.getAllCustomers();
        for (CustomerBeans customer : customers_list) {
            Vector V = new Vector();
            V.add(sr++);
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
    private javax.swing.JButton jButtoSave;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonClear1;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTableCustomer;
    private javax.swing.JTextField jTextFieldCustomerAddress;
    private javax.swing.JTextField jTextFieldCustomerCnic;
    private javax.swing.JTextField jTextFieldCustomerContact;
    private javax.swing.JTextField jTextFieldCustomername;
    private javax.swing.JTextField jTextFieldSerach;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables
}
