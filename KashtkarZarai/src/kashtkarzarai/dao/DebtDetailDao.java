/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kashtkarzarai.dao;

import java.util.ArrayList;
import kashtkarzarai.bean.DebtDetailBeans;

/**
 *
 * @author Vksoni
 */
public interface DebtDetailDao {
      public ArrayList<DebtDetailBeans> getAllDetailByCustomerId(int customer_id);
      public int saveDebtDetail(DebtDetailBeans debt);  
}
