/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.test;

import com.ecommerce.helloworldweb.utilities.Tag;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SAURAV
 */
public class TagTest {
    
//    public TagTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//        System.out.println("I am before class");
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//        System.out.println("I am after class");
//    }
//    
//    @Before
//    public void setUp() {
//        System.out.println("I am before");
//    }
//    
//    @After
//    public void tearDown() {
//        System.out.println("I am after");
//    }
//    
//    @Test
//     public void hello() {
//         System.out.println("I am real logic");
//     }
//     
//     @Test
//     public void testTag(){
//         System.out.println("I am new test");
//     }
    
    @Test
    public void testTag() {
        String[] a = new String[]{"food","lifestyle","fashion"};
        String expected="fashion,lifestyle,food,";
        assertEquals(expected, Tag.convertTag(a));
            
    }
}
