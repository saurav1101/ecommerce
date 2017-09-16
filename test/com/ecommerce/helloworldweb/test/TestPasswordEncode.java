/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.test;

import com.ecommerce.helloworldweb.utilities.PasswordDecode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author SAURAV
 */
public class TestPasswordEncode {
        
    @Test
     public void testPasswordEncode() {
         assertEquals("YXBwbGU=",PasswordDecode.encode("apple"));
     }
}
