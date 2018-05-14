/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kashtkarzarai.bean;

/**
 *
 * @author Vksoni
 */
public class CustomerBeans {
 int customer_id;
 String customer_name;
 String contact;
 String cnic;
 String address;
 String creation_date;

    public CustomerBeans(int customer_id, String customer_name, String contact, String cnic, String address, String creation_date) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.contact = contact;
        this.cnic = cnic;
        this.address = address;
        this.creation_date = creation_date;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }
 
 
}
