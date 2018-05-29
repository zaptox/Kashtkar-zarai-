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
import kashtkarzarai.bean.UserBeans;
import kashtkarzarai.dao.UserDao;
import kashtkarzarai.db.DbConnection;
import kashtkarzarai.db.SqliteDBCon;

/**
 *
 * @author hp
 */
public class UserDaoImpl implements UserDao {

    public Connection con = SqliteDBCon.LoadDb();

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

    @Override
    public int saveUser(UserBeans u) {
        int i = 0;
        String query = "INSERT INTO user (u_name, u_password,u_active) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, u.getName());
            ps.setString(2, u.getPassword());
            ps.setInt(3, 1);

            i = ps.executeUpdate();

        } catch (Exception e) {

            System.out.println("Error in saving User");
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public ArrayList<UserBeans> getAllUsers() {
        ArrayList<UserBeans> user_list = new ArrayList<>();
        String query = "SELECT * FROM USER WHERE u_active=1";
        try {

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int customer_id = rs.getInt("u_id");
                String u_name = rs.getString("u_name");
                String u_password = rs.getString("u_password");

                int active = rs.getInt("u_active");

                user_list.add(new UserBeans(customer_id, u_name, u_password));

            }

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

        return user_list;
    }

    @Override
    public int modifyUser(UserBeans e) {
        int i = 0;
        String query = " UPDATE user SET u_name =? , `u_password` = ?  WHERE `u_id` = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, e.getName());
            ps.setString(2, e.getPassword());
            ps.setInt(3, e.getId());

            i = ps.executeUpdate();
        } catch (Exception ex) {

            System.out.println("Error in modification of user");
            ex.printStackTrace();
        }
        return i;
    }

    @Override
    public int removeUser(UserBeans e) {
        int i = 0;
        String query = "UPDATE user SET u_active=0 WHERE u_id =? ";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, e.getId());

            i = ps.executeUpdate();
        } catch (Exception ex) {

            System.out.println("Error in deletion of User");
            ex.printStackTrace();
        }
        return i;
    }

    @Override
    public UserBeans getUserById(int user_id) {
    UserBeans user=null;
        String query = "SELECT * FROM USER WHERE u_active=1 and u_id=?";
        try {

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, user_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int customer_id = rs.getInt("u_id");
                String u_name = rs.getString("u_name");
                String u_password = rs.getString("u_password");

                int active = rs.getInt("u_active");

                user=new UserBeans(customer_id, u_name, u_password);

            }

        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }

        return user;    }

}
