/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.utilities;

import java.util.Base64;



/**
 *
 * @author SAURAV
 */
public class PasswordDecode {
    public static String encode(String password) {
        return Base64.getEncoder().encodeToString(password.getBytes());
    }
}
