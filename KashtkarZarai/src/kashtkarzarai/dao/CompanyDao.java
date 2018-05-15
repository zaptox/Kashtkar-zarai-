/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kashtkarzarai.dao;

import java.util.ArrayList;
import kashtkarzarai.bean.CompanyBeans;
import kashtkarzarai.bean.CustomerBeans;

/**
 *
 * @author Dell
 */
public interface CompanyDao {
    public int saveCompany(CompanyBeans company);
    public ArrayList<CompanyBeans> getAllCompanies();
    public int modifyCompany(CompanyBeans company);
    public int removeCompany(CompanyBeans company);
    public CompanyBeans getCompanyById(int company_id);
    
}
