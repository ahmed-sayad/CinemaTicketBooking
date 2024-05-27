
package com.cinema.admin.dao;

import com.cinema.admin.model.Admin;
import com.cinema.admin.servcies.AdminServcie;
import java.sql.*;
public class AdminDateOfBirth implements AdminServcie{
    
    private final Connection con;
    private String query;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public AdminDateOfBirth (Connection con){
        this.con = con;
    }

    @Override
    public Admin logAdmin(String email, String password){
        Admin admin = null;
        try{
                    query = "select * from admin where email=? and password=?";
                    pst = this.con.prepareStatement(query);
                    pst.setString(1, email);
                    pst.setString(2, password);
                    rs = pst.executeQuery();
                    if(rs.next()){
                        admin.setId(rs.getInt("admin_id"));
                        admin.setEmail(rs.getString(" "));
                        admin.setBirth_date(rs.getString("birth_date"));
                        admin.setGender(rs.getString("gender"));
                        admin.setRole(rs.getString("role"));
                    }

        } catch(Exception ex){
            ex.printStackTrace();
        }
        
        return admin;
    }
   
    
}
