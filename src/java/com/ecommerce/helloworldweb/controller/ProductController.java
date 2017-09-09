/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.controller;

import com.ecommerce.helloworldweb.dao.ProductDao;
import com.ecommerce.helloworldweb.dao.ProductModel;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Saurav
 */
@WebServlet({"/admin/product/add"})
public class ProductController extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        String contextPath = request.getContextPath();
        if(request.getRequestURI().equals(contextPath+"/admin/product/add")){
           String name=request.getParameter("pname");
           int price=Integer.parseInt(request.getParameter("pprice")); 
           int discount=Integer.parseInt(request.getParameter("pdiscount"));
           String tags=request.getParameter("ptags");
           //file upload garna baki xa
           //encapsulate the data
           ProductModel pm = new ProductModel();
           pm.setProduct_name(name);
           pm.setProduct_discount(discount);
           pm.setProduct_price(price);
           pm.setProduct_tag(tags);
           //send the object to dao
          ProductDao.insert(pm);
          response.sendRedirect(contextPath+"/admin/product");
            
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
