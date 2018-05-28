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
public class SaleBeans {
    private int sale_id;
    private int customer_id;
    private int active;
    private String discount_type;
    private float discount;
    private double total_bill;

    public SaleBeans() {
    }

    public SaleBeans(int sale_id, int customer_id, int active, String discount_type, float discount, double total_bill) {
        this.sale_id = sale_id;
        this.customer_id = customer_id;
        this.active = active;
        this.discount_type = discount_type;
        this.discount = discount;
        this.total_bill = total_bill;
    }

    public double getTotal_bill() {
        return total_bill;
    }

    public void setTotal_bill(double total_bill) {
        this.total_bill = total_bill;
    }

    public int getSale_id() {
        return sale_id;
    }

    public void setSale_id(int sale_id) {
        this.sale_id = sale_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getDiscount_type() {
        return discount_type;
    }

    public void setDiscount_type(String discount_type) {
        this.discount_type = discount_type;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
    
}
