/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kashtkarzarai.dao;

import java.util.ArrayList;
import kashtkarzarai.bean.CustomerBeans;
/**
 *
 * @author Vksoni
 */
public interface CustomerDao {
    public int saveCustomer(CustomerBeans customer);
    public ArrayList<CustomerBeans> getAllCustomers();
    public int modifyCustomers(CustomerBeans customer);
    public int removeCustomer(CustomerBeans customer);
    public CustomerBeans getCustomerById(int cust_id);
}
