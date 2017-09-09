/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.dao; 

import java.sql.Connection;
import java.sql.DriverManager;
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
    
}
