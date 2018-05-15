/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kashtkarzarai.bean;

/**
 *
 * @author Dell
 */
public class CompanyBeans {
    
    int company_id;
    String company_name;
    String company_contact;
    String company_address;
    String dealer_name;
    int  active;

    public CompanyBeans(int company_id, String company_name, String company_contact, String company_address, String dealer_name, int active) {
        this.company_id = company_id;
        this.company_name = company_name;
        this.company_contact = company_contact;
        this.company_address = company_address;
        this.dealer_name = dealer_name;
        this.active = active;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_contact() {
        return company_contact;
    }

    public void setCompany_contact(String company_contact) {
        this.company_contact = company_contact;
    }

    public String getCompany_address() {
        return company_address;
    }

    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }

    public String getDealer_name() {
        return dealer_name;
    }

    public void setDealer_name(String dealer_name) {
        this.dealer_name = dealer_name;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
    
            
           
}
