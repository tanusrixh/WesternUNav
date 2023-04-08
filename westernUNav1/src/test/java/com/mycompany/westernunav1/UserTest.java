/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.westernunav1;

import java.util.ArrayList;
import javax.swing.JPanel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nourfayadh
 */
public class UserTest {
    
    public UserTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setFavePOI method, of class User.
     */
    @Test
    public void testSetFavePOI() {
        System.out.println("setFavePOI");
        ArrayList<PointofInterest> favePOI = new ArrayList<PointofInterest>();
        User instance = new User("user", "pass", new ArrayList<PointofInterest>(), new ArrayList<PointofInterest>(), false);
        instance.setFavePOI(favePOI);
     
    }

    /**
     * Test of setIsDeveloper method, of class User.
     */
    @Test
    public void testSetIsDeveloper() {
        System.out.println("setIsDeveloper");
        boolean isDeveloper = false;
        User instance = new User("user", "pass", new ArrayList<PointofInterest>(), new ArrayList<PointofInterest>(), false);
        instance.setIsDeveloper(isDeveloper);
       
    }

    /**
     * Test of getFavePOI method, of class User.
     */
    @Test
    public void testGetFavePOI() {
        System.out.println("getFavePOI");
        User instance = new User("user", "pass", new ArrayList<PointofInterest>(), new ArrayList<PointofInterest>(), false);
        ArrayList<PointofInterest> expResult = new ArrayList<PointofInterest>();
        ArrayList<PointofInterest> result = instance.getFavePOI();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIsDeveloper method, of class User.
     */
    @Test
    public void testGetIsDeveloper() {
        System.out.println("getIsDeveloper");
        User instance = new User("user", "pass", new ArrayList<PointofInterest>(), new ArrayList<PointofInterest>(), false);
        boolean expResult = false;
        boolean result = instance.getIsDeveloper();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getName method, of class User.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        User instance = new User("user", "pass", new ArrayList<PointofInterest>(), new ArrayList<PointofInterest>(), false);
        String expResult = "user";
        String result = instance.getName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getLoginCredentials method, of class User.
     */
    @Test
    public void testGetLoginCredentials() {
        System.out.println("getLoginCredentials");
        User instance = new User("user", "pass", new ArrayList<PointofInterest>(), new ArrayList<PointofInterest>(), false);
        String expResult = "pass";
        String result = instance.getLoginCredentials();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSavedPOI method, of class User.
     */
    @Test
    public void testGetSavedPOI() {
        System.out.println("getSavedPOI");
        User instance = new User("user", "pass", new ArrayList<PointofInterest>(), new ArrayList<PointofInterest>(), false);
        ArrayList<PointofInterest> expResult = new ArrayList<PointofInterest>();
        ArrayList<PointofInterest> result = instance.getSavedPOI();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class User.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "user";
        User instance = new User("user", "pass", new ArrayList<PointofInterest>(), new ArrayList<PointofInterest>(), false);
        instance.setName(name);
      
    }

    /**
     * Test of setLoginCredentials method, of class User.
     */
    @Test
    public void testSetLoginCredentials() {
        System.out.println("setLoginCredentials");
        String loginCredentials = "pass";
        User instance = new User("user", "pass", new ArrayList<PointofInterest>(), new ArrayList<PointofInterest>(), false);
        instance.setLoginCredentials(loginCredentials);
      
    }

    /**
     * Test of setSavedPOI method, of class User.
     */
    @Test
    public void testSetSavedPOI() {
        System.out.println("setSavedPOI");
        ArrayList<PointofInterest> savedPOI = new ArrayList<PointofInterest>();
        User instance = new User("user", "pass", new ArrayList<PointofInterest>(), new ArrayList<PointofInterest>(), false);
        instance.setSavedPOI(savedPOI);
        
    }


    /**
     * Test of main method, of class User.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        User.main(args);
       
    }

    
}
