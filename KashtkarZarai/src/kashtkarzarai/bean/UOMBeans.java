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
public class UOMBeans {
    
    private int uom_id;
    private String uom;

    public UOMBeans(int uom_id, String uom) {
        this.uom_id = uom_id;
        this.uom = uom;
    }

    public UOMBeans() {
    }

    public int getUom_id() {
        return uom_id;
    }

    public void setUom_id(int uom_id) {
        this.uom_id = uom_id;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }
    
}
