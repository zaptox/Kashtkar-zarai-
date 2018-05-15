/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaptox.Kashkarzarai.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Vksoni
 */
public class CurrentDate {
    public static String getCurrentDate(){
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
    return ""+now;}
}
