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
        String query = "INSERT INTO `kashtkarzarai`.`company` (`company_id`, `company_name`, `company_contact`, `company_address`, `dealer_name`) VALUES (NULL, 'Seed Fertilizer"+num+"', '030303003030', 'rahem yar khan', 'wajahat');  ";
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
