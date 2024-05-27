
package com.cinema.user.dao;

import com.cinema.admin.model.Admin;
import com.cinema.user.servcies.UserServcie;
import java.sql.*;
public class UserDateOfBirth implements UserServcie{
    
    private final Connection con;
    private String query;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public UserDateOfBirth (Connection con){
        this.con = con;
    }

    @Override
    public Admin logUser(String email, String password){
        Admin admin = null;
        try{
                    query = "select * from user where email=? and password=?";
                    pst = this.con.prepareStatement(query);
                    pst.setString(1, email);
                    pst.setString(2, password);
                    rs = pst.executeQuery();
                    if(rs.next()){
                        admin.setId(rs.getInt("user_id"));
                        admin.setEmail(rs.getString("email"));
                        admin.setBirth_date(rs.getString("birth_date"));
                        admin.setGender(rs.getString("gender"));
                    }

        } catch(Exception ex){
            ex.printStackTrace();
        }
        
        return admin;
    }
   
    
}
