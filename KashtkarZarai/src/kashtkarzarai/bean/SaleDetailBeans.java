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
public class SaleDetailBeans {

    private int sale_detail_id;
    private int sale_id;
    private int customer_id;
    private int product_id;
    private int quantity;
    private int company_id;
    private int uom_id;
    private String sale_date;
    private double price;
    private String company_name;
    private String customer_name;
    private String uom;
    private String p_name;

    public SaleDetailBeans(int sale_detail_id, int quantity, String sale_date, double price, String company_name, String customer_name, String uom, String p_name) {
        this.sale_detail_id = sale_detail_id;
        this.quantity = quantity;
        this.sale_date = sale_date;
        this.price = price;
        this.company_name = company_name;
        this.customer_name = customer_name;
        this.uom = uom;
        this.p_name = p_name;
    }

 

    public SaleDetailBeans() {
    }

    public SaleDetailBeans(int sale_detail_id, int sale_id, int customer_id, int product_id, int quantity, int company_id, int uom_id, String sale_date, double price) {
        this.sale_detail_id = sale_detail_id;
        this.sale_id = sale_id;
        this.customer_id = customer_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.company_id = company_id;
        this.uom_id = uom_id;
        this.sale_date = sale_date;
        this.price = price;
    }

    public int getSale_detail_id() {
        return sale_detail_id;
    }

    public void setSale_detail_id(int sale_detail_id) {
        this.sale_detail_id = sale_detail_id;
    }

    public int getSale_id() {
        return sale_id;
    }

    public void setSale_id(int sale_id) {
        this.sale_id = sale_id;
    }
       public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }
    

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getSale_date() {
        return sale_date;
    }

    public void setSale_date(String sale_date) {
        this.sale_date = sale_date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getUom_id() {
        return uom_id;
    }

    public void setUom_id(int uom_id) {
        this.uom_id = uom_id;
    }

}
