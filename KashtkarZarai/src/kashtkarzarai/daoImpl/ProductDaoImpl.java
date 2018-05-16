/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kashtkarzarai.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import kashtkarzarai.bean.CustomerBeans;
import kashtkarzarai.bean.ProductBeans;
import kashtkarzarai.dao.ProductDao;
import kashtkarzarai.db.DbConnection;

/**
 *
 * @author hp
 */
public class ProductDaoImpl  implements ProductDao{
public static Connection con = DbConnection.conn;
    @Override
    public int saveProduct(ProductBeans productBeans) {
        int i = 0;
        String query = "INSERT INTO product (company_id, p_name,quantity,cost,active) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,productBeans.getCompany_id() );
            ps.setString(2,productBeans.getP_name());
            ps.setInt(3,productBeans.getQuantity());
            ps.setInt(4,productBeans.getCost());
            ps.setInt(5,productBeans.getActive());

            i = ps.executeUpdate();

        } catch (Exception e) {

            System.out.println("Error in saving Product");
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public ArrayList<ProductBeans> getAllProducts() {
         ArrayList<ProductBeans> productlist = new ArrayList<>();
        try {
            String query = "SELECT * FROM product WHERE active=1";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int p_id = rs.getInt("p_id");
                int company_id = rs.getInt("company_id");
                String p_name = rs.getString("p_name");
                int  quantity = rs.getInt("quantity");
                int cost = rs.getInt("cost");

                int active = rs.getInt("active");
               // String creation_date = rs.getString("creation_date");

                productlist.add(new ProductBeans(p_id, company_id, p_name, cost, quantity, active));

            }
        } catch (Exception e) {
            System.out.println("Error in getting Customer");
            e.printStackTrace();
        }

        return productlist;
    }

    @Override
    public int modifyProduct(ProductBeans productBeans) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int removeProduct(ProductBeans productBeans) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProductBeans getProductById(int pro_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
