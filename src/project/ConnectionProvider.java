/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

/**
 *
 * @author Relience
 */
public class ConnectionProvider {
    public static Connection getcon(){
        System.out.println("hello");
       try
       {
        Class.forName("com.mysql.cj.jdbc.Driver");
           System.out.println("driver open");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","2102796");
           System.out.println("connection open");
         return con;
        }
         catch(Exception ee){
          return null;
}
    }  
}
