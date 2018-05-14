/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kashtkarzarai.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import kashtkarzarai.bean.UserBeans;
import kashtkarzarai.dao.UserDao;
import kashtkarzarai.db.DbConnection;

/**
 *
 * @author hp
 */
public class UserDaoImpl implements UserDao {

    public Connection con = DbConnection.conn;

    @Override
    public boolean userLogin(UserBeans e) {
        boolean check = false;
        String query = "SELECT * FROM USER WHERE u_name=? AND u_password=?";
        try {

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, e.getName());
            ps.setString(2, e.getPassword());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                check = true;

            }

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

        return check;
    }

}
