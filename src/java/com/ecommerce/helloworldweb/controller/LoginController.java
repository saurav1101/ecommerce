/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.controller;

import com.ecommerce.helloworldweb.dao.LoginDao;
import com.ecommerce.helloworldweb.dao.ProductDao;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SAURAV
 */
@WebServlet({"/login"})
public class LoginController extends HttpServlet {


    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextPath=request.getContextPath();
        if(request.getRequestURI().equals(contextPath+"/login")) {
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextPath=request.getContextPath();
        if(request.getRequestURI().equals(contextPath+"/login")) {
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            if(LoginDao.checkValidity(username, password)) {
                HttpSession session = request.getSession(true);
                session.setAttribute("user", username);
                request.setAttribute("productvalue", ProductDao.select());
                RequestDispatcher rd = request.getRequestDispatcher("admin-product.jsp");
                rd.forward(request, response);
            }
            else {
                response.sendRedirect(contextPath+"/login");
            }
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
