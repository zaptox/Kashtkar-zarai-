/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kashtkarzarai.dao;

import java.util.ArrayList;
import kashtkarzarai.bean.CustomerBeans;
import kashtkarzarai.bean.UserBeans;

/**
 *
 * @author hp
 */
public interface UserDao {
    
    public boolean userLogin(UserBeans u);
      public int saveUser(UserBeans u);
    public ArrayList<UserBeans> getAllUsers();
    public int modifyUser(UserBeans u);
    public int removeUser(UserBeans u);
    public UserBeans getUserById(int user_id);
}
