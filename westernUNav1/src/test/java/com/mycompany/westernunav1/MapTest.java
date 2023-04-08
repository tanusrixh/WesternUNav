/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.westernunav1;

import java.util.ArrayList;
import javax.swing.JLayeredPane;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Hala Abudaqqa
 */
public class MapTest {
 
    public MapTest() {
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
     * Test of getBuildingInfo method, of class Map.
     */
    @Test
    public void testGetBuildingInfo() {
        System.out.println("getBuildingInfo");
        Map instance = new Map();
        Building expResult = null;
        Building result = instance.getBuildingInfo();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setBuildingInfo method, of class Map.
     */
    @Test
    public void testSetBuildingInfo() {
        System.out.println("setBuildingInfo");
        Building buildingInfo = null;
        Map instance = new Map();
        instance.setBuildingInfo(buildingInfo);
    }

    /**
     * Test of setCurrUser method, of class Map.
     */
    @Test
    public void testSetCurrUser() {
        System.out.println("setCurrUser");
        User currUser = null;
        Map instance = new Map();
        instance.setCurrUser(currUser);

    }

    /**
     * Test of setBuildingName method, of class Map.
     */
    @Test
    public void testSetBuildingName() {
        System.out.println("setBuildingName");
        String buildingName = "Alumni Hall";
        Map instance = new Map();
        instance.setBuildingName(buildingName);
        assertEquals(buildingName, instance.getBuildingName());
        
    }

    /**
     * Test of getCurrUser method, of class Map.
     */
    @Test
    public void testGetCurrUser() {
        System.out.println("getCurrUser");
        Map instance = new Map();
        User expResult = null;
        User result = instance.getCurrUser();
        assertEquals(expResult, result);

    }

    /**
     * Test of getBuildingName method, of class Map.
     */
    @Test
    public void testGetBuildingName() {
        System.out.println("getBuildingName");
        Map instance = new Map();
        String expResult = instance.getBuildingName();
        String result = instance.getBuildingName();
        assertEquals(expResult, result);
    }

    /**
     * Test of displayRoomPOI method, of class Map.
     */
    @Test
    public void testDisplayRoomPOI() {
        System.out.println("displayRoomPOI");
        Room roomInfo = new Room("100", "washroom", 1474, 1044, "Washrooms");
        JLayeredPane layer = new JLayeredPane();
        Map instance = new Map();
        instance.displayRoomPOI(roomInfo, layer);
    }

    /**
     * Test of updateBIJSON method, of class Map.
     */
    @Test
    public void testUpdateBIJSON() {
        System.out.println("updateBIJSON");
        ArrayList<Floor> floor = null;
        Map instance = new Map();
        instance.updateBIJSON(floor);

    }

    /**
     * Test of main method, of class Map.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Map.main(args);
    }
    
}
