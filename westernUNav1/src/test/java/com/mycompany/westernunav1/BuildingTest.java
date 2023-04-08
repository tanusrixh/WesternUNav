/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.westernunav1;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author NOSHEEN
 */
public class BuildingTest {
    
    public BuildingTest() {
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
     * Test of newJSON method, of class Building.
     */
    @Test
    public void testNewJSON() {
        System.out.println("newJSON");
        String code = "";
        int floors = 0;
        Building instance = null;
        instance.newJSON(code, floors);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Building.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Building instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Building.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Building instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFloors method, of class Building.
     */
    @Test
    public void testGetFloors() {
        System.out.println("getFloors");
        Building instance = null;
        ArrayList<Floor> expResult = null;
        ArrayList<Floor> result = instance.getFloors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFloors method, of class Building.
     */
    @Test
    public void testSetFloors() {
        System.out.println("setFloors");
        ArrayList<Floor> floors = null;
        Building instance = null;
        instance.setFloors(floors);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumFloors method, of class Building.
     */
    @Test
    public void testGetNumFloors() {
        System.out.println("getNumFloors");
        Building instance = null;
        int expResult = 0;
        int result = instance.getNumFloors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumFloors method, of class Building.
     */
    @Test
    public void testSetNumFloors() {
        System.out.println("setNumFloors");
        int numFloors = 0;
        Building instance = null;
        instance.setNumFloors(numFloors);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFileName method, of class Building.
     */
    @Test
    public void testGetFileName() {
        System.out.println("getFileName");
        Building instance = null;
        String expResult = "";
        String result = instance.getFileName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFileName method, of class Building.
     */
    @Test
    public void testSetFileName() {
        System.out.println("setFileName");
        String fileName = "";
        Building instance = null;
        instance.setFileName(fileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRooms method, of class Building.
     */
    @Test
    public void testGetRooms() {
        System.out.println("getRooms");
        Building instance = null;
        ArrayList<Room> expResult = null;
        ArrayList<Room> result = instance.getRooms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRooms method, of class Building.
     */
    @Test
    public void testSetRooms() {
        System.out.println("setRooms");
        ArrayList<Room> rooms = null;
        Building instance = null;
        instance.setRooms(rooms);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
