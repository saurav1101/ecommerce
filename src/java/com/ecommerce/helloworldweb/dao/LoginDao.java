/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.dao;

import com.ecommerce.helloworldweb.utilities.PasswordDecode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author SAURAV
 */
public class LoginDao {
    public static boolean checkValidity(String username, String password){
 
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
        String sql = "select * from login where username='"+
        username+"' and password='"+PasswordDecode.encode(password)+"'";
        try {
            st=con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            if(rs.next()){
                return true;
            }
        } catch(Exception e) {
        }
        return false;
    }
}    