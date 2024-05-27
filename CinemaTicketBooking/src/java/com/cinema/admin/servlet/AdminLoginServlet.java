package com.cinema.admin.servlet;

import com.cinema.DBconnection.ConnectionDB;
import com.cinema.admin.dao.AdminDateOfBirth;
import com.cinema.admin.model.Admin;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AdminLoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                String email = request.getParameter("email");
                String password = request.getParameter("password");

                AdminDateOfBirth dao = new AdminDateOfBirth(ConnectionDB.getCon());
                Admin admin = dao.logAdmin(email ,password);
                if(admin!=null){
                    response.sendRedirect("admin/adminpanel.jsp");
                }else{
                    out.println("unknown credential");
                }
                
                
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
