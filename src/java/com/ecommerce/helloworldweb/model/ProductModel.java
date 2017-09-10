/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.model;

import java.io.Serializable;

/**
 *
 * @author Saurav
 */
public class ProductModel implements Serializable{
    
    private static long SerialVersionUID = 1L;
    
    private int product_id;
    private String product_name;
    private int product_price;
    private String product_tag;
    private String product_rating;
    private int product_discount;        
    private String product_image;
    
    // blank Constructor
    // parameterized Constructor
    // getter / setter

    public ProductModel() {
     
    }



    public ProductModel(int product_id, String product_name, int product_price, String product_tag, String product_rating, int product_discount, String product_image) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_tag = product_tag;
        this.product_rating = product_rating;
        this.product_discount = product_discount;
        this.product_image = product_image;
    }

    

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public String getProduct_tag() {
        return product_tag;
    }

    public void setProduct_tag(String product_tag) {
        this.product_tag = product_tag;
    }

    public String getProduct_rating() {
        return product_rating;
    }

    public void setProduct_rating(String product_rating) {
        this.product_rating = product_rating;
    }

    public int getProduct_discount() {
        return product_discount;
    }

    public void setProduct_discount(int product_discount) {
        this.product_discount = product_discount;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    
}
