/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import kashtkarzarai.bean.CustomerBeans;
import kashtkarzarai.db.DbConnection;

/**
 *
 * @author hp
 */
public class TestDemo {
    
     private static Connection con = DbConnection.conn;
     
    public int saveCustomer(int num) {
     
        int i = 0;
        String query = "INSERT INTO `kashtkarzarai`.`sale_detail` (`sale_id`, `customer_id`, `product_id`, `quantity`, `company_id`, `uom_id`, `sale_date`, `price`) VALUES ('23', '1', '2', '1', '1', '1', '2018-05-25', '100');";
        try {
                Statement statement = con.createStatement();
            

            i = statement.executeUpdate(query);

        } catch (Exception e) {

            System.out.println("Error in saving Customer");
            e.printStackTrace();
        }
        return i;
    }
  
    
}
