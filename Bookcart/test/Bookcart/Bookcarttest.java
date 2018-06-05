package Bookcart;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sjadh
 */
public class Bookcarttest {
    Book b;
    
    public Bookcarttest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        b=new Book();
    }
    
    @After
    public void tearDown() {
    }

   @Test
   public void testAdd_cust_acc(){
        assertEquals(100,b.testAdd_cust_acc(100));
    }
   @Test
   public void testBook_acc(){
        assertEquals(10,b.testBook_acc(10));
    }
   
   @Test
   public void testStock_display(){
        assertEquals("The Sympathizer",b.testStock_display("The Sympathizer"));
    }
}
