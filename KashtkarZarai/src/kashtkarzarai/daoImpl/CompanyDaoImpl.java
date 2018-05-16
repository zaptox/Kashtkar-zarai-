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
import kashtkarzarai.bean.CompanyBeans;
import kashtkarzarai.bean.CustomerBeans;
import kashtkarzarai.db.DbConnection;
import kashtkarzarai.dao.CompanyDao;

/**
 *
 * @author Dell
 */
public class CompanyDaoImpl implements CompanyDao {

    private static Connection con = DbConnection.conn;

    @Override
    public int saveCompany(CompanyBeans company) {
        int i = 0;
        String query = "INSERT INTO company (`company_name`, `company_contact`,"
                + " `company_address`, `dealer_name`)"
                + " VALUES (?, ?, ?, ?); ";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, company.getCompany_name());
            ps.setString(2, company.getCompany_contact());
            ps.setString(3, company.getCompany_address());
            ps.setString(4, company.getDealer_name());

            i = ps.executeUpdate();

        } catch (Exception e) {

            System.out.println("Error in saving Customer");
            e.printStackTrace();
        }
        return i;

    }

    @Override
    public ArrayList<CompanyBeans> getAllCompanies() {
        ArrayList<CompanyBeans> company_list = new ArrayList<>();
        try {
            String query = "SELECT * FROM company WHERE active=1;";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int company_id = rs.getInt("company_id");
                String company_name = rs.getString("company_name");
                String company_contact = rs.getString("company_contact");
                String company_address = rs.getString("company_address");
                String dealer_name = rs.getString("dealer_name");

                company_list.add(new CompanyBeans(company_id, company_name, company_contact, company_address, dealer_name, 1));

            }
        } catch (Exception e) {
            System.out.println("Error in getting Customer");
            e.printStackTrace();
        }

        return company_list;

    }

    @Override
    public int modifyCompany(CompanyBeans companyBeans) {
        int i = 0;
        String query = "UPDATE company SET `company_name` = ? , `company_contact` = ? ,"
                + " `company_address` = ? , `dealer_name` = ? WHERE `company_id` = ?; ";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, companyBeans.getCompany_name());
            ps.setString(2, companyBeans.getCompany_contact());
            ps.setString(3, companyBeans.getCompany_address());
            ps.setString(4, companyBeans.getDealer_name());
            ps.setInt(5, companyBeans.getCompany_id());

            i = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println("Error in modification of Customer");
            e.printStackTrace();
        }
        return i;

    }

    @Override
    public int removeCompany(CompanyBeans companyBeans) {
        int i = 0;
        String query = "UPDATE company SET `active` = '0' WHERE `company_id` = ?;  ";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, companyBeans.getCompany_id());

            i = ps.executeUpdate();
        } catch (Exception e) {

            System.out.println("Error in deletion of Customer");
            e.printStackTrace();
        }
        return i;

    }

    @Override
    public CompanyBeans getCompanyById(int company_id) {
        CompanyBeans company = null;
        try {
            String query = "SELECT * FROM company WHERE active=1 AND company_id=" + company_id;
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery(query);
            while (rs.next()) {
                int company_id1 = rs.getInt("company_id");
                String company_name = rs.getString("company_name");
                String company_contact = rs.getString("company_contact");
                String company_address = rs.getString("company_address");
                String dealer_name = rs.getString("dealer_name");
                company = new CompanyBeans(company_id1, company_name, company_contact, company_address, dealer_name, 1);

            }
        } catch (Exception e) {
            System.out.println("Error in getting customer");
            e.printStackTrace();
        }

        return company;

    }

}
