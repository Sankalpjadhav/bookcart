package Bookcart;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bookcart.Book;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sushrutn
 */
public class addtest {
    Book b;
    
    public addtest() {
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
     public void disp_cart(){
    assertEquals(1,b.disp_cart(1));
    }
    public void display_cart(){
    assertEquals(0,b.disp_cart(0));
    }
    public void item_check(){
    assertEquals(0,b.check(1));
    }

}
