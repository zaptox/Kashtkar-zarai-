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
import kashtkarzarai.bean.ProductBeans;
import kashtkarzarai.bean.SaleDetailBeans;
import kashtkarzarai.dao.SaleDetailsDao;
import static kashtkarzarai.daoImpl.ProductDaoImpl.con;
import static kashtkarzarai.daoImpl.SaleDaoImpl.con;
import kashtkarzarai.db.DbConnection;

/**
 *
 * @author Vksoni
 */
public class SaleDetailDapImpl implements SaleDetailsDao {

    public static Connection con = DbConnection.conn;

    @Override
    public int saveSaleDetails(SaleDetailBeans detail) {
        int i = 0;
        String query = "INSERT INTO sale_detail (sale_id, customer_id, product_id, quantity, company_id, uom_id, sale_date, price) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, detail.getSale_detail_id());
            ps.setInt(2, detail.getCompany_id());
            ps.setInt(3, detail.getProduct_id());
            ps.setInt(4, detail.getQuantity());
            ps.setInt(5, detail.getCompany_id());
            ps.setInt(6, detail.getUom_id());
            ps.setString(7, detail.getSale_date());
            ps.setDouble(8,detail.getPrice() );

          
            i = ps.executeUpdate();

        } catch (Exception e) {

            System.out.println("Error in saving Sale detail");
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public ArrayList<SaleDetailBeans> getAllSaleDetailbyCustomerId(int customer_id) {
        ArrayList<SaleDetailBeans> sale_details_list = new ArrayList<>();
        try {
            String query = "SELECT * FROM sale_detail WHERE customer_id=" + customer_id;
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int sale_detail_id = rs.getInt("sale_detail_id");
                int sale_id = rs.getInt("sale_id");
                int cust_id = rs.getInt("customer_id");
                int product_id = rs.getInt("product_id");
                int quantity = rs.getInt("quantity");
                int company_id = rs.getInt("company_id");
                int uom_id=rs.getInt("uom_id");
                String sale_date = rs.getString("sale_date");
                double price = rs.getInt("price");

                sale_details_list.add(new SaleDetailBeans(sale_detail_id, sale_id, cust_id, product_id, quantity, company_id,uom_id, sale_date, price));

            }
        } catch (Exception e) {
            System.out.println("Error in getting Sales Details");
            e.printStackTrace();
        }

        return sale_details_list;
    }

    @Override
    public int modifySaleDetails(SaleDetailBeans details) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
