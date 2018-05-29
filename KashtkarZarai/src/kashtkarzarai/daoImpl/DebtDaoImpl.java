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
import kashtkarzarai.bean.DebtDetailBeans;
import kashtkarzarai.dao.DebtDetailDao;
import kashtkarzarai.db.DbConnection;
import kashtkarzarai.db.SqliteDBCon;

/**
 *
 * @author Vksoni
 */
public class DebtDaoImpl implements DebtDetailDao{
    public Connection con = SqliteDBCon.LoadDb();

    @Override
    public ArrayList<DebtDetailBeans> getAllDetailByCustomerId(int customer_id) {
    ArrayList<DebtDetailBeans> debt_detail_list = new ArrayList<>();
        try {
            String query = "SELECT * FROM debt_detail WHERE customer_id="+customer_id+" ORDER BY debt_detail_id DESC";
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int debt_detail_id=rs.getInt("debt_detail_id");
                String customer_name = rs.getString("name");
                double amount = rs.getDouble("amount");
                String debt_date = rs.getString("debt_date");

                debt_detail_list.add(new DebtDetailBeans(debt_detail_id, customer_name,amount,debt_date));

            }
        } catch (Exception e) {
            System.out.println("Error in getting Customer debt details");
            e.printStackTrace();
        }

        return debt_detail_list;

    
    }

    @Override
    public int saveDebtDetail(DebtDetailBeans debt) {
 int i = 0;
        String query = "INSERT INTO debt_detail (`customer_id`, `name`, `amount`, `debt_date`) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, debt.getCustomer_id());
            ps.setString(2, debt.getName());
            ps.setDouble(3, debt.getDebt_amount());
            ps.setString(4, debt.getDate());

            i = ps.executeUpdate();

        } catch (Exception e) {

            System.out.println("Error in saving Customer");
            e.printStackTrace();
        }
        return i;

    }
    
}
