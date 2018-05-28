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
public class DebtDetailBeans {
    private int debt_detail_id;
    private String name;
    private double debt_amount;
    private int customer_id;
    private String date;

    public DebtDetailBeans(int debt_detail_id, String name, double debt_amount, String date) {
        this.debt_detail_id = debt_detail_id;
        this.name = name;
        this.debt_amount = debt_amount;
        this.date = date;
    }

    public DebtDetailBeans(int debt_detail_id, String name, double debt_amount, int customer_id, String date) {
        this.debt_detail_id = debt_detail_id;
        this.name = name;
        this.debt_amount = debt_amount;
        this.customer_id = customer_id;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDebt_detail_id() {
        return debt_detail_id;
    }

    public void setDebt_detail_id(int debt_detail_id) {
        this.debt_detail_id = debt_detail_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDebt_amount() {
        return debt_amount;
    }

    public void setDebt_amount(double debt_amount) {
        this.debt_amount = debt_amount;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
    
}
