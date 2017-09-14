/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.dao; 

import com.ecommerce.helloworldweb.model.ProductModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Saurav
 */
public class ProductDao { // DAO(Data Access Object)
    
    public static void insert(ProductModel pm) {
    
        try {
//            Class.forName("com.mysql.jdbc.Driver"); // for MySql
              Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            System.out.println(e);
            
        }
        Connection con = null;
        Statement st = null;
        try {
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce-api", "root","");
              con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ecommerce_api","postgres",
                      "saurav");
        } catch (Exception e){
            System.out.println(e);
        }
        
        String sql ="insert into products(product_name, product_price, product_tag, product_rating, "
                + "product_discount, product_image) values ('"+pm.getProduct_name()+"',"
                +pm.getProduct_price()+",'"+pm.getProduct_tag()+"','"+pm.getProduct_rating()+"',"
                +pm.getProduct_discount()+",'"+pm.getProduct_image()+"')";
        try {
            st = con.createStatement();
            st.execute(sql);
        } catch (Exception e){
            System.out.println(e);
        }
    }
 
      public static void update(ProductModel pm) {
    
        try {
//            Class.forName("com.mysql.jdbc.Driver"); // for MySql
              Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            System.out.println(e);
            
        }
        Connection con = null;
        Statement st = null;
        try {
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce-api", "root","");
              con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ecommerce_api","postgres",
                      "saurav");
        } catch (Exception e){
            System.out.println(e);
        }
        
        String sql ="update products set product_name='" +pm.getProduct_name()+"', product_price=" +pm.getProduct_price()+
                ", product_tag='" +pm.getProduct_tag()+"', product_rating='"+pm.getProduct_rating()+"', product_discount=" +
                pm.getProduct_discount()+", product_image='" +pm.getProduct_image() +"' where product_id="+pm.getProduct_id();
                 
        try {
            st = con.createStatement();
            st.execute(sql);
        } catch (Exception e){
            System.out.println(e);
        }
    }
  
    
    public static ArrayList<ProductModel> select() {
        ArrayList al = new ArrayList();
        try {
//            Class.forName("com.mysql.jdbc.Driver"); // for MySql
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            System.out.println(e);
            
        }

        Connection con = null;
        Statement st = null;
        
        try {
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce-api", "root","");
              con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ecommerce_api","postgres",
                      "saurav");
        } catch (Exception e){
            System.out.println(e);
        }
        
        String sql = "select *from products";
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                al.add(new ProductModel(rs.getInt("product_id"), rs.getString("product_name"), rs.getInt("product_price"), rs.getString("product_tag"), rs.getString("product_rating"), rs.getInt("product_discount"), rs.getString("product_image")));
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;
        
    }
    public static ArrayList<ProductModel> selectById(int id) {
        ArrayList al = new ArrayList();
        try {
//            Class.forName("com.mysql.jdbc.Driver"); // for MySql
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            System.out.println(e);
            
        }

        Connection con = null;
        Statement st = null;
        
        try {
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce-api", "root","");
              con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ecommerce_api","postgres",
                      "saurav");
        } catch (Exception e){
            System.out.println(e);
        }
        
        String sql = "select *from products where product_id="+id;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
                al.add(new ProductModel(rs.getInt("product_id"), rs.getString("product_name"), rs.getInt("product_price"), rs.getString("product_tag"), rs.getString("product_rating"), rs.getInt("product_discount"), rs.getString("product_image")));
                        
        } catch (Exception e) {
            System.out.println(e);
        }
        return al;
        
    }
    
    public static void delete(int id) {
        try {
//            Class.forName("com.mysql.jdbc.Driver"); // for MySql
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            System.out.println(e);
            
        }
        Connection con = null;
        Statement st = null;
        
        try {
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce-api", "root","");
              con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ecommerce_api","postgres",
                      "saurav");
        } catch (Exception e){
            System.out.println(e);
        }
        
        String sql = "delete from products where product_id =" +id;    
        
        try {
            st = con.createStatement();
            st.execute(sql);
        } catch (Exception e){ 
            System.out.println(e);
          
        }
                
    }
   
}
