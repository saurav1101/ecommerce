/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.controller;

import com.ecommerce.helloworldweb.dao.ProductDao;
import com.ecommerce.helloworldweb.model.ProductModel;
import com.ecommerce.helloworldweb.utilities.Tag;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
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
            //file upload start
           String saveLocation = request.getServletContext().getRealPath("/files");
           MultipartRequest  mr = new MultipartRequest(request, saveLocation, 1000000, new DefaultFileRenamePolicy());
           String imageName = mr.getOriginalFileName("files");
           String name=mr.getParameter("pname");
           int price=Integer.parseInt(mr.getParameter("pprice")); 
           int discount=Integer.parseInt(mr.getParameter("pdiscount"));
           String[] tempTag = mr.getParameterValues("ptags");
           String tags = Tag.convertTag(tempTag);
           String rating=mr.getParameter("prating");
         
           
            //file upload garna baki xa
           //encapsulate the data
           ProductModel pm = new ProductModel();
           pm.setProduct_name(name);
           pm.setProduct_discount(discount);
           pm.setProduct_price(price);
           pm.setProduct_tag(tags);
           pm.setProduct_rating(rating);
           pm.setProduct_image(imageName);
           
           int id=0;
           try {
               id = Integer.parseInt(request.getParameter("id"));
               pm.setProduct_id(id);
           } catch (Exception e) {
           }
           
           if(id==0){
          //send the object to dao
          ProductDao.insert(pm);
           }
           else {
               ProductDao.update(pm);
           }
          response.sendRedirect(contextPath+"/admin/product");
            
        }
    }
  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
