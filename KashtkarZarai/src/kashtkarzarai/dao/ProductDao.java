/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kashtkarzarai.dao;

import java.util.ArrayList;
import kashtkarzarai.bean.ProductBeans;

/**
 *
 * @author hp
 */
public interface ProductDao {
    public int saveProduct(ProductBeans productBeans);
    public ArrayList<ProductBeans> getAllProducts();
    public int modifyProduct(ProductBeans productBeans);
    public int removeProduct(ProductBeans productBeans);
    public ProductBeans getProductById(int pro_id);
    public int updatequantity(int quantity, int product_id);
    
}
