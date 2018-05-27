/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kashtkarzarai.frames;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;
import kashtkarzarai.bean.CompanyBeans;
import kashtkarzarai.bean.CustomerBeans;
import kashtkarzarai.bean.ProductBeans;
import kashtkarzarai.bean.SaleBeans;
import kashtkarzarai.bean.SaleDetailBeans;
import kashtkarzarai.dao.CompanyDao;
import kashtkarzarai.dao.ProductDao;
import kashtkarzarai.dao.SaleDao;
import kashtkarzarai.dao.SaleDetailsDao;
import kashtkarzarai.dao.UomDao;
import kashtkarzarai.daoImpl.ProductDaoImpl;
import kashtkarzarai.daoImpl.SaleDaoImpl;
import kashtkarzarai.daoImpl.SaleDetailDapImpl;
import kashtkarzarai.daoImpl.UomDaoImpl;

/**
 *
 * @author Dell
 */
public class SalePage extends javax.swing.JFrame {

    /**
     * Creates new form SalePage
     */
    DefaultTableModel tableModelProduct;
    public ArrayList<ProductBeans> product_list;
    public ArrayList<ProductBeans> orderedProductList;
    ProductDao productDao;
    SaleDao saleDao;
    SaleDetailsDao saleDetailDao;
    public static boolean sale_customer = false;
    UomDao uomDao;
    DefaultTableModel tableModel2;
    int customer_id = -1;
    public static int total_price = 0;
    public static int total_price_temp = 0;
    TableRowSorter<DefaultTableModel> rowSorter = null;

    public SalePage() {
        initComponents();
        productDao = new ProductDaoImpl();
        uomDao = new UomDaoImpl();
        saleDao = new SaleDaoImpl();
        saleDetailDao = new SaleDetailDapImpl();
        tableModelProduct = (DefaultTableModel) this.jTable1.getModel();
        tableModel2 = (DefaultTableModel) this.jTable2.getModel();
        customer_id = -1;

        nameField.setEnabled(false);
        numberField.setEnabled(false);
        addressfield.setEnabled(false);
        JTableHeader header = this.jTable1.getTableHeader();
        header.setBackground(new Color(0, 204, 0));
        header.setForeground(new Color(255, 255, 255));
        header.setFont(new Font("SansSerif", Font.BOLD, 18));
        JTableHeader header2 = this.jTable2.getTableHeader();
        header2.setBackground(new Color(0, 204, 0));
        header2.setForeground(new Color(255, 255, 255));
        header2.setFont(new Font("SansSerif", Font.BOLD, 18));
        rowSorter = new TableRowSorter<DefaultTableModel>(tableModelProduct);
        this.jTable1.setRowSorter(rowSorter);
        orderedProductList = new ArrayList<>();
        walkingRadio.setSelected(true);
        sale_customer = false;

        showInTable();

    }

    public SalePage(CustomerBeans customer) {
        initComponents();
        sale_customer = true;
        nameField.setText(customer.getCustomer_name());
        numberField.setText(customer.getContact());
        addressfield.setText(customer.getAddress());
        nameField.setEnabled(false);
        numberField.setEnabled(false);
        addressfield.setEnabled(false);
        tableModelProduct = (DefaultTableModel) this.jTable1.getModel();
        tableModel2 = (DefaultTableModel) this.jTable2.getModel();
        productDao = new ProductDaoImpl();
        customer_id = customer.getCustomer_id();

        JTableHeader header = this.jTable1.getTableHeader();
        header.setBackground(new Color(0, 204, 0));
        header.setForeground(new Color(255, 255, 255));
        header.setFont(new Font("SansSerif", Font.BOLD, 18));
        JTableHeader header2 = this.jTable2.getTableHeader();
        header2.setBackground(new Color(0, 204, 0));
        header2.setForeground(new Color(255, 255, 255));
        header2.setFont(new Font("SansSerif", Font.BOLD, 18));
        showInTable();
        rowSorter = new TableRowSorter<DefaultTableModel>(tableModelProduct);
        this.jTable1.setRowSorter(rowSorter);

        orderedProductList = new ArrayList<>();
        uomDao = new UomDaoImpl();
        saleDao = new SaleDaoImpl();
        saleDetailDao = new SaleDetailDapImpl();

        this.total_price = 0;
        this.total_price_temp = 0;

    }

    public void showInTable() {
        tableModelProduct.setRowCount(0);
        try {

            int serial = 0;
            product_list = productDao.getAllProducts();

            for (ProductBeans p : product_list) {
                Vector V = new Vector();
                serial++;

                V.add(serial);
                V.add(p.getP_id());
                V.add(p.getP_name());
                V.add(p.getCost());
                V.add(p.getQuantity());
                V.add(p.getP_id());
//            V.add(customer.getCreation_date());

                tableModelProduct.addRow(V);
            }
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        discountField = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        walkingRadio = new javax.swing.JRadioButton();
        numberField = new javax.swing.JTextField();
        deliveryRadio = new javax.swing.JRadioButton();
        addressfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        itemField = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        addField = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        quantityField = new javax.swing.JTextField();
        uomField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sale");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Discount Type");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amount", "Percentage" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Discsount:");

        discountField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        discountField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                discountFieldKeyReleased(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 204, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Customer:");

        nameField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        walkingRadio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        walkingRadio.setText("Walking");
        walkingRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                walkingRadioMouseReleased(evt);
            }
        });
        walkingRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walkingRadioActionPerformed(evt);
            }
        });
        walkingRadio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                walkingRadioPropertyChange(evt);
            }
        });

        numberField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        numberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberFieldActionPerformed(evt);
            }
        });

        deliveryRadio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deliveryRadio.setText("Return Later");
        deliveryRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deliveryRadioMouseReleased(evt);
            }
        });
        deliveryRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryRadioActionPerformed(evt);
            }
        });

        addressfield.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addressfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressfieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Contact:");

        itemField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        itemField.setText("Item: -----");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Address:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Search:");

        searchField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S#", "Product_id", "Name", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Quantity:");

        addField.setBackground(new java.awt.Color(0, 204, 0));
        addField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addField.setForeground(new java.awt.Color(255, 255, 255));
        addField.setText("Add");
        addField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFieldActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product_name", "Price", "Quantity", "Uom", "Total_price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable2MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Total bill:");

        totalField.setEditable(false);
        totalField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton2.setBackground(new java.awt.Color(0, 204, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Generate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Name:");

        uomField.setText("uom");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(walkingRadio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deliveryRadio))
                            .addComponent(nameField)
                            .addComponent(numberField)
                            .addComponent(addressfield, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uomField))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(itemField))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(addField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(942, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(discountField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(walkingRadio)
                            .addComponent(deliveryRadio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(addressfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(itemField)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(quantityField)
                                .addComponent(uomField)))
                        .addGap(18, 18, 18)
                        .addComponent(addField)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(discountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void discountFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discountFieldKeyReleased
        // TODO add your handling code here:
        if (discountField.equals("")) {
            totalField.setText(total_price + "");

        } else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("amount")) {

            try {
                int discount = Integer.parseInt(discountField.getText().toString());
                int totalpriceget = total_price;
                totalpriceget -= discount;
                totalField.setText(totalpriceget + "");

            } catch (Exception e) {
                totalField.setText(total_price + "");

                //                JOptionPane.showMessageDialog(this, "Invalid amount");
            }

            System.out.println("amount");
        } else if (jComboBox1.getSelectedItem().toString().equalsIgnoreCase("percentage")) {

            try {
                float discount_percent = Integer.parseInt(discountField.getText().toString());
                float discount = (discount_percent * total_price) / 100;

                int totalpriceget = total_price;
                totalpriceget -= discount;
                totalField.setText(totalpriceget + "");

            } catch (Exception e) {
                totalField.setText(total_price + "");

                //                JOptionPane.showMessageDialog(this, "Invalid amount");
            }
            System.out.println("percentage");
        }
    }//GEN-LAST:event_discountFieldKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new HomePage().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void numberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberFieldActionPerformed

    private void deliveryRadioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deliveryRadioMouseReleased
        if (deliveryRadio.isSelected()) {
            System.out.println("Jradio 2 is selected");
            this.dispose();
            new CustomerPage(1).setVisible(true);

            //            register.setEnabled(true);
        }
        if (!deliveryRadio.isSelected()) {
            System.out.println("Jradio 2 is not not selected");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_deliveryRadioMouseReleased

    private void deliveryRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deliveryRadioActionPerformed

    private void addressfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressfieldActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        // TODO add your handling code here:
//        String search_product = searchField.getText();
//        showInTableSearched(search_product);
        String searchData = this.searchField.getText();
        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchData));
    }//GEN-LAST:event_searchFieldKeyReleased

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here:
        int id = jTable1.getSelectedRow();
//        int id1=(int) tableModelProduct.getValueAt(id, 5);
//        System.out.println("The id is"+id1);
        int product_id_table = Integer.parseInt("" + this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 1));

//        int product_id_table = product_list.get(id).getP_id();
//        DbManagerInterface ob = new DbManager();
        ProductBeans p = null;
        try {
            p = productDao.getProductById(product_id_table);
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
        itemField.setText("Item: " + p.getP_name());
        String uom = uomDao.getUomName(p.getUom());
        uomField.setText("" + uom);
        addField.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseReleased

    private void addFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFieldActionPerformed
        // TODO add your handling code here:
        //        if(jTable1.isRowSelected)
        int quantity = 0;
        try {
            quantity = Integer.parseInt(quantityField.getText().toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Quantity must be in numbers Format");
        }

        if ((int) quantity <= 0) {
            JOptionPane.showMessageDialog(this, "Must write a valid Quantity");
        } else {

            int product_id_table = Integer.parseInt("" + this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 1));

//            int user_id_table = productList.get(id).getProduct_id();
//
//            DbManagerInterface ob = new DbManager();
            ProductBeans p = productDao.getProductById(product_id_table);
//            int quantity = (int) jSpinner1.getValue();
            int product_quantity = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 4);
            jTable1.setValueAt(product_quantity - quantity, jTable1.getSelectedRow(), 4);
            showInBuy(p, quantity);

        }
    }//GEN-LAST:event_addFieldActionPerformed

    private void showInBuy(ProductBeans p, int quantity) {
//        DbManagerInterface ob = new DbManager();
//        tableModel2.setRowCount(0);

        Vector v = new Vector();
//        int id = p.getCategory_id();
//        String category = ob.getCategory(id).getName();
//        System.out.println("" + p.getName());
        v.add(p.getP_name());
        System.out.println("" + p.getCost());
        v.add(p.getCost());
        String uom = uomDao.getUomName(p.getUom());
        v.add(quantity);
        v.add(uom);

        int t_price = quantity * p.getCost();

        v.add(t_price);
        total_price += t_price;
        totalField.setText("" + total_price);
        total_price_temp = total_price;
        try {
            tableModel2.addRow(v);
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
        orderedProductList.add(new ProductBeans(p.getP_id(), p.getCompany_id(), quantity, p.getUom(), p.getP_name(), p.getCost(), 1));
//        orderedProductList.add(new ProductBeans(p.getP_id(), ICONIFIED, p_name, ABORT, quantity, t_price));
//        System.out.println("" + orderedProductList + "\n");

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LocalDate date = LocalDate.now();
        float discount = 0;
//        int discount_id = discountList.get(jComboBox1.getSelectedIndex()).getDiscount_id();
        try {
            discount = Float.parseFloat(discountField.getText().toString());
        } catch (Exception e) {

        }
        float total_price = Float.parseFloat(totalField.getText().toString());

//        try{
////            ArrayList numbers = obGlobal.getOrderNumbers();
//            boolean new_number = false;
//            int number = (int) ((Math.random() * 1000) + 1);
//
//            while (!new_number) {
//
//                for (Object o: numbers) {
//                    if (number == (int) o) {
//                        number = (int) ((Math.random() * 1000) + 1);
//                        new_number = false;
//                        break;
//                    } else {
//                        new_number = true;
//
//                    }
//
//                }
//
//            }
        if (customer_id != -1) {
            String discount_type = jComboBox1.getSelectedItem().toString();

            int discount1 = 0;
            try {
                discount1 = Integer.parseInt(discountField.getText().toString());
            } catch (Exception e) {
                discount1 = 0;
            }

            saleDao.saveSale(new SaleBeans(1, customer_id, 1, discount_type, discount1, total_price));
        } else {
            String discount_type = jComboBox1.getSelectedItem().toString();

            int discount1 = 0;
            try {
                discount1 = Integer.parseInt(discountField.getText().toString());
            } catch (Exception e) {
                discount1 = 0;
            }
            saleDao.saveSale(new SaleBeans(1, 0, 1, discount_type, discount1, total_price));

//            saleDao.(new Order(0, date.toString(), customer_id, number,
//                    1, 1, null, 1,
//                    null, discount_id, discount, total_price));
        }
//
        for (ProductBeans p : orderedProductList) {
            int quantity = p.getQuantity();
            int product_id = p.getP_id();
            productDao.updatequantity(quantity, product_id);

            if (sale_customer) {
                int sale_id = saleDao.getSaleId();
                System.out.println("sale_id"+sale_id);
                System.out.println("customer_id "+customer_id );
                saleDetailDao.saveSaleDetails(new SaleDetailBeans(1, sale_id, customer_id, product_id, quantity, p.getCompany_id(), p.getUom(), date+"", p.getCost()));
            }
//            int order_id=obGlobal.getOrderId(number);
//            if(order_id!=-1){
//
//                obGlobal.insertOrderDetails(new OrderDetails(1, order_id,
//                    product_id, quantity, 1, 1, null, 1, null));
//        }
//        else{
//            JOptionPane.showMessageDialog(this, "order_id  =-1");
//        }
        }
//        }
//        catch(Exception e){
//            JOptionPane.showMessageDialog(this, ""+e.getMessage());
//
//        }
        //        System.out.println(dtf.format(localDate)); //2016/11/16
        //        System.out.println("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void walkingRadioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_walkingRadioPropertyChange

        // TODO add your handling code here:
    }//GEN-LAST:event_walkingRadioPropertyChange

    private void walkingRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walkingRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_walkingRadioActionPerformed

    private void walkingRadioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_walkingRadioMouseReleased
        // TODO add your handling code here:
        if (walkingRadio.isSelected()) {
            System.out.println("Jradio 1 is selected");
            nameField.setEnabled(false);
            numberField.setEnabled(false);
            addressfield.setEnabled(false);
            //            register.setEnabled(false);
            sale_customer = false;

        }
        if (!walkingRadio.isSelected()) {
            //    System.out.println("Jradio 1 is not not selected");
        }
    }//GEN-LAST:event_walkingRadioMouseReleased

    private void jTable2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTable2MouseReleased

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
            java.util.logging.Logger.getLogger(SalePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addField;
    private javax.swing.JTextField addressfield;
    private javax.swing.JRadioButton deliveryRadio;
    private javax.swing.JTextField discountField;
    private javax.swing.JLabel itemField;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField numberField;
    private javax.swing.JTextField quantityField;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField totalField;
    private javax.swing.JLabel uomField;
    private javax.swing.JRadioButton walkingRadio;
    // End of variables declaration//GEN-END:variables
}
