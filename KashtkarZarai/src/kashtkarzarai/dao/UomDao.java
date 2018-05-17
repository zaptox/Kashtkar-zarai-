/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kashtkarzarai.dao;

import java.util.ArrayList;
import kashtkarzarai.bean.UOMBeans;

/**
 *
 * @author Vksoni
 */
public interface UomDao {
    public ArrayList<UOMBeans>getAllUom();
    public int saveUom(UOMBeans uom);
    public int removeUom(UOMBeans uom);
    public String getUomName(int id);
    
}
