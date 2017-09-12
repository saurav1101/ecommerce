/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.utilities;

/**
 *
 * @author SAURAV
 */
public class Tag {
    public static String convertTag(String[] tempTag) {
        String tags = "";
        for(int i = 0; i < tempTag.length; i++) {
             tags = tempTag[i] +"," +tags;             
        }
        
        return tags;
    }
}
