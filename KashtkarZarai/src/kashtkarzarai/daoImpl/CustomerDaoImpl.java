/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kashtkarzarai.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import kashtkarzarai.bean.CustomerBeans;
import kashtkarzarai.dao.CustomerDao;
import kashtkarzarai.db.DbConnection;

/**
 *
 * @author Vksoni
 */
public class CustomerDaoImpl implements CustomerDao {

    private static Connection con = DbConnection.conn;

    @Override
    public int saveCustomer(CustomerBeans customer) {
        int i = 0;
        String query = "INSERT INTO customer (customer_name, contact, cnic, address,creation_date) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, customer.getCustomer_name());
            ps.setString(2, customer.getContact());
            ps.setString(3, customer.getCnic());
            ps.setString(4, customer.getAddress());
            ps.setString(5, customer.getCreation_date());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                i = rs.getInt(1);
            }

        } catch (Exception e) {

            System.out.println("Error in saving Customer");
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public ArrayList<CustomerBeans> getAllCustomers() {
        ArrayList<CustomerBeans> customers_list = new ArrayList<>();
        try {
            String query = "SELECT * FROM customer WHERE active=1";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int customer_id = rs.getInt("customer_id");
                String customer_name = rs.getString("customer_name");
                String contact = rs.getString("contact");
                String address = rs.getString("address");
                String cnic = rs.getString("cnic");

                int active = rs.getInt("active");
                String creation_date = rs.getString("created_date");

                customers_list.add(new CustomerBeans(customer_id, customer_name, contact, cnic, address, creation_date));

            }
        } catch (Exception e) {
            System.out.println("Error in getting Customer");
            e.printStackTrace();
        }

        return customers_list;
    }

    @Override
    public int modifyCustomers(CustomerBeans customer) {
        int i = 0;
        String query = " UPDATE customer SET `customer_name` =? , `contact` = ? , `cnic` = ? , `address` = ? , `creation_date` = ? WHERE `customer_id` = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, customer.getCustomer_name());
            ps.setString(2, customer.getContact());
            ps.setString(3, customer.getCnic());
            ps.setString(4, customer.getAddress());
            ps.setString(5, customer.getCreation_date());
            ps.setInt(6, customer.getCustomer_id());

            i = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println("Error in modification of Customer");
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int removeCustomer(CustomerBeans customer) {
        int i = 0;
        String query = "UPDATE customer SET active=0 WHERE `customer_id` =? ";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, customer.getCustomer_id());

            i = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println("Error in deletion of Customer");
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public CustomerBeans getCustomerById(int cust_id) {
        CustomerBeans customer = null;
        try {
            String query = "SELECT * FROM customer WHERE active=1 and customer_id=" + cust_id;
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int customer_id = rs.getInt("customer_id");
                String customer_name = rs.getString("customer_name");
                String contact = rs.getString("contact");
                String address = rs.getString("address");
                String cnic = rs.getString("cnic");

                int active = rs.getInt("active");
                String creation_date = rs.getString("created_date");

                customer = new CustomerBeans(customer_id, customer_name, contact, cnic, address, creation_date);

            }
        } catch (Exception e) {
            System.out.println("Error in getting customer");
            e.printStackTrace();
        }

        return customer;
    }
}
