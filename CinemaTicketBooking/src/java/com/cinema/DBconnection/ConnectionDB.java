
package com.cinema.DBconnection;

import java.sql.*;

public class ConnectionDB {
    public static Connection con;
    
    public static Connection getCon(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticket", "root", "");
        } catch(ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }
        
        return con;
    }
    
}
