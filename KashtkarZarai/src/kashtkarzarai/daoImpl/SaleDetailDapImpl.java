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
        String query = "INSERT INTO sale_detail (sale_id, customer_id, product_id, "
                + "quantity, company_id, uom_id, sale_date, price) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, detail.getSale_id());
            ps.setInt(2, detail.getCustomer_id());
            ps.setInt(3, detail.getProduct_id());
            ps.setInt(4, detail.getQuantity());
            ps.setInt(5, detail.getCompany_id());
            ps.setInt(6, detail.getUom_id());
            ps.setString(7, detail.getSale_date());
            ps.setDouble(8, detail.getPrice() * detail.getQuantity() );

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
            String query = "SELECT s.`sale_detail_id`,p.`p_name`,c.`customer_name`,s.`quantity`,cp.`company_name`,s.`price`, u.`uom`,s.`sale_date` FROM sale_detail s, product p, customer c ,company cp , uom_table u WHERE s.`company_id`=c.`customer_id` AND s.`product_id`=p.`p_id` AND s.`company_id`=cp.`company_id` AND s.`uom_id`=u.`uom_id` AND s.customer_id=" + customer_id + " ORDER BY sale_detail_id DESC";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int sale_detail_id = rs.getInt("sale_detail_id");
                String p_name = rs.getString("p_name");
                String customer_name = rs.getString("customer_name");
                String company_name = rs.getString("company_name");
                int quantity = rs.getInt("quantity");
                String uom = rs.getString("uom");
                String sale_date = rs.getString("sale_date");
                double price = rs.getDouble("price");

                sale_details_list.add(new SaleDetailBeans(sale_detail_id, quantity, sale_date, price, company_name, customer_name,uom,  p_name));

            }
        } catch (Exception e) {
            System.out.println("Error in getting  customer Sales Details");
            e.printStackTrace();
        }

        return sale_details_list;
    }

    @Override
    public int modifySaleDetails(SaleDetailBeans details) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
