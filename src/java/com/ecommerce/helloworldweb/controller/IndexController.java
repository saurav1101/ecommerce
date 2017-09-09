/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Saurav
 */
@WebServlet({"/index", "/form"})
public class IndexController extends HttpServlet {
//get: all the requests are get request
//post: after we specify something as post,only then post request is sent


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String contextPath = request.getContextPath();
//        String ipAddress = request.getRemoteAddr();
//        String uri = request.getRequestURI();

//        System.out.println(contextPath);
//        System.out.println(ipAddress);
//        System.out.println(uri);
          
        if(request.getRequestURI().equals(contextPath +"/index")){
         request.setAttribute("el", "we are practicing expressionlanguage");
//         el ="we are practicing..."
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        }
        
        if(request.getRequestURI().equals(contextPath +"/form")){
            RequestDispatcher rd = request.getRequestDispatcher("form.jsp");
            rd.forward(request, response);
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                  
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
