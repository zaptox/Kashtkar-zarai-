/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kashtkarzarai.bean;

/**
 *
 * @author hp
 */
public class ProductBeans {

    private int p_id;
    private int company_id;
    private int quantity;
    private int uom;

  
    private String p_name;
    private int cost;
    private int active;

    public ProductBeans(int p_id, int company_id, int quantity, int uom, String p_name, int cost, int active) {
        this.p_id = p_id;
        this.company_id = company_id;
        this.quantity = quantity;
        this.uom = uom;
        this.p_name = p_name;
        this.cost = cost;
        this.active = active;
    }

   
      public int getUom() {
        return uom;
    }

    public void setUom(int uom) {
        this.uom = uom;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

}
