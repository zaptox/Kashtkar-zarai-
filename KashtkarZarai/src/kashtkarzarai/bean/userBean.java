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
public class userBean {
    private int  u_id ;
    private String u_name ;
    private String u_password;
    private int  active;

    public userBean(int u_id, String u_name, String u_password, int active) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_password = u_password;
        this.active = active;
    }
            

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
    

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }
    
}
