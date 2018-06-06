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
import kashtkarzarai.bean.ProductBeans;
import kashtkarzarai.bean.SaleDetailBeans;
import kashtkarzarai.dao.SaleDetailsDao;
import kashtkarzarai.db.DbConnection;
import kashtkarzarai.db.SqliteDBCon;

/**
 *
 * @author Vksoni
 */
public class SaleDetailDapImpl implements SaleDetailsDao {

    public Connection con = SqliteDBCon.LoadDb();

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
            String query = "SELECT  s.`sale_detail_id`,p.`p_name`,c.`customer_name`,s.`quantity`,\n" +
"                    cp.`company_name`,sl.total_bill,\n" +
"                    s.`price`,u.`uom`,p.`packsize`,s.`sale_date`,sl.paid,sl.reference FROM sale_detail s\n" +
"                    INNER JOIN customer c ON \n" +
"                    s.`customer_id`=c.`customer_id`INNER JOIN \n" +
"                    product p ON s.`product_id`=p.`p_id`INNER JOIN company cp ON \n" +
"                    s.`company_id`=cp.`company_id`INNER JOIN uom_table u ON s.`uom_id`=u.`uom_id` inner join sale sl on s.sale_id=sl.sale_id\n" +
"                    WHERE s.customer_id="+customer_id+" order by s.sale_detail_id desc";
            Statement ps = con.createStatement();

            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int sale_detail_id = rs.getInt("sale_detail_id");
                String p_name = rs.getString("p_name");
                String customer_name = rs.getString("customer_name");
                String company_name = rs.getString("company_name");
                int quantity = rs.getInt("quantity");
                String uom = rs.getString("uom");
                int packetsize=rs.getInt("packsize");
                String sale_date = rs.getString("sale_date");
                double price = rs.getDouble("total_bill");
                double paid=rs.getDouble("paid");
                String reference=rs.getString("reference");
                sale_details_list.add(new SaleDetailBeans(sale_detail_id,packetsize ,quantity, sale_date, price, company_name, customer_name,uom,  p_name,paid,reference));

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
