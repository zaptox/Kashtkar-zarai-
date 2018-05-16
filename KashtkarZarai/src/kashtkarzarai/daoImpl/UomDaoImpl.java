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
import kashtkarzarai.bean.UOMBeans;
import kashtkarzarai.dao.UomDao;
import kashtkarzarai.db.DbConnection;

/**
 *
 * @author Vksoni
 */
public class UomDaoImpl implements UomDao {

    public static Connection con = DbConnection.conn;

    @Override
    public ArrayList<UOMBeans> getAllUom() {
        ArrayList<UOMBeans> uom_list = new ArrayList<>();
        try {
            String query = "SELECT * FROM uom_table";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int uom_id = rs.getInt("uom_id");
                String uom = rs.getString("uom");

                uom_list.add(new UOMBeans(uom_id, uom));

            }
        } catch (Exception e) {
            System.out.println("Error in getting Customer");
            e.printStackTrace();
        }

        return uom_list;
    }

    @Override
    public int saveUom(UOMBeans uom) {
        int i = 0;
        String query = "INSERT INTO uom_table (uom) VALUES (?)";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, uom.getUom());

            i = ps.executeUpdate();

        } catch (Exception e) {

            System.out.println("Error in saving UOM");
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int removeUom(UOMBeans uom) {
  int i = 0;
        String query = "DELETE FROM `uom_table` WHERE `uom_id` =? ";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, uom.getUom_id());

            i = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println("Error in deletion of UOM");
            e.printStackTrace();
        }
        return i;    }

}
