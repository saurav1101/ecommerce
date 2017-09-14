/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.controller;

import com.ecommerce.helloworldweb.dao.ProductDao;
import com.ecommerce.helloworldweb.model.ProductModel;
import com.ecommerce.helloworldweb.utilities.Tag;
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
@WebServlet({"/admin/product/add","/admin/product/delete/","/admin/product/edit/"})
public class ProductController extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextPath=request.getContextPath();
        if(request.getRequestURI().equals(contextPath+"/admin/product/delete/")) {
            int id=Integer.parseInt(request.getParameter("id"));
            ProductDao.delete(id);
            response.sendRedirect(contextPath+"/admin/product");
        }
        else if(request.getRequestURI().equals(contextPath+"/admin/product/edit/")){
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("editproductval",ProductDao.selectById(id));            
//          response.sendRedirect(contextPath+"/admin/product"); doesn't work
            RequestDispatcher rd = request.getRequestDispatcher("/admin-product.jsp");
            rd.forward(request, response);
        }
    
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        String contextPath = request.getContextPath();
        if(request.getRequestURI().equals(contextPath+"/admin/product/add")){
           String name=request.getParameter("pname");
           int price=Integer.parseInt(request.getParameter("pprice")); 
           int discount=Integer.parseInt(request.getParameter("pdiscount"));
           String[] tempTag = request.getParameterValues("ptags");
           String tags = Tag.convertTag(tempTag);
           String rating=request.getParameter("prating");
         
           //file upload garna baki xa
           //encapsulate the data
           ProductModel pm = new ProductModel();
           pm.setProduct_name(name);
           pm.setProduct_discount(discount);
           pm.setProduct_price(price);
           pm.setProduct_tag(tags);
           pm.setProduct_rating(rating);
          
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
