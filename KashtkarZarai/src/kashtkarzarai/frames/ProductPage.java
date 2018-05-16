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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;
import kashtkarzarai.bean.CompanyBeans;
import kashtkarzarai.bean.CustomerBeans;
import kashtkarzarai.bean.ProductBeans;
import kashtkarzarai.dao.CompanyDao;
import kashtkarzarai.dao.ProductDao;
import kashtkarzarai.daoImpl.CompanyDaoImpl;

import kashtkarzarai.daoImpl.ProductDaoImpl;
import kashtkarzarai.util.playAudio;

/**
 *
 * @author Vksoni
 */
public class ProductPage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    DefaultTableModel tableModelCustomer;
    DefaultComboBoxModel defaultComboBoxModel;
    public ArrayList<ProductBeans> productlist;
    public ArrayList<CompanyBeans> companylist;
    TableRowSorter<DefaultTableModel> rowSorter = null;

    ProductDao productDao;
    CompanyDao companyDao;

    public ProductPage() {
        initComponents();

        productDao = new ProductDaoImpl();
        companyDao = new CompanyDaoImpl();
        defaultComboBoxModel = (DefaultComboBoxModel) this.jComboBox1_Company.getModel();
        tableModelCustomer = (DefaultTableModel) this.jTableCustomer.getModel();
        rowSorter = new TableRowSorter<DefaultTableModel>(tableModelCustomer);
        this.jTableCustomer.setRowSorter(rowSorter);
        companylist = new ArrayList<CompanyBeans>();

        JTableHeader header = this.jTableCustomer.getTableHeader();
        header.setBackground(new Color(0, 204, 0));
        header.setForeground(new Color(255, 255, 255));
        header.setFont(new Font("SansSerif", Font.BOLD, 18));
        this.jButtonUpdate.setEnabled(false);
        this.jButtonDelete.setEnabled(false);
        this.registerButton.setEnabled(false);
        showInTable();
        showInComboBox();

    }

    public ProductPage(int reference) {
        initComponents();

        productDao = new ProductDaoImpl();
        tableModelCustomer = (DefaultTableModel) this.jTableCustomer.getModel();
        rowSorter = new TableRowSorter<DefaultTableModel>(tableModelCustomer);
        this.jTableCustomer.setRowSorter(rowSorter);

        JTableHeader header = this.jTableCustomer.getTableHeader();
        header.setBackground(new Color(0, 204, 0));
        header.setForeground(new Color(255, 255, 255));
        header.setFont(new Font("SansSerif", Font.BOLD, 18));
        this.jButtonUpdate.setEnabled(false);
        this.jButtonDelete.setEnabled(false);
        this.registerButton.setEnabled(true);

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
        jTextFieldProductname = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCost = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldQuantity = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jButtoSave = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButtonClear1 = new javax.swing.JButton();
        jComboBox1_Company = new javax.swing.JComboBox<>();
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
                "Sr #", "Company", "Product Id", "Product Name", "Quantity", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, true
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

        jTextFieldProductname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldProductname.setBorder(null);
        jTextFieldProductname.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldProductname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldProductnameMouseClicked(evt);
            }
        });
        jTextFieldProductname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProductnameActionPerformed(evt);
            }
        });
        jTextFieldProductname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldProductnameKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldProductname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 260, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 260, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("PRODUCT NAME*");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 170, -1));

        jTextFieldCost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldCost.setBorder(null);
        jTextFieldCost.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldCost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldCostMouseClicked(evt);
            }
        });
        jTextFieldCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCostActionPerformed(evt);
            }
        });
        jTextFieldCost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCostKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 260, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 260, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("COST*");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, -1));

        jTextFieldQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldQuantity.setBorder(null);
        jTextFieldQuantity.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldQuantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldQuantityMouseClicked(evt);
            }
        });
        jTextFieldQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantityActionPerformed(evt);
            }
        });
        jTextFieldQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldQuantityKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 260, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 260, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("QUANTITY*");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 120, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 260, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("COMPANY*");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 120, -1));

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
        registerButton.setText("Register");
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

        jComboBox1_Company.setToolTipText("");
        jComboBox1_Company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_CompanyActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1_Company, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 260, -1));

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
        /* int customer_id = Integer.parseInt("" + this.jTableCustomer.getValueAt(this.jTableCustomer.getSelectedRow(), 1));
        CustomerBeans customer = productDao.getCustomerById(customer_id);
        this.jTextFieldCustomerAddress.setText(customer.getAddress());
        this.jTextFieldCustomername.setText(customer.getCustomer_name());
        this.jTextFieldCustomerCnic.setText(customer.getCnic());
        this.jTextFieldCustomerContact.setText(customer.getContact());
        this.jButtonUpdate.setEnabled(true);
        this.jButtonDelete.setEnabled(true);
        this.jButtoSave.setEnabled(false);

         */
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
        /*  int customer_id = Integer.parseInt("" + this.jTableCustomer.getValueAt(this.jTableCustomer.getSelectedRow(), 1));
        String cust_name = productDao.getCustomerById(customer_id).getCustomer_name();

        if (productDao.removeCustomer(new CustomerBeans(customer_id, "", "", "", "", "")) >= 0) {
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
         */
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTextFieldProductnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldProductnameMouseClicked

    }//GEN-LAST:event_jTextFieldProductnameMouseClicked

    private void jTextFieldProductnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductnameActionPerformed

    private void jTextFieldProductnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProductnameKeyPressed

    }//GEN-LAST:event_jTextFieldProductnameKeyPressed

    private void jTextFieldCostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCostMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCostMouseClicked

    private void jTextFieldCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCostActionPerformed

    private void jTextFieldCostKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCostKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCostKeyPressed

    private void jTextFieldQuantityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldQuantityMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantityMouseClicked

    private void jTextFieldQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantityActionPerformed

    private void jTextFieldQuantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuantityKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantityKeyPressed

    private void jButtoSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoSaveActionPerformed

        if (checkTextBoxNoEmpty()) {
            String product_name = this.jTextFieldProductname.getText();
            int cost = Integer.parseInt(this.jTextFieldCost.getText());
            int quntity = Integer.parseInt(this.jTextFieldQuantity.getText());
            int company_id = this.jComboBox1_Company.getSelectedIndex() + 1;

            if (productDao.saveProduct(new ProductBeans(0, company_id, product_name, cost, quntity, 1)) >= 0) {
                this.jTextFieldProductname.setText("");
                this.jTextFieldQuantity.setText("");
                this.jTextFieldCost.setText("");
                //this.jTextFieldCustomerContact.setText("");
                new playAudio().playSuccessSound();

                JOptionPane.showMessageDialog(this, product_name + " saved succesfully ", "Success", JOptionPane.DEFAULT_OPTION);

                showInTable();
            }
        } else {
            new playAudio().playErrorSound();
            JOptionPane.showMessageDialog(this, "Please Fill the all textbox ", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtoSaveActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
//        int c_id= this.
        /* int customer_id = Integer.parseInt("" + this.jTableCustomer.getValueAt(this.jTableCustomer.getSelectedRow(), 1));
        CustomerBeans customer = productDao.getCustomerById(customer_id);
      new SalePage(customer).setVisible(true);
         */
    }//GEN-LAST:event_registerButtonActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        /*
        int customer_id = Integer.parseInt("" + this.jTableCustomer.getValueAt(this.jTableCustomer.getSelectedRow(), 1));
        String customer_name = this.jTextFieldCustomername.getText();
        String cnic = this.jTextFieldCustomerCnic.getText();
        String contact = this.jTextFieldCustomerContact.getText();
        String address = this.jTextFieldCustomerAddress.getText();
        if (!(customer_name.equals("") || cnic.equals("") || contact.equals("") || address.equals(""))) {

            productDao.modifyCustomers(new CustomerBeans(customer_id, customer_name, contact, cnic, address, CurrentDate.getCurrentDate()));
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
         */
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

    private void jButtonClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonClear1ActionPerformed

    private void jComboBox1_CompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_CompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1_CompanyActionPerformed

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
            java.util.logging.Logger.getLogger(ProductPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductPage().setVisible(true);
            }
        });
    }

    public void showInTable() {
        tableModelCustomer.setRowCount(0);
        int i = 1;
        productlist = productDao.getAllProducts();
        for (ProductBeans p : productlist) {
            Vector V = new Vector();
            //  V.add(customers_list.size());

            V.add(i++);
            V.add(companyDao.getCompanyName(p.getCompany_id()));
            V.add(p.getP_id());
            V.add(p.getP_name());
            V.add(p.getQuantity());
            V.add(p.getCost());

            tableModelCustomer.addRow(V);
        }

    }

    public void showInComboBox() {
        companylist = companyDao.getAllCompanies();
        for (CompanyBeans c : companylist) {
            defaultComboBoxModel.addElement("" + c.getCompany_name());
        }
    }

    public boolean checkTextBoxNoEmpty() {
        boolean check = false;
        if (!this.jTextFieldProductname.getText().equals("")
                && !this.jTextFieldCost.getText().equals("")
                && !this.jTextFieldQuantity.getText().equals("")) {

            check = true;
        }
        return check;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoSave;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonClear1;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBox1_Company;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTableCustomer;
    private javax.swing.JTextField jTextFieldCost;
    private javax.swing.JTextField jTextFieldProductname;
    private javax.swing.JTextField jTextFieldQuantity;
    private javax.swing.JTextField jTextFieldSerach;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables
}
