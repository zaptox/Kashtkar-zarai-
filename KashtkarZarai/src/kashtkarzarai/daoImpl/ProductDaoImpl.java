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
public class ProductDaoImpl implements ProductDao {

    public static Connection con = DbConnection.conn;

    @Override
    public int saveProduct(ProductBeans productBeans) {
        int i = 0;
        String query = "INSERT INTO product (company_id, p_name,quantity,uom,packsize,cost,active) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, productBeans.getCompany_id());
            ps.setString(2, productBeans.getP_name());
            ps.setInt(3, productBeans.getQuantity());
            ps.setInt(4, productBeans.getUom());
            ps.setInt(5, productBeans.getPacksize());

            ps.setInt(6, productBeans.getCost());
            ps.setInt(7, productBeans.getActive());

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
                int quantity = rs.getInt("quantity");
                int uom = rs.getInt("uom");
                int cost = rs.getInt("cost");
                int packsize=rs.getInt("packsize");

                int active = rs.getInt("active");
                // String creation_date = rs.getString("creation_date");

                productlist.add(new ProductBeans(p_id, company_id, quantity, uom,packsize, p_name, cost, active));

            }
        } catch (Exception e) {
            System.out.println("Error in getting Product");
            e.printStackTrace();
        }

        return productlist;
    }

    @Override
    public int modifyProduct(ProductBeans productBeans) {
        int i = 0;
        String query = " UPDATE product SET `company_id` =? , `p_name` = ? , `quantity` = ? , `uom` = ? ,`packsize` = ?,  `cost` = ? WHERE `p_id` = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, productBeans.getCompany_id());
            ps.setString(2, productBeans.getP_name());
            ps.setInt(3, productBeans.getQuantity());
            ps.setInt(4, productBeans.getUom());
            ps.setInt(5, productBeans.getPacksize());
            
            ps.setInt(6, productBeans.getCost());
            ps.setInt(7, productBeans.getP_id());

            i = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println("Error in modification of product");
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int removeProduct(ProductBeans productBeans) {
        int i = 0;
        String query = "UPDATE product SET active=0 WHERE `p_id` =? ";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, productBeans.getP_id());

            i = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println("Error in deletion of product");
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public ProductBeans getProductById(int pro_id) {
        ProductBeans productBeans = null;

        int i = 0;

        try {
            String query = "SELECT * FROM product WHERE active=1 and p_id=" + pro_id;
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int company_id = rs.getInt("company_id");
                String p_name = rs.getString("p_name");
                int quantity = rs.getInt("quantity");
                int p_id = rs.getInt("p_id");
                int uom = rs.getInt("uom");
                int active = rs.getInt("active");
                int packsize = rs.getInt("packsize");
                int cost = rs.getInt("cost");

                productBeans = new ProductBeans(p_id, company_id, quantity,uom,packsize, p_name, cost, active);

            }
        } catch (Exception e) {

            System.out.println("Error in modification of Customer");
            e.printStackTrace();
        }
        return productBeans;

    }

}
