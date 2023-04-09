/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.westernunav1;

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
public class PointofInterestTest {
    
    public PointofInterestTest() {
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
     * Test of getBuildingName method, of class PointofInterest.
     */
    @Test
    public void testGetBuildingName() {
        System.out.println("getBuildingName");
        PointofInterest instance = new PointofInterest("room 111", "classroom", "educational space", 360, 90);
        String expResult = null;
        String result = instance.getBuildingName();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setBuildingName method, of class PointofInterest.
     */
    @Test
    public void testSetBuildingName() {
        System.out.println("setBuildingName");
        String buildingName = "Middlsex College";
        PointofInterest instance = new PointofInterest("room 111", "classroom", "educational space", 360, 90);;
        instance.setBuildingName(buildingName);
       
    }

    /**
     * Test of getFloorName method, of class PointofInterest.
     */
    @Test
    public void testGetFloorName() {
        System.out.println("getFloorName");
        PointofInterest instance = new PointofInterest("room 111", "classroom", "educational space", 360, 90);;
        String expResult = null;
        String result = instance.getFloorName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFloorName method, of class PointofInterest.
     */
    @Test
    public void testSetFloorName() {
        System.out.println("setFloorName");
        String floorName = "First Floor";
        PointofInterest instance = new PointofInterest("room 111", "classroom", "educational space", 360, 90);;
        instance.setFloorName(floorName);
       
    }

    /**
     * Test of getCategory method, of class PointofInterest.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        PointofInterest instance = new PointofInterest("room 111", "classroom", "educational space", 360, 90);;
        String expResult = "educational space";
        String result = instance.getCategory();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCategory method, of class PointofInterest.
     */
    @Test
    public void testSetCategory() {
        System.out.println("setCategory");
        String category = "educational space";
        PointofInterest instance = new PointofInterest("room 111", "classroom", "educational space", 360, 90);;
        instance.setCategory(category);
        
    }

    /**
     * Test of getPoiX method, of class PointofInterest.
     */
    @Test
    public void testGetPoiX() {
        System.out.println("getPoiX");
        PointofInterest instance = new PointofInterest("room 111", "classroom", "educational space", 360, 90);;
        int expResult = 360;
        int result = instance.getPoiX();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of setPoiX method, of class PointofInterest.
     */
    @Test
    public void testSetPoiX() {
        System.out.println("setPoiX");
        int poiX = 450;
        PointofInterest instance = new PointofInterest("room 111", "classroom", "educational space", 360, 90);;
        instance.setPoiX(poiX);
        
    }

    /**
     * Test of getPoiY method, of class PointofInterest.
     */
    @Test
    public void testGetPoiY() {
        System.out.println("getPoiY");
        PointofInterest instance = new PointofInterest("room 111", "classroom", "educational space", 360, 90);;
        int expResult = 90;
        int result = instance.getPoiY();
        assertEquals(expResult, result);
   
    }

    /**
     * Test of setPoiY method, of class PointofInterest.
     */
    @Test
    public void testSetPoiY() {
        System.out.println("setPoiY");
        int poiY = 50;
        PointofInterest instance = new PointofInterest("room 111", "classroom", "educational space", 360, 90);;
        instance.setPoiY(poiY);
        
    }

    /**
     * Test of getPoiRoomNumber method, of class PointofInterest.
     */
    @Test
    public void testGetPoiRoomNumber() {
        System.out.println("getPoiRoomNumber");
        PointofInterest instance = new PointofInterest("room 111", "classroom", "educational space", 360, 90);;
        String expResult = "room 111";
        String result = instance.getPoiRoomNumber();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of setPoiRoomNumber method, of class PointofInterest.
     */
    @Test
    public void testSetPoiRoomNumber() {
        System.out.println("setPoiRoomNumber");
        String poiRoomNumber = "room 111";
        PointofInterest instance = new PointofInterest("room 111", "classroom", "educational space", 360, 90);;
        instance.setPoiRoomNumber(poiRoomNumber);
        
    }

    /**
     * Test of getPoiDescription method, of class PointofInterest.
     */
    @Test
    public void testGetPoiDescription() {
        System.out.println("getPoiDescription");
        PointofInterest instance = new PointofInterest("room 111", "classroom", "educational space", 360, 90);;
        String expResult = "classroom";
        String result = instance.getPoiDescription();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPoiDescription method, of class PointofInterest.
     */
    @Test
    public void testSetPoiDescription() {
        System.out.println("setPoiDescription");
        String poiDescription = "classroom";
        PointofInterest instance = new PointofInterest("room 111", "classroom", "educational space", 360, 90);;
        instance.setPoiDescription(poiDescription);

    }

    /**
     * Test of getPoilocation method, of class PointofInterest.
     */
    @Test
    public void testGetPoilocation() {
        System.out.println("getPoilocation");
        PointofInterest instance = new PointofInterest("room 111", "classroom", "educational space", 360, 90);;
        Building expResult = null;
        Building result = instance.getPoilocation();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of setPoilocation method, of class PointofInterest.
     */
    @Test
    public void testSetPoilocation() {
        System.out.println("setPoilocation");
        Building poilocation = null;
        PointofInterest instance = new PointofInterest("room 111", "classroom", "educational space", 360, 90);;
        instance.setPoilocation(poilocation);
       
    }
    
}
