/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kashtkarzarai.bean;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class PaymentDoneBeans {
private   String  date;
private Float discount;
private String discount_type;
private Double total_price;
private int customer_id;
private ArrayList<ProductBeans> orderedProductList;
Boolean sale_customer;
int quantity;

    public PaymentDoneBeans(String date, Float discount, String discount_type, Double total_price, int customer_id, ArrayList<ProductBeans> orderedProductList, Boolean sale_customer, int quantity) {
        this.date = date;
        this.discount = discount;
        this.discount_type = discount_type;
        this.total_price = total_price;
        this.customer_id = customer_id;
        this.orderedProductList = orderedProductList;
        this.sale_customer = sale_customer;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public String getDiscount_type() {
        return discount_type;
    }

    public void setDiscount_type(String discount_type) {
        this.discount_type = discount_type;
    }

    public Double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public ArrayList<ProductBeans> getOrderedProductList() {
        return orderedProductList;
    }

    public void setOrderedProductList(ArrayList<ProductBeans> orderedProductList) {
        this.orderedProductList = orderedProductList;
    }

    public Boolean getSale_customer() {
        return sale_customer;
    }

    public void setSale_customer(Boolean sale_customer) {
        this.sale_customer = sale_customer;
    }



}
