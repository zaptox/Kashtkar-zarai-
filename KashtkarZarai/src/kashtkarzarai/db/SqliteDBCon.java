/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kashtkarzarai.db;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Vksoni
 */
public class SqliteDBCon {
    Connection con;
    
    
    public static Connection LoadDb(){
    try{
    Class.forName("org.sqlite.JDBC");
    Connection con=DriverManager.getConnection("jdbc:sqlite:KashtkarSQLITE.sql");
    return con; 
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;
    }
    
    
    }
}
