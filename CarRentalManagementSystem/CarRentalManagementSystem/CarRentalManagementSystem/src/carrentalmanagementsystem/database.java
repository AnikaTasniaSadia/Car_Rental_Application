/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author anika
 */
public class database {
    
  public static Connection connectDb(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

           
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/rentcar", "root", ""); // root is the default username while "" or empty is for the password
            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }  
}
